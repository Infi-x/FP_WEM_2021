/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientes.y.escaleras;

/**
 *
 * @author dedei
 */

public class ficha {
    private int posicion;
    private Tipo color;
    
    public ficha(Tipo c){
    posicion=1;
    color=c;
    }

    public Tipo getColor() {
        return color;
    }

    public void setColor(Tipo color) {
        this.color = color;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return ""+getColor();
    }
    
}
