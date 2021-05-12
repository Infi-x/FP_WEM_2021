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
public abstract class Figura {
    private Point centro;
    private Color color;
    
    public Figura(Point p,Color c){
    centro=p;
    color=c;
    }

    public Point getCentro() {
        return centro;
    }

    public void setCentro(Point centro) {
        this.centro = centro;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "Punto central: ("+centro.getX()+","+centro.getY()+"), Color: ("+color.getRed()+
                ", "+color.getGreen()+", "+color.getBlue()+")";
    }
    
    
}
