/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author dedei
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calcu mio= new Calcu();
        int[] el=new int[10];
        for(int i=0;i<el.length;i++)
            el[i]=i+1;
        Calcu tuyo= new Calcu(el);
        tuyo.escribirNumeros();
        /*mio.introducirNumero(5);
        mio.introducirNumero(4);
        mio.escribirNumeros();
        mio.borrarUltimoElemento();
        System.out.println("Borrado ultimo elemneto");
        mio.escribirNumeros();*/
        
    }
    
}
