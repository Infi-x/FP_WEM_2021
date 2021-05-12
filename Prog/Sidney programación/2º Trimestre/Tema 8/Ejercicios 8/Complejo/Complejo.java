
/**
 * 
 */
 
public class Complejo
{
    // variables de instancia
    private float parteReal;
    private float parteImaginaria;

    /**
     * Constructor de la clase Complejo
     */
    public Complejo(float real, float imaginaria)
    {
        parteReal = real;
        parteImaginaria = imaginaria;
    }

    /**
     
     * @param  
     * @return     
     */
    public float getParteReal()
    {
        return parteReal;
    }
    
    public float getParteImaginaria()
    {
        return parteImaginaria;
    }
    
    /**
      * 
      *
      * @param  
      * @return     
      */
     public Complejo sumar(Complejo otro)
     {
        Complejo suma = new Complejo(this.getParteReal() + otro.getParteReal(),
                                     this.getParteImaginaria() + otro.getParteImaginaria());
        return suma;
     }
     
}
