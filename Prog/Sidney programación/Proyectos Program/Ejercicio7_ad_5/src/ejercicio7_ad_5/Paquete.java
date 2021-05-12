/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_ad_5;

/**
 *
 * @author dedei
 */
public class Paquete implements Producto{

    private int Num_ocurrencias;
    private Producto Producto;
    private String Nombre;
    
    public Paquete( int n, Producto p){
        Num_ocurrencias=n;
        Producto=p; 
        Nombre="Pack de "+n+"x "+p.getNombre();
    }
    
    public double getPrecio() {
        return Producto.getPrecio()*Num_ocurrencias;
    }

    public int getNum_ocurrencias() {
        return Num_ocurrencias;
    }

    public void setNum_ocurrencias(int Num_ocurrencias) {
        this.Num_ocurrencias = Num_ocurrencias;
    }

    public String getNombre() {
        return Nombre;
    }

    @Override
    public String getDescripcion() {
        return Nombre;
    }

    
    
    
    
   

}
