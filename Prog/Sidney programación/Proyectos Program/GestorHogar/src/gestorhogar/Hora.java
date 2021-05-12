/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorhogar;

import java.util.GregorianCalendar;

/**
 *
 * @author dedei
 */
public class Hora implements Comparable{
    private int hora;
    private int minuto;
    private int segundo;
     
    public Hora( int queH, int queM, int queS){
        if (comprobarHora(queH, queM, queS)==true){
            hora=queH;
            minuto=queM;
            segundo=queS;
        }
        else horaSistema();
    }
    public Hora(){
    horaSistema();
    }
    public void horaSistema(){
        GregorianCalendar gc=new GregorianCalendar();
        hora=gc.get(GregorianCalendar.HOUR_OF_DAY);
        minuto=gc.get(GregorianCalendar.MINUTE);
        segundo=gc.get(GregorianCalendar.SECOND);
    }
    
    public void DameLaHora(){
        horaSistema();       
    }
    
    public void printHora()
    {
        System.out.printf (hora+":"+minuto+":"+segundo);
    }
    
    public void print()
    {
       System.out.printf("%02d:%02d:%02d", hora, minuto, segundo);
    }
     
    public int getHora(){
        return hora;
    }
    
    public int getMinuto(){
        return minuto;
    }
    
    public int getSegundo() {
        return segundo;
    }
    
    public void setHora(int nuevoHora){
        if(comprobarHora(nuevoHora,minuto,segundo)==true){
        hora= nuevoHora;
       }
    }
    
    public void setMinuto(int nuevoMinuto){
        if(comprobarHora(hora,nuevoMinuto,segundo)==true){
        minuto= nuevoMinuto;
       }   
    }
    
    public void setSegundo(int nuevoSegundo){
        if(comprobarHora(hora,minuto,nuevoSegundo)==true){
        segundo= nuevoSegundo;
       }
    }
    
    private boolean comprobarHora(int hora, int minuto, int segundo){
       if (hora>=0 && hora<=23){
           if(minuto>=0 && minuto<=59){
               if(segundo>=0 && segundo<=59){
                   return true;
                }
               return false;
            }
           return false;
        }
       return false; 
    }

    
    public String toString(){
        return String.format("%02d:%02d:%02d",hora,minuto,segundo);
    }
    
    public Hora cambiarHora(){
        int h = hora;
        int m = minuto;
        int s = segundo;
        s++;
        if(s==60){
            s = 0;
            m++;
            if(m==60){
                m =0;
                h++;
                if(h==24)h=0;               

            }
        }
        return new Hora(h , m , s);
    }
    public int aSegundos(){
        return hora*3600+minuto*60+segundo;
    }
    
    public Hora aHora(int n){
    int h=n/3600;
    int m=(n-h*3600)/60;
    int s=(n-m*60);
    return new Hora(h,m,s);
    }
    
    public void reloj()throws InterruptedException{
        for(int i=0;i<1;i--){
            horaSistema();
            print();
            Thread.sleep(1000);
            System.out.print("\u000C");            
        }
    }

    @Override
    public int compareTo(Object t) {
     if(t.getClass()==this.getClass()){
         Hora f=(Hora) t;
         if(f.getHora()<this.getHora())
                return -1;
            if(f.getHora()>this.getHora())
                return 1;
            if(f.getHora()==this.getHora()){
                if(f.getMinuto()<this.getMinuto())
                    return -1;
                if(f.getMinuto()>this.getMinuto())
                    return 1;
                if(f.getMinuto()==this.getMinuto()){
                    if(f.getSegundo()<this.getSegundo())
                        return -1;
                    if(f.getSegundo()>this.getSegundo())
                        return 1;
                    if(f.getSegundo()==this.getSegundo())
                        return 0;
                }
            }        
     }
        return -1;  
    }
   }

