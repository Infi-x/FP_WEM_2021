/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3apuntes;

import java.util.*;
import java.io.*;
/**
 *
 * @author Alumnado
 */
public class ListaNumeros {
    private int[] vector;
    
    public ListaNumeros(int tam) {
        if (tam < 1) throw new ArgumentoIncorrectoExcepcion(tam);
        vector = new int[tam];
        inicializar();
    }
    
    private void inicializar() {
        Random azar = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = azar.nextInt(100)+1;
        }
    }
    
    public void guardarEnFichero() throws IOException {
        FileWriter fw = new FileWriter("numeros.txt");
        for (int cada:vector) {
            fw.write(cada+"\t");
        }
        fw.close();
    }
}
