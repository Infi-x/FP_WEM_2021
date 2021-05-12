/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;

/**
 *
 * @author dedei
 */
public class FrecuenciaDado{
    private Dado1 da;
    private int[] frecuencia;
    
    public FrecuenciaDado(){
        frecuencia=new int[6];
        da=new Dado1();
    }
    
    public void tirarDado(int veces){
    int n=0;
        for(int i=0;i<veces;i++){
            n=da.tirar();
            switch(n){
                case 1: frecuencia[0]++;break;
                case 2: frecuencia[1]++;break;
                case 3: frecuencia[2]++;break;
                case 4: frecuencia[3]++;break;
                case 5: frecuencia[4]++;break;
                case 6: frecuencia[5]++;break;
                default:break;
            }
        }
    }
    
    public void escribirFrecuencia(){
        System.out.println("Cara  |  Frecuencia");
        
        for(int i=0; i<frecuencia.length;i++)
           System.out.printf(" %02d   |    %02d\n",i+1,frecuencia[i]);
    }
}
