/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1ad;

import java.io.*;
import java.util.*;
/**
 *
 * @author Alumnado
 */
public class Maximo {
    
    public Maximo() {
    }
    
    public int maximoSinExcepciones() throws IOException {
        BufferedReader b = new BufferedReader(new FileReader("numeros.txt"));
        int max = -1;
        
        do {
            String num = "";
            char c = (char)b.read();
            if (c == -1) break;
        } while (true);
    }
    
    public int maximoConExcepciones() {
        
    }
}
