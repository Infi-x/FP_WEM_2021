

/**
 * Una clase que representa autom�viles.
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
     * Constructor para los objetos de la clase Coche.  Cu�l es el coche por defecto?
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
     * cambiar el a�o del coche
     */
    public void setAnio(int an) {
        anio = an;
    } 
    
    /**
     * visualizar la informaci�n del coche
     */
    public void print() {
        System.out.println("Modelo " + modelo + "\nA�o " + anio + 
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
     * devolver el a�o del coche
     */
    public int getAnio() { 
        return anio;
    }

}
