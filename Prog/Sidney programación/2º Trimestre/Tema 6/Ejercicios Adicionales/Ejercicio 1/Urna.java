 (itimport java.util.*;
/**
 * Write a description of class Urna here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Urna {
    private ArrayList<Bola> bolas;
    private int tam;

    /**
     * Constructor for objects of class Urna
     */
    public Urna() {
        bolas = new ArrayList<Bola>();
        tam = 0;
    }

    /**
     * Métodos de la clase Urna
     */
    public void meterBola(Bola b) {
        if (b != null) bolas.add(b);
    }
    
    public Bola sacarBola() {
        if (bolas == null) throw new RuntimeException("La urna está vacía");
        int p = obtenerPosicionAleatoria(bolas.size()-1);
        if (p < 0) return null;
        return bolas.get(p);
    }
    
    private int obtenerPosicionAleatoria(int hasta) {
        if (hasta >= 0 && hasta < bolas.size()) {
            Random pos = new Random();
            return pos.nextInt(hasta+1);
        }
        return -1;
    }
    
    public int cuantasBlancas() {
        int count = 0;
        for (Bola b: bolas) {
            if (b.esBlanca()) count++;
        }
        return count;
    }
    
    public int cuantasNegras() {
        int count = 0;
        for (int i = 0; i < bolas.size(); i++) {
            if (bolas.get(i).esNegra()) count++;
        }
        return count;
    }
    
    public void mostrarUrna() {
        Iterator<Bola> it;
        it = bolas.iterator();
        while (it.hasNext()) {
            Bola aMostrar = it.next();
            System.out.println(aMostrar.getColorString());
        }
    }
    
    public void borrarBlancas() {
        Iterator<Bola> it;
        it = bolas.iterator();
        while (it.hasNext()) {
            Bola aBorrar = it.next();
            if (aBorrar.esBlanca()) it.remove();
        }
    }
}
