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
public class Tren {
    private Vagon[]vagones;
    private int siguienteVagon;
    private final int MAX_VAGONES = 10;
    
    public Tren(){
        vagones = new Vagon[MAX_VAGONES];
        siguienteVagon = -1;   
    }
    
    public int getNumeroVagones(){
        return siguienteVagon+1;
    }
    
    public void anadirVagon(Vagon v){
        if(v!=null && MAX_VAGONES>siguienteVagon){
            siguienteVagon++;
            vagones[siguienteVagon]=v;
        }
    }
    
    public Vagon borrarVagon(int n){
        Vagon aux=null;
        if(0<=n && n<siguienteVagon && vagones[n]!=null){
            aux=vagones[n];
            for(int i=n; i<siguienteVagon-1;i++)
                vagones[i]=vagones[i++];
            vagones[siguienteVagon]=null;
            siguienteVagon--;
        }
        return aux;
    }
    
    public void printListaVagones(){
        if(siguienteVagon==-1)
            System.out.println("El tren no tiene ningun vagón");
        for(int i=0; i<siguienteVagon; i++)
            vagones[i].printDetalles();
       
    }
    
    public boolean emitirTicket(){
        
        for(int i=0; i<siguienteVagon; i++)
            if(vagones[i].reservarSiguienteAsiento())
               return true;
        return false;
    }
    
    
}
