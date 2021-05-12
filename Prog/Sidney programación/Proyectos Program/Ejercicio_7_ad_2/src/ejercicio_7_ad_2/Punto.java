/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7_ad_2;

/**
 *
 * @author dedei
 */
public class Punto {
    protected int x, y;
    /**
     * Constructor for objects of class Punto
     */
    public Punto() {
        x = y = 1;
    }
    
    public Punto(int cx, int cy) {
        x = cx;
        y = cy;
    }

    /**
     * Métodos de la clase
     */
    public int getX () {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setX(int n) {
        x = n;
    }
    
    public void setY(int n) {
        y = n;
    }
    
    public void desplaza(int equis, int i){
    x+=equis;
    y+=i;
    }
    
    public int hashcode(){
    return 7*x+11*y;
    }
    
    public String toString() {
        return "("+x+", "+y+")";
    }
}
