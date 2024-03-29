/**
 * 
 * Esta clase contiene la relaci�n de comandos - �rdenes -
 * que reconoce el juego. Se utiliza para reconocer �rdenes que
 * teclea el usuario.
 * 
 * @author  Michael Kolling y David J. Barnes
 * @version 2006.03.30
 */ 

public class RepertorioOrdenes 
{
        private static final String[] ordenesValidas = {
            "ir", "salir", "ayuda"};

      /**
      * Constructor - inicializa las �rdenes
      */
      public RepertorioOrdenes() 
      {
        // no hace nada
      }
    
     /**
     * Verifica si una cadena (String) dada es una
     * palabra de comando v�lida. 
     * @return true Si la orden es v�lida
     * false si no lo es
     */
      public boolean esOrden(String unaCadena)
      {
        for (int i = 0; i < ordenesValidas.length; i++)
            if (ordenesValidas[i].equals(unaCadena))  return true;
        return false;
      }
      
     
}