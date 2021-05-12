/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero;

/**
 *
 * @author antonioalonso
 */
public class FicheroJPG extends FicheroImagen {
    private Compresion compresion;
    
    public FicheroJPG(String t, int tam, Compresion c) {
        super(t, tam);
        compresion = c;
    }
    
    public Compresion getCompresion() {
        return compresion;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.print(" - "+getCompresion());
    }
}
