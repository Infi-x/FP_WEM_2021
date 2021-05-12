/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author dedei
 */
public class Calcu {
    public final int MAX = 10;
    private int[]numeros;
    private int total;
    
    public Calcu(){
        numeros = new int[MAX];
        total = 0;
}
    public Calcu(int[]n){
       if(n.length>MAX){
           numeros = new int[MAX];
           total=0;
       }
       else{
        numeros = n;
        total = n.length;
       }
}
    
    public void introducirNumero(int x){
        if(total<MAX){
            numeros[total]=x;
            total++;
        }
         
    }
    
    public int contarMayoresQue(int n){
        int conta = 0;
      
        for(int i=0; i<total; i++){
          if(n<numeros[i])
              conta++;              
              }
        return conta;
    }
    
    public void escribirNumeros(){
        for(int i =0; i<total; i++)
            System.out.println(i+ " = "+numeros[i]);
    }
    
    public int getTotal(){
        return total;
    }
    
    private boolean posicionCorrecta(int n){
        return n<total && n>=0;
    }
    
    public void intercambiar(int x, int y){
       if(posicionCorrecta(x)&& posicionCorrecta(y)){
           int aux1 = numeros[x];
           int aux2 = numeros[y];
           numeros[x]=aux2;
           numeros[y]=aux1;
       }
       
    }
       
       public void borrarUltimoElemento(){
               if(total>0){
                   numeros[total]=0;
                   total--;
               }
       }
   
    private boolean haynumeros(){
        return total>0;
    }
    
    private boolean esPar(int n){
        return n%2==0;
    }
    
    private void borrarUnPar(int n){
        if(esPar(numeros[n])){
            for(int i=n;i<numeros.length-1;i++){
            numeros[i]=numeros[i+1];
            }
            numeros[numeros.length-1]=0;
            total--;
        }
    }
    
    public void borrarPares(){
        for(int i=0;i<total;i++)
        borrarUnPar(i);
    }         
}
