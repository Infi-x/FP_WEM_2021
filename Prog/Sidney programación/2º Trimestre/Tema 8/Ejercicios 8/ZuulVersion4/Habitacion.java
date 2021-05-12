import java.util.*;
/**
 * Clase Habitacion  - una habitaci�n en el juego de aventuras
 * Una habitaci�n representa una posici�n en el escenario. Est�
 * conectada con otras habitaciones a trav�s de salidas: salida norte,
 * este, sur, oeste.
 * 
 * Para cada direcci�n la habitaci�n almacena una referencia a su 
 * habitaci�n contigua o null si no existe salida en esa direcci�n. 
 * 
 * @author  Michael Kolling y David J. Barnes
 * @version 2006.03.30
 */ 

public class Habitacion 
{
    private String descripcion;
    private HashMap<String, Habitacion> salidas;
    private static ArrayList<String> permitidas;

    /**
     * Crea una habitaci�n inicialmente sin salidas.
     * La descripci�n es algo as� como "laboratorio de ordenadores", "el bar"
     * 
     * @param descripcion La descripci�n de la habitaci�n
     */
    public Habitacion(String descripcion)
    {
      String[] dir = {"norte", "este", "sur", "oeste", "arriba", "abajo"};
      permitidas = new ArrayList(Arrays.asList(dir));
      this.descripcion = descripcion;
      salidas = new HashMap();
    }
    
     /**
     * Establece las salidas de la habitaci�n. Cada direcci�n
     * conduce hacia una habitaci�n o es null
     * 
     * @param norte La salida norte.
     * @param este La salida este.
     * @param sur La salida sur.
     * @param oeste La salida oeste.
     */
    //public void setSalidas(Habitacion norte, Habitacion este,
    //                       Habitacion sur, Habitacion oeste) 
    //{
    //  if (norte != null) 
    //        salidas.put("norte", norte);
    //  if (este != null) 
    //        salidas.put("este", este);
    //  if (sur != null) 
    //        salidas.put("sur", sur);
    //  if (oeste != null) 
    //        salidas.put("oeste", oeste);
    //}
    
    public void setSalida(String direccion, Habitacion hacia) {
        if (permitidas.contains(direccion)) 
            salidas.put(direccion.toLowerCase(), hacia);
    }
    
    public Habitacion getSalida(String direccion) {
        return salidas.get(direccion);
    }
    
    public String getSalidasString() {
        return "Salidas: "+salidas.keySet()+"\n";
    }

    /**
     * @return La descripci�n de la habitaci�n.
     */
    public String getDescripcion() {
      return descripcion;
    }
    
    public String getDescripcionLarga() {
        return "Usted se encuentra actualmente en "+descripcion+"\n"+getSalidasString();
    }
}