/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamenu;

import java.util.*;

/**
 *
 * @author dedei
 */
public class Menu {
    private static final String[] opciones={"Menu de prueba","Altas","Bajas","Modificar","Consultas","Salir"};
    private Scanner sc;
    private int opcion;
    public Menu(){
    sc= new Scanner(System.in);
    
    }
    
    public void aplicarMenu(){
        do{
            PrintMenu();
            controlarOpcion();
        }while(opcion!=5);
    }
    
    public void PrintMenu(){
        do{
             System.out.println("\u000C");
            System.out.println(opciones[0]+"\n\n");
        for(int i=1;i<opciones.length;i++)
        System.out.println(opciones[i]+"....."+i);
        System.out.print("Elija opción: ");
        try{            
            opcion=sc.nextInt();            
        }
        catch(Exception e){
            opcion=0;   
            System.out.println("Te has equivicado tonto\n\n");
        }
        sc= new Scanner(System.in);
        
        }while(opcion<1||opcion>opciones.length-1);
        
    }
    
    public void controlarOpcion(){
        switch(opcion){
            case 1: altas();break;
            case 2: bajas();break;
            case 3: modificar();break;
            case 4: consultas();break;
            case 5: salir();break;            
        }
    }
    
    private void altas(){
        System.out.println("Esta usted en las altas"); 
        System.out.print("Return para continuar\n\n");
        sc= new Scanner(System.in);
        sc.nextLine();
       
    }
    
    private void bajas(){
        System.out.println("Esta usted en las bajas");
        System.out.print("Return para continuar\n\n");
        sc= new Scanner(System.in);
        sc.nextLine();
    }
    
    private void modificar(){
        System.out.println("Esta usted en las modificaiones");
        System.out.print("Return para continuar\n\n");
        sc= new Scanner(System.in);
        sc.nextLine();
    }
    
    private void consultas(){
        System.out.println("Esta usted en las consultas");
        System.out.print("Return para continuar\n\n");
        sc= new Scanner(System.in);
        sc.nextLine();
    }
    
    private void salir(){
        System.out.println("Esta usted fuera de mi puta casa\n\n");
        System.out.print("Return para continuar\n\n");
        sc= new Scanner(System.in);
        sc.nextLine();
    }
}
