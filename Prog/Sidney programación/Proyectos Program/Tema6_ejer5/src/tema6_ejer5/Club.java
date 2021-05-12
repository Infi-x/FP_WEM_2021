/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6_ejer5;

import java.util.*;

/**
 *
 * @author dedei
 */
public class Club {
    private String nombre;
    private ArrayList<Persona> personas;
    
    public Club(String n){
        nombre = n;
        personas = new ArrayList();
    }
    
    public void addPersona(String nombre, HashSet<String>hob){
        Persona aux = new Persona(nombre);
        for(String cada: hob)
            aux.addHobbie(cada);
        personas.add(aux);
    }
    
    public int personasConHobbie(String cual){
        int cont = 0;
        Iterator<Persona> it = personas.iterator();
        
        while(it.hasNext()){
            if(it.next().tieneHobbie(cual))
                cont++;
        }
        return cont;
    } 
    
    public void printClub(){
        System.out.println("El nombre de este club es: "+nombre);
        for(Persona cada: personas)
            System.out.println(cada);
    }
    
    public HashSet<String> borrarPersonasConHobbie(String cual){
        HashSet<String> aux = new HashSet();
        Iterator<Persona>it = personas.iterator();
        
        while(it.hasNext()){
            Persona nueva = it.next();
            if(nueva.tieneHobbie(cual)){
                aux.add(nueva.getNombre());
                it.remove();
            }
            
        }
        return aux;
    }
    
}
