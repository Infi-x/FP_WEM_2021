import java.util.*;
import java.text.*;
/**
 * Write a description of class Libro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private Estado estado;
    private String fechaPrestamo;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String t, String a, int num) {
        titulo = t;
        autor = a;
        paginas = num;
        estado = Estado.DISPONIBLE;
    }

    /**
     * Métodos de la clase Libro
     */
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getNumeroPaginas() {
        return paginas;
    }
    
    public boolean estaPrestado() {
        if (estado == Estado.PRESTADO) return true;
        return false;
    }
    
    public void prestar() {
        if (estado == Estado.PRESTADO) {
            System.out.println("El libro ya se encuentra prestado");
        } else {
            estado = Estado.PRESTADO;
            fechaPrestamo = obtenerFechaPrestamo();
        }
    }
    
    private String obtenerFechaPrestamo() {
        GregorianCalendar fecha = new GregorianCalendar();
        Date fechaActual = fecha.getTime();
        return new SimpleDateFormat("dd/MM/yyyy").format(fechaActual);
    }
    
    public void devolver() {
        if (estado == Estado.DISPONIBLE) {
            System.out.println("El libro ya se encuentra disponible");
        } else {
            estado = Estado.DISPONIBLE;
            fechaPrestamo = null;
        }
    }
    
    public String toString() {
        if (estaPrestado()) {
            return "El libro "+titulo+" del autor "+autor+" tiene "+paginas+
               " páginas.\n"+"Se encuentra "+estado+" desde el día "+fechaPrestamo;
        } else {
            return "El libro "+titulo+" del autor "+autor+" tiene "+paginas+
               " páginas.\n"+"Actualmente se encuentra "+estado;
        }
    }
}