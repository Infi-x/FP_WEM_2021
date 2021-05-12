
/**
 * En realidad no se trata de una calculadora, sino de un vector de números
 * con el que haremos diferentes operaciones y métodos.
 *
 * @author Antonio Alonso
 * @version 1.0
 */
public class Calculadora {
    private final int MAX = 20;
    private int[] numeros;
    private int total;

    /**
     * Constructores de la clase Calculadora
     */
    public Calculadora() {
        numeros = new int[MAX];
        total = 0;
    }
    
    public Calculadora(int[] nums) {
        int cantidad = 0;
        if (nums!=null) cantidad = nums.length;
        if (cantidad > MAX) cantidad = MAX;
        
        numeros = new int[MAX];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = nums[i];
        }
        total = cantidad;
    }
    
    /**
     * Métodos de la clase Calculadora
     */
    public void introducirNumero(int n) {
        if (total < MAX) {
            int num = n;
            numeros[total] = num;
            total++;
        }
    }
    
    public int contarMayoresQue(int n) {
        int count = 0;
        
        for (int i = 0; i < total; i++) {
            if (numeros[i] > n) count++;
        }
        return count;
    }
    
    public void escribirNumeros() {
        for (int i = 0; i < total; i++) {
            System.out.println(i+" - "+numeros[i]);
        }
    }
    
    public int getTotal() {
        return total;
    }
    
    public void intercambiar(int n1, int n2) {
        if (n1!=n2 && posicionCorrecta(n1) && posicionCorrecta(n2)) {
            int aux = numeros[n2];
            numeros[n2] = numeros[n1];
            numeros[n1] = aux;
        }
    }
    
    private boolean posicionCorrecta(int p) {
        if (p<0 || p>MAX-1) return false;
        return true;
    }
    
    public void borrarUltimoElemento() {
        if (hayNumeros()) {
            numeros[total-1] = 0;
            total--;
        }
    }
    
    public void borrarPares() {
        for (int i = 0; i < total; i++) {
            borrarUnPar(i);
        }
    }
    
    public boolean hayNumeros() {
        return total>0;
    }
    
    private void borrarUnPar(int p) {
        if (posicionCorrecta(p) && esPar(numeros[p])) {
            intercambiar(p, total-1);
            borrarUltimoElemento();
        }
    }
    
    private boolean esPar(int n) {
        if (n % 2 != 0) return false;
        return true;
    }
}