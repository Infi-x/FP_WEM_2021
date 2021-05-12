/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9_ad3;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dedei
 */
public class Sumador {
    private Scanner sc;
    
    public Sumador(String f){
    int sum=0;
    try{
        sc=new Scanner(new File(f));
        while(sc.hasNext()){
        sum=sumar(sc.nextInt(),sum);
        }
        System.out.println("El total");
    }
    catch(IOException e){
        System.out.println("Error en el fichero");   
    }
    catch(InputMismatchException i){
        System.out.println("Hay datos que no son números");
        
    }
    }
    public int sumar(int i,int r){
    return r+i;
    }
}
