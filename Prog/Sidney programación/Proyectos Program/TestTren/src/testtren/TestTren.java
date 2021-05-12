/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtren;

/**
 *
 * @author dedei
 */
public class TestTren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tren mio =new Tren();
        ClaseVagon uno=new ClaseVagon(34);
        ClaseVagon dos=new ClaseVagon(45);
        ClaseVagon tres=new ClaseVagon(23);
        ClaseVagon cuatro=new ClaseVagon(44);
        ClaseVagon cinco=new ClaseVagon(12);
        ClaseVagon seis=new ClaseVagon(56);
        mio.añadirVagon(uno);
        mio.añadirVagon(dos);
        mio.añadirVagon(tres);
        mio.añadirVagon(cuatro);
        mio.añadirVagon(cinco);
        mio.añadirVagon(seis);
        mio.printListaVagones();
        System.out.println("Borrado el vagon 1");
        mio.borrarVagon(1);
        mio.printListaVagones();
    }
    
}
