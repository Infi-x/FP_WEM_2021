/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;
import java.util.*;
/**
 *
 * @author AAlonsinho
 */
public class CD {
    private List<Cancion> canciones;
    
    // Constructor de la clase CD
    public CD() {
        canciones = new ArrayList<Cancion>();
    }
    
    // Métodos de la clase CD
    public void agregarCancion(Cancion c) {
        canciones.add(c);
    }
    
    public void borrarCancion(String t) {
        t = t.toUpperCase();
        
        for (Cancion cada: canciones) {
            if (cada.getTitulo().equals(t)) {
                canciones.remove(cada);
                break;
            }
        }
    }
    
    public void ordenarPorTitulo() {
        
    }
}
