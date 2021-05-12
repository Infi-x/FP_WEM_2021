/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeatren;

/**
 *
 * @author dedei
 */
public class Vagon {
    private static int identificador;
    private int id;
    private double[]asiento;
    private int asientoActual;
    
    public Vagon(int n){ 
       identificador++;
       id=identificador;
       asientoActual = 0;
       inicializarAsientos(n);
    }
    
    private void inicializarAsientos(int n){
        asiento = new double[n];
        for(int i=0; i<asiento.length; i++)
            asiento[i]=-1;
    }
    
    public int getCapacidad(){
        return asiento.length;
    }
    
    public void printDetalles(){
        System.out.println("Vagón "+id+ "- Capacidad "+this.getCapacidad());
    }
    
    private void printTicket(int n){
        if(n<=asiento.length)
        this.printDetalles();
        System.out.println("Nº asiento -"+n+"\nPrecio: "+asiento[n]);
        
    }
    
    public double reembolsarAsiento(int n){
        double aux=0;
        if(n<this.getCapacidad() && n>0)
                if(asiento[n]>=0){
                    aux=asiento[n];
                    asiento[n]=-1;
                }
        return aux;
    }
    
    public boolean reservarSiguienteAsiento(){
        if(asientoActual<=this.getCapacidad()){
            asiento[asientoActual]=asientoActual*2.5+1;
            this.printTicket(asientoActual);
            asientoActual++;
            return true;
        }
        return false;
    }
    
    public double getPrecioMedio(){
        double suma = 0;
        int conta=0;
            for(int i=0; i<asiento.length; i++)
                if(asiento[i]>=0){
                    suma+=asiento[i];
                conta++;
                }
            return suma/conta;
    }
    
}
