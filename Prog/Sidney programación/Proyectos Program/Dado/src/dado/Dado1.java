/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;
import java.util.Random;
/**
 *
 * @author dedei
 */
public class Dado1 {
    
    public Dado1(){
    
    }
      
    public int tirar(){
    
    return (int) (Math.random()*6)+1;
    }
    
    
}
