/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

/**
 *
 * @author dedei
 */
public class Arrays {
    
    private int[]precios;
    private boolean[]plazas;
    private String[]nombres;
    private final int MAX = 25;
    private int[]lluvia;
    
    public Arrays(){
        precios = new int[20];
        nombres = new String[MAX];
        lluvia = new int[30];
    }
    
    public Arrays(int n){
        plazas = new boolean[n];
    }
    
    

    public void printPrecios(){
        for(int i=0; i<precios.length; i++){
            if(i%2==0)
                precios[i]=1+i;
            System.out.print(precios[i]+" ");
        }
    }
    
    public void printPlazas(){
        for(int i=0; i<plazas.length; i++){
            if(i%2==0)
                plazas[i]=true;
            System.out.print(plazas[i]+" ");
        }
    }
    
    public void printNombres(){
        for(int i=0; i<nombres.length; i++)
            System.out.print(nombres[i]+" ");
        
    }

}
