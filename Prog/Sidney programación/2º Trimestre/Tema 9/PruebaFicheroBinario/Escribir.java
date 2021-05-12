import java.io.*;
/**
 * Write a description of class Escribir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escribir
{
    private DataOutputStream fout;

    /**
     * Constructor for objects of class Escribir
     */
    public Escribir()
    {
        try
        {
            fout=new DataOutputStream(new FileOutputStream("prueba.txt"));
        }
        catch(Exception i){}
    }

    public void escribir()
    {
        try
        {
            fout.writeDouble(2.34);
            fout.writeDouble(3.34);
            fout.writeDouble(4.34);
            fout.write("Miguel".getBytes());
            fout.close();
        }
        catch(Exception i){}
    }
}
