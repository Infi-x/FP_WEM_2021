
/**
 * Write a description of class Elemento here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elemento {
    // instance variables - replace the example below with your own
    private String nombre;
    private String descripcion;
    private double peso;

    /**
     * Constructor for objects of class Elemento
     */
    public Elemento(String nom, String des, double p) {
         nombre = nom;
         descripcion = des;
         peso = p;
    }

    /**
     * Métodos de la clase
     */
    public String getNombre() {
        return nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public double getPeso() {
        return peso;
    }
}
