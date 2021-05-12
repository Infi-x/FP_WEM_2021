/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_ad_5;

import java.util.*;

/**
 *
 * @author dedei
 */
public class GrupoProductos implements Producto{
    private ArrayList<Producto> Productos;
    private String nombre;
    
    public GrupoProductos(String n){
        Productos=new ArrayList();
        nombre="Kit de "+n.toUpperCase();
    }
    
    public void add(Producto p){
        Productos.add(p);
    }

    @Override
    public double getPrecio() {
        double precioFinal=0.0;
       for(Producto cada:Productos)
           precioFinal+=cada.getPrecio();
       return precioFinal;
    }

    @Override
    public String getDescripcion() {
        String d=getNombre()+"{";
        for(int i=0;i<Productos.size();i++){
            if(i!=0)d+=", ";
            d+=Productos.get(i).getDescripcion();
        }
        return d+"}";
    }

    @Override
    public String getNombre() {
        return nombre;
    }

}
