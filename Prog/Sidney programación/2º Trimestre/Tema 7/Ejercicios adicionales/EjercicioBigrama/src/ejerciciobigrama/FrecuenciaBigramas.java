package ejerciciobigrama;
/**
 * Clase FrecuenciaBigramas 
 * 
 * @author AAlonsinho
 * @version 
 */
import java.util.*;
import java.util.Scanner;
import java.io.*;

public class FrecuenciaBigramas {
    private Map<Bigrama, Integer> map;
    
    /**
     * Constructor de la clase FrecuenciaBigramas
     */
    public FrecuenciaBigramas(String f) {
        
    }

    /**
     * 
     * @param fichero
     * @return
     */
     private void procesarFichero(String f) {
        try {
            Scanner sc = new Scanner(new File(f));
            String pri="", segun="";
           
            while (sc.hasNext()) {
                String actual = sc.next();
                
                if (pri.equals("")) {
                    pri = actual;
                } else {
                    if (!segun.equals("")) pri = segun;
                    segun = actual;
                }
                if (!segun.equals("")) {
                    Bigrama nuevo = new Bigrama(pri, segun);
                    Integer aux = map.get(nuevo);
                    if (aux == null) aux = 0;
                    map.put(nuevo, aux+1);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Bigrama masFrecuente() {
        Bigrama aux = null;
        int count = 0;
        
        for (Bigrama cada: map.keySet()) {
            if (map.get(cada)>count) {
                count = map.get(cada);
                aux = cada;
            }
        }
        return aux;
    }
        
    public void escribirBigramaMasFrecuente() {
        
    }
        
    public String toString() {
        List<Bigrama> lista = new ArrayList<Bigrama>(map.keySet());
        Collections.sort(lista);
        String aux = "";
        
        for (Bigrama cada:lista) aux += cada+" ("+map.get(cada)+")\n";
        return ""+aux;
    }
        
    public void printBigramas() {
        
    }
}
