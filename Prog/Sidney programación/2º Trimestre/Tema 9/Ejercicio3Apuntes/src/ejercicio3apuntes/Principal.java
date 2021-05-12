/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3apuntes;
import java.io.*;

/**
 *
 * @author Alumnado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaNumeros l;
        
        try {
            l = new ListaNumeros(-1);
        }
        catch(ArgumentoIncorrectoExcepcion e) {
            System.out.println(e);
        }
        
        l = new ListaNumeros(10);
        try {
            l.guardarEnFichero();
        }
        catch(IOException e) {
            System.out.println("Se ha producido un error.");
        }
    }
    
}
