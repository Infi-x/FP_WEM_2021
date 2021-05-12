/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.exam;
import java.util.*;
/**
 *
 * @author cash
 */
public class main {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1=new Persona("Fulanito Fernandez",Estado.SOLTERO,new fecha(2,5,1678));
        Persona p2=new Persona("Gabriel El De las Tablas",Estado.CASADO,new fecha(5,7,1998));
        Persona p3=new Persona("Javi Pestes",Estado.DIVORCIADO,new fecha(12,1,2001));
        Persona p4=new Persona("Miguel El Bromas",Estado.DIVORCIADO,new fecha(5,7,1796));
        Lista l= new Lista();
        l.addPersona(p1);
        l.addPersona(p2);
        l.addPersona(p4);
        l.addPersona(p3);
        l.ordenar();
        l.mostrarPersona();
        int num=l.cuantosDivorciados();
        System.out.println(num);
        ArrayList<Persona> p= l.borrarSolteros();
        System.out.println(p);
        l.mostrarPersona();
       
        
        //De nada xd
    }
    
}
