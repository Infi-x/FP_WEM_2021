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
public class Ejercicio_7_ad_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CocheDeportivo uno=new CocheDeportivo("Pepe","Rojo");
       CocheEconomico dos=new CocheEconomico("Pipo","Verde");
       Taxi tres=new Taxi("Juan","Amarillo",6);
       CocheDeportivo cuatro= new CocheDeportivo("Pipo","Azul");
       CocheDeportivo cinco=new CocheDeportivo("Juan","Gris");
       Concesionario mio= new Concesionario("JUanLu");
        CocheDeportivo seis=new CocheDeportivo("Pepe","Rojo");
       mio.aniadir(uno);
       mio.aniadir(dos);
       mio.aniadir(tres);
       mio.aniadir(cuatro);
       mio.aniadir(cinco);
       mio.aniadir(seis);
       System.out.println("Coches añadidos");
       mio.listarCoches();
       mio.AvanzarTodos();
       System.out.println("Coches avanzados");
       mio.listarCoches();
       System.out.println("Borrados coches de Pepe");
       mio.borrarDeConductor("Pepe");
       mio.listarCoches();
        System.out.println("Borrados los taxis");
       mio.borrarTaxis();
       mio.listarCoches();
    }
    
}
