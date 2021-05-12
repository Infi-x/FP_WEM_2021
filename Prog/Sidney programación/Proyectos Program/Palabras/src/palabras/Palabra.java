/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabras;

/**
 *
 * @author dedei
 */
public class Palabra {
    private String caste;
    private String ingles;
            
    public Palabra(String c, String i){
        caste  = c;
        ingles = i;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    @Override
    public String toString() {
        return "Palabra: "+caste+" Traducción al Ingles: "+ingles;
    }
    
}
