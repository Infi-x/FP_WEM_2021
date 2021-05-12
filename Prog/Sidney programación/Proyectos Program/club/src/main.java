
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dedei
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashSet<String> uno=new HashSet();
       HashSet<String> dos=new HashSet();
       HashSet<String> tres=new HashSet();
       uno.add("Dormir");
       uno.add("jugar");
       uno.add("bailar");
       dos.add("ll");
       dos.add("kk");
       dos.add("tt");
       tres.add("kk");
       tres.add("ii");
       tres.add("uu");
       
       Club mio = new Club("KK");
       mio.addPersona("Sidney", dos);
       mio.addPersona("Laisa", uno);
       mio.addPersona("Liz", tres);
       
        System.out.println("Mostrando lista del club");
       mio.printClub();
       
        System.out.println("Personas que tienen de Hobbies kk");
        System.out.println(mio.personasConHobbie("kk"));
        
        HashSet<String> aux= mio.borrarPersonasConHobbie("kk");
        System.out.println("borrando personas con hobbie kk");
        mio.printClub();
               
    }
    
}
