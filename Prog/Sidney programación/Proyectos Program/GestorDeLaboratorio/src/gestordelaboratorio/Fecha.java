/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordelaboratorio;

import java.util.GregorianCalendar;

/**
 *
 * @author lunis
 */
public class Fecha 
{
    private int dia, mes, anio;
    
    
    
    private void fechaDelSistema(){
        GregorianCalendar gc = new GregorianCalendar();
        dia = gc.get(GregorianCalendar.DAY_OF_MONTH);
        mes = gc.get(GregorianCalendar.MONTH)+1;
        anio = gc.get(GregorianCalendar.YEAR);        
    }
    
    public Fecha() 
    {
     /*dia=3;
     mes=10;
     anio=2019; */
        fechaDelSistema();
    }
    public Fecha(int queD, int queM, int queA)  {
    if(comprobarFecha(queD, queM, queA)==true){
        dia = queD;
        mes = queM;
        anio = queA;                
    }
    else{        
        fechaDelSistema();
        }
    }     
    
    public void printFecha(){
    System.out.println(/*dia+"/"+mes+"/"+anio*/this);
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
    
    public void setDia(int nuevoDia){
        if(comprobarFecha(nuevoDia,mes,anio)==true) dia=nuevoDia;        
    }
    
    public void setMes(int nuevoMes){
        if(comprobarFecha(dia,nuevoMes,anio)==true) mes=nuevoMes;
    }
    
    public void setAnio(int nuevoAnio){
        if(comprobarFecha(dia, mes, nuevoAnio)==true) anio=nuevoAnio;
    }
    
    public boolean comprobarFecha(int d, int m, int a)
    {        
        if(a==0) return false;
        if(m<1 || m>12) return false;
        int limite=0;        
        if(m==4 || m==6 || m==9 || m==11) limite=30;
        else if(m==2 && bisiesto(a)==true) {
            limite=29;
        } else if(m==2) limite=28;
                else limite=31;
        if(d<1 || d>limite) return false;
        return true;        
    }
    
    private boolean bisiesto(int year)
    {
        if((year%4==0 && year%100!=0)||year%400==0) return true;
        return false;    
    }
   
     /* 
    public String toString() 
    {
     String f=dia+"/"+mes+"/"+anio;
     return f;
    }*/
    public String toString(){
        return String.format("%02d/%02d/%04d",dia,mes,anio);
     } 
    
    
    public int cuantosDiasSon(Fecha f){
        return diferencia(this.dia,this.mes,f.dia,f.mes);
    }
    
    public int cuantosDias(int d, int m){
        int c =0;
        c = d;
        for(int i=0;i<m;i++)
        c += GetDiasMes(i+1);
        return c;
    }
    
    public int diferencia(int d1, int m1, int d2, int m2){
        int c = cuantosDias(d2,m2) - cuantosDias(d1,m1);
        return c;
    }
    
    public int GetDiasMes(int m){        
        switch(m){
            case 1:return 31;
            case 2:return 28;
            case 3:return 31;
            case 4:return 30;
            case 5:return 31;
            case 6:return 30;
            case 7:return 31;
            case 8:return 31;
            case 9:return 30;
            case 10:return 31;
            case 11:return 30;
            case 12:return 31;           
        }
        return 1;
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


