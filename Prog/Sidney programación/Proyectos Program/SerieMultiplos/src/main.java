
import java.util.ArrayList;

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
        Multiplos mio= new Multiplos();
        mio.anadirEntrada(1);
        mio.anadirEntrada(2);
        mio.anadirEntrada(3);
        mio.anadirEntrada(4);
        mio.anadirEntrada(5);
        mio.anadirEntrada(6);
        mio.anadirEntrada(7);
        mio.anadirEntrada(8);
        mio.anadirEntrada(9);
        mio.anadirEntrada(10);
        ArrayList<Integer> aux=mio.obtenerMultiplosDe(8);
        for(int i=0;i<aux.size();i++)
            System.out.println(aux.get(0)+"x"+(i+1)+"="+aux.get(i)+" ");
    }
    
}
