
/**
 * Write a description of class InterfazDiccionario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Principal {
 
    public static void main(String[] args) {
        Diccionario dic = new Diccionario(69);
        Palabra mesa = new Palabra("mesa", "table");
        
        dic.insertarPalabra(mesa);
        System.out.println(dic.obtenerPalabra(0));
        
        int a = 'A';
        char b = 65;
        System.out.println(b);
    }
}
