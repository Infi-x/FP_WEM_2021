/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientes.y.escaleras;

/**
 *
 * @author dedei
 */
public class Jugador {
    private String nombre;
    private ficha ficha;
  
    
    public Jugador(String n,ficha f){
        nombre=n;
        ficha=f;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ficha getFicha() {
        return ficha;
    }

    public void setFicha(ficha ficha) {
        this.ficha = ficha;
    }
    
    public void tirarFicha(int n){
       ficha.setPosicion(n);
    }
    
    
    @Override
    public String toString() {
        return " "+nombre+"\n"+"con ficha "+ ficha;
    }
    
    
}
