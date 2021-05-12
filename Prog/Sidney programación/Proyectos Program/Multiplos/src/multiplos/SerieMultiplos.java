/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos;

import java.util.*;

public class SerieMultiplos {
    private HashMap<String,ArrayList<Integer>> mapMultiplos;
    
    public SerieMultiplos(){
    mapMultiplos= new HashMap();
    }
    
    public void AniadirEntrada(int num){
    String clave=""+num;
    ArrayList<Integer> multi= new ArrayList(GenerarMultiplos(num));
    mapMultiplos.put(clave, multi);
    }
    
    private ArrayList<Integer> GenerarMultiplos(int num){
    ArrayList<Integer> aux=new ArrayList();
    for(int i=0;i<10;i++)
      aux.add((i+1)*num);
       return aux;
    }
    
    public ArrayList<Integer> ObtenerMultiplosDe(int num){
    String clave=""+num;
        for(String cada:mapMultiplos.keySet())
            if(clave.equalsIgnoreCase(cada))
                return mapMultiplos.get(cada);
        return null;
    }
    
    public void EscribirMapa(){
        for(String cada:mapMultiplos.keySet()){
            System.out.println("Número: "+cada+" Multilpos:");
            EscribirValor(mapMultiplos.get(cada));
        }
    }
    
    private void EscribirValor(ArrayList<Integer> lista){
    for(int i=0;i<lista.size();i++)
        System.out.print((i+1)+": "+lista.get(i)+" ");
    System.out.println();
    
    }
}
