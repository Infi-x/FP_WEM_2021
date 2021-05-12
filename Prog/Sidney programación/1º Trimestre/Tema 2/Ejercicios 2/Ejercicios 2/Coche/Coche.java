/**
 * Una clase que representa autom�viles.
 * 
 * @author 
 * @version 
 */
public class Coche
{
    private String modelo; // Ford Focus, Citrone X-Sara, ...
    private String color;
    private int anio;
    
    /**
     * Constructor para los objetos de la clase Coche.
     * 
     */
   
    
     public Coche(String queModelo, String queColor, int queAnio)
    {
        modelo = queModelo;
        color = queColor;
        anio = queAnio;
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
    
     /**
     * 
     *
     * @param  unCoche el coche a comparar con el actual
     * @return true si los coches que se comparan son iguales    
     */
    public boolean igualQue(Coche unCoche)
    {
        
        return (this.modelo.equals(unCoche.getModelo()) &&
               this.color.equals(unCoche.getColor()) &&
               this.anio == unCoche.getAnio());
    }
    
    

}
