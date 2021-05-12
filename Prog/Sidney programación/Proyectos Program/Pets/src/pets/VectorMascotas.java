/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;
import java.util.*;
/**
 *
 * @author dedei
 */
public class VectorMascotas {
    private Mascota[] mascotas;
    private final int MAX;
    private int cantidad;
    
    public VectorMascotas(){
    mascotas=new Mascota[20];
    cantidad=0;
    MAX=20;
    }
    
    public void cuantasIguanas(){
        System.out.println("Total de IGUANAS\n");
        int cont =0;
        for(int i=0;i<cantidad;i++)
            if(mascotas[i].getEspecie()==Especie.IGUANA){
                  System.out.println(mascotas[i]+"\n");
                  cont++;
            }
        System.out.println("Total = "+cont+"\n");
    }
    
    public void addPets(Mascota m){
    if(m==null)System.out.print("No podemos acoger a esta mascota los datos son erroneos");
        if(cantidad==20){
        System.out.print("No podemos acoger mas mascotas");
        return;
    }
    mascotas[cantidad++]=m;
    }
    
        public void mostrarMascota(){
        String aux="";
        for(int i=0;i<cantidad;i++)
            aux+=mascotas[i]+"\n \n";
        System.out.print(aux);
    }
        
    public int borrarArañas(){
    int cont=0;
    for(int i=0;i<cantidad;i++)
        if(mascotas[i].getEspecie()==Especie.SPYDER){
        cont++;
        for(int j=i;j<cantidad-1;j++)mascotas[i]=mascotas[j+1];
        i--;
        cantidad--;
        }
      return cont;      
    }
    
    public String queEspecie(String n){
    String aux="";
        for(int i=0;i<cantidad;i++)
            if( mascotas[i].getNombre().equalsIgnoreCase(n))
                return aux+=mascotas[i].getStringEs2();
        return "No existe tu busqueda";
    }
    
    
}
