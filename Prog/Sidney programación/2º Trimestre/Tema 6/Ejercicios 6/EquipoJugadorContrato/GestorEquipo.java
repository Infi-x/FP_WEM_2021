/**
 * La clase Gestor describe el gestor del equipo
 * (lo que hasta ahora era nuestro interfaz de texto).
 * En este ejercicio el interfaz está desglosado 
 * en dos clases, la clase Gesto que actúa como controlador 
 * y la clase LectorEntradas que pide los datos al usuario.
 * El conrolador delega en en lector cuando solicita un dato.
 * 
 */

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
     * Controla la lógica del gestor
     */

    public void iniciar()
    {
          escribirBienvenida();
          
          String input = lector.getInput();
          while (!input.contains("salir"))
          {
                   String[] palabras = input.split(" ");
                   if (palabras[0].equalsIgnoreCase("Añadir"))
                        añadirJugador(palabras);
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
    private void añadirJugador(String[] palabras)
    {
            int edad = Integer.parseInt(palabras[2]);
            int salario = Integer.parseInt(palabras[3]);
            equipo.firmarContrato(new Jugador(palabras[1], edad), salario);
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
    private void mejorPagado(String[] palabras)
    {
            
            System.out.println(equipo.getContratoMasAlto().getJugador().getNombre());
    }
    
     
     /**
     * visualizar un mensaje de bienvenida
     */    
    
    private void escribirBienvenida()
    {
        System.out.println("Bienvenido al sistema !");
        System.out.println("Posibles acciones:\n" +
            "Visualizar Equipo\n" + "Añadir jugador <nombre> <edad> <salario>\n" +
            "Borrar jugador<nombre>\n" + 
            "Mejor pagado\n" + "Salir\n");
    }
       
     
     /**
     * mensaje de despedida del gestor
     */
    private void escribirAdios() {
        System.out.println("Salida del gestor, adiós.");
    }
    
    

}
