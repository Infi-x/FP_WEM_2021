import java.util.*;
/**
 * Write a description of class Secuencia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Secuencia {
    private ArrayList<Integer> sec;

    /**
     * Constructor for objects of class Secuencia
     */
    public Secuencia(ArrayList<Integer> s) {
        sec = new ArrayList<Integer>();
        sec.addAll(s);
        Collections.sort(sec);
    }
    
    /**
     * Métodos de la clase Secuencia
     */
    public ArrayList<Integer> getSecuencia() {
        ArrayList<Integer> s = new ArrayList<Integer>();
        s = sec;
        return s;
    }
    
    public ArrayList<Integer> fusionar(ArrayList<Integer> s1, ArrayList<Integer> s2) {
        ArrayList<Integer> aux = new ArrayList<Integer>();
        s1.addAll(aux);
        s2.addAll(aux);
        Collections.sort(aux);
        return aux;
    }
    
    public ArrayList<Integer> interseccion(ArrayList<Integer> s1, ArrayList<Integer> s2) {
        ArrayList<Integer> aux = new ArrayList<Integer>();
        ArrayList<Integer> copiaS1 = new ArrayList<Integer>(s1);
        ArrayList<Integer> copiaS2 = new ArrayList<Integer>(s2);
        
        for (Integer cada:copiaS1) {
            if (copiaS2.contains(cada)) {
                copiaS2.remove(cada);
                aux.add(cada);
            }
        }
        return aux;
    }
}