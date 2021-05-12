
/**
 * Clase Diccionario del ejercicio 5.14
 *
 * @author Antonio Alonso
 * @version 1.0
 */
public class Diccionario {
    private Palabra[] listaPalabras;
    private int pos;
    private static final int MAX_PALABRAS = 100;

    public Diccionario(int numPalabras) {
        pos = 0;
        
        if (numPalabras>MAX_PALABRAS) {
            numPalabras = MAX_PALABRAS;
        }
        listaPalabras = new Palabra[numPalabras];
    }
    
    public void insertarPalabra(Palabra nueva) {
        int p = dondeEstaCastellano(nueva.getCastellano());
        if (p == -1 && !estaLleno()) {
            listaPalabras[pos]=nueva;
            pos++;
        } else {
            if (p != -1) listaPalabras[p] = nueva;
        }
    }
    
    private boolean estaLleno() {
        if (pos == listaPalabras.length) return true;
        return false;
    }
    
    public Palabra obtenerPalabra(int i) {
        if (esCorrecto(i)) {
            return listaPalabras[i];
        }
        return null;
    }

    private boolean esCorrecto(int p) {
        if (p<0 || p>pos) return false;
        return true;
    }
 
    public void escribirDiccionario() {
        for (int i = 0; i < pos; i++) {
            System.out.println(listaPalabras[i]);
        }
    }
    
    public String traducirAlIngles(String s) {
        int p = dondeEstaCastellano(s);
        if (p != -1) {
           return listaPalabras[p].getIngles();
        }
        return null;
    }
    
    public String traducirAlCastellano(String s) {
        int p = dondeEstaIngles(s);
        if (p != -1) {
           return listaPalabras[p].getCastellano();
        }
        return null;
    }
    
    private int dondeEstaCastellano(String cas) {
        for (int i = 0; i < pos; i++) {
            if (listaPalabras[i].getCastellano().equalsIgnoreCase(cas)) {
                return i;
            }
        }
        return -1;
    }
    
     private int dondeEstaIngles(String in) {
        for (int i = 0; i < pos; i++) {
            if (listaPalabras[i].getIngles().equalsIgnoreCase(in)) {
                return i;
            }
        }
        return -1;
    }
}
