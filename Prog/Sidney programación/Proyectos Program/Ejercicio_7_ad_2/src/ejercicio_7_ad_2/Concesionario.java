/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7_ad_2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author dedei
 */
public class Concesionario {
    private String nombre;
    private ArrayList<Coche> Coches;
    
    public Concesionario(String nom){
    nombre=nom;
    Coches=new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }
    
    public void aniadir(Coche co){
    int cont=0;
    for(Coche cada:Coches){
    if(cada.equals(co)){
    cont=1;
    break;
    }
    }
    if(cont==1)System.out.println("No se puede añadir el coche que desea");    
    else Coches.add(co);
    }
    
    public void borrarDeConductor(String quien){
        Iterator<Coche> it= Coches.iterator();
        while(it.hasNext()){
        if(it.next().getConductor().equalsIgnoreCase(quien))it.remove();
        }
    }
    
    public void listarCoches(){
        for(Coche cada:Coches)
        System.out.println(cada);
    }
    
    public void borrarTaxis(){
    Iterator<Coche> it= Coches.iterator();
        while(it.hasNext()){
        if(it.next().getTipo().equalsIgnoreCase("TAXI"))it.remove();
        }
    }
    
    public void AvanzarTodos(){
    for(Coche cada:Coches)
        cada.avanza();
    }
}
