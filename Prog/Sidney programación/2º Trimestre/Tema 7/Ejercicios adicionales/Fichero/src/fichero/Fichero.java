/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero;

/**
 *
 * @author antonioalonso
 */
public abstract class Fichero implements Comparable {
    private String titulo;
    private int tamaño;
    
    public Fichero(String t, int tam) {
        titulo = t;
        tamaño = tam;
    }
    
    public int getTamaño() {
        return tamaño;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public int compareTo(Fichero otro) {
        if (this.getTamaño() == otro.getTamaño()) return 0;
        if (this.getTamaño() < otro.getTamaño()) return -1;
        return 1;
    }
    
    public void display() {
        System.out.print(getTitulo()+" - "+getTamaño());
    }
}
