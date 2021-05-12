/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_10;

/**
 *
 * @author dedei
 */
public class Jugador {
    private String Nombre;
    private int Edad;
    
    public Jugador(String n,int d){
        Nombre=n.toUpperCase();
        Edad=d;
    }

    public String getNombre() {
        return Nombre;
    }
        public String getNombre2() {
        String aux[]=Nombre.split("");
        String aux2="";
        for(int i=1;i<aux.length;i++)
            aux2+=aux[i];
        return ""+aux[0]+aux2;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre.toUpperCase();
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Jugador:\n" + "Nombre:" + getNombre2() + "\nEdad:" + Edad+"\n\n";
    }
    
    
}
