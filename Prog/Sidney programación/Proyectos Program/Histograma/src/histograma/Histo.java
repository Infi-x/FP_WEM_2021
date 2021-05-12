/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histograma;
import java.util.Random;


/**
 *
 * @author dedei
 */
public class Histo {
    private int[] valores;
    private final int MAX = 15;
    
    public Histo(){
        
    valores = new int[MAX];
    this.inicializar();
    }
    
    private void inicializar(){
        for(int i=0;i<MAX;i++)
            valores[i]=this.generarAleatorio();
    }
    
    private int generarAleatorio(){
        int n=(int)(Math.random()*46)+5;
        return n;
    }
    
    public void escribirHistograma(){
        for(int i=0; i<MAX; i++){
           for(int j=0; j<valores[i];j++)
                System.out.print("*");
            System.out.println();
        }
    }
    
}
