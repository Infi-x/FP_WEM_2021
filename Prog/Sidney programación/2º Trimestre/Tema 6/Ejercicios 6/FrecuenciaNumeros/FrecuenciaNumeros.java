
/**
 * La clase mantiene un map en el
 * que se registran las veces que 
 * aparece cada uno de los números
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
          * @param  el nº a añadir    
          */
         public void añadirNumero(int numero)
         {
               
         }
 
 

        /**
         * lee los números de un fichero de texto 
         * Este método no hay que modificarlo
         *      
         */
         public void cargarDeFichero() 
        {
             try
             {
                     sc = new Scanner(new File("numeros.txt"));
                     while (sc.hasNext() )
                           añadirNumero(sc.nextInt());
             }
             catch (IOException e)
             {
                     e.printStackTrace();
             }
        }
        
        /**
         * 
         * Listar cada número aparecido y su frecuencia
         * Se utiliza Map.Entry
         */
        public void listarFrecuencias()
        {
                
                
        }
        
         /**
         * 
         * Muestra cuántos números diferentes han aparecido
         * y la relación de todos ellos
         * 
         * Se utiliza la "vista" sobre las claves
         * y un for each
         */
        public void listarNumeros()
        {
               
                
        }
        
        
}
