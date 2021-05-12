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
public class Jugador {
    private String nombre;
    private int edad;
    
    public Jugador(String nom, int e) {
        nombre = nom;
        edad = e;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    @Override
    public String toString() {
        return "El jugador "+getNombre()+" tiene "+getEdad()+" años.";
    }
}
