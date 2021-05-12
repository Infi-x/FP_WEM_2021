
/**
 * Write a description of class Contador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contador {
    private int valor;
    
    public Contador() {
        valor = 0;
    }
    
    public void decrementar() {
        if (valor > 0) {
            valor--;
        }
    }
    
    public int getContador() {
        return valor;
    }
    
    public void incrementar() {
        valor++;
    }
    
    public void printContador() {
        System.out.println(valor);
    }
    
    public void reset() {
        valor = 0;
    }
}
