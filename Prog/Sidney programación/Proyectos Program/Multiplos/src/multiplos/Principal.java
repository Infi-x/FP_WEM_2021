/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos;

import java.util.ArrayList;

/**
 *
 * @author dedei
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SerieMultiplos mio= new SerieMultiplos();
        mio.AniadirEntrada(1);
        mio.AniadirEntrada(2);
        mio.AniadirEntrada(3);
        mio.AniadirEntrada(4);
        mio.AniadirEntrada(5);
        mio.AniadirEntrada(6);
        mio.EscribirMapa();
    }
    
}
