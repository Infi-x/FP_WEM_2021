/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.*;

public class ListaNombres {
    private ArrayList<String> lista;
    public ListaNombres(){
    lista= new ArrayList();
    }
    
    public int buscarPosicion(String a){
    for(int i=0;i<lista.size();i++)
        if(a.compareToIgnoreCase(lista.get(i))<0)
            return i;
     return lista.size();
    }
    
    public String obtenerConjunto(int pos, GeneradorConjunto gn){
    if(gn==null ||pos>=lista.size()) throw new IllegalArgumentException("Gilipollas");
    gn.setPalabra(lista.get(pos));
    return ""+gn;        
    }
    
    public void addNombre(String n){
        n.toUpperCase();
        int a= buscarPosicion(n);
        lista.add(a,n);
    }
    
    public String toString(){
    String aux="";
    for(int i=0;i<lista.size();i++)
        aux+=(i+1)+" "+lista.get(i)+" ";
    return aux.trim();
    }
    
}
