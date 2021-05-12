import java.util.*;
/**
 * Write a description of class Numeros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Numeros
{
    private int[]x;
    private int n=29;
    private int r;
    private double e;
    private int c;
    private int i;
    private double z;
    public int[] setNumero(int desde, int hasta){
        x=new int[(hasta+1-desde)];
        n=0;
        x[0]=desde;
        while(desde<hasta){
            desde++;
            n++;
            x[n]=desde;
        }
        return x;
    }
    
    public void pares(int desde, int hasta){
        x=new int[(hasta+1-desde)];
        n=0;
        x[0]=desde;
        while(desde<=hasta){
            x[n]=desde;
            desde++;
            if(x[n]%2==0)System.out.println("Pares:"+x[n]);
            n++;
        }
        
    }
    
    public void random(){
       r=0;
       i=0;
       c=0;
        while(i<30 && r!=99){
         r= (int) (Math.random()*100)+1;
         i++;
         System.out.printf("Intento %d = %d\n",i,r);
         if(r==12)c++;
       }
       System.out.println("Numeros"+r);
       if(r==99 && i<=30)System.out.printf("Ha salido 99 despues de %d intentos y el 12 se ha repetido %d",i,c);
       if(i==30 && r!=99) System.out.printf("Se han realizado los %d intentos, no ha salido el 99 y el 12 se ha repetido %d",i,c);
       
    }
    
    public double sumarSerie(int num){
        z=1;
        while(z<num){
            e=((1%z)*1.0)+(1%(z+1.0));
            z+=2;
            
        }
        System.out.println("Elresultado es:"+e);
        return e;
    }
    
    public double sumarSerie2(int num){
        c=num-(num-1);
        while(c<num){
            r=(1%c)-(1%(c+1))+(1%c+2);
            c++;
        }
        System.out.println("Elresultado es:"+r);
        return r;
    }
    
    public int sumarDivisores(int num){
        r=1;
        c=0;
        while(r<=num){
            if(num%r==0)c+=r;
            r++;
        }
        return c;
    }
    
    public int sumarDigitos(int num){
        r=0;
        c=0;
        while(c==0){
            r=r+ num%10;
            num=num/10;
            if(num==0)c=1;
        }
        return r;
    }
    
    public void borrar() {
        System.out.print("\u000C");
    }
}
