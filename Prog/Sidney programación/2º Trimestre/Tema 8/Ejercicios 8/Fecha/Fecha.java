/**
 * Modela una fecha
 */
public class Fecha 
{

    private int dia;
    private int mes;
    private int año;
        
    /**
     *
     * Crea una fecha con dia 1-3-2006
     */
    public Fecha() 
    {
        dia = 1;
        mes = 3;
        año = 2006;
       
    }
    
    /**
     * Constructor con parámetros
     */
    public Fecha(int d, int m, int y)
    {
        dia = d; 
        mes = m; 
        año = y;
    }
    
    /**
     * Avanza la fecha un día
     * 
     */
    public void setSiguienteDia() 
    {
        dia = dia + 1;
        verificarDiaOverflow();
    }
    
    private void verificarDiaOverflow()
    {
        if ( dia > diasMes() )
        {
            dia = 1;
            mes = mes + 1;
            verificarMesOverflow();
        }
    }
    
    private void verificarMesOverflow()
    {
        if ( mes > 12 )
        {
            mes = 1;
            año = año + 1;
        }
    }
    
    /**
     * Cuántos días tiene este mes?
     * 
     * @return el nº de días del mes
     */
    private int diasMes() 
    {
        
        int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
        int res;

        res = dias[mes - 1];
        
        if ( mes == 2 && esBisiestoAño() ) 
        {
            res++;
        }
        return res;    
    }
        
    /**
     * Detectar si año bisiesto
     * @return true si el año es bisiesto
     */
    private boolean esBisiestoAño()
    {
        
       
        return ( divides(4, año) && !divides(100, año) || divides(400, año) );
    }
    
    private boolean divides(int x, int y) 
    {
        return y % x == 0;
    }

    /**
     * 
     */
    public String toString()
    {
        return dia + "-" + mes + "-" + año;
    }
    
    public boolean equals(Object o)
    {
        if ( o.getClass() != this.getClass() )
            return false;
            
        Fecha d = (Fecha) o;
        if ( dia == d.dia && mes == d.mes && año == d.año)
                return true;
        else 
                return false;
       
    }
    
    /**
     * Avanzar la fecha d días
     * 
     * @param d el nº de días
     */
    public void addDias(int d)
    {
        for ( int i = 0; i < d; i++ )
        {
            setSiguienteDia();
        }
    }
}
