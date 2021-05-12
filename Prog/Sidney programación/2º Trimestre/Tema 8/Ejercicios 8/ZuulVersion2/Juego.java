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
      private Habitacion habitacionActual;
    
      public Juego() 
      {
        crearHabitaciones();
        parser = new Parser();
      }
    
      /**
       * Crea todas las habitaciones y establece las salidas
       */
      private void crearHabitaciones() 
      {
        Habitacion exterior, cine, bar, laboratorio, despacho;
    
        exterior = new Habitacion("la entrada a la universidad");
        cine = new Habitacion("un cine");
        bar = new Habitacion("un bar");
        laboratorio = new Habitacion("un laboratorio");
        despacho = new Habitacion("un despacho");
    
        // inicializar las salidas de las habitaciones
        exterior.setSalidas(null, cine, laboratorio, bar);
        cine.setSalidas(null, null, null, exterior);
        bar.setSalidas(null, exterior, null, null);
        laboratorio.setSalidas(exterior, despacho, null, null);
        despacho.setSalidas(null, null, null, laboratorio);
    
        habitacionActual = exterior; // el juego empieza en la entrada a la universidad
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
         System.out.println("Te encuentras en " +
                               habitacionActual.getDescripcion());
         System.out.print(habitacionActual.getSalidasString());
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
              System.out.println("No te entiendo...");
              return false;
            }
        
            String palabra = orden.getPalabraOrden();
            if (palabra.equals("ayuda")) 
              escribirAyuda();
            else if (palabra.equals("ir"))
                 irAHabitacion(orden);
            else if (palabra.equals("salir"))
                 salir = salir(orden);
            return salir;
      }
    
      private void escribirAyuda() 
      {
        System.out.println("Estás perdido.");
        System.out.println();
        System.out.println("Tus órdenes posibles son:");
        System.out.println("   ir   salir  ayuda");
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
        if (orden.haySegundaPalabra()) 
        {
              System.out.println("¿Salir de dónde?");
              return false;
        }
        else return true;
      }
}