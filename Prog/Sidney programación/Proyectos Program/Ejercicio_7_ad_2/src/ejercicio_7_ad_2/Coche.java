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
public abstract class Coche {
    private String Conductor;
    private String Tipo;
    private String Color;
    private Punto posicion;
    
    public Coche(String Co, String Ti, String Col, Punto pos){
    Conductor=Co;
    Tipo=Ti;
    Color=Col;
    posicion=pos;
    }

    public String getConductor() {
        return Conductor;
    }

    public void setConductor(String Conductor) {
        this.Conductor = Conductor;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Punto getPosicion() {
        return posicion;
    }
    
    public abstract void avanza();
    
    public void setPosicion(Punto posicion) {
        this.posicion = posicion;
    }
    @Override
    public boolean equals(Object o){
    if(o instanceof Coche==false)return false;
    Coche c=(Coche)o;
    if(Conductor.equals(c.Conductor) && Color.equals(c.Color) && Tipo.equals(c.Tipo))return true;
    return false;
    }
    
    public int hashcode(){
    return 11*Conductor.hashCode()+3*Color.hashCode()+5*Tipo.hashCode();
    }

    @Override
    public String toString() {
        return "Conductor=" + Conductor + ", Tipo=" + Tipo + ", Color=" + Color + ", posicion=" + posicion ;
    }
    
    
}
