/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.*;

public class GeneradorConjunto{
   private String palabra;
   private HashSet<String> conjunto;
   
   public GeneradorConjunto(String p){
       palabra=p.toUpperCase();
       conjunto= new HashSet();
       obtenerConjunto();
   }
   public GeneradorConjunto(){
       palabra=null;
       conjunto= new HashSet();
   }

    public String getPalabra() {
        return palabra;
    }

    public HashSet getConjunto() {
        return conjunto;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
        obtenerConjunto();
    }

    public void setConjunto(HashSet conjunto) {
        this.conjunto = conjunto;
    }
   
   public void obtenerConjunto(){
       String aux[]=palabra.split("");
       for(int i=0;i<aux.length;i++)
           conjunto.add(aux[i]);
   }

    @Override
    public String toString() {
        return "Palabra: "+palabra+" Conjunto: "+ conjunto;
    }
  
}
