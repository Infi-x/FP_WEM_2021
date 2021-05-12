/**
 * Modela una fecha
 */
public class Fecha 
{

    private int dia;
    private int mes;
    private int a�o;
        
    /**
     *
     * Crea una fecha con dia 1-3-2006
     */
    public Fecha() 
    {
        dia = 1;
        mes = 3;
        a�o = 2006;
       
    }
    
    /**
     * Constructor con par�metros
     */
    public Fecha(int d, int m, int y)
    {
        dia = d; 
        mes = m; 
        a�o = y;
    }
    
    /**
     * Avanza la fecha un d�a
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
            a�o = a�o + 1;
        }
    }
    
    /**
     * Cu�ntos d�as tiene este mes?
     * 
     * @return el n� de d�as del mes
     */
    private int diasMes() 
    {
        
        int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
        int res;

        res = dias[mes - 1];
        
        if ( mes == 2 && esBisiestoA�o() ) 
        {
            res++;
        }
        return res;    
    }
        
    /**
     * Detectar si a�o bisiesto
     * @return true si el a�o es bisiesto
     */
    private boolean esBisiestoA�o()
    {
        
       
        return ( divides(4, a�o) && !divides(100, a�o) || divides(400, a�o) );
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
        return dia + "-" + mes + "-" + a�o;
    }
    
    public boolean equals(Object o)
    {
        if ( o.getClass() != this.getClass() )
            return false;
            
        Fecha d = (Fecha) o;
        if ( dia == d.dia && mes == d.mes && a�o == d.a�o)
                return true;
        else 
                return false;
       
    }
    
    /**
     * Avanzar la fecha d d�as
     * 
     * @param d el n� de d�as
     */
    public void addDias(int d)
    {
        for ( int i = 0; i < d; i++ )
        {
            setSiguienteDia();
        }
    }
}
