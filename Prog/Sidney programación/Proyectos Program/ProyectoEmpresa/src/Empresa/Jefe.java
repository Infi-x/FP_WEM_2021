/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

import java.util.ArrayList;

/**
 *
 * @author dedei
 */
public class Jefe extends Empleado{
    private ArrayList<Empleado> Empleados;
    private double bonificacion;
    public Jefe(String n, String p, double s, double b,int a) {
        super(n, "Jefe de "+p, s+600,a);
        Empleados=new ArrayList();
        bonificacion=b;
    }
    
    public String obtenerSueldo(){
        double aux=(getSueldo()+getSueldo())*bonificacion;
        return String.format("%4.2f", aux);
    }
    
    public void anadirEmpleado(Empleado e){
        if(e!=null)
            Empleados.add(e);
    }
    @Override
    public String toString() {
        return super.toString()+
                "\nSueldo con bonificacíon: "+obtenerSueldo()+"€("+bonificacion+")"+
                "\nNúmero de Empleados: "+Empleados.size();
    }
    
    
}
