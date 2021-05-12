/**
 * Write a description of class Punto3D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Punto3D extends Punto {
    private int z;

    /**
     * Constructor for objects of class Punto3D
     */
    public Punto3D() {
        z=0;
    }
    
    public Punto3D(int cx, int cy, int cz) {
        super(cx, cy); //La llamada super ha de ser siempre
        z = cz;        //la primera línea del constructor.
    }
    
    public Punto3D(int cz) {
        super(13, 7);
        z = cz;
    }

    /**
     * Métodos de la clase
     */
    public int getZ() {
        return z;
    }
    
    public void setZ(int n) {
        z = n;
    }
    
    public String toString3D() {
        return "("+x+", "+y+", "+z+")";
    }
    
    public String toString3D2() {
        return super.toString()+z;
    }
    
    public String toString3D3() {
        return toString()+z; //Al no haber ningún método llamado toString
                             //en esta clase, va al de la clase padre.
    }
    
    public String toString3D4() {
        String s = super.toString();
        s = s.substring(0, s.length()-1);
        return s+", "+z+")";
    }
}
