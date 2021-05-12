
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dedei
 */
public class Multiplos {
    private HashMap<String,ArrayList<Integer>> multi;
    
    public Multiplos(){
        multi=new HashMap();  
    }
    
    public void anadirEntrada(int num){
        String aux=""+num;
        ArrayList<Integer> aux2=generarMultiplos(num);
        multi.put(aux, aux2);
    }
    
    private ArrayList<Integer> generarMultiplos(int num){
        ArrayList<Integer> aux=new ArrayList();
        int i=0;
        while(i<10){
            aux.add(num*(i+1));
            i++;
        }
        return aux;
    }
    
    public ArrayList<Integer> obtenerMultiplosDe(int num){
        return multi.get(""+num);
    }
    
    public void EscribirMapa(){
        for(String cada:multi.keySet()){
            System.out.print("Número: "+cada+" Multiplos: ");
            this.EscribirValor(multi.get(cada),cada);
        }
            
    }
    
    private void EscribirValor(ArrayList<Integer> lista,String id){
        for(int i=0;i<lista.size()-1;i++)
            System.out.print(id+"x"+(i+1)+": "+lista.get(i)+", ");
        System.out.println(id+"x"+lista.size()+": "+lista.get(lista.size()-1));
    }
}
