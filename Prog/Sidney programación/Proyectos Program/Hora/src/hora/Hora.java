/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hora;

/**
 *
 * @author dedei
 */
public class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Hora(){
    hora=7;
    minuto=55;
    segundo=0;
    }
    
    public Hora(int s){
    hora=s/3600;
    minuto=hora%3600;
    segundo=minuto/60; 
    }
    
    public Hora(int h,int m,int s){
    if(!comprobarHora(h,m,s))
    {
    hora=8;
    minuto=59;
    segundo=59;
    }
    else{
    hora=h;
    minuto=m;
    segundo=s;
    } 
    }
    
    private boolean comprobarHora(int h,int m,int s){
        if(h>=0&&24>h)
            if(m>=0&&60>m)
                if(s>=0&&60>s)
                    return true;
        return false;
    }
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
       if(comprobarHora(hora,minuto,segundo))
           this.hora = hora;       
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if(comprobarHora(hora,minuto,segundo))
            this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if(comprobarHora(hora,minuto,segundo))
            this.segundo = segundo;
    }
    
    public void cambiarHora(){
    segundo++;
        if(segundo==60){
            segundo= 0;
            minuto++;
            if(minuto==60){
                minuto=0;
                hora++;
                if(hora==24)hora=0;               
            }
        }
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
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hora,minuto,segundo);
    }
    
}
