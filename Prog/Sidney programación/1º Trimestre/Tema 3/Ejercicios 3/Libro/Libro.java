/**
 * Esta clase mantiene informaci�n sobre un libro.
 * Podr�a formar parte de una aplicaci�n m�s grande como un sistema que gestionase una librer�a, por ejemplo.
 *
 * @author (Introduce tu nombre)
 * @version (Inserta la fecha de hoy)
 */
class Libro
{
    // los atributos
    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;
     /**
     * establecer el autor y el t�tulo cunado el objeto se construya
     */
    public Libro(String queAutor, String queTitulo, int queNumeroPaginas)
    {
        autor = queAutor;
        titulo = queTitulo;
        numeroPaginas= queNumeroPaginas;
        numeroReferencia="";
        vecesPrestado= 0;
    }

    public String getAutor(){
        return autor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    
    public int getVecesPrestado(){
        return vecesPrestado;
    }
    
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    public void setNumeroReferencia(String ref ){
       numeroReferencia= ref;
    }
    
    public void printAutor(){
        System.out.println("Autor:"+autor);
    }
    
    public void printTitulo(){
        System.out.println("Titulo:"+titulo);
    }
    
    public void printNumeroPaginas(){
        System.out.println("N�mero de p�ginas:"+numeroPaginas);
    }
    
    public void printNumeroReferencia(){
        System.out.println("N�mero de referencia:"+numeroReferencia);
    }
    
    public void prestar(){
        vecesPrestado++;    
    }
    
    public void printDetalles(){
        System.out.println("");
        System.out.println("Titulo:"+titulo);
        System.out.println("Autor:"+autor);
        System.out.println("N�mero de p�ginas:"+numeroPaginas);
        System.out.println("N�mero de referencia:"+numeroReferencia);
        System.out.println("Veces prestado:"+vecesPrestado);
    }
}
