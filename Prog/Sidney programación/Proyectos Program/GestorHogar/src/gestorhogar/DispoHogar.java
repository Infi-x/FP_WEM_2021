/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorhogar;

import java.util.Random;

/**
 *
 * @author dedei
 */
public class DispoHogar extends Dispositivo {
    private boolean persiana;
    private boolean bombilla;
    private boolean calefactor;
    private String estado;
    public DispoHogar(String n,String tipo, double c) {
        super(n, c);
        if(tipo.equalsIgnoreCase("persiana"))
            persiana=true;
        if(tipo.equalsIgnoreCase("bombilla"))
            bombilla=true;
        if(tipo.equalsIgnoreCase("calefactor"))
            calefactor=true;
    }
    
    public  void CalcularConsumo(){
        double du=super.getConsumo();
        Random azar=new Random();
        int num=azar.nextInt(75);
        if(du>num)
            du-=num;
        if(du<num)
            du+=num;
        super.setConsumo(du);
    }

    public void Persiana(String n) {
        estado="La persiana esta "+n;
    }

    public void Bombilla(String n) {
        estado="La bombilla esta "+n;
    }

    public void Calefactor(String n) {
        estado="El calefactor esta "+n;
        
    }

    public boolean isPersiana() {
        return persiana;
    }

    public boolean isBombilla() {
        return bombilla;
    }

    public boolean isCalefactor() {
        return calefactor;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEstado: "+estado;
    }
    
    
    
}
