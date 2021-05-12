/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobigrama;

/**
 *
 * @author AAlonsinho
 */
public class Bigrama implements Comparable<Bigrama>{
    private String primera, segunda;
    
    public Bigrama(String p, String s) {
        primera = p.toUpperCase();
        segunda = s.toUpperCase();
    }
    
    public String getPrimera() {
        return primera;
    }
    
    public String getSegunda() {
        return segunda;
    }
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bigrama)) return false;
        
        Bigrama aux = (Bigrama) o;
        
        return aux.getPrimera().equals(getPrimera()) && aux.getSegunda().equals(getSegunda());
    }
    
    @Override
    public int hashCode() {
        return primera.hashCode() * 13 + segunda.hashCode();
    }
    
    @Override
    public int compareTo (Bigrama b) {
        if (primera.equals(b.primera)) return segunda.compareTo(b.segunda);
        return primera.compareTo(b.primera);
    }
    
    @Override
    public String toString() {
        return primera+" - "+segunda;
    }
}
