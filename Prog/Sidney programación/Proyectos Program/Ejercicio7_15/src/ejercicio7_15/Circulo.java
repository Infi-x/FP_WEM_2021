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
public class Circulo extends Figura{
    private double Radio;
    
    public Circulo(Point p, Color c, double r){
    super(p,c);
    Radio=r;
    }

    @Override
    public double getArea() {
       return Math.PI*Radio*Radio; 
    }

    @Override
    public double getPerimetro() {
    return 2*Math.PI*Radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    
    
    @Override
    public String toString() {
        return "Circulo con Radio: "+Radio+" "+super.toString();
    }
    
    
}
