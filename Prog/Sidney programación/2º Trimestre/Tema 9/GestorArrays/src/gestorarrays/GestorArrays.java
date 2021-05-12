/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorarrays;

import java.io.*;
import java.util.*;
/**
 *
 * @author Alumnado
 */
public class GestorArrays {
    private int[] numeros;
    private int elem;
    private String nombre;
    private BufferedReader fichero;
    private PrintWriter ficheroSalida;
    
    public GestorArrays(String nom, int n) throws ArgumentoIncorrectoExcepcion {
        numeros = new int[n];
        ficheroSalida = new PrintWriter(new BufferedWriter(new FileWriter(nom)));
    }
    
    public void cargarArray() {
        
    }
    
    public void duplicarArray() {
        for (int i = 0; i < elem; i++) {
            numeros[i] = numeros[i]*2;
        }
    }
    
    public void volcarArray() {
        
    }
}
