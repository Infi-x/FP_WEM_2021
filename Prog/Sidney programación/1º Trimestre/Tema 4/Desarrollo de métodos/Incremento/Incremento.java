
/**
 * Write a description of class Incremento here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Incremento {
    private int num;
    
    public Incremento(int n) {
        num = n;
    }
    
    public void incrementar() {
        int i = 1;
        
        while (i <= num) {
            System.out.println(i);
            i++;
        }
    }
}
