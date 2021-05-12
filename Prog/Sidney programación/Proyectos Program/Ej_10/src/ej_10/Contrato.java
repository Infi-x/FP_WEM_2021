/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_10;


public class Contrato {
    private Jugador jugador;
    private int Salario;
    
    public Contrato(Jugador j, int s){
        jugador=j;
        Salario=s;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public int getSalario() {
        return Salario;
    }

    @Override
    public String toString() {
        return "Contrato del Jugador:"+jugador.getNombre()+"("+jugador.getEdad()+") "+"Salario:"+Salario;
    }

}
