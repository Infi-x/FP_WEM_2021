/**
 * Este proyecto modela una sencilla m�quina expendedora de billetes.
 * El precio del ticket se especifica via el constructor.
 * Es una m�quina sencilla en el sentido de que conf�a que el usuario 
 * inserte el suficiente dinero antes de emitir el ticket.
 * Asume tambi�n que el usuario introduce cantidades positivas
 */

 public class  MaquinaExpendedora
{
    // El precio de un ticket en esta m�quina
    private int precio;
    // Cantidad de dinero introducida por el usuario hasta ahora
    private int importe;
    // Cantidad total de dinero recogida por la m�quina
    private int total;

    /**
     * Crear una m�quina que emite tickets de un determinado precio
     * El precio ha de ser mayor que 0 y no hay que verificar esto
     */
  
    public MaquinaExpendedora(int precioTicket)
    {
        precio = precioTicket;
        importe = 0;
        total = 0;
    }
    
    /**
     * Devolver el precio de un billete
     */
    public int getPrecio()
    {
        return precio;
    }
    
    /**
     * Modificar el precio de un billete
     */
    public void setPrecio(int precioCoste)
    {
        precio=precioCoste;
    }
    
    /**
     * Devolver el total de la caja de la maquina
     */
    public int getTotal()
    {
        return total;
    }

    /**
     * Devolver la cantidad de dinero insertada hasta el momento
     * para el billete
     */
    public int getImporte()
    {
        return importe;
    }
     
    /**
     * Recibir una cantidad de dinero de un usuario
     */
         
    public void insertarDinero(int cantidad)
    {
        if(cantidad>0)importe = importe + cantidad;
        else System.out.println("Debe usted introducir cantidades positivas");
    }
    
    /**
     * Devuelve el cambio
     */
         
    public int devolverCambio()
    {
        int aux=importe;
        importe=0;
        return aux;
    }
    
    /**
     * Imprime una frase en pantalla
     */
         
    public void prompt()
    {
        System.out.println("Por favor, inserte la cantidad correcta de dinero");
    }
    
    /**
     * Imprime el precio
     */
         
    public void mostrarPrecio()
    {
        System.out.println("El precio total del ticket es " +precio+ " cents");
    }

    /**
     * Imprimir un ticket
     * Actualizar el total recolectado por la m�quina y
     * poner el importe a 0
     */
    
    public void imprimirTicket()
    {
        System.out.println("##################");
        System.out.println("# M�quina expendedora BlueJ");
        System.out.println("# Billete:");
        System.out.println("# " + precio + " cents.");
        System.out.println("##################");
        System.out.println();

        // Actualizar el total recogido por la m�quina
        total = total + precio;
        // Poner el importe a 0
        importe = importe-precio;
    }
    
    /**
     * Vac�a la caja de la m�quina
     * poner el importe a 0
     */
    public int vaciarMaquina()
    {
        int aux=total;
        total=0;
        return aux;
    }
}
