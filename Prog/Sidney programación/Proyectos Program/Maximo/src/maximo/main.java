/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximo;

/**
 *
 * @author dedei
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MAX m= new MAX();
        int num=m.MaximoSinExcepciones();
        System.out.println(num);
    }
    
}
