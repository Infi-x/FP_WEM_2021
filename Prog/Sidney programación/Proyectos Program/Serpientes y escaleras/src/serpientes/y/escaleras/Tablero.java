/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientes.y.escaleras;

import java.util.*;

public class Tablero {
    private ArrayList<SnakeAndStairs> serpientes;
    private ArrayList<SnakeAndStairs> escaleras;
    private int[] pos;
    private ArrayList<Jugador> gamers;
    
    
    
    public Tablero(ArrayList<Jugador> j){
        serpientes=new ArrayList();
        escaleras=new ArrayList();
        pos=new int[100];
        gamers= new ArrayList(j);
        for(int i=0;i<pos.length;i++)
            pos[i]=100-i;
        crearTablero();
    }
   
    private void crearTablero(){
        int nSerpientes=new Random().nextInt(2)+3;
        int nEscaleras=new Random().nextInt(3)+2;
        SnakeAndStairs primera=new SnakeAndStairs();
        serpientes.add(primera);
        SnakeAndStairs segunda=new SnakeAndStairs();
        escaleras.add(segunda);
        for(int i=0;i<nSerpientes;i++){
           SnakeAndStairs resto= new SnakeAndStairs();
           resto.crearSerpiente();
            if(serpientes.get(i).getCabeza()==resto.getCabeza()|| serpientes.get(i).getCola()==resto.getCola())i--;
            else 
            if(!comprobarTablero(resto.getCabeza())||!comprobarTablero(resto.getCola()))i--;
            else serpientes.add(resto);
        }
        for(int i=0;i<nEscaleras;i++){
           SnakeAndStairs rest= new SnakeAndStairs();
           rest.crearEscalera();
           if(!comprobarTablero(rest.getArriba())||!comprobarTablero(rest.getAbajo()))i--;
           else 
               if(escaleras.get(i).getArriba()==rest.getArriba()|| escaleras.get(i).getAbajo()==rest.getAbajo())i--;
               else escaleras.add(rest);      
        }
        System.out.println("Culo");
        
    }
    
