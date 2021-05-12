
/**
 * Write a description of class Tren here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tren {
    private Vagon vagones[];
    private int siguienteVagon;
    private final int MAX_VAGONES = 10;

    /**
     * Constructor de la clase Tren
     */
    public Tren() {
        vagones = new Vagon[MAX_VAGONES];
        siguienteVagon = -1;
    }

    /**
     * Métodos de la clase Tren
     */
    public int getNumeroVagones() {
        return siguienteVagon+1;
    }
    
    private boolean estaLleno() {
        return siguienteVagon==9;
    }
    
    public void añadirVagon(Vagon v) {
        if (estaLleno() || v==null) return;
        vagones[++siguienteVagon] = v;
    }
    
    private boolean esCorrecto(int p) {
        if (p<0 || p>siguienteVagon) return false;
        return true;
    }
    
    public Vagon borrarVagon(int p) {
        if (!esCorrecto(p)) return null;
        Vagon aux = vagones[p];
        
        for (int i = p; i<siguienteVagon; i++) vagones[i] = vagones[i++];
        siguienteVagon--;
        return aux;
    }
    
    public void printListaVagones() {
        if (siguienteVagon==-1) {
            System.out.println("El tren está vacío.");
            return;
        }
        
        for (int i = 0; i <= siguienteVagon; i++) vagones[i].printDetalles();
    }
    
    public boolean emitirTicket() {
        for (int i = 0; i<=siguienteVagon; i++) {
            if (vagones[i].estaLleno()) continue;
            else {
                vagones[i].reservarSiguienteAsiento();
                return true;
            }
        }
        return false;
    }
    
    public int buscarMaximaCapacidad(int p) {
        int pmax = p;
        
        for (int i = p+1; i<=siguienteVagon; i++) {
            if (vagones[i].getCapacidad()>vagones[pmax].getCapacidad()) pmax = i;
        }
        return pmax;
    }
    
    public void ordenarVagones() {
        for (int i = 0; i<siguienteVagon; i++) {
            int max = buscarMaximaCapacidad(i);
            if (max>i) {
                Vagon aux = vagones[i];
                vagones[i] = vagones[max];
                vagones[max] = aux;
            }
        }
    }
}
