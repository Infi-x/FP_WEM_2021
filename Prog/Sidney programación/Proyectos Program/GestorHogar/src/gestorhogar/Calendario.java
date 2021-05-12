/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorhogar;

import java.util.*;

/**
 *
 * @author dedei
 */
public class Calendario {
    private Fecha fecha;
    private Hora hora;
    private HashMap<String,ArrayList<Hora>> rutinaPorHora;
    
    public Calendario(){
        fecha= new Fecha();
        hora=new Hora();
        rutinaPorHora=new HashMap();
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }


    public HashMap<String, ArrayList<Hora>> getRutinaPorHora() {
        return rutinaPorHora;
    }

    public void setRutinaPorHora(HashMap<String, ArrayList<Hora>> rutinaPorHora) {
        this.rutinaPorHora = rutinaPorHora;
    }
    
    public void CrearRutinaHora(Hora uno,Hora dos,String nombre){
        ArrayList<Hora> aux=new ArrayList();
        aux.add(uno);
        aux.add(dos);
        rutinaPorHora.put(nombre,aux);
    }

    @Override
    public String toString() {
        return "Dia: "+fecha+" Hora: "+hora;
    }
    
    public void AvanzarDia(){
       fecha=fecha.avanzarDia(fecha);
       hora.setHora(0);
       hora.setMinuto(0);
       hora.setSegundo(0);
    }
    public void AvanzarTantosDias(int dias){
        fecha.cuantosDias(dias);
    }
}
