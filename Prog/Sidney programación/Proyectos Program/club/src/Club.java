
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
public class Club {
    private String nombre;
    private ArrayList<Persona> personas;
    
    public Club(String n){
        nombre=n;
        personas=new ArrayList();
    }
    
    public void addPersona(String n, HashSet<String> h){
        Persona aux=new Persona(n);
        for(String cada: h)
            aux.addHobbie(cada);
        personas.add(aux);
    }
    
    public int personasConHobbie(String cual){
        int cont=0;
        Iterator<Persona> it;
        it= personas.iterator();
        while(it.hasNext()){
            Persona cada=it.next();
            if(cada.tieneHobbie(cual))
                cont++;
        }
            
        return cont;
    }
    
    public void printClub(){
        System.out.println("Club "+nombre);
        for(Persona cada:personas)
            System.out.println(cada);
    }
    
    public HashSet<String> borrarPersonasConHobbie(String Cual){
    HashSet<String> aux=new HashSet();
    Iterator<Persona> it=personas.iterator();
    while(it.hasNext()){
        Persona cada=it.next();
        if(cada.tieneHobbie(Cual)){
            aux.add(cada.getNombre());
            it.remove();
        }
         
    }
    return aux;
    }
}
