/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.reservas;

import java.util.*;

/**
 *
 * @author dedei
 */
public class GestorRestaurante {
    private Restaurante r;
    private Scanner teclado;
    private int cont;
    
    public GestorRestaurante(Restaurante res){
    r=res;
    cont=0;
    }
    
    public void iniciar(){  
    String nombre="**  Restaurante ~"+r.getNombre()+"~  **";
    String cabeza="";
    for(int i=0;i<nombre.length();i++)cabeza+="*";
     System.out.println("\n"+cabeza+"\n"+nombre+"\n"+cabeza+"\n\n");
     int eleccion=menu();
     switch(eleccion){
         case 1: reservar();break;
         case 2: listarReservas();break;
         case 3: eliminarReservas();break;
         case 4: mostrarRestaurante();break;
         case 5: System.out.println("Adios");break;             
     }
     
    }
    private void reservar(){
    System.out.print("\nQuien hará la reserva?\n>>");
    teclado=new Scanner(System.in);
    String nombre=teclado.nextLine();
    System.out.print("Cuantos comerán?\n>>");
    teclado=new Scanner(System.in);
    int numero=0;
    do{
    try{            
           numero=teclado.nextInt();          
        }
        catch(Exception e){
            numero=0;   
            System.out.println("Te has equivicado tonto\n\n");
        }
    if(numero>16){
        System.out.println("No tenemos mesas para ti");
        numero=2000;
        break;
    }
    }while(numero<1||numero>16);
    boolean reserva= r.HacerReserva(nombre, numero);
    if(reserva)System.out.println("Reserva realizada");
    else System.out.println("No se puede hacer la reserva");
    System.out.print("Desea hacer algo mas?(1 Si/2 No)\n>>");
    teclado=new Scanner(System.in);
    int op=0;
    do{
    try{            
          op=teclado.nextInt();          
        }
        catch(Exception e){
            op=0;   
            System.out.println("Te has equivicado tonto\n\n");
        }
    if(op>2)System.out.println("Error vuelva a escribir su respuesta");
    }while(op<1||op>2);
    if(op==1)iniciar();
    else System.out.println("Adios");
    }
    
    private void listarReservas(){
    r.MostrarReservas();
    if(cont==0)System.out.println("No hay reservas");
    else System.out.print("Estas son las reservas realizadas\n");
    cont++;
    System.out.print("Desea hacer algo mas?(1 Si/2 No)\n>>");
    teclado=new Scanner(System.in);
    int op=0;
    do{
    try{            
          op=teclado.nextInt();          
        }
        catch(Exception e){
            op=0;   
            System.out.println("Te has equivicado tonto\n\n");
        }
    if(op>2)System.out.println("Error vuelva a escribir su respuesta");
    }while(op<1||op>2);
    if(op==1)iniciar();
    else System.out.println("Adios");
    }
    
    private void eliminarReservas(){
    r.EliminarReservas();
    cont=0;
    System.out.print("Se han borrado todas las reservas\n");
    System.out.print("Desea hacer algo mas?(1 Si/2 No)\n>>");
    teclado=new Scanner(System.in);
    int op=0;
    do{
    try{            
          op=teclado.nextInt();          
        }
        catch(Exception e){
            op=0;   
            System.out.println("Te has equivicado tonto\n\n");
        }
    if(op>2)System.out.println("Error vuelva a escribir su respuesta");
    }while(op<1||op>2);
    if(op==1)iniciar();
    else System.out.println("Adios");
    }
    
    private void mostrarRestaurante(){
    r.MostrarRestaurante();
    System.out.print("Estas son las mesas del Restaurante\n");
    System.out.print("Desea hacer algo mas?(1 Si/2 No)\n>>");
    teclado=new Scanner(System.in);
    int op=0;
    do{
    try{            
          op=teclado.nextInt();          
        }
        catch(Exception e){
            op=0;   
            System.out.println("Te has equivicado tonto\n\n");
        }
    if(op>2)System.out.println("Error vuelva a escribir su respuesta");
    }while(op<1||op>2);
    if(op==1)iniciar();
    else System.out.println("Adios");
    }
    
    private int menu(){
      int eleccion=0;
        do{
    System.out.println("Eliga una opción>");
    System.out.println("1-.Reservar");
    System.out.println("2-.Listar Reservas");
    System.out.println("3-.Eliminar Reservas");
    System.out.println("4-.Mostrar Restaurante");
    System.out.println("5-.Salir");
    System.out.print("Teclee una opcion\n>>");
    teclado=new Scanner(System.in);
    
    try{            
          eleccion=teclado.nextInt();           
        }
        catch(Exception e){
            eleccion=0;   
            System.out.println("Te has equivicado tonto\n\n");
        }
         if(eleccion>5)System.out.print("Esa opcion no existe");
        }while(eleccion<1||eleccion>5);
    
    return eleccion;
    }
}