/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3apuntes;

/**
 *
 * @author Alumnado
 */
public class ArgumentoIncorrectoExcepcion extends RuntimeException {
    private int argumento;
    
    public ArgumentoIncorrectoExcepcion(int a) {
        argumento = a;
    }
    
    public String toString() {
        return "Argumento incorrecto: "+argumento;
    }
}
