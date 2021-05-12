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
public class Partida {
    private Tablero tablero;
    private ArrayList<Jugador> gamers;
    private Dado dado;
    private Scanner sc;
    
    public Partida(){
        gamers= new ArrayList();
        dado= new Dado();
        sc = new Scanner(System.in);
        
    }
     
    public void Bienvenida(){
        System.out.println("Bienvenido a serpientes y escaleras");
        System.out.println("Empecemos a jugar");
        System.out.println("¿Cuantos jugadores seran?(De 2 a 4 jugadores)");
       int numero;
       try{            
            numero=sc.nextInt();            
        }
        catch(Exception e){
            numero=0;   
            System.out.println("Te has equivicado tonto\n\n");
        }
        sc= new Scanner(System.in);
                    if(numero<2){
                       System.out.println("Lo siento no puedes jugar solo");
                       Adios();
                   }
                    else{
                   System.out.println("Dime los nombres de los jugadores");
                   for(int i=0;i<numero;i++){
                   String nomb=sc.nextLine();
                   sc= new Scanner(System.in);
                   String[] jugador=nomb.split(" ");
                   inscribirJugadores(jugador[0]);
                   if((numero-1)==i)
                   System.out.print("Jugador "+(i+1)+" ha sido inscrito\n");
                   else System.out.print("Jugador "+(i+1)+" ha sido inscrito\n Escbriba el siguiente\n");
                   }
                   if(gamers.size()<4)rellenar(numero);
                   System.out.println("Jugadores inscritos, pulsa enter para iniciar el juego");
                   tablero=new Tablero(gamers);                   
                   sc.nextLine();
                   sc= new Scanner(System.in);
                   tablero.escribirTablero();}
        
       
   }
   
   private void inscribirJugadores(String n){
       if(gamers.size()==0)  {         
           gamers.add(new Jugador(n,new ficha(Tipo.AMARILLO)));
           return;
       }
       if(gamers.size()==1){
           gamers.add(new Jugador(n,new ficha(Tipo.NARANJA)));
           return;
       }
       if(gamers.size()==2){
           gamers.add(new Jugador(n,new ficha(Tipo.ROJO)));
           return;
       }
       if(gamers.size()==3){
           gamers.add(new Jugador(n,new ficha(Tipo.VERDE)));
           
       }
   }
   
   private void rellenar(int n){
       if(gamers.size()==4)return;
       else{ 
           for(int i=0;i<4-n;i++)
               gamers.add(new Jugador("NULO",new ficha(Tipo.NEGRO)));
       }
   }
    
    public void jugar(){
       for(int i=0;i<gamers.size();i++){
           if(gamers.get(i).getNombre().equalsIgnoreCase("NULO"))continue;
           else{
        System.out.println("Le toca a "+gamers.get(i).getNombre());
                           int numero=dado.tira();
                           gamers.get(i).getFicha().setPosicion(gamers.get(i).getFicha().getPosicion()+numero);
                           tablero.cambiarPos(gamers.get(i),gamers.get(i).getFicha().getPosicion());
                           System.out.println("Has sacado un "+numero);
                           int num=tablero.comprobarSerpiente(gamers.get(i).getFicha().getPosicion());
                           int num2=tablero.comprobarEscalera(gamers.get(i).getFicha().getPosicion());
                           
                           if(gamers.get(i).getFicha().getPosicion()!=num){
                               gamers.get(i).getFicha().setPosicion(num);
                               tablero.cambiarPos(gamers.get(i),gamers.get(i).getFicha().getPosicion());
                               System.out.println("Has caido en una serpiente retrocede a la casilla "+num);
                        }else if(gamers.get(i).getFicha().getPosicion()!=num2){
                                gamers.get(i).getFicha().setPosicion(num2);
                                tablero.cambiarPos(gamers.get(i),gamers.get(i).getFicha().getPosicion());
                                System.out.println("Has caido en una escalera avanza a la casilla "+num2);                               
                           }
                           if(gamers.get(i).getFicha().getPosicion()>100){
                               int pasada=gamers.get(i).getFicha().getPosicion()-100;
                               gamers.get(i).getFicha().setPosicion(100-pasada);
                           System.out.println("Te has pasado del 100, retrocede "+pasada);
                           }
                           if(gamers.get(i).getFicha().getPosicion()==100){
                                System.out.println("El jugador "+gamers.get(i).getNombre()+" ha ganado");
                                Adios();
                                return;
                           }
           }
       }        
    };

    public Tablero getTablero() {
        return tablero;
    }
   
   public int Adios(){
       gamers.clear();
       System.out.println("La partida ha terminado");
       System.out.println("¿Desea volver a jugar?(S/N)");
       System.out.print("Elija una opcion: ");
       String input =sc.nextLine();
       if(input.equalsIgnoreCase("S")){
           return 1;
       }
       else System.out.println("Adios, hasta la proxima");
       return 0;
   }
   
   public void ResumenPartida(){
       for(int i=0;i<gamers.size();i++)
           if(gamers.get(i).getNombre().equalsIgnoreCase("NULO"))continue;
           else System.out.println("El jugador: "+gamers.get(i).getNombre()+" va en la pos "+gamers.get(i).getFicha().getPosicion());
   }
}

