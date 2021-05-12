package Tesa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dedei
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tesauro t = new Tesauro();
        
        t.addSimConComa("excelente, brillante, colosal, exquisito, estupendo, soberbio");
        t.addSimConComa("estupendo, maravilloso, superior, magnífico");
        t.addSimConComa("maravilloso ,estupendo, magnifico, excelente");
        
        System.out.print(t);
        System.out.println("Borramos estupendo");
        System.out.println(t.borrarSim("estupendo"));
        System.out.println(t);
       
    }
    
}
