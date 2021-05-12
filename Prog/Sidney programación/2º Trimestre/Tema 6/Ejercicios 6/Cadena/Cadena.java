
/**
 * Write a description of class Cadena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cadena
{
    // instance variables - replace the example below with your own
    private String cadena;
    /**
     * Constructor for objects of class Cadena
     */
    public Cadena(String pal)
    {
        cadena = pal;
    }

    public String getCadena()
    {
        return cadena;
    }
    
    private  String invertir()
    {
        String inver = "";
      
        for (int i= cadena.length()-1; i>=0; i--)  
            inver = inver + cadena.charAt(i) ;
        return inver;
 
    }
 
    public boolean esPalindroma()
    {
        return cadena.equalsIgnoreCase(this.invertir()) ;
    }
    
    /*
     * Suma todos los dígitos que hata en la cadena
     * @return el número que represetna la suma
     */
    public int sumarDigitos()
    {
        int suma = 0;
        char carac;
        for (int i = 0; i < cadena.length(); i++)
        {
            carac = cadena.charAt(i);
            if (carac >= '0' && carac <= '9') 
                // suma = suma + ( carac - '0');
                // suma += (int)carac - (int)'0';
                suma += Character.getNumericValue(carac) - Character.getNumericValue('0');
        }
        return suma;    
    }
    
    /*
     * Cuenta las ocurrencias de una cadena dada 
     * @param la cadena a buscar 
     * @return el nº de ocurrencias
     */
    public int numeroOcurrencias(String buscada)
    {
        int cuantas = 0, desde = 0;
        int posEncontrada = cadena.indexOf(buscada, desde);
        
        while (posEncontrada != -1)
        {
            cuantas++;
            desde = posEncontrada + 1;
            posEncontrada = cadena.indexOf(buscada, desde);
        }
        return cuantas;
    }
    
    /*
     * Comparar con otra cadena que se recibe como argumento
     * 
     */
    
    public boolean igualQue(Cadena otra)
    {
        return (cadena.compareTo(otra.getCadena()) == 0);
    }
    
     public boolean menorQue(Cadena otra)
    {
        return (cadena.compareTo(otra.getCadena()) < 0);
    }
    
     public boolean matorQue(Cadena otra)
    {
        return (cadena.compareTo(otra.getCadena()) > 0);
    }
    
    /*
     * Comprobar si todos los caracteres son letras
     */
    public boolean todoLetras()
    {
        int i = 0;
        boolean todolet = true;
        
        while (i < cadena.length() && todolet )
        {
            todolet = Character.isLetter(cadena.charAt(i));
            i++;
        }
        return todolet;
    }
    
    
        
  
    
}