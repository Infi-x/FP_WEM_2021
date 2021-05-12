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
public class DispoCocina extends Dispositivo{
    private boolean nevera;
    private boolean lavadora;
    private boolean secadora;
    private String estado;
    public DispoCocina(String n,String tipo, double c) {
        super(n, c);
        if(tipo.equalsIgnoreCase("nevera"))
            nevera=true;
        if(tipo.equalsIgnoreCase("lavadora"))
            lavadora=true;
        if(tipo.equalsIgnoreCase("secadora"))
            secadora=true;
    }
    
    public  void CalcularConsumo(){
        double du=super.getConsumo();
        Random azar=new Random();
        int num=azar.nextInt(200);
        if(du>num)
            du-=num;
        if(du<num)
            du+=num;
        super.setConsumo(du);
    }
    
    public void Nevera(int n){
        estado="Su nevera esta trabajando a una temperatura de "+n+"Cº";

    }
    
    public void Lavadora(String n){
        estado="Su lavadora esta "+n;

    }
    
    public void Secadora(String n){
        estado="Su secadora esta "+n;

    }

    public void Estado(String n){
        estado=n;

    }
    
    public String getEstadoN() {
        return estado;
    }

    public String getEstadoL() {
        return estado;
    }

    public String getEstadoS() {
        return estado;
    }

    public boolean isNevera() {
        return nevera;
    }

    public boolean isLavadora() {
        return lavadora;
    }

    public boolean isSecadora() {
        return secadora;
    }

    @Override
    public String toString() {
        return super.toString()+"\nEstado: "+estado;
    }
    
    
}
