
/**
 * Clase FrecuenciaBigramas 
 * 
 * @author 
 * @version 
 */

import java.util.Scanner;
import java.io.*;

public class FrecuenciaBigramas
{
         
        

        /**
         * Constructor de la clase FrecuenciaBigramas
         */
        public FrecuenciaBigramas(String fichero)
        {
               
        }

        /**
         * 
         * @param  
         * @return
         */
        private void procesarFichero(String fichero)
        {
                try
                {
                     Scanner sc = new Scanner(new File(fichero)); //palabras.txt
                    
                     while (sc.hasNext())
                     {
                          String actual = sc.next();
                          
                          
                          
                          
                          
                     }
                }
                catch (IOException e)
                {
                     e.printStackTrace();
                }
        }
        
       
        
        
        
}
