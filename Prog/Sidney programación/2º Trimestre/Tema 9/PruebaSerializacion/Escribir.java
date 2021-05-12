import java.io.*;
import java.util.*;
/**
 * Write a description of class Escribir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escribir
{
    private ObjectOutputStream fout;

    /**
     * Constructor for objects of class Escribir
     */
    public Escribir()
    {
        try
        {
            fout=new ObjectOutputStream(new FileOutputStream("prueba.txt"));
        }
        catch(Exception i){}
    }

    public void escribir()
    {
        Bigrama b=new Bigrama("pero","que");
        ArrayList<Bigrama>aLbG=new ArrayList<Bigrama>();
        aLbG.add(new Bigrama("hola","yo"));
        aLbG.add(new Bigrama("hola","tu"));
        aLbG.add(new Bigrama("tu","yo"));
        try
        {
            fout.writeObject(2.34);
            fout.writeObject(3.34);
            fout.writeObject(4.34);
            fout.writeObject("Miguel");
            fout.writeObject(b);
            fout.writeObject(aLbG);
            fout.close();
        }
        catch(Exception i){System.out.println("Error Escribir");}
    }
}
