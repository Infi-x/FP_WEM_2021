/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerpruebascanner;

import java.util.*;
/**
 *
 * @author Alumnado
 */
public class Alumno {
    private String nombre;
    private double nota1, nota2, nota3;
    
    public Alumno(String s, int n1, int n2, int n3) {
        nombre = s;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }
    
    public String toString() {
        return "El alumno "+nombre+" ha obtenido una media de "+getMedia();
    }
    
    public double getMedia() {
        return (nota1+nota2+nota3)/3;
    }
}
