import java.util.*;
/**
 * Alamcena detalles de un miembro del club
 @author K�lling y Barnes
 */
public class Miembro {
    // El nombre del miembro
    private String nombre;
    // El mes en el que el miembro se inscribi� al club
    private int mes;
    // El a�o en el que el miembro se inscribi� al club
    private int anio;

    /**
     * Constructor de la clase Miembro
     * @param nombre El nombre del miembro
     * @param mes El mes en el que el miembro se inscribi� al club (1-12)
     * @param a�o El a�o en el que el miembro se inscribi� al club
     */
    public Miembro(String nombre, int mes, int anio)
             throws IllegalArgumentException
    {
        if  (mes < 1 || mes > 12)
		{
            throw new IllegalArgumentException(
                "Mes " + mes + "fuera del rango. Debe ser una valor entre 1 ... 12");
        }
        this.nombre = nombre;
        this.mes = mes;
        this.anio = anio;
    }
    
    /**
     * @return El nombre del miembro
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * @return El mes en el que el miembro se inscribi� al club
     *        Un valor entre 1..12
     */
    public int getMes() {
        return mes;
    }

    /**
     * @return El a�o en el que el miembro se inscribi� al club
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @return Un string que representa al miembro
     */
    public String toString() {
        return "Nombre: " + nombre +
               " inscrito en el mes " +
               mes + " de " + anio;
    }
}
