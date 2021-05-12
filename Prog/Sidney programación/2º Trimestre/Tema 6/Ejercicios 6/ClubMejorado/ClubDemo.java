
/**
 * Demo de las clases Club y Miembro
 * 
 * @author (Kölling y Barnes) 
 */
public class ClubDemo
{
    
    private Club club;

    /**
     * Constructor de la clase ClubDemo
     */
    public ClubDemo()
    {
        club = new Club();
    }

    /**
     * Añadir algunos miembros al club, y mostrar cuantos hay.
     * 
     */
    public void demo()
    {
        club.aniadir(new Miembro("David", 2, 2004));
        club.aniadir(new Miembro("Michael", 1, 2004));
        System.out.println("El club tiene " +
                           club.numeroMiembros() +
                           " miembros.");
    }
}
