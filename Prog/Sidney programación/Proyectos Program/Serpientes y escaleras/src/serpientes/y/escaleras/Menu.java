    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientes.y.escaleras;

import java.util.*;

/**
 *
 * @author dedei
 */
public class Menu{
    private static final String[] opciones={"Turno Finalizado","Jugar......................1",
        "Actualizar tablero.........2","Resumen de la partida......3","Salir......................4"};
    private Scanner sc;
    private int opcion;
    private Partida partida;    
        
    public Menu(Partida p){
        partida=p;        
        sc= new Scanner(System.in);
    }
    
    public void aplicarMenu(){
        partida.Bienvenida();
        do{
            PrintMenu();
            controlarOpcion();
        }while(opcion!=4);
    }
    
    public void PrintMenu(){
        do{
        System.out.print("\n\n");
        for(int i=1;i<opciones.length;i++)
        System.out.println(opciones[i]);
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
            case 1: continuar();break;
            case 2: actualizar();break;
            case 3: resumen();break;
            case 4: salir();break;           
        }
    }
    
    private void continuar(){
        System.out.println("Seguimos con la partida");      
        partida.jugar();
        System.out.println(opciones[0]);
        sc= new Scanner(System.in);
        sc.nextLine();
       
    }
    
    private void actualizar(){
       Tablero t=partida.getTablero();
       t.escribirTablero();
        sc= new Scanner(System.in);
        sc.nextLine();
    }
    
    private void resumen(){
        partida.ResumenPartida();
        sc= new Scanner(System.in);
        sc.nextLine();
    }
    
    private void salir(){
        int n=partida.Adios();
        if(n==1)aplicarMenu();
        if(n==0)return;
    }
}
