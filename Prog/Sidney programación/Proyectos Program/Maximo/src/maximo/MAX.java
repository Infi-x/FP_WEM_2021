/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dedei
 */
public class MAX {
    
    public MAX(){}
    
    public int MaximoSinExcepciones(){
         try {
             File e= new File("Numeros.txt");
            Scanner sc = new Scanner(e);
           int num=0;
           int max=-1;
            while (sc.hasNext()) {
                num=sc.nextInt();
                if(max==-1)max=num;
                if(num>max)max=num;
                }
            return max;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
       return -1; 
    }
    
    public int MaximoConExcepciones(){
    
       return -1; 
    }
}
