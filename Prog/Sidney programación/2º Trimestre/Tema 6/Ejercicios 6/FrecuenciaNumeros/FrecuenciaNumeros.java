
/**
 * La clase mantiene un map en el
 * que se registran las veces que 
 * aparece cada uno de los n�meros
 * de un fichero de texto
 * 
 */

import java.util.Scanner;
import java.io.*;

public class FrecuenciaNumeros
{
        
        private static Scanner sc;

        /**
         * Constructor de la clase FrecuenciaNumeros
         */
        public FrecuenciaNumeros()
        {
                
        }
        
         /**
          * 
          *
          * @param  el n� a a�adir    
          */
         public void a�adirNumero(int numero)
         {
               
         }
 
 

        /**
         * lee los n�meros de un fichero de texto 
         * Este m�todo no hay que modificarlo
         *      
         */
         public void cargarDeFichero() 
        {
             try
             {
                     sc = new Scanner(new File("numeros.txt"));
                     while (sc.hasNext() )
                           a�adirNumero(sc.nextInt());
             }
             catch (IOException e)
             {
                     e.printStackTrace();
             }
        }
        
        /**
         * 
         * Listar cada n�mero aparecido y su frecuencia
         * Se utiliza Map.Entry
         */
        public void listarFrecuencias()
        {
                
                
        }
        
         /**
         * 
         * Muestra cu�ntos n�meros diferentes han aparecido
         * y la relaci�n de todos ellos
         * 
         * Se utiliza la "vista" sobre las claves
         * y un for each
         */
        public void listarNumeros()
        {
               
                
        }
        
        
}
