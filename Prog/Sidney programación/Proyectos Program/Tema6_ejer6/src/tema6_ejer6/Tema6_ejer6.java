/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6_ejer6;

/**
 *
 * @author dedei
 */
public class Tema6_ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /* ListaNombres mio= new ListaNombres();
      mio.addNombre("Liz");
      mio.addNombre("Sidney");
      mio.addNombre("Laisa");
      mio.addNombre("Anthony");
      System.out.println(mio);
      GeneradorConjunto n=null;
      System.out.println(mio.obtenerConjunto(0,n ));
    */
    GeneradorConjunto mio = new GeneradorConjunto();
    mio.obtenerConjunto();
        System.out.println(mio);
    }
    
    
}
