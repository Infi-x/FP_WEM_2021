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
public class CocheEconomico extends Coche{
    
    public CocheEconomico(String Co, String Col){
    super(Co,"CocheEconomico",Col,new Punto(0,200));
    }
    
    public void avanza(){
    Random azar= new Random();
    double av=azar.nextDouble();
    if(av>=0.5) getPosicion().desplaza(20, 0);
    else getPosicion().desplaza(25, 0);
    }
}
