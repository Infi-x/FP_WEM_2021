/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hora;

/**
 *
 * @author dedei
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hora uno= new Hora();
        Hora dos= new Hora(35,23,56);
        Hora tres= new Hora(12,64,32);
        Hora cuatro= new Hora(12,34,-32);
        Hora cinco= new Hora(3660);
        System.out.println("uno:......"+uno);
        System.out.println("dos:......"+dos);
        System.out.println("tres:....."+tres);
        System.out.println("cuatro:..."+cuatro);
        System.out.println("cinco:...."+cinco);
        uno.cambiarHora();
        dos.cambiarHora();
        tres.cambiarHora();
        cuatro.cambiarHora();
        cinco.cambiarHora();
        System.out.println("Pasado un segundo");
        System.out.println("uno:......"+uno);
        System.out.println("dos:......"+dos);
        System.out.println("tres:....."+tres);
        System.out.println("cuatro:..."+cuatro);
        System.out.println("cinco:...."+cinco);
                
    }
    
}
