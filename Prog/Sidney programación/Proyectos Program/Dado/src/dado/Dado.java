/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;

/**
 *
 * @author dedei
 */
public class Dado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FrecuenciaDado mio=new FrecuenciaDado();
       mio.tirarDado(5);
       mio.escribirFrecuencia();
    }
    
}
