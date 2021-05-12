/**
 *  La clase principal del juego "El mundo de Zuul". 
 *  El juego es un simple juego de aventuras basado en texto.
 *  Los usuarios (jugadores) se mueven sobre un escenario.
 *  
 *  Para jugar se crea una instancia de esta clase y se
 *  llama al método jugar.
 * 
 *  La clase principal crea todas las
 *  habitaciones, crea el parser e inicia el jeugo. También evalúa y
 *  ejecuta las órdenes que el parser devuelve.
 *  
 * 
 * @author  Michael Kolling y David J. Barnes
 * @version 2006.03.30
 */
 

public class Juego
{
      private Parser parser;
      private Jugador jugador;
    
      public Juego() 
      {
        crearHabitaciones();
        parser = new Parser();
        jugador = new Jugador("Antonio", 100.00);
        jugador.entrarEnHabitacion(crearHabitaciones());
      }
    
      /**
       * Crea todas las habitaciones y establece las salidas
       */
      private Habitacion crearHabitaciones() {
        Habitacion exterior, cine, bar, laboratorio, despacho, sotano;
    
        exterior = new Habitacion("la entrada a la universidad");

        cine = new Habitacion("un cine");
        Elemento pantalla = new Elemento("pantalla", "Una pantalla gigante", 15.34);
        Elemento asiento = new Elemento("asiento", "Un asiento", 6.76);
        cine.agregarElemento(pantalla);
        cine.agregarElemento(asiento);
        
        bar = new Habitacion("un bar");
        Elemento mesa = new Elemento("mesa", "Una mesa de bar", 11.34);
        Elemento barra = new Elemento("barra", "La barra del bar", 180.56);
        bar.agregarElemento(mesa);
        bar.agregarElemento(barra);
        
        laboratorio = new Habitacion("un laboratorio");
        Elemento microscopio = new Elemento("microscopio", "Un microscopio", 20.34);
        laboratorio.agregarElemento(microscopio);
        
        despacho = new Habitacion("un despacho");
        Elemento consola = new Elemento("consola", "Una PlayStation 4", 15.34);
        Elemento cama = new Elemento("cama", "Una cama", 140.56);
        Elemento mesilla = new Elemento("mesa de noche", "Una mesa de noche", 10.34);
        despacho.agregarElemento(consola);
        despacho.agregarElemento(cama);
        despacho.agregarElemento(mesa);
        
        sotano = new Habitacion("un sótano");
        Elemento estanteria = new Elemento("estanteria", "Una estanteria", 60.34);
        sotano.agregarElemento(estanteria);
    
        // inicializar las salidas de las habitaciones
        exterior.setSalida("este", cine);
        exterior.setSalida("sur", laboratorio);
        exterior.setSalida("oeste", bar);
        
        cine.setSalida("oeste", exterior);
        
        bar.setSalida("este", exterior);
        
        laboratorio.setSalida("norte", exterior);
        laboratorio.setSalida("este", despacho);
        
        despacho.setSalida("oeste", laboratorio);
        despacho.setSalida("abajo", sotano);
        
        sotano.setSalida("arriba", despacho);
        
        return exterior; //Devuelve la habitación inicial
      }
    
      // método para empezar a jugar. Incluye un bucle
      // que se ejecuta hasta el final del juego
      public void jugar()
      {
            escribirBienvenida();
        
            // Bucle principalp. Se leen repetidamente comandos y
            // se ejecutan hasta que el juego concluye
            boolean terminado = false;
            while (! terminado) 
            {
              Orden orden = parser.getOrden();
              terminado = this.procesarOrden(orden);
            }
            System.out.println("Gracias por jugar. Adiós");
      }
    
     /**
     * Escribir mensaje de bienvenida al jugador.
     */
      private void escribirBienvenida()
      {
            System.out.println();
            System.out.println("Bienvenido a Zuul");
            System.out.println("Escribe 'ayuda' si necesitas ayuda.");
            System.out.println();
            escribirLocalizacion();
      }
      
     private void escribirLocalizacion() {
         System.out.print(habitacionActual.getDescripcionLarga());
     }
     
     private String getSalidasString() {
         return habitacionActual.getSalidasString();
     }
    
     /**
     * Dada una orden se procesa (ejecuta).
     * @param orden  La orden a ejecutar.
     * @return true Si la orden finaliza el juego, false en otro caso.
     */
      private boolean procesarOrden(Orden orden)
      {
            boolean salir = false;
        
            if (orden.ordenDesconocida())
            {
              System.out.println("No te entiendo bro...");
              return false;
            }
        
            String palabra = orden.getPalabraOrden();
            if (palabra.equals("ayuda")) 
                escribirAyuda();
            else if (palabra.equals("ir"))
                irAHabitacion(orden);
            else if (palabra.equals("salir"))
                salir = salir(orden);
            else if (palabra.equals("mira"))
                mira();
            else if (palabra.equals("volver"))
                volver();
            
            return salir;
      }
    
     private void escribirAyuda() {
       System.out.println("Estás perdido.");
       System.out.println();
       System.out.println("Las órdenes que puedes usar son: ");
       parser.mostrarOrdenes();
     }
    
     /** 
     * Intentar ir en una dirección. Si hay una salida entrar en la nueva
     * habitación, sino escrbir un mensaje de error.
     */
     private void irAHabitacion(Orden orden)
     {
           if (!orden.haySegundaPalabra()) 
           {
             // si no hay segunda palabra no se sabe adónde ir
             System.out.println("¿Ir a dónde?");
             return;
           }
        
           String direccion = orden.getSegundaPalabra();
        
           // intentar salir de la habitación actual
           //Habitacion siguienteHabitacion = null;
           Habitacion siguienteHabitacion = habitacionActual.getSalida(direccion);
           if (siguienteHabitacion == null)
              System.out.println("No hay salida por esa dirección");
           else
           {
             habitacionAnterior = habitacionActual;
             habitacionActual = siguienteHabitacion;
             escribirLocalizacion();
           }
     }
    
     /** 
     * Se ha tecleado "Salir". Verificar el resto de la orden
     * para ver si realment se quiere salir del juego
     * @return true, si la orden sale del juego, false en otro caso.
     */
     private boolean salir(Orden orden)
     {
         if (orden.haySegundaPalabra()) {
             System.out.println("¿Salir de dónde?");
             return false;
         }
         else return true;
     }
      
     private void mira() {
         escribirLocalizacion();
     }
     
     private void volver() {
         if (habitacionAnterior != null) {
             habitacionActual = habitacionAnterior;
             escribirLocalizacion();
         }
     }
}