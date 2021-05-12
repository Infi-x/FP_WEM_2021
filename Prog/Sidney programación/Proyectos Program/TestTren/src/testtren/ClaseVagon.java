/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtren;

/**
 *
 * @author dedei
 */
public class ClaseVagon {
    private static int identificador;
    private int id;
    private double[]asientos;
    private int asientoActual;
    
    public ClaseVagon(int n){
    inicializarAsientos(n);
    asientoActual = 0;
    identificador++;
    id=identificador;
    
    }
    
    private void inicializarAsientos(int n){
        asientos = new double[n];
        for(int i=0; i<asientos.length; i++)
            asientos[i]=-1;       
    }
    
    public int getCapacidad(){
        return asientos.length;
    }
    
    public void printDetalles(){
        System.out.println("Vagón: "+id+" - Capacidad: "+this.getCapacidad());
    }
    
    private void printTicket(int a){
        if(a<=this.getCapacidad()){
            this.printDetalles();
            System.out.println("Nº de asiento: "+a+"\nPrecio: "+asientos[a]);
        }
    }
        
        public double reembolsarAsiento(int a){
            double p=0;
            if(a<=this.getCapacidad() && a>=0)
                if(asientos[a]!=-1){
                p=asientos[a];
                asientos[a]=-1;
                return p;
                }
            return 0;
        }
        
        public boolean reservarSiguienteAsiento(){
            
            if(asientoActual<=getCapacidad()){
                asientos[asientoActual]=asientoActual*2.5+1;
                this.printTicket(asientoActual);
                asientoActual++;
                return true;
            }
            
            return false;
        }
        
        public double getPrecioMedio(){
        double total=0;
        int cont=0;
        for(int i=0;i<asientos.length;i++)
            if(asientos[i]!=-1){
                total+=asientos[i];
                cont++;
            }
        return total/cont;
        }
}


