/**
 * Clase Habitacion  - una habitación en el juego de aventuras
 * Una habitación representa una posición en el escenario. Está
 * conectada con otras habitaciones a través de salidas: salida norte,
 * este, sur, oeste.
 * 
 * Para cada dirección la habitación almacena una referencia a su 
 * habitación contigua o null si no existe salida en esa dirección. 
 * 
 * @author  Michael Kolling y David J. Barnes
 * @version 2006.03.30
 */ 

public class Habitacion 
{
    public String descripcion;
    public Habitacion salidaNorte;
    public Habitacion salidaSur;
    public Habitacion salidaEste;
    public Habitacion salidaOeste;

    /**
     * Crea una habitación inicialmente sin salidas.
     * La descripción es algo así como "laboratorio de ordenadores", "el bar"
     * 
     * @param descripcion La descripción de la habitación
     */
    public Habitacion(String descripcion)
    {
      this.descripcion = descripcion;
    }
    
     /**
     * Establece las salidas de la habitación. Cada dirección
     * conduce hacia una habitación o es null
     * 
     * @param norte La salida norte.
     * @param este La salida este.
     * @param sur La salida sur.
     * @param oeste La salida oeste.
     */
    public void setSalidas(Habitacion norte, Habitacion este,
                           Habitacion sur, Habitacion oeste) 
    {
      if (norte != null) 
            salidaNorte = norte;
      if (este != null) 
            salidaEste = este;
      if (sur != null) 
            salidaSur = sur;
      if (oeste != null) 
            salidaOeste = oeste;
    }

    /**
     * @return La descripción de la habitación.
     */
    public String getDescripcion()
    {
      return descripcion;
    }
}
