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
public class ProductoInventariado extends Producto {
    private int cantidad, porcentaje;
    
    public ProductoInventariado(String id, double p, int c, int per) {
        super(id, p);
        cantidad = c;
        porcentaje = per;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public int getPorcentaje() {
        return porcentaje;
    }
    
    public void setCantidad(int c) {
        cantidad = c;
    }
    
    public void setPorcentaje(int per) {
        porcentaje = per;
    }
    
    @Override
    public String toString() {
        return super.toString()+". Además, hay "+getCantidad()+" unidades y se"
                +" le aplica un porcentaje del "+getPorcentaje()+"%.";
    }
}
