/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

/**
 *
 * @author dedei
 */
public class Mascota {

    private String nombre;
    private Especie especie;
    private String duenio;
    private fecha fechaNac;

    public Mascota(String n,Especie e,String d,fecha f){
    
        nombre=n.toUpperCase();
        especie=e;
        duenio=d;
        fechaNac=f;
    }
    
    public int compareTo(String nom){
    return nombre.compareTo(nom);
    }

    public String getNombre() {
        String aux=""+nombre.charAt(0);
        nombre.toLowerCase();
        for(int i=1;i<nombre.length();i++)
            aux+=nombre.charAt(i);
        nombre.toUpperCase();
        return aux;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getStringEs2() {
        String aux="";
        switch(especie){
          case T_REX: aux="T-REX";break;
          case SPYDER: aux="ARAÑA";break;
          default:aux=""+especie;
        }
        return aux;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public String getDuenio() {
     String[]vec=duenio.split("-");
     String aux=""+vec[0]+" "+vec[1];
        return aux;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public fecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(fecha fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Nombre: "+getNombre()+" (Dueño: "+getDuenio()+")\n"
                +"Especie: "+getStringEs2()+"\n"
                +"Fecha de nacimiento: "+fechaNac;
                }

    public Especie getEspecie() {
        return especie;
    }
    
    
}
