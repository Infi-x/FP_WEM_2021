import java.awt.*;
/**
 * Write a description of class Principal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Principal {
    public static void main(String[] args) {
        Matriz pepe = new Matriz();
        pepe.printMatriz();
        Point res = pepe.buscarNumero();
        
        if (res != null) {
            int fila = (int)res.getX();
            int columna = (int)res.getY();
            System.out.println("Se encontró en la fila "+fila+" y en la columna "+columna);
        } else {
            System.out.println("No se encontró");
        }
    }
}
