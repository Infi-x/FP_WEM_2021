import java.util.*;
/**
 * Write a description of class Libreria here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Libreria {
    private ArrayList<Libro> libros;
    private String nombre;

    /**
     * Constructor for objects of class Libreria
     */
    public Libreria(String nom) {
        nombre = nom;
        libros = new ArrayList<Libro>();
    }

    /**
     * Métodos de la clase Libreria
     */
    public String getNombre() {
        return nombre;
    }
    
    public int getCantidadDeLibros() {
        return libros.size();
    }
    
    public void agregarLibro(Libro nuevo) {
        if (nuevo != null) libros.add(nuevo);
    }
    
    public Libro localizarLibro(String tit) {
        Iterator<Libro> it;
        it = libros.iterator();
        
        while (it.hasNext()) {
            Libro aux = it.next();
            if (aux.getTitulo() == tit) return aux;
        }
        return null;
    }
    
    public boolean hayLibroDeAutor(String nom) {
        int i = 0;
        
        while (i<libros.size()) {
            Libro aux = libros.get(i);
            if (aux.getAutor() == nom) return true;
            i++;
        }
        return false;
    }
    
    public void borrarLibrosDeAutor(String nom) {
        int i = 0;
        int borrados = 0;
        
        while (i<libros.size()) {
            Libro aux = libros.get(i);
            if (aux.getAutor() == nom) {
                libros.remove(i);
                borrados++;
            }
            i++;
        }
        if (borrados == 0) System.out.println("El autor no tiene ningún libro.");
    }
    
    public void obtenerLibros() {
        if (getCantidadDeLibros() == 0) System.out.println("No hay libros guardados.");
        else {
            for (Libro cada:libros) System.out.println(cada.toString());
        }
    }
    
    public void prestarLibro(String tit) {
        Libro aPrestar = localizarLibro(tit);
        if (aPrestar == null) {
            System.out.println("El libro no existe en la librería.");
        } else {
            aPrestar.prestar();
        }
    }
}