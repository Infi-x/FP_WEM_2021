/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipojugadorcontrato;

/**
 *
 * @author Alumnado
 */
public class Contrato {
    private Jugador jugador;
    private double salario;
    
    public Contrato(Jugador j, double sal) {
        jugador = j;
        salario = sal;
    }
    
    public Jugador getJugador() {
        return jugador;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public String toSring() {
        return "El jugador "+getJugador().getNombre()+" cobra "+getSalario()+" millones de euros.";
    }
}
