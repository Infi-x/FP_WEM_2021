import java.util.*;
/**
 * Código de la clase ListaPersonas
 *
 * @author Antonio Alonso
 * @version 11/12/18
 */
public class ListaPersonas {
    private final int MAX = 20;
    private Persona[] personas;
    private int tam;

    /**
     * Constructor de la clase ListaPersonas
     */
    public ListaPersonas() {
        personas = new Persona[MAX];
        tam = 0;
    }

    /**
     * Métodos de la clase ListaPersonas
     */
    public int cuantosDeCada(String s) {
        int count = 0;
        
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null) {
                if (personas[i].getEstadoCivil().equals(s)) count++;
            }
        }
        return count;
    }
    
    public String cumpleanios(String nom) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null) {
                if (personas[i].getNombre().equals(nom)) return personas[i].getFecha();
            }
        }
        //En caso de que no exista el nombre introduccido devuelve una string indicando
        //un error.
        return "Error";
    }
    
    public void addPersona(Persona nueva) {
        //He hecho este método de manera que va a añadir a la nueva persona en la primera 
        //posición vacía que encuentre, por si anteriormente se han borrado otras personas.
        if (estaLleno()) return;
        if (nueva != null) {
            for (int i = 0; i < personas.length; i++) {
                if (personas[i] == null) {
                    personas[i] = nueva;
                    tam++;
                    return;
                }
            }
        } else {
            System.out.println("Error");
        }
    }
    
    private boolean estaLleno() {
        if (tam == MAX) return true;
        return false;
    }
    
    public void mostrarPersonas() {
        if (hayPersonas()) {
            for (int i = 0; i < personas.length; i++) {
                if (personas[i] != null) {
                    System.out.println("Persona "+i+": "+personas[i].toString());
                }
            }
        } else {
            System.out.println("No hay personas guardadas.");
        }
    }
    
    private boolean hayPersonas() {
        if (tam != 0) return true;
        return false;
    }
    
    public int borrarSolteros() {
        int count = 0;
        
        if (hayPersonas()) {
            for (int i = 0; i < personas.length; i++) {
                if (personas[i] != null) {
                    if (personas[i].getEstadoCivil().equals("SOLTERO")) {
                        personas[i] = null;
                        tam--;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}