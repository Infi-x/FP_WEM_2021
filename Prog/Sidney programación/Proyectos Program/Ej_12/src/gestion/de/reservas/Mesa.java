/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.reservas;

/**
 *
 * @author dedei
 */
public class Mesa {
    private String id;
    private int capacidad;
    private boolean libre;
    
    public Mesa(int i,int cap){
        id=i+"";
        capacidad=cap;
        libre=true;
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        this.id =""+id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    @Override
    public String toString() {
        return "\nMesa id="+id+"\nCapacidad="+capacidad+"\nLibre="+libre+"\n\n";
    }
    
}
