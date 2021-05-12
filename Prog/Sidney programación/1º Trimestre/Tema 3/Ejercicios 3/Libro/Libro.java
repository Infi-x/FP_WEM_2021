/**
 * Esta clase mantiene información sobre un libro.
 * Podría formar parte de una aplicación más grande como un sistema que gestionase una librería, por ejemplo.
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
     * establecer el autor y el título cunado el objeto se construya
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
        System.out.println("Número de páginas:"+numeroPaginas);
    }
    
    public void printNumeroReferencia(){
        System.out.println("Número de referencia:"+numeroReferencia);
    }
    
    public void prestar(){
        vecesPrestado++;    
    }
    
    public void printDetalles(){
        System.out.println("");
        System.out.println("Titulo:"+titulo);
        System.out.println("Autor:"+autor);
        System.out.println("Número de páginas:"+numeroPaginas);
        System.out.println("Número de referencia:"+numeroReferencia);
        System.out.println("Veces prestado:"+vecesPrestado);
    }
}
