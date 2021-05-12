
/**
 * Write a description of class Bucles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bucles
{
   private int c;
   private int r;
   private int i;
   private int a;
   
   public Bucles(){
    c=0;
    r=0;
    i=0;
   }
   
   public void escribirFigura(int n){
       c=0;
       r=0;
       i=n-(n-1);
       System.out.println("");
      while(c<n){
           while(r<n){
              System.out.print(""+i);
              r++;
        }
        i++;
        r=0;
        c++;
        System.out.println("");
     }
     
   }
 
   public void escribirFigura2(int n){
       c=0;
       r=0;
       i=n-(n-1);
       System.out.println("");
      while(c<n){
           while(r<i){
              System.out.print(""+i);
              r++;
        }
        i++;
        r=0;
        c++;
        System.out.println("");
     }
     
   }
   public void escribirFigura3(int n){
       c=0;
       r=0;
       i=n-(n-1);
       System.out.println("");
       a=n-(n-1);
      while(c<n){
           while(r<a){
              System.out.print(""+i);
              r++;
              i++;
        }
        r=0;
        c++;
        i=n-(n-1);
        a++;
        System.out.println("");
     }
     
   }

   public void tablaDeMultiplicar(int n){
    c=1;
    r=1;
    i=0;
    a=0;
    while(c<=10){
       System.out.println("");
       while(a<n){
            i=r*c;
            System.out.printf(" %02d x %02d = %03d ",r,c,i);
            r++;
            a++;
            }
      
       c++;
       r=1;
       a=0;
        }
    /*while(c<=n){
        //System.out.printf("Tabla del %d",c);
        
        while(r<=10){
           
           System.out.println("");
           r++;
           a=0;
           c++;
        }
        r=0;
        
    }*/ 
   }
   
   public void calcularSumatorio(int cuanto, int lim){
    i=0;
    r=0;
    c=1;
    while(r<=cuanto){
        r= (int) (Math.random()*lim)+1;
        c=r-(r-1);
        i=r+c;
        
        
    }
    } 
   
   public void Borrar(){
    System.out.print("\u000C");
   }
}
