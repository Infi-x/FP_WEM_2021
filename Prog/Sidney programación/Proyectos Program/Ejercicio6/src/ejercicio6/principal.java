/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author dedei
 */
public class principal {


    public static void main(String[] args) {
        /*GeneradorConjunto nuevo= new GeneradorConjunto("puto");
        System.out.println(nuevo);
         GeneradorConjunto nuevo2= new GeneradorConjunto("Conjunto");
         System.out.println(nuevo2);*/
        ListaNombres list= new ListaNombres();
        list.addNombre("Maria");
        list.addNombre("Pedro");
        list.addNombre("Fani");
        list.addNombre("Andres");
        System.out.println(list);
         String aux =list.obtenerConjunto(-1,new GeneradorConjunto());
         System.out.println(aux);
        
    }
    
}
