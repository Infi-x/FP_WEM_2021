/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordelaboratorio;

import java.util.Random;

/**
 *
 * @author dedei
 */
public class Cultivo {
    private String id;
    private int valorHeces;
    private int valorEcoli;
    
    public Cultivo(String d){
    id=d;
    }

    public void setValorHeces(int valorHeces) {
        this.valorHeces = valorHeces;
    }

    public void setValorEcoli(int valorEcoli) {
        this.valorEcoli = valorEcoli;
    }
    
    public boolean RevisarParasitos(){
    Random azar=new Random();
    int auxi=azar.nextInt(101);
        return auxi>20 && auxi<valorHeces && (valorHeces%2)==0;
    }
    
    public boolean RevisarInfeccion(){
    Random azar=new Random();
    int auxi=azar.nextInt(101);
        return auxi>30 && auxi<valorEcoli && (valorEcoli%1)==0;
    }
}
