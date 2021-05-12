
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dedei
 */
public class Persona {
    private String nombre;
    private HashSet<String> hobbies;
    
    public Persona(String n){
        nombre=n;
        hobbies=new HashSet();
    }
    public String getNombre(){
        return nombre;
    }
    
    public void addHobbie(String h){
        if(!tieneHobbie(h))
            hobbies.add(h.toLowerCase());
    }
    
    public boolean tieneHobbie(String h){
        return hobbies.contains(h);
    }
    
    public String hobbiesToString(){
        String aux="";
        for(String cada:hobbies)
            aux+="-"+cada+"\n";
        return aux;
    }
    
    public String toString(){
        String aux="Nombre: "+nombre+"\nHobbies:\n"+this.hobbiesToString();
        return aux;
    }
}
