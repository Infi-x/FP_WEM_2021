/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabras;

import java.util.Scanner;

/**
 *
 * @author dedei
 */
public class interfazdiccionario {
    
    private Diccionario dic;
    private Scanner sc;
    
    public interfazdiccionario(){
    sc=new Scanner(System.in);
    dic=new Diccionario(50);
    }
    
    public void cuantasPalabras(){
        System.out.println("Bienvenido a su nuevo Diccionario");
        System.out.println("¿Con cuántas palabras quiere inicializar este diccionario? \nCómo máximo pueden ser "+dic.getMAX_PALABRAS()+" palabras.");
        System.out.print("->");
        int op=sc.nextInt();
        sc=new Scanner(System.in);
        dic=new Diccionario(op);
        if(op>dic.getMAX_PALABRAS())
            System.out.println("Este diccionario tiene "+dic.getMAX_PALABRAS()+" palabras");
        else 
            System.out.println("Este diccionario tiene "+op+" palabras");
           
    }
   
    public void añadirPalabra(){
        System.out.println("Ingrese la nueva palabra en el Diccionario: ");
        System.out.print("Primero la palabra en Castellano: ");
        String p= sc.nextLine();
        sc=new Scanner(System.in);
        System.out.print("Ahora la palabra en Ingles: ");
        String i= sc.nextLine();
        sc=new Scanner(System.in);
        Palabra mio=new Palabra(p,i);
        dic.insertarPalabra(mio);
    }
    
    public void mostrarDiccionario(){
        System.out.println("");
        System.out.println("Mostrando Diccionario: ");
        dic.EscribirDicc();
        System.out.println("\nPulsa Enter para volver\n-->");
        sc.nextLine();
        sc=new Scanner(System.in);
    }
    
    public void traductor(){
        System.out.println("Buscar palabra:  ");
        System.out.println("->");
        int p= sc.nextInt();
        sc=new Scanner(System.in);
        Palabra aux=dic.BuscarPalabra(p);
            System.out.println("Ingles: "+aux.getIngles()+" Español: "+aux.getCaste());
    
    }
    
     public void menu(){
         this.cuantasPalabras();
         int op=0;
         while(op!=4){
            System.out.println("****** Diccionario Castellano - Ingles ******");
            System.out.println("1.Añadir Palabra");
            System.out.println("2.Mostrar Diccionario");
            System.out.println("3.Buscar Traduccion");
            System.out.println("4.Salir");
            op=sc.nextInt();
            sc=new Scanner(System.in);
            this.elegir(op);
         }
     }  
     
     public void elegir(int p){
     
         switch(p){
             case 1: this.añadirPalabra();break;
             case 2: this.mostrarDiccionario();break;
             case 3: this.traductor();break;
             case 4: System.out.println("Hasta Pronto");break;
             default: System.out.println("Opción no valida");
         }
     }
     
}
