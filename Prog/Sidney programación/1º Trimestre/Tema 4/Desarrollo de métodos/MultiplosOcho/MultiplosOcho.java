
/**
 * Write a description of class MultiplosOcho here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiplosOcho {

    public void multiplosOcho() {
        int mult = 0;
        int n = 1;
        
        while (mult < 496) {
            mult = 8 * n;
            System.out.println(mult);
            n++;
        }    
    }
}
