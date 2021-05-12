
/**
 * Write a description of class Metodos here.
 *
 * @author Antonio Alonso
 * @version 1.0
 */
public class Metodos {

    /**
     * Métodos buscarMinimo y ordenarVector: El método buscarMinimo lee un
     * vector y devuelve la posición en la que se encuentra el mínimo,
     * mientras que ordenarVector ordena un vector dado usando el método
     * buscarMinimo.
     */
    public int buscarMinimo (int[] v, int pos) {
        //La variable pos es la posición a partir de la cuál se lee el vector.
        //La variable v es el vector.
         int pmin = pos;
        
         for (int i = pos+1; i < v.length; i++) {
             if (v[i] < v[pmin]) pmin = i;
         }
         return pmin;
    }
    
    public int buscarMaximo(int[] v, int pos) {
        int pmax = pos;
        
        for (int i = pos+1; i < v.length; i++) {
            if (v[i] > v[pmax]) pmax = i;
        }
        return pmax;
    }
    
    public void ordenarVectorMenorMayor(int[] vec) {
        //La variable vec es el vector.
        
        for (int i = 0; i < vec.length; i++) {
            int pmin = buscarMinimo(vec, i);
            
            if (vec[i] != vec[pmin]) {
                int aux = vec[i];
                vec[i] = vec[pmin];
                vec[pmin] = aux;
            }
            System.out.print(vec[i] +", ");
        }
    }
    
    public void ordenarVectorMayorMenor(int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            int pmax = buscarMaximo(vec, i);
            
            if (vec[i] != vec[pmax]) {
                int aux = vec[i];
                vec[i] = vec[pmax];
                vec[pmax] = aux;
            }
            System.out.print(vec[i]+", ");
        }
    }
    
    /**
     * Lo mismo que el anterior pero unificado en un mismo método.
     */
    
    public void ordenarVectorMenorMayor2 (int[] vec) {
        //La variable vec es el vector dado.
        
        for (int i = 0; i < vec.length-1; i++) {
            for (int j = i+1; j < vec.length; j++) {
                if (vec[i] > vec[j]) {
                    int aux = vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux;
                }
            }
            System.out.print(vec[i]+" ");
        }
    }
}
