/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesauro;

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
        
        t.aniadirSinonimo("excelente", "estupendo");
        t.aniadirSinonimoC("estupendo maravilloso superior magnífico");
        t.aniadirSinonimoC("maravilloso estupendo magnifico excelente");
        
        System.out.print(t);
        
        t.borrarSinonimo("estupendo");
        
        System.out.print(t);
    }
    
}
