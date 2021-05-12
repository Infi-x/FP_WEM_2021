import java.io.*;
import java.util.*;
/**
 * Write a description of class Leer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leer
{
    private ObjectInputStream fin;

    /**
     * Constructor for objects of class Leer
     */
    public Leer()
    {
        try
        {
            fin=new ObjectInputStream(new FileInputStream("prueba.txt"));
        }
        catch(Exception i){}
    }

    public void leer()
    {
        Double uno=0.,dos=0.,tres=0.;
        String yo="";
        Bigrama bg=null;
        ArrayList<Bigrama>aB=null;
        try
        {
            uno=(Double)fin.readObject();
            dos=(Double)fin.readObject();
            tres=(Double)fin.readObject();
            yo=(String)fin.readObject();
            bg=(Bigrama)fin.readObject();
            aB=(ArrayList<Bigrama>)fin.readObject();
            fin.close();
        }
        catch(Exception i){System.out.println("Error Leer");}
        System.out.println(uno+" "+dos+" "+tres+" " +yo+" "+bg);
        System.out.println(aB);
    }
}
