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
public class Producto {
    private String codigo;
    private double precio;
    
    public Producto(String id, double p) {
        codigo = id;
        precio = p;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setCodigo(String id) {
        codigo = id;
    }
    
    public void setPrecio(double p) {
        precio = p;
    }
    
    @Override
    public String toString() {
        return "El producto con código "+getCodigo()+" tiene un precio de "+getPrecio();
    }
}
