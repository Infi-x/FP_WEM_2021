import java.util.*;
import java.awt.*;
/**
 * Write a description of class Matriz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matriz {
    private int[][] x;
    private Random azar;

    /**
     * Constructor for objects of class Matriz
     */
    public Matriz(int f, int c) {
        x = new int[f][c];
        azar = new Random();
        inicializar();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void inicializar() {
        for (int fil = 0; fil < x.length; fil++) {
            for (int col = 0; col < x[fil].length; col++) {
                //x[fil][col] = 0;
                x[fil][col] = azar.nextInt(21)+30;
            }
        }
    }
    
    public void printMatriz() {
        for (int fil = 0; fil < x.length; fil++) {
            for (int col = 0; col < x[fil].length; col++) {
                System.out.print(x[fil][col]+" ");
            }
            System.out.println();
        }
    }
    
    public int buscarMayor() {
        int max = x[0][0];
        
        for (int fil = 0; fil < x.length; fil++) {
            for (int col = 0; col < x[fil].length; col++) {
                if (x[fil][col] > max) max = x[fil][col];
            }
        }
        return max; 
    }
    
    public int buscarMenor() {
        int min = x[0][0];
        
        for (int fil = 0; fil < x.length; fil++) {
            for (int col = 0; col < x[fil].length; col++) {
                if (x[fil][col] < min) min = x[fil][col];
            }
        }
        return min; 
    }
    
    public Point buscarNumero(int n) {
        for (int fil = 0; fil < x.length; fil++) {
            for (int col = 0; col < x[fil].length; col++) {
                if (x[fil][col] == n) return new Point (fil,col);
            }
        }
        return null;
    }
    
    public void ordenarMatriz() {
        pasarVectorOrdenado();
        pasarMatriz(pasarVectorOrdenado());
        printMatriz();
    }
    
    private void pasarMatriz(int[] v) {
        for (int i = 0; i < v.length; i++) {
            x[i/x[0].length][i%x[0].length] = v[i];
        }
    }
    
    private int[] pasarVectorOrdenado() {
        int nfil = x.length;
        int ncol = x[0].length;
        int j = 0;
        int[] v = new int[nfil*ncol];
        
        for (int fil = 0; fil < x.length; fil++) {
            for (int col = 0; col < x[fil].length; col++) {
                //v[j++] = x[fil][col];
                v[fil*ncol+col] = x[fil][col];
            }
        }
        Arrays.sort(v);
        return v;
    }
}