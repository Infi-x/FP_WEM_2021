import java.util.*;
/**
 * Write a description of class TestUrna here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestUrna {

    /**
     * Main
     */
    public static void main (String[] args) {
        Urna urna = new Urna();
        Bola b1 = new Bola();
        Bola b2 = new Bola();
        Bola b3 = new Bola();
        Bola b4 = new Bola();
        
        urna.meterBola(b1);
        urna.meterBola(b2);
        urna.meterBola(b3);
        urna.meterBola(b4);
        
        System.out.println("MOSTRAMOS LAS BOLAS DE LA URNA");
        urna.mostrarUrna();
        System.out.println(" ");
        
        System.out.println("Hay "+urna.cuantasBlancas()+" bolas blancas.");
        System.out.println("Hay "+urna.cuantasNegras()+" bolas negras.");
        System.out.println(" ");
        
        System.out.println("BORRAMOS LAS BLANCAS");
        urna.borrarBlancas();
        urna.mostrarUrna();
        System.out.println(" ");
        
        System.out.println("Quedan "+urna.cuantasNegras()+" bolas negras.");
    }
}
