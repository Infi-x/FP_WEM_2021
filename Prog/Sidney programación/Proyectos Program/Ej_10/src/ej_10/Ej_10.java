/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_10;

/**
 *
 * @author dedei
 */
public class Ej_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Equipo equipo = new Equipo("Mi equipo"); 
        GestorEquipo gestor = new GestorEquipo(equipo);
        String[] nombres ={"Eto", "Robinho", "Raúl", "Inhiesta", "Mezzi" };
        int[] edades = {25, 24, 26, 22, 21 };
        int[] salarios = {7, 3, 4, 8, 5};
        equipo.firmarContratos(nombres, edades, salarios);
        gestor.iniciar();
    
    /*Equipo e = new Equipo("Real Madrid");
     String[] nombres = {"Eto", "Robinho", "Raúl", "Inhiesta", "Mezzi" };
        int[] edades = {25, 24, 26, 22, 21 };
        int[] salarios = {7, 3, 4, 8, 5};
        e.firmarContratos(nombres, edades, salarios);
        e.escribirJugadoresV1();
        e.escribirJugadoresV2();
        int[] pos={0,2,4};
        e.escribirDetallesJugadores(pos);*/
        
        
      
    }
}
