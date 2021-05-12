
/**
 * Write a description of class Posicion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Posicion {
    private int fila;
    private int col;

    /**
     * Constructor de la clase Posicion
     */
    public Posicion(int f, int c) {
        fila = f;
        col = c;
    }

    /**
     * Métodos de la clase Posicion
     */
    public int getFila() {
        return fila;
    }
    
    public int getColumna() {
        return col;
    }
}
