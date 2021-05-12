/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Empresa.*;
import java.util.ArrayList;

/**
 *
 * @author dedei
 */
public class PruebaEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<Empleado> Empleados=new ArrayList();
        Empleados.add(new Jefe("Pepe","Desarrollo",1600,0.7,2001));
        Empleados.add(new Empleado("Juan","Programador",1300,2010));
        Empleados.add(new Administrador("Felipe","Desarrollo",1400,0.5,2011));
        for(int i=0;i<Empleados.size();i++)
            System.out.println("Sueldo de: "+Empleados.get(i).getNombre()+"\nSueldo: "+Empleados.get(i).SueldoS()+"€");
    }
    
}
