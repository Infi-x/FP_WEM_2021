
/**
 * Write a description of class Conversor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Conversor {
    private double grados;

    public Conversor() {
        grados = 0;
    }

    public void setGrados(double g) {
        grados = g;
    }
    
    public double aCentigrados() {
        return grados;
    }
    
    public double aFahrenheit() {
        return (9/5)*grados+32;
    }
    
    
    
}
