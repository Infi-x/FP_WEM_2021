import java.util.*;
/**
 * Write a description of class ListaElementos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaElementos {
    private HashMap<String, Elemento> elementos;

    /**
     * Constructor for objects of class ListaElementos
     */
    public ListaElementos() {
        elementos = new HashMap();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public HashMap<String, Elemento> getElementos() {
        return elementos;
    }
    
    public void addElemento(Elemento e) {
        elementos.put(e.getNombre(), e);
    }
    
    public void borrarElemento(String nom) {
        elementos.remove(nom);
    }
    
    public Elemento getElemento(String nom) {
        return elementos.get(nom);
    }
    
    public String getElementosString() {
        return "Elementos: "+elementos.keySet()+"\n";
    }
    
    public double getPesoTotal() {
        double aux = 0;
        for (Elemento cada: elementos.values()) {
            aux += cada.getPeso();
        }
        return aux;
    }
}
