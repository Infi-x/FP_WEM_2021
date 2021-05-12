/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorhogar;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dedei
 */
public class DispositivoConInternet extends Dispositivo {
    private boolean estado;
    private double velocidad;
    private Scanner sc;
    
    public DispositivoConInternet(String n, double c) {
        super(n, c);
        this.estado =false;
        this.velocidad=0;
        CalcularVelocidad();
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getVelocidad() {
        return velocidad;
    }
    
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    
    public  void CalcularConsumo(){
        double du=super.getConsumo();
        Random azar=new Random();
        int num=azar.nextInt(350);
        if(du>num)
            du-=num;
        if(du<num)
            du+=num;
        super.setConsumo(du);
    }
    public  void CalcularVelocidad(){
        Random azar=new Random();
        int num=azar.nextInt(350);
        velocidad=num;
    }
}
