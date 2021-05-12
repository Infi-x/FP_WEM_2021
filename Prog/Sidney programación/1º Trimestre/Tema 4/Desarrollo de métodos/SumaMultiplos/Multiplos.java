
/**
 * Write a description of class Multiplos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Multiplos {

    public void printDivisores() {
        int m = 1;
        int s = 0;
        int p = 0;
        
        while (m < 11) {
            s += (4*m);
            m++;
        }
        p = s/10;
        System.out.println("La suma de los 10 primeros divisores de 4 es "+s);
        System.out.println("El promedio de los 10 primeros divisores de 4 es "+p);
    }
}
