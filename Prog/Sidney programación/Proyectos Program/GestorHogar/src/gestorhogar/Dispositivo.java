/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorhogar;

import java.util.Scanner;

/**
 *
 * @author dedei
 */
public abstract class Dispositivo implements Comparable {
    private String Nombre;
    private double Consumo;
    private boolean encendido;
    private Hora inicio;
    private Hora apagado;
    

    public Dispositivo(String n,double c){
    Nombre=n;
    Consumo=c;
    encendido=true;
    inicio=new Hora();
    
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getConsumo() {
        return Consumo;
    }

    public void setConsumo(double Consumo) {
        this.Consumo = Consumo;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    

    @Override
    public int compareTo(Object t) {
        if(t.getClass()==this.getClass()){
        Dispositivo d=(Dispositivo) t;
        if(d.getConsumo()<this.Consumo)return -1;
        if(d.getConsumo()==this.Consumo)return 0;
        if(d.getConsumo()>this.Consumo)return 1;
        }
        return -1;
    }
    
    public  void CalcularConsumo(){}
    
    public void apagar(){
        if(encendido){
        encendido=false;
        apagado=new Hora();
        }else
            System.out.println("Ya tiene su dispositivo apagado");
        
    }
    
    public void encender(){
        if(!encendido){
        encendido=true;
        inicio=new Hora();
        }else
            System.out.println("Ya tiene su dispositivo encendido");
    }
    
    public Hora tiempoEncendido(){
        if(encendido){
        Hora now=new Hora();
        int sum=now.aSegundos()-inicio.aSegundos();
        return inicio.aHora(sum);
        }
        int sum= inicio.aSegundos()-apagado.aSegundos();
        Hora now= inicio.aHora(sum);
        return now;
    }
    
    public String toString(){
    String aux="";
    aux+="Nombre: "+Nombre+"\nConsumo diario: "+Consumo+" Kwh";
    if(encendido)aux+="\nEstado: on";
    if(!encendido)aux+="\nEstado: off";
    aux+="\nTiempo de uso diario:"+tiempoEncendido();
    return aux;
    }
    
}
