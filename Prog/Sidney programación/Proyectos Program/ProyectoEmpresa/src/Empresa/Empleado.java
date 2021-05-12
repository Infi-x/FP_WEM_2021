/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author dedei
 */
public class Empleado {
    private String nombre;
    private String puesto;
    private double sueldo;
    private int anio;
    public Empleado(String n, String p,double s, int a){
        nombre=n;
        puesto=p; 
        sueldo=s;
        anio=a;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    public String SueldoS() {
        return String.format("%6.2f",sueldo);
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public void IncremenSueldo(double sueldo) {
        this.sueldo+= sueldo;
    }
    
    public String toString(){
        return "Nombre: "+nombre+
                "\nPuesto: "+puesto+
                "\nSalario base: "+SueldoS()+"€";
    }
    
    
}
