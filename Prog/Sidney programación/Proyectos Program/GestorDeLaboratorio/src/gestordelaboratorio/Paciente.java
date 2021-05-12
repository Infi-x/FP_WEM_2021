/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordelaboratorio;

import java.util.ArrayList;

/**
 *
 * @author lunis
 */
public class Paciente {
    private String Nombre;
    private String id;
    private int Edad;
    private Fecha nacimiento;
    private double Peso;
    private ArrayList<Pato> Patologias;
    
    public Paciente(String n,String i,int e,Fecha f,double p, ArrayList<Pato> pa){
        Nombre=n;
        id=i;
        Edad=e;
        nacimiento=f;
        Peso=p;
        Patologias=pa;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public ArrayList<Pato> getPatologias() {
        return Patologias;
    }

    public void setPatologias(ArrayList<Pato> Patologias) {
        this.Patologias = Patologias;
    }
    
    public boolean BuscarPato(String p){
    for(int i=0;i<Patologias.size();i++)
        if(Patologias.get(i).name().equalsIgnoreCase(p))
            return true;
    return false;
    }
    
    public String EscribirPato(){
        String Aux="";
        for(Pato cada:Patologias)
            Aux+="\t-"+cada+"\n";
        if(Patologias.size()==0)
            return "Sin Patologias";
        return Aux;
            
    }
    public String toString(){
       
    return "Nombre: "+Nombre+" id:"+id+"\nEdad: "+Edad+"\nPeso: "+Peso+"\nPatologias:\n"+EscribirPato();
    }
}
