/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6_ejer6;

import java.util.HashSet;

/**
 *
 * @author dedei
 */
public class GeneradorConjunto {
    private String palabra;
    private HashSet<Character> conjunto;
    
    public GeneradorConjunto(String p){
        palabra = p.toUpperCase();
        conjunto = new HashSet();
    }
    
    public GeneradorConjunto(){
        palabra = "MARIA";
        conjunto = new HashSet();
    }
    
    public void setPalabra(String p){
        palabra = p;
    }
    
    public void obtenerConjunto(){
        char a=0;
        for(int i=0; i<palabra.length(); i++){
            a=palabra.charAt(i);
            conjunto.add(a);
        }
    }
    
    public String getPalabra(){
        return this.palabra;
    }
    
    public String toString(){
        String aux = "";
        aux+="Esta es mi palabra: "+palabra+", y este es su conjunto:";
        for(char cada: conjunto)
            aux+=" -"+cada;
        return "-"+aux;
   }
}

























































/*
    private String palabra;
    private HashSet<Character> conjunto;
    
    public GeneradorConjunto(String g){
        palabra = g.toUpperCase();
        conjunto = new HashSet();
    }
    
    public GeneradorConjunto(){
        palabra="POLLON";
        conjunto=new HashSet();
    }
    
    public void setPalabra(String p){
        palabra = p.toUpperCase();
    }
    
    public void obtenerConjunto(){
     for(int i=0; i<palabra.length();i++)
         conjunto.add(palabra.charAt(i));
    }
    
    public String getPalabra(){
        return this.palabra;
    }
    
     public String toString() {
        String aux= "Palabra: "+palabra+" Conjunto: ";
        for(Character cada: conjunto)
            aux+=""+cada+", ";
        return aux;
    }
    
*/




























/*

public void obtenerConjunto(){
    for(int i=0;i<palabra.length();i++)
           conjunto.add(palabra.charAt(i));
    }
    
    public String toString() {
        String aux= "Palabra: "+palabra+" Conjunto: ";
        for(Character cada: conjunto)
            aux+=""+cada+", ";
        return aux;
    }
*/