package Tesa;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dedei
 */
public class Tesauro {
    private HashMap<String,HashSet<String>> tesauro;
    
    public Tesauro(){
        tesauro=new HashMap();
    }
    
    public void addSim(String p,String s){
        if(!p.equalsIgnoreCase(s)){
            if(tesauro.containsKey(p)){
                HashSet<String> aux= tesauro.get(p);
                aux.add(s);
                tesauro.put(p, aux);
            }else{
                HashSet<String> aux=new HashSet();
                aux.add(s);
                tesauro.put(p, aux);
            }
        }
    }
    
    public void addSimConComa(String c){
        String[] cadena=c.split(",");
            for(int i=1;i<cadena.length;i++)
                this.addSim(cadena[0].trim(),cadena[i].trim());
    }
    
    public String borrarSim(String s){
        String aux="";
        for(String clave:tesauro.keySet()){
            if (tesauro.get(clave).contains(s)){
                tesauro.get(clave).remove(s);
                aux+=clave+" ";
            }   
        }        
        return aux;
    }

    @Override
    public String toString() {
     String aux="";
     for(String clave: tesauro.keySet()){
         aux+="Palabra: "+clave+" sinonimos:[ ";
         for(String sim:tesauro.get(clave))
             aux+=sim+" ";
         aux+=" ]\n";
     }
         return aux;
    }
    
    public boolean verContains(String s){
        HashSet<String> aux=new HashSet();
        aux.add(s);
        return aux.remove(s);
    }
}