/**
 * La clase Lector lee datos desde la consola, 
 * elimina los espacios en blanco al principio y final 
 * de l l�nea y convierte el texto
 * en min�sculas.
 * 
 */
package equipojugadorcontrato;

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
     * Lee una l�nea, elimina los blancos
     * y la devuelve en min�sculas
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
     * Lee una l�nea
     *
     * @return  un string, la l�nea tecleada por el usuario
     */
    private String leerLinea()
    {
        String linea = sc.nextLine();
       
        return linea;
    }
}