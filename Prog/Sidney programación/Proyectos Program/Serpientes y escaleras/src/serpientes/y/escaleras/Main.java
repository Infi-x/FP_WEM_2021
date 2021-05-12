
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpientes.y.escaleras;
/**
 *
 * @author dedei
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu m=new Menu(new Partida());
        m.aplicarMenu();
                
        /*Jugador uno=new Jugador("Sidney",new ficha(Tipo.AMARILLO));
        Jugador dos=new Jugador("Sidney",new ficha(Tipo.NARANJA));
        Jugador tres=new Jugador("Sidney",new ficha(Tipo.ROJO));
        Jugador cuatro=new Jugador("NULO",new ficha(Tipo.NEGRO));
        ArrayList<Jugador> j=new ArrayList();
        j.add(uno);
        j.add(dos);
        j.add(tres);
        j.add(cuatro);
        
        Tablero t=new Tablero(j);
        t.escribirTablero();*/
        
        
    }
    
}
