/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesauro;

import java.util.*;
/**
 *
 * @author antonioalonso
 */
public class Tesauro {
    private HashMap<String, String> tesauro;
    
    public Tesauro() {
        tesauro = new HashMap();
    }
    
    public void aniadirSinonimo(String pal, String sin) {
        pal=pal.toUpperCase();
        sin=sin.toUpperCase();
       String s=tesauro.get(pal);
       if(s==null)tesauro.put(pal,sin);
       else if (s.contains(sin)==false) {
            String aux=s+" "+sin;
            tesauro.put(pal, aux);
        }
    }
    
    public boolean estaAqui(String p,String[]aux){
    for(int i=0;i<aux.length;i++)
        return p.equalsIgnoreCase(aux[i]);
        return false;
    }
    
    public void aniadirSinonimo(String conjunto) {
        String[] palabras = conjunto.split(" ");
        for (int i = 1; i < palabras.length; i++) 
            aniadirSinonimo(palabras[0],palabras[i]);
     
    }
    
    public ArrayList<String> borrarSinonimo(String sin) {
        sin=sin.toUpperCase();
        ArrayList<String> borrados=new ArrayList();
        for (String cada:tesauro.keySet()) {      
            if (tesauro.get(cada).contains(sin)) {
                borrados.add(cada);
                borrarSin(cada,sin);
            }
        }
        return borrados;
    }
    
    private void borrarSin(String p, String s){
    String[] partida=tesauro.get(p).split(p);
    String aux="";
    for(String cada:partida)
        if(cada.equals(s)==false)aux+=cada+" ";
        tesauro.put(p,aux.trim());
    }
    
    public void escribirTesauro(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        String s = "";
        for (String cada:tesauro.keySet()) {
            s += cada+": "+tesauro.get(cada)+"\n";
        }
        return s;
    }
}
