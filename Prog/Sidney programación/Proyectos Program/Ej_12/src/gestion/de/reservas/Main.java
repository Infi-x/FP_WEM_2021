/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.reservas;

/**
 *
 * @author dedei
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorRestaurante r=new GestorRestaurante(new Restaurante("Pepito",12));
        r.iniciar();
    }
    
}
