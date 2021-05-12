/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7_ad_2;

import java.util.Random;

/**
 *
 * @author dedei
 */
public class Taxi extends Coche {
    private int num_Plazas;
    public Taxi(String Co, String Col,int num){
    super(Co,"TAXI",Col,new Punto(0,200));
    num_Plazas=num;
    }
    
    public void avanza(){
    Random azar= new Random();
    double av=azar.nextDouble();
    if(av>=0.33) getPosicion().desplaza(35, 0);
    else getPosicion().desplaza(15, 0);
    }
}
