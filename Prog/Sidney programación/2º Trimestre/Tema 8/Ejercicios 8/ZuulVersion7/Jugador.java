/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador {
    private String nombre;
    private Habitacion habitacionActual;
    private Habitacion habitacionAnterior;
    private double pesoMaximo;

    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(String nom, double pmax) {
        nombre = nom;
        pesoMaximo = pmax;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void entrarEnHabitacion(Habitacion h) {
        habitacionActual = h;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPesoMaximo() {
        return pesoMaximo;
    }
    
    public Habitacion getHabitacionActual() {
        return habitacionActual;
    }
    
    public Habitacion getHabitacionAnterior() {
       return habitacionAnterior; 
    }
}