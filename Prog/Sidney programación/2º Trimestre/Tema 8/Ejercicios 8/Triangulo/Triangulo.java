
/**
 * La clase Triangulo modela un triángulo
 */
public class Triangulo
{
    private int lado1;
    private int lado2;
    private int lado3;

    /**
     * Constructor 
     */
    public Triangulo(int lado1, int lado2, int lado3)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    /**
     * 
     * @return     true si es equilátero
     */
    public boolean esEquilatero()
    {
        return (lado1 == lado2) && (lado2 == lado3);
    }
    
   /**
  * 
  * @return    true si es isósceles
  */
    public boolean esIsosceles()
    {
        return (lado1 == lado2) && (lado2 != lado3);
    }
    
    /**
  * 
  * @return     true si es escaleno
  */
     public boolean esEscaleno()
    {
        return (lado1 != lado2) && (lado2 != lado3);
    }
 
    /**
     *
     */
    public String toString()
    {
        String strResul = "";
        
        strResul = strResul + "Lado1 = " + lado1 +
                   "\nLado2 = " + lado2 + "\nLado3 = " + lado3;
        return strResul;
    }
    
     
 
}
