
/**
 * Write a description of class Dinero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dinero {
    private int euros;

    public Dinero(int e) {
        euros=e;
    }
    
    public int getEuros() {
        return euros;
    }
    
    public void setEuros(int e) {
        euros=e;
    }
    
    public void printDescomposicion() {
        System.out.println(euros+"€ son: ");
        int cien=euros/100;
        if (cien!=0) {
            System.out.println("Billetes de 100 = "+cien);
            euros=euros%100;
        }
        int diez=euros/10;
        if (diez!=0) {
            System.out.println("Billetes de 10 = "+diez);
            euros=euros%10;
        }
        int cinco=euros/5;
        
        if (cinco!=0) {
            System.out.println("Billetes de 5 = "+cinco);
            euros=euros%5;
        }
        int dos=euros/2;
        
        if (dos!=0) {
            System.out.println("Monedas de 2 = "+dos);
            euros=euros%2;
        }
        int uno=euros;
        
        if (uno!=0) {
            System.out.println("Monedas de 1 = "+uno);
        }
    }
}
