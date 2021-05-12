 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartonbingo;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author dedei
 */
public class Carton {
    private final int FILAS = 3;
    private final int COLUMNAS = 5;
    private int[][]carton;
    
    public Carton(){
        carton = new int[FILAS][COLUMNAS];
        generarNuevoCarton();
    }
    
    public void generarNuevoCarton(){
        int n= 0;
        Random azar=new Random();
        for(int i=0; i<carton.length; i++)
            for(int j=0; j<carton[i].length; j++){
                n=azar.nextInt(20)+1;
                if(estaNumero(n))
                    j--;
                else
                    carton[i][j]=n;
            }
    }
    
    private boolean estaNumero(int n){
        if(obtenerPosicionNumero(n)==null)
            return false;
      return true;              
    }
    
    private Posicion obtenerPosicionNumero(int n){
        for(int i=0; i<carton.length; i++)
            for(int j=0; j<carton[i].length; j++)
                if(carton[i][j]==n)
                    return new Posicion(i,j);
         return null;       
    }
    
    public void tacharNumero(int n){
        Posicion p=obtenerPosicionNumero(n);
        if(p!=null)
            carton[p.getFila()][p.getColumna()]=0;
           
    }
    
    public boolean esLinea(int n){
       int cont=0;
        if(n<FILAS&&n>=0)
        for(int j=0;j<carton[n].length;j++){
         if(carton[n][j]==0)
            cont++;
        }
        return cont==5;
    }
    
    public boolean esBingo(){
      int cont=0;
       for(int i=0; i<carton.length; i++)
           if(esLinea(i)){
               cont++;
           }
      return cont==3; 
    }
    
    public void escribirCarton(){
         JOptionPane.showMessageDialog(null, this, "Cartón de bingo",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String toString(){
        String aux="";
        for(int i=0; i<carton.length; i++){
            for(int j=0; j<carton[i].length; j++)
                if(carton[i][j]<=9)
                aux+="0"+carton[i][j]+" ";
            else
                aux+=carton[i][j]+" ";
             aux+="\n";
            }
          return aux;      
    }
}
