
/**
 * Write a description of class Palabra here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palabra {
    private String castellano, ingles;

    public Palabra(String cast, String ing) {
        castellano=cast;
        ingles=ing;
    }
    
    public String getCastellano() {
        return castellano;
    }
    
    public String getIngles() {
        return ingles;
    }
    
    public String toString() {
        String trans = castellano+" - "+ingles;
        return trans;
    }
}
