/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2apuntes;

/**
 *
 * @author AAlonsinho
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorFichero g = new GestorFichero("jajajaja.txt");
        
        try {
            g.abrirFichero();
            g.escribirDatos();
            g.cerrarFichero();
            g.abrirFicheroAniadiendo();
            g.escribirDatos();
            g.cerrarFichero();
        }
        catch(IllegalArgumentException e) {
            System.out.println("El gestor de archivos no sdsd");
        }
    }
    
}
