/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.exam;

import java.util.*;
public class Lista {
    ArrayList<Persona> personas;
    
    public Lista(){
    personas= new ArrayList();
    }
    
    public int cuantosDivorciados(){
        int cont=0;
        Iterator<Persona> it= personas.iterator();
        while(it.hasNext()){
            Persona siguiente=it.next();
            if(siguiente.getEstado()==Estado.DIVORCIADO)cont++;
        }
        return cont;
    }
    
    public void mostrarPersona(){
        String aux="";
        for(Persona cada:personas)
            aux+=cada+"\n \n";
        System.out.print(aux);
    }
    
    public ArrayList<Persona> borrarSolteros(){
    ArrayList<Persona> aux=new ArrayList();
        for(int i=0;i<personas.size();i++){
            if(personas.get(i).getEstado()==Estado.SOLTERO)
            {
                aux.add(personas.get(i));
                personas.remove(i);
                i--;
            }
        }
    return aux;
    
    }
    
    public void ordenar(){
    Collections.sort(personas);
    }
    public void desordenar(){
    Collections.shuffle(personas);
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    
    public void addPersona(Persona p){
    if(p==null){}
        else personas.add(p);
    }
    
    public ArrayList getLista(){
    return personas;
    }
}

