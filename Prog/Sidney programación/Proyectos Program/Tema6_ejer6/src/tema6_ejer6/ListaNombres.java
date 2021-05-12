/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6_ejer6;

import java.util.ArrayList;

/**
 *
 * @author dedei
 */
public class ListaNombres {
   private ArrayList<String> lista;
   
   public ListaNombres(){
       lista = new ArrayList<String>();
   }
   
   public void anadirNombre(String n){
       n=n.toUpperCase();
       int p = buscarPosicion(n);
       lista.add(p, n);
   }
   
   private int buscarPosicion(String p){
       
       for(int i=0; i<lista.size();i++)
           if(p.compareToIgnoreCase(lista.get(i))<0)
            return i;
       return lista.size();
   }
   
   public String obtenerConjuntoDe(int pos, GeneradorConjunto gn){
       if(gn==null || pos>=lista.size())throw new IllegalArgumentException("Hola bb");
       gn.setPalabra(lista.get(pos));
       gn.obtenerConjunto();
       return ""+gn;
   }
   
   public String toString(){
       String aux = "";
       for(int i=0; i<lista.size();i++)
           aux+=(i+1)+" "+lista.get(i)+" ";
       return aux;
   }
   
   
    
}







































/*
    private ArrayList<String> lista;
    
    public ListaNombres(){
        lista= new ArrayList();
    }
    public int buscarPosicion(String a){
        a=a.toUpperCase();
    for(int i=0;i<lista.size();i++)
        if(a.compareToIgnoreCase(lista.get(i))<0)
            return i;
     return lista.size();
    }
    
    public String obtenerConjunto(int pos, GeneradorConjunto gn){
    if(gn==null ||pos>=lista.size()) throw new IllegalArgumentException("Gilipollas");
    gn.setPalabra(lista.get(pos));
    gn.obtenerConjunto();
    return ""+gn;        
    }
    
    public void addNombre(String n){
        int a= buscarPosicion(n);
        lista.add(a,n.toUpperCase());
    }
    
    public String toString(){
    String aux="";
    for(int i=0;i<lista.size();i++)
        aux+=(i+1)+" "+lista.get(i)+" ";
    return aux.trim();
    }
*/