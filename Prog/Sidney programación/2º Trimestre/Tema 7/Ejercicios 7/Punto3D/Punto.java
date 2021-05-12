
/**
 * Write a description of class Punto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Punto {
    protected int x, y;
    /**
     * Constructor for objects of class Punto
     */
    public Punto() {
        x = y = 1;
    }
    
    public Punto(int cx, int cy) {
        x = cx;
        y = cy;
    }

    /**
     * Métodos de la clase
     */
    public int getX () {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setX(int n) {
        x = n;
    }
    
    public void setY(int n) {
        y = n;
    }
    
    public String toString() {
        return "("+x+", "+y+")";
    }
}
