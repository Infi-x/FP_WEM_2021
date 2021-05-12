/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_10;

import java.util.*;
import java.util.Map.Entry;

public class Equipo {
    private String Nombre;
    private HashMap<String,Contrato> Contratos;
    
    public Equipo(String n){
    Nombre=n.toUpperCase();
    Contratos= new HashMap();
    }
    
    public void firmarContrato(Jugador j, int s){
        Contrato c= new Contrato(j,s);
        Contratos.put(j.getNombre(),c);   
    }
    
    public void firmarContratos(String[] Nombres, int[] edades, int[] salarios){
    if(Nombres==null || edades==null || salarios==null)
        throw new IllegalArgumentException("Gilipollas");
    if(Nombres.length!=edades.length || salarios.length!=Nombres.length || salarios.length!=edades.length)
        throw new IllegalArgumentException("Gilipollas");
        for(int i=0;i<Nombres.length;i++){
            Jugador j=new Jugador(Nombres[i],edades[i]);
            firmarContrato(j,salarios[i]);           
        }
        }
    
    public int numeroJugadores(){
    return Contratos.size();
    }
    
    public void escribirJugadoresV1(){
    String aux="";
    for (String cada:Contratos.keySet()) {
        aux+="Jugador:"+cada+"\n";
    }
    System.out.println(aux);
    } 
    
    public void escribirJugadoresV2(){
    String aux="";
    Iterator <Entry<String, Contrato>> it = Contratos.entrySet().iterator();
    Entry<String, Contrato> entry= null;
    String nom=null;
    Integer sal=null;
    while (it.hasNext()) {
    entry=it.next();
    nom=entry.getKey();
    sal=entry.getValue().getSalario();
    aux+="Jugador: "+nom+"\nSalario: "+sal+"\n\n";
    }
     System.out.println(aux);
    }
    
    public Jugador getJugador(String nombre){
        for (String cada:Contratos.keySet())     
            if (cada.equalsIgnoreCase(nombre))
               return Contratos.get(cada).getJugador();
        return null;
    } 
    
    public int getSalario(String nombre){
     for (String cada:Contratos.keySet())     
            if(cada.equalsIgnoreCase(nombre)) 
               return Contratos.get(cada).getSalario();
        return -1;
    }
    
    public void borrarJugador(String nombre){
    Iterator <Entry<String, Contrato>> it = Contratos.entrySet().iterator();
        while(it.hasNext()){
            Entry<String, Contrato> entry=it.next();
            if(entry.getKey().equals(nombre))it.remove();
        }
    } 
    
    public Contrato getContratoMasAlto(){
    Contrato con=null;
    int cont=0;
    for(Contrato cada:Contratos.values())
      if(cont==0)con=cada;
      else if(con.getSalario()<cada.getSalario())con=cada;
        return con;
    } 
    
    public Jugador getJugador(int pos){
    
    Set<String> Claves=Contratos.keySet();
    ArrayList<String> Lista = new ArrayList<String>(Claves);
     return getJugador(Lista.get(pos));
    }
    
    public void escribirDetallesJugadores(int[] posiciones){
    int tam=posiciones.length;
    for(int i=0;i<tam;i++)
        System.out.print(getJugador(posiciones[i]));
    }
}
