/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.exam;

public  class Persona implements Comparable<Persona>{
   private String nombre;
   private Estado estado;
   private fecha fechaNAc;



   
    public Persona(String n,Estado e,fecha f){
    
        nombre=n.toUpperCase();
        estado=e;
        fechaNAc=f;
    }
    
    public int compareTo(Persona p){
        return nombre.compareTo(p.nombre);
    }

    public String getNombre() {
        String[] aux=nombre.split(" ");
        String nom="";
        nom+=aux[0].charAt(0)+". ";
        for(int i=1;i<aux.length;i++)
        nom+=aux[i]+" ";
        
        return nom;
    }

    public String getNombre2() {
        return nombre;
    }

    public Estado getEstado() {
        return estado;
    }
    
        public String getEstado2() {
        return ""+estado;
    }

    public fecha getFechaNAc() {
        return fechaNAc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setFechaNAc(fecha fechaNAc) {
        this.fechaNAc = fechaNAc;
    }

    @Override
    public String toString() {
        return "Nombre=" + getNombre() + "\nEstado civil=" + estado + "\nFecha Nacimiento=" + fechaNAc;
    }
    
    
}
