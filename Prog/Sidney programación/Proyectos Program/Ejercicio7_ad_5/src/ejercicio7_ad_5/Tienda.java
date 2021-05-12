/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_ad_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author dedei
 */
public class Tienda {
    private HashMap<Producto,Integer> almacen;
    private String nombre;
    private double caja;
    private double beneficio;
    
    public Tienda(String n, double c, double b){
        almacen=new HashMap();
        nombre=n.toUpperCase();
        caja=c;
        beneficio=b;
    }
    
    public void ComprarProducto(Producto p, int cuantos){
        double precioTotal=p.getPrecio()*cuantos;
        if(caja<precioTotal)return;
        int cant=cuantosHay(p);
        if(cant!=1)cuantos+=cant;
        almacen.put(p, cuantos);
        caja-=precioTotal;
    }

    public int cuantosHay(Producto p){
        for(Producto cada:almacen.keySet())
            if(cada.equals(p))return almacen.get(cada);
        return -1;
    }
    
    public void venderProducto(Producto p, int cuantos){
        int cant=cuantosHay(p);
        if(cant==-1|| cant<cuantos)return;
        double totalprecio=p.getPrecio()*cuantos*(1+beneficio);
        almacen.put(p, cant-cuantos);
        caja+=totalprecio;
    }
    
    public void listarProductos(){
        System.out.print("Inventario de La tienda "+nombre+"\n");
        for(Producto cada:almacen.keySet())
            if(cada instanceof Articulo){
                if(almacen.get(cada)==1)
                    System.out.println("\nProducto: 1x "+cada.getDescripcion()+"\nPrecio: "+String.format("%.2f",cada.getPrecio()*(1+beneficio))+"\nTipo: "+cada.getClass().getSimpleName());
                else
                    System.out.println("\nProducto: "+(almacen.get(cada)+1)+"x "+cada.getDescripcion()+"\nPrecio: "+String.format("%.2f",cada.getPrecio()*almacen.get(cada)*(1+beneficio))+"€("+String.format("%.2f",cada.getPrecio()*(1+beneficio))+"€ por unidad)"+"\nTipo: "+cada.getClass().getSimpleName());            
            }
        for(Producto cada:almacen.keySet())
            if(cada instanceof Paquete){
                if(almacen.get(cada)==1)
                    System.out.println("\nProducto: 1x "+cada.getDescripcion()+"\nPrecio: "+String.format("%.2f",cada.getPrecio()*(1+beneficio))+"\nTipo: "+cada.getClass().getSimpleName());
                else
                    System.out.println("\nProducto: "+(almacen.get(cada)+1)+"x "+cada.getDescripcion()+"\nPrecio: "+String.format("%.2f",cada.getPrecio()*almacen.get(cada)*(1+beneficio))+"€("+String.format("%.2f",cada.getPrecio()*(1+beneficio))+"€ por unidad)"+"\nTipo: "+cada.getClass().getSimpleName());            
            }
        for(Producto cada:almacen.keySet())
             if(cada instanceof GrupoProductos){   
                if(almacen.get(cada)==1)
                    System.out.println("\nProducto: 1x "+cada.getDescripcion()+"\nPrecio: "+String.format("%.2f",cada.getPrecio()*(1+beneficio))+"\nTipo: "+cada.getClass().getSimpleName());
                else
                    System.out.println("\nProducto: "+(almacen.get(cada)+1)+"x "+cada.getDescripcion()+"\nPrecio: "+String.format("%.2f",cada.getPrecio()*almacen.get(cada)*(1+beneficio))+"€("+String.format("%.2f",cada.getPrecio()*(1+beneficio))+"€ por unidad)"+"\nTipo: "+cada.getClass().getSimpleName());            
            }
             
        System.out.println("\nTotal en la caja: "+String.format("%.2f",caja)+"€");
        System.out.println("\nBeneficio en cada compra: "+String.format("%.2f",beneficio)+"€");
    }
        
    
    public void ModificarPrecioArticulo(String n,double p){
        for(Producto cada:almacen.keySet())
            if(cada instanceof Articulo)
                if(cada.getNombre().equalsIgnoreCase(n))
                ((Articulo) cada).setPrecio(cada.getPrecio()+p);        
    }
    
    
    }

