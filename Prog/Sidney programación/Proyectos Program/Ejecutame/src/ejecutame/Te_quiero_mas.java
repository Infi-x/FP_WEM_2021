/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecutame;

import java.util.Scanner;

/**
 *
 * @author dedei
 */
public class Te_quiero_mas {
    private  String[] texto={"Quiero que sepas que te quiero mucho,",
            " De verdad",
            "Te quiero mucho, eres muy especial para mi",
            " Me haces muy feliz",
            "Eres maravillosa",
            "Eres lo mejor que me ha pasado",
            "Quiero que lo sepas, porque te quiero mucho,",
            "Y no quiero que estemos mal, ni causar malos momentos",
            "Quiero que estes bien y hacerte sentir bien,",
            "Porque el no lograrlo me hace sentir mal,",
            "Te quiero mucho",
            "Y te lo quiero demostrar........."
            };
    private Scanner sc;
    
    public Te_quiero_mas(){}
    
    public void TeQuieroMucho() throws InterruptedException{
        String Nombre="";
        System.out.println("Quien eres?");
        sc= new Scanner(System.in);
        Nombre=sc.nextLine();
        if(Nombre.equalsIgnoreCase("LIZ")|| Nombre.equalsIgnoreCase("LIZBETH")|| Nombre.equalsIgnoreCase("GRISHA")){
            for(int i=0;i<texto.length;i++){
                for(int j=0;j<texto[i].length();j++){
                    System.out.print(texto[i].charAt(j));
                    Thread.sleep(250);
                }
                System.out.println("");
                
            }
            
            
            int cont=0;
            
            for(int i=0;i>-1;i++){
              System.out.print("Te quiero mucho ");
              Thread.sleep(250);
              cont++;
              if(cont==10){
                  System.out.println("");
                  cont=0;
              }
            }
            
    }
       else 
        if(Nombre.equalsIgnoreCase("Laisa")){
            int cont=0;
            for(int i=0;i>-1;i++){
              System.out.print("Te quiero señorita mococienta ");
              Thread.sleep(250);
              cont++;
              if(cont==6){
                  System.out.println("");
                  cont=0;
              }
            }
        }
        else 
            System.out.println("Este programa no es para ti");
    }
} 

