/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabras;

/**
 *
 * @author dedei
 */
public class Palabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  Palabra uno = new Palabra("Perro","Dog");
        Palabra dos = new Palabra("Jugar","Play");
        Palabra tres = new Palabra("Dormir","Sleep");
        Diccionario mio = new Diccionario(5);
        mio.insertarPalabra(uno);
        mio.insertarPalabra(dos);
        mio.insertarPalabra(tres);
        mio.EscribirDicc();*/
      interfazdiccionario mio= new interfazdiccionario();
      mio.menu();
    }
    
}

