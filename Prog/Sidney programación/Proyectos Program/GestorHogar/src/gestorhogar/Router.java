/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorhogar;

import java.util.*;

/**
 *
 * @author dedei
 */
public class Router extends Dispositivo {
    private String contrasenia;
    private ArrayList<DispositivoConInternet> dispositivosDentro;
    private Scanner sc;
    public Router(String n, double c) {
        super(n,c);
        dispositivosDentro= new ArrayList();
        sc= new Scanner(System.in);
         contrasenia="12345678";       
    }
    
    public void bienvenida(){
        int Respuesta=0;
        String aux="";
        System.out.println("Bienvenido a su nuevo router,\nenpecemos a configurarlo...");
        System.out.println("Quiere cambiar el nombre por defecto?\n1.Si 2.No");
        Respuesta=SioNo();
        if(Respuesta==1){
            ModificarNombre();
        }
            ModificarContraNueva();

    }
    
    public void AniadirDispositivo(DispositivoConInternet d){
        if(validacion())
           dispositivosDentro.add(d);
    }
    
    public boolean validacion(){
        String aux="";
        int cont=0;
        do{
            System.out.println("Introduzca la contraseña...");
            aux=sc.nextLine();
            sc=new Scanner(System.in);
            if(contrasenia.equalsIgnoreCase(aux)){
                System.out.println("Contraseña correcta, pulse enter para volver");
            sc.nextLine();
            sc=new Scanner(System.in);
            return true;
            }else{
                System.out.println("Contraseña incorrecta le quedan "+(3-cont)+" intentos, vuelva a introducirla");
                cont++;
                if(cont==3){
                    System.out.println("Intentos superados, vuelva a intentarlo mas tarde");
                    break;
                }
            }
        }while(!aux.equals(contrasenia));
        return false;
    }
    
    public int SioNo(){
    int aux=0;
        do{
        try{            
            aux=sc.nextInt();            
        }
        catch(Exception e){
            aux=0;   
            System.out.println("Opcion seleccionada no apta,intentelo de nuevo\n\n");
        }
        sc= new Scanner(System.in);
        
        }while(aux<1||aux>2);
        return aux;
    }
    
    public void ModificarNombre(){
        int Respuesta=0;
        String aux="";   
        do{
            System.out.println("Escriba el nuevo nombre de su router:...");
            aux=sc.nextLine();
            sc= new Scanner(System.in);
            System.out.println("Quiere dejar "+aux+" como nuevo nombre para su router?\n1.Si 2.No ");
            Respuesta=SioNo();
        }while(Respuesta==2);
    }
    
    public void ModificarContraNueva(){
        int Respuesta=0;
        String aux="";
        do{
            System.out.println("Escriba la nueva contraseña de su router:...");
            aux=sc.nextLine();
            sc= new Scanner(System.in);
            System.out.println("Quiere dejar "+aux+" como nueva contraseña para su router?\n1.Si 2.No ");
            Respuesta=SioNo();
        }while(Respuesta==2);
        contrasenia=aux;
        }
    
    public void ModificarContra(){
        int Respuesta=0;
        String aux="";
        do{
            System.out.println("Ingrese su antigua contraseña");
            aux=sc.toString();
            sc= new Scanner(System.in);
            if(aux.equals(contrasenia)){
                do{
                System.out.println("Contraseña correcta, ingrese su nueva contraseña (minimo 8 caracteres, maximo 12");
                aux=sc.nextLine();
                sc= new Scanner(System.in);
                if(aux.length()<7 || aux.length()>11)
                    System.out.println("Contraseña no apta, repita");
                }while(aux.length()<7 || aux.length()>11);
                System.out.println("La contraseña se ha cambiado sactisfactioriamente");
                contrasenia=aux;
                BorrarDispos();
            }else
                System.out.println("Contraseña equivicada, repita");
        }while(!aux.equals(contrasenia));
    }
    
    private void BorrarDispos(){
        dispositivosDentro.clear();
    }
    
    public void DesconectarDispo(String n){
        for(DispositivoConInternet cada :dispositivosDentro)
            if(cada.getNombre().equals(n))
                dispositivosDentro.remove(cada);
    }
    
    public void ListarDipo(){
        for(DispositivoConInternet cada :dispositivosDentro)
            System.out.println("Nombre: "+cada.getNombre()+" Velocidad de red: "+cada.getVelocidad());
    }

    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+
                "\nEstado: "+this.isEncendido()+
                "\nNumero de conecciones: "+this.dispositivosDentro.size();
    }

    public ArrayList<DispositivoConInternet> getDispositivosDentro() {
        return dispositivosDentro;
    }

    public void setDispositivosDentro(ArrayList<DispositivoConInternet> dispositivosDentro) {
        this.dispositivosDentro = dispositivosDentro;
    }

    public String getContrasenia() {
        return contrasenia;
    }


    
    
}
