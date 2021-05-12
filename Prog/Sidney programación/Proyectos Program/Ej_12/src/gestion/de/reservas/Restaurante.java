/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.reservas;

import java.util.*;
/**
 *
 * @author dedei
 */
public class Restaurante {
    private String Nombre;
    private Mesa[] Mesas;
    private ArrayList<Reserva> Reservas;
    
    public Restaurante(String nombre, int cuantas){
        Nombre=nombre;
        Mesas= new Mesa[cuantas];
        Reservas= new ArrayList();
        inicializarMesas();
    }
    
    public void inicializarMesas(){
        for(int i=0;i<Mesas.length;i++){
            Mesas[i]=new Mesa(i+1, (int) (Math.random()*15 + 2));
        }
    }

    public String getNombre() {
        return Nombre;
    }
    
    public boolean HacerReserva(String nombre,int c){
        int intento=AsignarMesa(c);
        if(intento>-1){
            Reservas.add(0,new Reserva(nombre,c,intento));
            Mesas[intento-1].setLibre(false);
            return true;
        }
        return false;
    }
    
    private int AsignarMesa(int c){
        int sum=0;
        for(int i=0;i<Mesas.length;i++){
            if((c+sum)==Mesas[i].getCapacidad()&& Mesas[i].isLibre())return i+1;
            if(i==Mesas.length-1){
                if((c+sum)>16)return -1;
                i=0;
                sum++;
            }
        }
        return -1;
    }
    
    public void MostrarReservas(){
        Iterator<Reserva> it;
        it=Reservas.iterator();
        while(it.hasNext()){
        Reserva cada=it.next();
        System.out.println(cada);
        }
    }
    
    public void MostrarRestaurante(){
        for(Mesa cada:Mesas)
            System.out.println(cada);
    }
    
    
    public void EliminarReservas(){
        Reservas.clear();
        for(int i=0;i<Mesas.length;i++)
            Mesas[i].setLibre(true);
    }
    
    }