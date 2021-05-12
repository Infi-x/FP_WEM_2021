import java.io.*;
/**
 * Write a description of class Bigrama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bigrama implements Serializable
{
    // instance variables - replace the example below with your own
    private String primera, segunda;

    /**
     * Constructor for objects of class Bigrama
     */
    public Bigrama(String quePrimera, String queSegunda)
    {
        primera=quePrimera;
        segunda=queSegunda;
    }
    
    public boolean equals(Object o)
    {
        if (!(o instanceof Bigrama)) return false;
        Bigrama aux=(Bigrama)o;
        return (primera.equals(aux.primera) && segunda.equals(aux.segunda));
    }
    
    public String toString()
    {
        return "Primera:"+primera+" Segunda:"+segunda;
    }
    
    public int hashCode()
    {
        return primera.hashCode()*13+segunda.hashCode();
    }
}
