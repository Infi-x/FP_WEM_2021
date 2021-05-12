import java.util.*;
/**
 * Write a description of class Secuencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Secuencia {
    private int[] lista;
    private Random generador;

    /**
     * Constructores de la clase Secuencia
     */
    public Secuencia(int[] a) {
        generador = new Random();
        if (a != null) lista = a;
        else {
            lista = new int[10];
            inicializar();
        }
    }
    
    public Secuencia(int n) {
        if (n < 1) n = 10;
        lista = new int[n];
        generador = new Random();
        inicializar();
    }

    /**
     * Métodos de la clase Secuencia
     */
    private void inicializar() {
        for (int i = 0; i<lista.length; i++) {
            lista[i] = generarAleatorio();
        }
        Arrays.sort(lista);
    }
    
    private int generarAleatorio() {
        return generador.nextInt(20)+1;
    }
    
    public int[] getSecuencia() {
        int[] copia = new int[lista.length];
        System.arraycopy(lista, 0, copia, 0, lista.length);
        return copia;
    }
    
    public Secuencia fusionarCon(Secuencia s) {
        int[] fusion = new int[lista.length+s.lista.length];
        System.arraycopy(lista, 0, fusion, 0, lista.length);
        System.arraycopy(s.lista, 0, fusion, lista.length, s.lista.length);
        Arrays.sort(fusion);
        return new Secuencia(fusion);
    }
    
    public Secuencia interseccionCon(Secuencia s) {
        int[] actual = getSecuencia();
        int[] otro = s.getSecuencia();
        int count = 0;
        
        for (int i = 0; i < actual.length; i++) {
            for (int j = 0; j < otro.length; j++) {
                if (actual[i] == otro[j]) {
                    otro[j] = otro[j]*(-1);
                    count++;
                    break;
                }
            }
        }
        
        if (count == 0) return null;
        int[] inter = new int[count];
        
        for (int i = 0, j = 0; i < otro.length; i++) {
            if (otro[i] < 0) inter[j++] = otro[i]*(-1);
        }
        
        return new Secuencia(inter);
    }
}
