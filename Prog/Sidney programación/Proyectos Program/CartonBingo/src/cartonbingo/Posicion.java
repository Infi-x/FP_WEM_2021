/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartonbingo;

/**
 *
 * @author dedei
 */
public class Posicion {
   private int fila;
   private int col;
   
   public Posicion(int f, int c){
       fila = f;
       col = c;
   }
   
   public int getFila(){
       return fila;
   }
   
    public int getColumna(){
        return col;
    }
    
}
