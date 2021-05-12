/**
 * Write a description of class Bola here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bola {
    private Color color;

    /**
     * Constructor for objects of class Bola
     */
    public Bola() {
        Color[] colores = Color.values();
        int elegido = (int)(Math.random()*colores.length+0);
        color = colores[elegido];
    }

    /**
     * Métodos de la clase Color
     */
    public Color getColor() {
        return color;
    }
    
    public String getColorString() {
        String col = color.toString();
        return "Bola de color "+col;
    }
    
    public boolean esBlanca() {
        if (color.toString() == "BLANCO") return true;
        return false;
    }
    
    public boolean esNegra() {
        if (color.toString() == "NEGRO") return true;
        return false;
    }
}