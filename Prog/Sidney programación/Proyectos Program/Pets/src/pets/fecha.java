/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pets;

/**
 *
 * @author cash
 */
import java.util.*;
public class fecha {
    
    private int dia;
    private int mes;
    private int anio;
    
    public void fechadelSistema(){
      GregorianCalendar gc = new GregorianCalendar();
      dia = gc.get(GregorianCalendar.DAY_OF_MONTH);
      mes = gc.get(GregorianCalendar.MONTH)+1;
      anio = gc.get(GregorianCalendar.YEAR);
    }
    
     
   
 public fecha(int queD , int queM , int queA)
 {
    if(comprobarFecha(queD, queM, queA)){
      dia=queD;
      mes=queM;
      anio=queA;
    }
    else fechadelSistema();   
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
      String nombreMes="Mes";
      if(mes==1) nombreMes="Enero";
      if(mes==2) nombreMes="Febrero";
      if(mes==3) nombreMes="Marzo";
      if(mes==4) nombreMes="Abril";
      if(mes==5) nombreMes="Mayo";
      if(mes==6) nombreMes="Junio";
      if(mes==7) nombreMes="Julio";
      if(mes==8) nombreMes="Agosto";
      if(mes==9) nombreMes="Septiembre";
      if(mes==10) nombreMes="Octubre";
      if(mes==11) nombreMes="Noviembre";
      if(mes==12) nombreMes="Diciembre";
      return String.format("%02d/%s/%04d",dia,nombreMes,anio);
    
 }

    int compareTo(fecha fechaNAc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