    public void escribirTablero(){
        System.out.println("**************************************************************************************************************************");
        System.out.println("**************************************************************************************************************************");
                
        int posL=0;
        for(int i=0;i<10;i++){
                System.out.println("**          **          **          **          **          **          **          **          **          **          **");
                if(i%2==0)System.out.printf("** %03d      ** %03d      ** %03d      ** %03d      ** %03d      ** %03d      ** %03d      ** %03d      ** %03d      ** %03d      **\n",pos[posL],pos[posL+1],pos[posL+2],pos[posL+3],pos[posL+4],pos[posL+5],pos[posL+6],pos[posL+7],pos[posL+8],pos[posL+9]);
                else System.out.printf("** %03d      ** %03d      ** %03d      ** %03d      ** %03d      ** %03d      ** %03d      ** %03d      ** %03d      ** %03d      **\n",pos[posL+9],pos[posL+8],pos[posL+7],pos[posL+6],pos[posL+5],pos[posL+4],pos[posL+3],pos[posL+2],pos[posL+1],pos[posL]);
                System.out.println("**          **          **          **          **          **          **          **          **          **          **");
                if(i%2==0)System.out.println("**"+escribirSoE(pos[posL])+escribirSoE(pos[posL+1])+escribirSoE(pos[posL+2])+escribirSoE(pos[posL+3])+escribirSoE(pos[posL+4])+escribirSoE(pos[posL+5])+escribirSoE(pos[posL+6])+escribirSoE(pos[posL+7])+escribirSoE(pos[posL+8])+escribirSoE(pos[posL+9]));
                else System.out.println("**"+escribirSoE(pos[posL+9])+escribirSoE(pos[posL+8])+escribirSoE(pos[posL+7])+escribirSoE(pos[posL+6])+escribirSoE(pos[posL+5])+escribirSoE(pos[posL+4])+escribirSoE(pos[posL+3])+escribirSoE(pos[posL+2])+escribirSoE(pos[posL+1])+escribirSoE(pos[posL]));
                System.out.println("**          **          **          **          **          **          **          **          **          **          **");
                if(i%2==0){
                System.out.println("**"+escribirPosJ(gamers.get(0),pos[posL])+escribirPosJ(gamers.get(0),pos[posL+1])+escribirPosJ(gamers.get(0),pos[posL+2])+escribirPosJ(gamers.get(0),pos[posL+3])+escribirPosJ(gamers.get(0),pos[posL+4])+escribirPosJ(gamers.get(0),pos[posL+5])+escribirPosJ(gamers.get(0),pos[posL+6])+escribirPosJ(gamers.get(0),pos[posL+7])+escribirPosJ(gamers.get(0),pos[posL+8])+escribirPosJ(gamers.get(0),pos[posL+9]));
                System.out.println("**"+escribirPosJ(gamers.get(1),pos[posL])+escribirPosJ(gamers.get(1),pos[posL+1])+escribirPosJ(gamers.get(1),pos[posL+2])+escribirPosJ(gamers.get(1),pos[posL+3])+escribirPosJ(gamers.get(1),pos[posL+4])+escribirPosJ(gamers.get(1),pos[posL+5])+escribirPosJ(gamers.get(1),pos[posL+6])+escribirPosJ(gamers.get(1),pos[posL+7])+escribirPosJ(gamers.get(1),pos[posL+8])+escribirPosJ(gamers.get(1),pos[posL+9]));
                System.out.println("**"+escribirPosJ(gamers.get(2),pos[posL])+escribirPosJ(gamers.get(2),pos[posL+1])+escribirPosJ(gamers.get(2),pos[posL+2])+escribirPosJ(gamers.get(2),pos[posL+3])+escribirPosJ(gamers.get(2),pos[posL+4])+escribirPosJ(gamers.get(2),pos[posL+5])+escribirPosJ(gamers.get(2),pos[posL+6])+escribirPosJ(gamers.get(2),pos[posL+7])+escribirPosJ(gamers.get(2),pos[posL+8])+escribirPosJ(gamers.get(2),pos[posL+9]));
                System.out.println("**"+escribirPosJ(gamers.get(3),pos[posL])+escribirPosJ(gamers.get(3),pos[posL+1])+escribirPosJ(gamers.get(3),pos[posL+2])+escribirPosJ(gamers.get(3),pos[posL+3])+escribirPosJ(gamers.get(3),pos[posL+4])+escribirPosJ(gamers.get(3),pos[posL+5])+escribirPosJ(gamers.get(3),pos[posL+6])+escribirPosJ(gamers.get(3),pos[posL+7])+escribirPosJ(gamers.get(3),pos[posL+8])+escribirPosJ(gamers.get(3),pos[posL+9]));
                }else{
                System.out.println("**"+escribirPosJ(gamers.get(0),pos[posL+9])+escribirPosJ(gamers.get(0),pos[posL+8])+escribirPosJ(gamers.get(0),pos[posL+7])+escribirPosJ(gamers.get(0),pos[posL+6])+escribirPosJ(gamers.get(0),pos[posL+5])+escribirPosJ(gamers.get(0),pos[posL+4])+escribirPosJ(gamers.get(0),pos[posL+3])+escribirPosJ(gamers.get(0),pos[posL+2])+escribirPosJ(gamers.get(0),pos[posL+1])+escribirPosJ(gamers.get(0),pos[posL]));
                System.out.println("**"+escribirPosJ(gamers.get(1),pos[posL+9])+escribirPosJ(gamers.get(1),pos[posL+8])+escribirPosJ(gamers.get(1),pos[posL+7])+escribirPosJ(gamers.get(1),pos[posL+6])+escribirPosJ(gamers.get(1),pos[posL+5])+escribirPosJ(gamers.get(1),pos[posL+4])+escribirPosJ(gamers.get(1),pos[posL+3])+escribirPosJ(gamers.get(1),pos[posL+2])+escribirPosJ(gamers.get(1),pos[posL+1])+escribirPosJ(gamers.get(1),pos[posL]));
                System.out.println("**"+escribirPosJ(gamers.get(2),pos[posL+9])+escribirPosJ(gamers.get(2),pos[posL+8])+escribirPosJ(gamers.get(2),pos[posL+7])+escribirPosJ(gamers.get(2),pos[posL+6])+escribirPosJ(gamers.get(2),pos[posL+5])+escribirPosJ(gamers.get(2),pos[posL+4])+escribirPosJ(gamers.get(2),pos[posL+3])+escribirPosJ(gamers.get(2),pos[posL+2])+escribirPosJ(gamers.get(2),pos[posL+1])+escribirPosJ(gamers.get(2),pos[posL]));
                System.out.println("**"+escribirPosJ(gamers.get(3),pos[posL+9])+escribirPosJ(gamers.get(3),pos[posL+8])+escribirPosJ(gamers.get(3),pos[posL+7])+escribirPosJ(gamers.get(3),pos[posL+6])+escribirPosJ(gamers.get(3),pos[posL+5])+escribirPosJ(gamers.get(3),pos[posL+4])+escribirPosJ(gamers.get(3),pos[posL+3])+escribirPosJ(gamers.get(3),pos[posL+2])+escribirPosJ(gamers.get(3),pos[posL+1])+escribirPosJ(gamers.get(3),pos[posL]));
                
                }
                System.out.println("**          **          **          **          **          **          **          **          **          **          **");
                System.out.println("**************************************************************************************************************************");
                System.out.println("**************************************************************************************************************************");
                
        posL+=10;
        } 
        System.out.println("Serpientes");
        for(int i=0;i<serpientes.size();i++)
            System.out.println(serpientes.get(i).getCabeza()+"-"+serpientes.get(i).getCola());
        System.out.println("Escaleras");
        for(int i=0;i<escaleras.size();i++)
            System.out.println(escaleras.get(i).getArriba()+"-"+escaleras.get(i).getAbajo());
    }
    
