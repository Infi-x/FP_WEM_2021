import java.util.*;

public class Club {
    private ArrayList<Persona> personas;

    /**
     * Constructor for objects of class Club
     */
    public Club() {
        personas = new ArrayList<Persona>();
    }

    /**
     * Métodos de la clase Club
     */
    public void addPersona(String nom, HashSet<String> hob) {
        Persona nueva = new Persona(nom);
        personas.add(nueva);
        Iterator<String> it;
        it = hob.iterator();
        
        while (it.hasNext()) {
            String hobbie = it.next();
            if (!nueva.tieneHobbie(hobbie)) nueva.addHobbie(hobbie);
        }
    }
    
    public int personasConHobbie(String cual) {
        int count = 0;
        Iterator<Persona> it;
        it = personas.iterator();
        
        while (it.hasNext()) {
            Persona cada = it.next();
            if (cada.tieneHobbie(cual)) count++;
        }
        
        return count;
    }
    
    public void printClub() {
        for (Persona cada: personas) {
            System.out.print(cada.toString());
        }
    }
    
    public HashSet<String> borrarPersonasConHobbie(String cual) {
        HashSet<String> borradas = new HashSet<String>();
        Iterator<Persona> it;
        it = personas.iterator();
        
        while (it.hasNext()) {
            Persona p = it.next();
            if (p.tieneHobbie(cual)) {
                borradas.add(p.getNombre());
                it.remove();
            }
        }
        return borradas;
    }
}