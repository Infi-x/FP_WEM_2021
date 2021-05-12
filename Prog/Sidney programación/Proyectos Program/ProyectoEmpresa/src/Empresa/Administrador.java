/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author dedei
 */
public class Administrador extends Empleado {
    private Jefe jefe;
    private double bonificacion;
    public Administrador(String n, String p, double s,double b,int a) {
        super(n,"Administrador de "+ p, s,a);
        bonificacion=b;
    }
    
    public void addJefe(Empleado j){
       jefe=(Jefe) j;
    }
    
    public String obtenerSueldo(){
        double aux=jefe.getSueldo()+super.getSueldo()*bonificacion;
        return String.format("%4.2f", aux);
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    public String toString(){
        return super.toString()+"\nJefe: "+jefe.getNombre()
                +"\nSueldo con bonificacion: "+obtenerSueldo()+"€("+bonificacion+")";
    }
}
