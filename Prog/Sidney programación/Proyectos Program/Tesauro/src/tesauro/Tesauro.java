/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesauro;

import java.util.*;


public class Tesauro {

     private HashMap<String, HashSet<String>> tesauro;
     
     public Tesauro(){
         tesauro= new HashMap();
     }
     
     public void aniadirSinonimo(String s, String p){
              if (!s.equals(p)) {
                HashSet<String> sinonimo=new HashSet();
                sinonimo = tesauro.get(s);
                sinonimo.add(p);
                tesauro.put(s, sinonimo);
        }
     }
     
      public void aniadirSinonimoC(String conjunto) {
        String[] palabras = conjunto.split(" ");
        HashSet<String> sinonimos =tesauro.get(palabras[0]);
        
        for (int i = 1; i < palabras.length; i++) {
            if (!palabras[0].equals(palabras[i]) && !sinonimos.contains(palabras[i]))
                sinonimos.add(palabras[i]);
        }
        
        tesauro.put(palabras[0], sinonimos);
    }
    
    public HashSet<String> borrarSinonimo(String sin) {
        HashSet<String> claves = new HashSet();
        
        for (String cada:tesauro.keySet()) {      
            if (tesauro.get(cada).contains(sin)) {
                tesauro.get(cada).remove(sin);
                claves.add(cada);
            }
        }
        return claves;
    }
    
    @Override
    public String toString() {
        String s = "";
        for (String cada:tesauro.keySet()) {
            s += cada.toUpperCase()+": "+tesauro.get(cada)+"\n";
        }
        return s;
    }
}
