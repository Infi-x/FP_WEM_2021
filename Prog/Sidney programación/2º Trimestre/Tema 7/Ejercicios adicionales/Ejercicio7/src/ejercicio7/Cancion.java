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
public class Cancion {
    private String titulo;
    private String interprete;
    private int duracion;
    
    // Constructor de la clase Cancion
    public Cancion(String t, String i, int d) {
        titulo = t;
        interprete = i;
        duracion = d;
    }
    
    //Métodos de la clase Cancion
    public String getTitulo() {
        return titulo;
    }
    
    public String getInterprete() {
        return interprete;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public String toString() {
        
    }
}
