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
public class Fecha implements Comparable{
    private int dia;
    private int mes;
    private int anio;
    
     
    public Fecha(int queD , int queM , int queA){
    if(comprobarFecha(queD, queM, queA)){
      dia=queD;
      mes=queM;
      anio=queA;
    }
    else fechadelSistema();   
 }
     public Fecha(){
    fechadelSistema();   
 }
 public void fechadelSistema(){
      GregorianCalendar gc = new GregorianCalendar();
      dia = gc.get(GregorianCalendar.DAY_OF_MONTH);
      mes = gc.get(GregorianCalendar.MONTH)+1;
      anio = gc.get(GregorianCalendar.YEAR);
    }

 
 public void printFecha(){
        System.out.println (dia+"/"+mes+"/"+anio);
 }

 public int getDia(){ 
    return dia;
 }
 
 public int getMes(){
   return mes;
 }
 
 public int getAnio(){
    return anio;
 } 

 public boolean comprobarFecha(int d, int m, int a){
    int mes1=m;
    int dia1=d;
    int anio1=a;
    
    if (anio1!=0){
        if(mes1>=1 && mes1<=12){
            if((anio1%4==0 && anio1%100!=0) || anio1%400==0){
                  if(mes1==2 && dia1>=1 && dia1<=29) {
                return true;       
            }
        }
            if(mes1==2 && dia1>=1 && dia1<=28) {
                return true;                                
        }           
            if((mes1==1||mes1==3||mes1==5||mes1==7||mes1==8||mes1==10||mes1==12) && dia1>=1 && dia1<=31) {
                     return true;
        }
            if((mes1==4||mes1==6||mes1==9||mes1==11) && dia1>=1 && dia1<=30) {
            return true;
        }
      }
   }
    return false;
 }           
 public void setDia(int nuevoDia){
    if (comprobarFecha(nuevoDia,mes,anio)==true){
      dia=nuevoDia;
    }
 }
 public void setMes(int nuevoMes){
    if (comprobarFecha(dia,nuevoMes,anio)==true){
      mes=nuevoMes;
    }
 }
 public void setAnio(int nuevoAnio){
    if (comprobarFecha(dia,mes,nuevoAnio)==true){
      anio=nuevoAnio;
    }
 }
 public void setFecha(int d, int m, int a){
    if (comprobarFecha(d,m,a)==true){
      dia=d;
      mes=m;
      anio=a;
    }
 }
  public String toString(){
    return String.format("%02d/%02d/%04d",dia,mes,anio);
    
 }   

    @Override
    public int compareTo(Object t) {
        if(t.getClass()==this.getClass()){
            Fecha f=(Fecha) t;
            if(f.getAnio()<this.getAnio())
                return -1;
            if(f.getAnio()>this.getAnio())
                return 1;
            if(f.getAnio()==this.getAnio()){
                if(f.getMes()<this.getMes())
                    return -1;
                if(f.getMes()>this.getMes())
                    return 1;
                if(f.getMes()==this.getMes()){
                    if(f.getDia()<this.getDia())
                        return -1;
                    if(f.getDia()>this.getDia())
                        return 1;
                    if(f.getDia()==this.getDia())
                        return 0;
                }
            }        
        }
        return -1;
    }
    public int queDias(int m)
  {
    int mes=1;
    switch(m){
     case(1):mes=31;break;
     case(2):mes=28;break;
     case(3):mes=31;break;
     case(4):mes=30;break;
     case(5):mes=31;break;
     case(6):mes=30;break;
     case(7):mes=31;break;
     case(8):mes=31;break;
     case(9):mes=30;break;
     case(10):mes=31;break;
     case(11):mes=30;break;
     case(12):mes=31;break;
     }
    return mes;
    }
    public Fecha cuantosDias(int n){
    Fecha aux= this;
    for(int i=0;i<n;i++)
        aux=avanzarDia(aux);
    return aux;
    }
  
    
    public Fecha avanzarDia(Fecha a){
        Fecha f=a;
        int diames=f.queDias(f.mes);
        if(f.dia==diames){
            f.dia=1;
            if(f.mes==12){
                f.mes=1;
                f.anio++;
            }else
                f.mes++;    
        }else
            f.dia++;
        return f;
        
    }
}
