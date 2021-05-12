/**
 * La clase Lector lee datos desde la consola, 
 * elimina los espacios en blanco al principio y final 
 * de l línea y convierte el texto
 * en minúsculas.
 * 
 */

import java.util.Scanner;


public class Lector
{
    private Scanner sc;

    /**
     * Constructor
     */
    public Lector()
    {
        sc = new Scanner(System.in);
    }

    /**
     * Lee una línea, elimina los blancos
     * y la devuelve en minúsculas
     *
     * @return  el string tecleado por el usuario
     */
    public String getInput() 
    {
        System.out.print("> "); //prompt               
        String lineaEntrada = leerLinea().trim().toLowerCase();

        return lineaEntrada;
    }

    /**
     * Lee una línea
     *
     * @return  un string, la línea tecleada por el usuario
     */
    private String leerLinea()
    {
        String linea = sc.nextLine();
       
        return linea;
    }
}