    public String escribirSoE(int n){
        int cont=0;
       
        String fila="";

                for(int a=0;a<serpientes.size();a++){
                if(n==serpientes.get(a).getCabeza()){
                    fila+=String.format("SerCa(%03d)**",serpientes.get(a).getCola());
                    cont++;
                    return fila;
                }   
                if(n==serpientes.get(a).getCola()){
                    fila+=String.format("SerCo(%03d)**",serpientes.get(a).getCabeza());
                    cont++; 
                    return fila;
                }
                }
                for(int c=0;c<escaleras.size();c++){    
                if(n==escaleras.get(c).getArriba()){
                    fila+=String.format("EscUp(%03d)**",escaleras.get(c).getAbajo());
                    cont++;
                    return fila;
                }
                if(n==escaleras.get(c).getAbajo()){
                    fila+=String.format("EscDo(%03d)**",escaleras.get(c).getArriba());
                    cont++;
                    return fila;
                }
                }
        return fila+="          **";
    }    
    
    public String escribirPosJ(Jugador j,int n){
    String fila="";
    if(j.getNombre().equalsIgnoreCase("NULO")){
    return fila+="          **";
    
    }
        if(j.getFicha().getPosicion()==n){
        if(j.getFicha().getColor()==Tipo.AMARILLO)fila+="A         **";
        if(j.getFicha().getColor()==Tipo.NARANJA) fila+="N         **";
        if(j.getFicha().getColor()==Tipo.ROJO)    fila+="R         **";
        if(j.getFicha().getColor()==Tipo.VERDE)   fila+="V         **";
        }else fila+="          **";
            
    return fila;
    }
    
    public void cambiarPos(Jugador j,int n){
        for(int i=0;i<gamers.size();i++)
            if(gamers.get(i).getFicha().getColor()==j.getFicha().getColor())
                gamers.get(i).getFicha().setPosicion(n);
    }
    
    public int comprobarSerpiente(int n){
       for(int i=0;i<serpientes.size();i++)
            if(n==serpientes.get(i).getCabeza())
              return serpientes.get(i).getCola();
              return n;
    }
    
    public int comprobarEscalera(int n){
        for(int i=0;i<escaleras.size();i++)
            if(n==escaleras.get(i).getAbajo())
               return escaleras.get(i).getArriba();
               return n;
    }
    
    public boolean comprobarTablero(int n){
        for(int i=0;i<serpientes.size();i++){
            if(n==serpientes.get(i).getCabeza())return false;
            if(n==serpientes.get(i).getCola())return false;
        } 
        return true;
    }
    
}
