import java.util.*;
/**
 * Almacena detalles del club de miembros
 * @author Kölling y Barnes
 */
public class Club {
    private ArrayList<Miembro> miembros;
    
    /**
     * Constructor para los objetos de la clase Club
     */
    public Club() {
        miembros = new ArrayList<Miembro>();
    }

    /**
     * Añadir un nuevo miembro a la lista de miembros
     * @param miembro  El objeto Miembro a añadir
     */
    public void aniadir(Miembro miembro) {
        if (miembro != null) miembros.add(miembro);
    }

    /**
     * @return El nº de miembros del club
     */
    public int numeroMiembros() {
        return miembros.size();
    }
    
    public int incorporadoEnMes(int mes) {
        if (mes<1 || mes>12) {
            System.out.println("Mes fuera de rango");
            return -1;
        }
        int count = 0;
        
        for (Miembro cada:miembros) {
            if (cada.getMes()==mes) count++;
        }
        
        return count;
    }
    
    public ArrayList<Miembro> borrar(int mes, int anio) {
        if (mes<1 || mes>12) {
            System.out.println("Mes fuera de rango");
            return null;
        }
        ArrayList<Miembro> aux = new ArrayList<Miembro>();
        Iterator<Miembro> it;
        it = miembros.iterator();
        while (it.hasNext()) {
            Miembro aBorrar = it.next();
            if (aBorrar.getMes()==mes && aBorrar.getAnio()==anio) {
                aux.add(aBorrar);
                it.remove();
            }
        }
        return aux;
    }
    
    public ArrayList<Miembro> borrar2(int mes, int anio) {
        if (mes<1 || mes>12) {
            System.out.println("Mes fuera de rango");
            return null;
        }
        ArrayList<Miembro> aux = new ArrayList<Miembro>();
        for (int i = 0; i<miembros.size(); i++) {
            Miembro aBorrar = miembros.get(i);
            if (aBorrar.getMes()==mes && aBorrar.getAnio()==anio) {
                aux.add(aBorrar);
                miembros.remove(i);
                i--;
            }
        }
        return aux;
    }
    
    public ArrayList<Miembro> borrar3(int mes, int anio) {
        if (mes<1 || mes>12) {
            System.out.println("Mes fuera de rango");
            return null;
        }
        ArrayList<Miembro> aux = new ArrayList<Miembro>();
        int i = 0;
        while (i<miembros.size()) {
            Miembro aBorrar = miembros.get(i);
            if (aBorrar.getMes()==mes && aBorrar.getAnio()==anio) {
                aux.add(aBorrar);
                miembros.remove(i);
            } else {
                i++;
            }
        }
        return aux;
    }
    
    public void listarClub() {
        for (Miembro cada:miembros) {
            System.out.println(cada);
        }
    }
}
