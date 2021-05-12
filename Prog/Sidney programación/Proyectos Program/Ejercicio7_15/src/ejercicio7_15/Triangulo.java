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
public class Triangulo extends Figura {
    private double base, altura;
    
    public Triangulo(Point p, Color c,double b, double a){
    super(p,c);
    base=b;
    altura=a;
    }

    @Override
    public double getArea() {
    return (base*altura)/2;
    }

    @Override
    public double getPerimetro() {
    
    }
}
