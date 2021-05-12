/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuencia;

import java.util.*;
/**
 *
 * @author antonioalonso
 */
public class Secuencia {
    private ArrayList<Integer> sec;
    
    public Secuencia(ArrayList<Integer> s) {
        sec = new ArrayList();
        sec.addAll(s);
        Collections.sort(sec);
    }
    
    public ArrayList<Integer> getSecuencia() {
        ArrayList<Integer> copia = new ArrayList();
        copia.addAll(sec);
        return copia;
    }
    
    public Secuencia fusionarCon(Secuencia otra) {
        Secuencia fusion = new Secuencia(fusionar(this.getSecuencia(), otra.getSecuencia()));
        return fusion;
    }
    
    public Secuencia interseccionCon(Secuencia otra) {
        Secuencia inter = new Secuencia(interseccion(this.getSecuencia(), otra.getSecuencia()));
        return inter;
    }
    
    private ArrayList<Integer> fusionar(ArrayList<Integer> s1, ArrayList<Integer> s2) {
        ArrayList<Integer> fusion = new ArrayList();
        if (s1 != null) fusion.addAll(s1);
        if (s2 != null) fusion.addAll(s2);
        Collections.sort(fusion);
        return fusion;
    }
    
    private ArrayList<Integer> interseccion(ArrayList<Integer> s1, ArrayList<Integer> s2) {
        ArrayList<Integer> inter = new ArrayList();
        
        for (Integer cada: s1) {
            if (s2.contains(cada)) {
                inter.add(cada);
                s2.remove(cada);
            }
        }
        Collections.sort(inter);
        return inter;
    }
    
    @Override
    public String toString() {
        String s = "["; 
        for (Integer cada: sec) s += cada+", ";
        s += "]";
        return s;
    }
}
