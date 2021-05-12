import java.util.*;
/**
 * Write a description of class InterfazDiccionario here.
 * 
 * @author Antonio Alonso
 * @version 1.0
 */
public class InterfazDiccionario {
    private int opcion;
    private Scanner teclado;
    private Diccionario dic;

    /**
     * Constructor for objects of class InterfazDiccionario
     */
    public InterfazDiccionario() {
        opcion = 0;
        teclado = new Scanner(System.in);
        dic = new Diccionario(20);
    }

    public void borrarPantalla() {
    
    }
    
    public void menu() {
        int opc = 0;
        
        do {
            borrarPantalla();
            System.out.println("Bienvenido al Diccionario Castellano-Ingles.\n\n");
            System.out.println("1. Ver Diccionario");
            System.out.println("2. Traducir termino al Ingles");
            System.out.println("3. Traducir termino al Castellano");
            System.out.println("4. Añadir termino");
            System.out.println("5. Modificar termino");
            System.out.println("6. Borrar termino");
            System.out.println("7. Salir");
            System.out.println("\n\n Elija una opcion:");
            
            try {
                teclado = new Scanner(System.in);
                opc = teclado.nextInt();
            }
            catch(InputMismatchExcepction i) {
                opc = 0;
            }
        } while (opc<1 || opc>7);
        opcion = opc;
    }
    
    public void iniciar() {
        do {
            menu();
            borrarPantalla();
            switch(opcion) {
                case 1: visualizar(); break;
                case 2: traducirIngles(); break;
                case 3: traducirCastellano(); break;
                case 4: añadir(); break;
                case 5: modificar(); break;
                case 6: borrar(); break;
                case 7: return;
            }
            System.out.print("Return para continuar");
            teclado = new Scanner(System.in);
            teclado.nextLine();
        } while (opcion != 7);
    }
    
    public void visualizar() {
        dic.escribirDiccionario();
    }
    
    public void traducirIngles() {
        dic.traducirAlIngles();
    }
    
    public void traducirCastellano() {
        dic.traducirAlCastellano();
    }
    
    public void añadir() {
        System.out.print("Introduzca el termino en castellano: ");
        teclado = new Scanner(System.in);
        String cas = teclado.nextLine();
        
        System.out.print("Introduzca el termino en ingles: ");
        teclado = new Scanner(System.in);
        String ing = teclado.nextLine();
        
        dic.insertarPalabra(new Palabra(cas, ing));
    }
    
    public void modificar() {
        visualizar();
        
        System.out.print("Introduzca el termino a modificar en castellano: ");
        teclado = new Scanner(System.in);
        String cas = teclado.nextLine();
        
        System.out.print("Introduzca el termino a modificar en ingles: ");
        teclado = new Scanner(System.in);
        String ing = teclado.nextLine();
        
        dic.insertarPalabra(new Palabra(cas, ing));
    }
    
    public void borrar() {
        
    }
}
