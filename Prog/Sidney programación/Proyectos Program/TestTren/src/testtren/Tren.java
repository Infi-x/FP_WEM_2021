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
public class Tren {
    private ClaseVagon[]vagones;
    private int siguienteVagon;
    private final int MAX_VAGONES = 10;
    
    public Tren(){
        vagones = new ClaseVagon[MAX_VAGONES];
        siguienteVagon = -1;
    }
    
    public int getNumeroVagones(){
        return siguienteVagon+1;
    }
    
    public void añadirVagon(ClaseVagon x){
        if(x!=null && MAX_VAGONES>=siguienteVagon){
            siguienteVagon++;
            vagones[siguienteVagon]=x;
        }
          
    }
    
    public ClaseVagon borrarVagon(int x){
        int auxn=x-1;
        ClaseVagon aux = null;
        if(vagones[auxn]!=null && x<=siguienteVagon && x>=0){
            aux=vagones[auxn];
            for(int i=auxn;i<siguienteVagon-1;i++){
                vagones[i]=vagones[i+1];
            }
            vagones[siguienteVagon]=null;
            siguienteVagon--;
                return aux;
        }
                   
         return null;  
    }
                    
    public void printListaVagones(){
        if(siguienteVagon==-1)
            System.out.println("El tren no tiene ningún Vagón");
        else 
            for(int i=0; i<siguienteVagon; i++)
            vagones[i].printDetalles();
            
    }
    
    public boolean emitirTicket(){
        for(int i=0; i<siguienteVagon; i++)
            if(vagones[i].reservarSiguienteAsiento())
                return true;
        return false;
    }
    
    private ClaseVagon min( int y){
        ClaseVagon aux=vagones[y];
        for(int i=y;i<siguienteVagon;i++)
            if(vagones[i].getCapacidad()<aux.getCapacidad())
                aux=vagones[i];
        return aux;
    }
    
    public void ordenarVagones(){
        ClaseVagon aux=null;
        ClaseVagon[] v=new ClaseVagon[vagones.length];
        for(int i=0;i<siguienteVagon;i++){
            aux=this.min(i);
            v[i]=aux;
        }
        vagones=v;
    }
    
    
    public ClaseVagon borrarVagonL(int x)
    {
        int n = vagones.length;
        
        if(x > n)
        {
            System.out.println("H");
            return null;
        }
        
        ClaseVagon[] tem = new ClaseVagon[n-1];
        ClaseVagon[] d = new ClaseVagon[1];
        
        for(int i = 0, j = 0 ; i < n; i++)
        {
            if(i+1 != x)
            {
                tem[j] = vagones[i];
                j++;
            }
            else
            {
                d[0] = vagones[i];
            }
        }
        
        vagones = new ClaseVagon[n-1];
        
        for(int i = 0; i < n-1; i++)
        {
            vagones[i] = tem[i];
        }
        
        /*System.out.println(d[0] +"2");*/
        return d[0];
    }
    
    
    
    
    
}
