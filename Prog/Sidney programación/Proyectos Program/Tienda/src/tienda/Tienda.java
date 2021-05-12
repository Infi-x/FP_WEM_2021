/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author antonioalonso
 */
public class Tienda {
    private final int MAX = 20;
    private String nombre;
    private ProductoInventariado[] inventario;
    private int ultimaEntrada;
    private double caja;
    
    public Tienda(String nom, double c) {
        inventario = new ProductoInventariado[MAX];
        nombre = nom;
        caja = c;
        ultimaEntrada = -1;
    }
    
    public int buscarProducto(String id) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].getCodigo().equals(id))
                return i;
        }
        return -1;
    }
    
    public void addProducto(String id, double p, int c, int per) {
        int pos = buscarProducto(id);
        
        if (pos==-1) {
            if (ultimaEntrada>=MAX-1 || p*c <= caja)
                throw new IllegalArgumentException("No se puede añadir el producto.");
            ProductoInventariado nuevo = new ProductoInventariado(id, p, c, per);
            inventario[ultimaEntrada+1] = nuevo;
            ultimaEntrada++;
            caja = caja - p*c;
        } else {
            if (inventario[pos].getPrecio()*c <= caja)
                throw new IllegalArgumentException("No se puede modificar el producto.");
            inventario[pos].setCantidad(inventario[pos].getCantidad()+c);
            caja = caja - inventario[pos].getPrecio()*c;
        }
    }
    
    public void venderProducto(String id, int c) {
        int pos = buscarProducto(id);
        
        if (pos==-1)
            throw new IllegalArgumentException("Producto no encontrado.");
        if(inventario[pos].getCantidad() < c)
            throw new IllegalArgumentException("Producto agotado.");
        
        inventario[pos].setCantidad(inventario[pos].getCantidad() - c);
        caja = caja + inventario[pos].getPrecio()*c;
    }
}
