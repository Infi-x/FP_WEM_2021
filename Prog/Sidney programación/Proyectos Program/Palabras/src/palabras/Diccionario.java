/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabras;

/**
 *
 * @author dedei
 */
public class Diccionario {
    private Palabra[]listaPalabras;
    private final int MAX_PALABRAS = 50;
    private int pos;
    
    public Diccionario(int numPalabras){
        if(numPalabras>MAX_PALABRAS)
            listaPalabras = new Palabra[MAX_PALABRAS];
        else
            listaPalabras = new Palabra[numPalabras];
        pos=0;
    }

    public int getMAX_PALABRAS() {
        return MAX_PALABRAS;
    }
    
    public void insertarPalabra(Palabra p){
        if(pos<listaPalabras.length){
            listaPalabras[pos]=p;
            pos++;
            System.out.println("Palabra insertada");
        }
        else 
            System.out.println("Diccionario al completo,"
                    + "\n no se pueden añadir mas palabras");
    }
    
    public Palabra BuscarPalabra(int p){
            
        for(int i=0; i<listaPalabras.length; i++)
            if(i==p-1)
              return listaPalabras[i];
        return null;
    }
    
    public void EscribirDicc(){
        System.out.println("Diccionario de Español-Ingles");
        for(int i=0; i<pos; i++)
            System.out.println(listaPalabras[i]);
    }
    
}
