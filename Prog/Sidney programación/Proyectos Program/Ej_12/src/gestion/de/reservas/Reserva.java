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
public class Reserva {
    private String Nombre;
    private int comensales;
    private String id;
    
    public Reserva(String n,int c,int i){
    Nombre=n;
    comensales=c;
    id=""+i;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getComensales() {
        return comensales;
    }

    public void setComensales(int comensales) {
        this.comensales = comensales;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nNombre: " + Nombre + "\nComensales: " + comensales + "\nid: " + id+"\n\n";
    }
    
    
}
