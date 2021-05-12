import java.util.ArrayList;

/**
 * Gestiona el stock del negocio
 * El stock es descrito por 0 o mas productos
 * 
 *  @author K�lling y Barnes
 * A completar
 */
public class GestorStock
{
    // Lista de productos
    private ArrayList<Producto> listaProductos;

    /**
     * Inicializar el gestor de stock
     */
    public GestorStock()
    {
        
    }

    /**
     *A�adir un producto a la lista
     * @param queProducto El producto a a�adir
     */
    public void a�adirProducto(Producto queProducto)
    {
        
            
            
    }
    
    /**
     * Recibir una entrega de un producto particular
     * Incrementar la cantidad del producto en la cantidad indicada.
     * @param id El id del producto
     * @param cuanto La cantidad en que se incrementar� el producto
     */
    public void recibir(int id, int cuanto)
    {
            
            
            
    }
    
    /**
     * Intenta encontrar el producto con el id dado
     * @param id  El identificador del producto a buscar
     * @return   El productos si se encuentra, o null 
     *          si no se encuentra
     */
    public Producto localizarProducto(int id)
    {
        
      
            
            
    }
    
    
    /**
     * Intenta encontrar el producto a partir de su nombre
     * @param nombre  El nombre del producto a buscar
     * @return   El producto si se encuentra, o null 
     *          si no se encuentra
     */
    public Producto localizarProducto(String nombre)
    {
       
            
            
    }
    
    /**
     * Localiza un producto de id dado, y devuelve cuanto hay en stock. 
     * Si el id no existe devuelve 0
     * @param id El id del producto
     * @return La cantidad en stock del producto localizado
     */
    public int cantidadEnStock(int id)
    {
       
            
            
    }

    /**
     * Escribir detalles del producto
     */
    public void escribirDetallesProductos()
    {
       
            
            
    }
    
    /*
     * Escribir productos cuyo stock est�
     * por debajo de un cierto nivel que se 
     * pasa como par�metro
     */
     public void escribirMenorQue(int valor)
    {
       
            
            
    }

}
