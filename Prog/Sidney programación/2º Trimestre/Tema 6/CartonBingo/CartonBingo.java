import java.util.*;
import javax.swing.JOptionPane;
/**
 * Write a description of class CartonBingo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CartonBingo {
    private final int FILAS = 3;
    private final int COLUMNAS = 5;
    private int[][] carton;

    /**
     * Constructor de la clase CartonBingo
     */
    public CartonBingo() {
        carton = new int[FILAS][COLUMNAS];
        generarNuevoCarton();
    }

    /**
     * Métodos de la clase CartonBingo
     */
    public void generarNuevoCarton() {
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length;) {
                int aleatorio = (int)(Math.random()*(79))+1;
                if (estaNumero(aleatorio)) continue;
                carton[i][j] = aleatorio;
                j++;
            }
        }
    }
    
    private boolean estaNumero(int n) {
        if (obtenerPosicionNumero(n) == null) return false;
        return true;
    }
    
    private Posicion obtenerPosicionNumero(int n) {
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                if (carton[i][j] == n) {
                    return new Posicion(i, j);
                }
            }
        }
        return null;
    }
    
    public boolean esBingo() {
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                if (carton[i][j] != 0) return false;
            }
        }
        return true;
    }
    
    public boolean esLinea(int f) {
        if (f<0 || f>FILAS) return false;
        for (int j = 0; j < carton[f].length; j++) {
            if (carton[f][j] != 0) return false;
        }
        return true;
    }
    
    public void tacharNumero(int n) {
        if (estaNumero(n)) {
            int fila = obtenerPosicionNumero(n).getFila();
            int columna = obtenerPosicionNumero(n).getColumna();
            carton[fila][columna] = 0;
        }
    }
    
    public String toString() {
        String s = new String();
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                s += carton[i][j]+" ";
            }
            s += "\n";
        }
        return "Cartón generado\n"+s;
    }
    
    public void escribirCarton() {
        JOptionPane.showMessageDialog(null, this, "Cartón de bingo", 
                                     JOptionPane.INFORMATION_MESSAGE);
    }
}