import java.util.*;
/**
 * Código de la clase Persona
 *
 * @author Antonio Alonso
 * @version 11/12/18
 */
public class Persona {
    private String nombre, estadoCivil, fechaNac;

    /**
     * Constructor de la clase Persona
     */
    public Persona(String nom, String estado, String fec) {
        nombre = nom;
        estadoCivil = estado;
        fechaNac = fec;
    }

    /**
     * Métodos de la clase Persona
     */
    public void setFecha(int dd, int mm, int aa) {
        //He puesto una condición para que no se pueda introducir cualquier número,
        //sino uno que sea válido para una fecha.
        if (dd > 0 && dd <= 31 && mm > 0 && mm <= 12 && aa > 0) {
            String nueva = dd+"/"+mm+"/"+aa;
            fechaNac = nueva;
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getEstadoCivil() {
        return estadoCivil;
    }
    
    public String getFecha() {
        String dia_mes = fechaNac.substring(0, 6);
        String anio = fechaNac.substring(8);
        return dia_mes+anio;
    }
    
    public String toString() {
        String persona = "Nombre: "+nombre+"\n"+
                         "Estado civil: "+estadoCivil+"\n"+
                         "Fecha de nacimiento: "+fechaNac;
        return persona;                   
    }
    
    public void imprimirToString() {
        System.out.println(toString());
    }
}
