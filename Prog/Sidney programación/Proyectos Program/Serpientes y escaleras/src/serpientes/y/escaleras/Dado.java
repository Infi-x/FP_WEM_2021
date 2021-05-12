/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientes.y.escaleras;



public class Dado {
public Dado(){}
    public int tira(){
        int n= (int) (Math.random()*6 + 1);
        return n;
    }
    
}
