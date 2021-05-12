import java.io.*;
/**
 * Write a description of class Leer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leer
{
    private DataInputStream fin;

    /**
     * Constructor for objects of class Leer
     */
    public Leer()
    {
        try
        {
            fin=new DataInputStream(new FileInputStream("prueba.txt"));
        }
        catch(Exception i){}
    }

    public void leer()
    {
        double uno=0,dos=0,tres=0;
        int p=0;
        String yo="";
        byte[]vec=new byte[100];
        try
        {
            uno=fin.readDouble();
            dos=fin.readDouble();
            tres=fin.readDouble();
            //p=fin.readInt();
            fin.read(vec);
            //fin.read(vec,0,6);
            yo=new String(vec);//yo=new String(vec,0,6);
            fin.close();
        }
        catch(Exception i){}
        System.out.println(uno+" "+dos+" "+tres+" "+p+" " +yo);
    }
}
