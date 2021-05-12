/**
 * La clase Gestor describe el gestor del equipo
 * (lo que hasta ahora era nuestro interfaz de texto).
 * En este ejercicio el interfaz est� desglosado 
 * en dos clases, la clase Gesto que act�a como controlador 
 * y la clase LectorEntradas que pide los datos al usuario.
 * El conrolador delega en en lector cuando solicita un dato.
 * 
 */
package equipojugadorcontrato;

public class GestorEquipo 
{

    private Equipo equipo;
    
    // pide los datos
    private Lector lector;
    
    /**
     * El constructor del gestor
     * @param equipo el equipo a gestionar
     */

    public GestorEquipo(Equipo equipo) 
    {
        this.equipo = equipo;
        lector = new Lector();
        
    }
    
    /**
     * Controla la l�gica del gestor
     */

    public void iniciar()
    {
          escribirBienvenida();
          
          String input = lector.getInput();
          while (!input.contains("salir"))
          {
                   String[] palabras = input.split(" ");
                   if (palabras[0].equalsIgnoreCase("Aniadir"))
                        aniadirJugador(palabras);
                   else if (palabras[0].equalsIgnoreCase("Borrar"))
                        borrarJugador(palabras);
                   else if (palabras[0].equalsIgnoreCase("Mejor"))
                        mejorPagado(palabras);
                   
                  input = lector.getInput();
          }
          
          escribirAdios();
                         
            
    }
    
       
    /**
     * un nuevo jugador firma un contrato con el equipo
     * @param palabras los datos del jugador
     */
    private void aniadirJugador(String[] palabras)
    {
            int edad = Integer.parseInt(palabras[1]);
            int salario = Integer.parseInt(palabras[2]);
            equipo.firmarContrato(new Jugador(palabras[0], edad), salario);
    }
    
     /**
     * borrar un jugador del equipo
     * @param palabras los datos del jugador a borrar
     */
     private void borrarJugador(String[] palabras)
    {
            
            equipo.borrarJugador(palabras[1]);
    }
    
     
     /**
     * visualizar el nombre del mejor pagado
     * @param palabras los datos del jugador a visualizar
     */
    private void mejorPagado(String[] palabras) { 
        System.out.println(equipo.getContratoMasAlto().getJugador().getNombre());
    }
    
     
     /**
     * visualizar un mensaje de bienvenida
     */    
    
    private void escribirBienvenida()
    {
        System.out.println("Bienvenido al sistema!");
        System.out.println("Posibles acciones:\n" +
            "Visualizar equipo\n" + "Aniadir jugador <nombre> <edad> <salario>\n" +
            "Borrar jugador<nombre>\n" + 
            "Mejor pagado\n" + "Salir\n");
    }
       
     
     /**
     * mensaje de despedida del gestor
     */
    private void escribirAdios() {
        System.out.println("Salida del gestor, adi�s.");
    }
    
    

}
