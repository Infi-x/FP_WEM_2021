import java.util.*;
/**
 * Write a description of class prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class prueba
{
   public int[] setNumeros(int desde,int hasta)
   {
       int tam=hasta+1-desde;
       int[]x= new int[tam];
       int n=0;
       x[0]=desde;
       while(desde<hasta){
           desde++;
           n++;
           x[n]=desde;
        }
        return x;
    }
    
   public void pares(int desde, int hasta)
   {
       int tam=hasta+1-desde;
       int[]x= new int[tam];
       int n=0;
       while(desde<=hasta){
        x[n]=desde;
        desde++;
        if(x[n]%2==0 && x[n]!=0)System.out.println("Pares:"+x[n]);
        n++;
        }
    }
    
   public void random(){
       int r=0;
       int i=0;
       int c=0;
        while(i<30 && r!=99){
          r= (int)(Math.random()*100)+1;
          i++;
          System.out.printf("Intento %d = %d\n",i,r);
          if(r==12)c++;
        }
       if(r==99 && i<=30)System.out.printf("Ha salido 99 despues de %d intentos y el 12 se ha repetido %d",i,c);
       if(i==30 && r!=99) System.out.printf("Se han realizado los %d intentos, no ha salido el 99 y el 12 se ha repetido %d",i,c);
       
       }
       
       
    
    }
       
