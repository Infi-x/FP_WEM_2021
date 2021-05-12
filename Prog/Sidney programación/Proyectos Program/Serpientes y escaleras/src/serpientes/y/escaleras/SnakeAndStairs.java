/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientes.y.escaleras;

import java.util.*;

public class SnakeAndStairs {
    private int cabeza;
    private int cola;
    private int arriba;
    private int abajo;
    
    public SnakeAndStairs(){
        cabeza=0;
        cola=0;
        
    }
    
    public void crearSerpiente(){
       int n= new Random().nextInt(70)+1;
       cola=n;
       while(cabeza==0){
       n= new Random().nextInt(70)+30;
       if(n<=cola)continue;
       else if((n-cola)<10)continue;
            else cabeza=n;  
       }
       
    }

    public int getCabeza() {
        return cabeza;
    }

    public void setCabeza(int cabeza) {
        this.cabeza = cabeza;
    }

    public int getCola() {
        return cola;
    }

    public void setCola(int cola) {
        this.cola = cola;
    }
    
    public void crearEscalera(){
       int n= new Random().nextInt(70)+10;
       abajo=n;
       while(arriba==0){
       n= new Random().nextInt(80)+20;
       if(n<=abajo)continue;
       else if((n-abajo)<10)continue;
            else arriba=n;    
       }
       
    }

    public int getArriba() {
        return arriba;
    }

    public void setArriba(int arriba) {
        this.arriba = arriba;
    }

    public int getAbajo() {
        return abajo;
    }

    public void setAbajo(int abajo) {
        this.abajo = abajo;
    }
}
