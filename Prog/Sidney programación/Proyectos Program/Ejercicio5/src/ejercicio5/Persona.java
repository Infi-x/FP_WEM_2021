/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.*;

public class Persona {
    private String nombre;
    private HashSet<String> hobbies;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nom) {
        nombre = nom;
        hobbies = new HashSet<String>();
    }

    /**
     * Métodos de la clase Persona
     */
    public String getNombre() {
        return nombre;
    }
   
    public void addHobbie(String h) {
        if (!tieneHobbie(h)) hobbies.add(h);
    }
    
    public boolean tieneHobbie(String h) {
        if (hobbies.contains(h)) return true;
        return false;
    }
    
    public String hobbiesToString() {
        String str = "";
        
        for (String cada:hobbies) {
            str += cada+", ";
        }
        return str;
    }
    
    public String toString() {
        return nombre+" tiene los siguientes hobbies: "+hobbiesToString();
    }
}
