/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_15;

import java.awt.*;

/**
 *
 * @author dedei
 */
public class Cuadrado extends Figura {
    
    private double lado;
    
    public Cuadrado(Point p, Color c, double l){
    super(p,c);
    lado=l;
    }
    
    
    public double getArea() {
      return lado*lado; 
    }

    @Override
    public double getPerimetro() {
    return 4*lado;
    }
    
    public String toString() {
        return "Cuadrado con lado: "+lado+" "+super.toString();
    }
    
}
