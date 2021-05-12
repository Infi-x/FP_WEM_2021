

/**
 * Una clase que representa automóviles.
 * 
 * @author 
 * @version 
 */
public class car
{
    private String modelo; // Ford Focus, Citrone X-Sara, ...
    private String color;
    private int anio;
    
    /**
     * Constructor para los objetos de la clase Coche.  Cuál es el coche por defecto?
     */
    public car()
    {
        modelo = "Ford Focus";
        color = "verde";
        anio = 2000;
    }

    /**
     * cambiar el modelo del coche
     */
    public void setModelo(String mod) {
        modelo = mod;
    }   
 
    /**
     * cambiar el color del coche
     */
    public void setColor(String col) {
        color = col;
    }     
  
    /**
     * cambiar el año del coche
     */
    public void setAnio(int an) {
        anio = an;
    } 
    
    /**
     * visualizar la información del coche
     */
    public void print() {
        System.out.println("Modelo " + modelo + "\nAño " + anio + 
                           "\nColor " + color + ".");
    }    
   
    /**
     * devolver el modelo del coche
     */
    public String getModelo() { 
        return modelo;
    }
  
    /**
     * devolver el color del coche
     */
    public String getColor() { 
        return color;
    }
  
    /**
     * devolver el año del coche
     */
    public int getAnio() { 
        return anio;
    }

}
