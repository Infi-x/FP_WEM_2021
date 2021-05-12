
/**
 * Write a description of class Vagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vagon {
    private int id;
    private static int count = 1;
    private double[] asientos;
    private int asientoActual;

    /**
     * Constructor de la clase Vagon
     */
    public Vagon(int c) {
        if (c<=0) c = 10;
        id = count++;
        asientos = new double[c];
        inicializarAsientos();
        asientoActual = 0;
    }

    /**
     * Métodos de la clase Vagón
     */
    private void inicializarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            asientos[i] = -1.0;
        }
    }
    
    public int getCapacidad() {
        return asientos.length;
    }
    
    public void printDetalles() {
        System.out.println("Vagón "+id+" - Capacidad: "+getCapacidad());
    }
    
    public void printTicket(int n) {
        if (n>=0 && n<asientoActual) {
            if (asientos[n] == -1) {
                System.out.println("El asiento ha sido reembolsado.");
            } else {
                printDetalles();
                System.out.println("Nº de asiento: "+n);
                System.out.println("Precio: "+asientos[n]);
            }
        }
    }
    
    public double reembolsarAsiento(int n) {
        if (asientoVendido(n)) {
            double aux = asientos[n];
            asientos[n] = -1.0;
            return aux;
        }
        return 0;
    }
    
    private boolean asientoCorrecto(int a) {
        if (a>=0 && a<getCapacidad()) return true;
        return false;
    }
    
    private boolean asientoVendido(int a) {
        if (asientoCorrecto(a) && asientos[a]!=-1) return true;
        return false;
    }
    
    public boolean reservarSiguienteAsiento() {
        if (asientoCorrecto(asientoActual)) {
            asientos[asientoActual] = 2.5*asientoActual+1;
            printTicket(asientoActual);
            asientoActual++;
            return true;
        }
        return false;
    }
    
    public double getPrecioMedio() {
        double total = 0;
        int count = 0;
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i] != -1) {
                total += asientos[i];
                count++;
            }
        }
        return total/count;
    }
    
    public boolean estaLleno() {
        if (asientoActual > getCapacidad()) return true;
        return false;
    }
}
