package gestorhogar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dedei
 */
public class Gestor {
    private String Nombre;
    private Scanner sc;
    private Calendario Calendario;
    private Router Router;
    private ArrayList<Dispositivo> Dispositivos;
    private HashMap<String,String> Rutinas;
    private int opcion_inicio;
    private int opcion_dispo;
    private int opcion_router;
    private static final String[] opciones_inicio={
        "-----------Menu Principal----------------",
        "- Dispositivos........................1 -",
        "- Router..............................2 -",
        "- Salir...............................3 -",};
    private static final String[] opciones_dispo={
        "---------Menu de Dispositivos----------",
        "- Buscar Dispositivo................1 -",
        "- Ver consumo.......................2 -",
        "- Apagar dispositivo................3 -",
        "- Encender dispositivo..............4 -",
        "- Apagado local.....................5 -",
        "- Añadir dispositivo................6 -",
        "- Eliminar dispositivo..............7 -",
        "- Volver al inicio..................8 -",
        };
    private static final String[] opciones_router={
        "------------Menu del Router------------",
        "- Listar dispositivos...............1 -",
        "- Cambiar contraseña................2 -",
        "- Cambiar Nombre....................3 -",
        "- Regristrar nuevo dispositivo......4 -",
        "- Eliminar Dispositivos.............5 -",
        "- Volver al inicio........... ......6 -",
        };
    
    public Gestor(){
    
    sc=new Scanner(System.in);
    Calendario=new Calendario();
    Dispositivos=new ArrayList();
    Rutinas= new HashMap();
    Router=null;
    }
    
    public void PrimeraBienvenida(){
        int opcion=0;
        System.out.println("Bienvanido a su nuevo gestor, por favor introduzca su nombre:");
        do{
            Nombre=sc.nextLine();
            sc=new Scanner(System.in);
            System.out.println("¿Es correcto?(1.Si 2.No)");
            do{
            try{
                opcion=sc.nextInt();
            sc=new Scanner(System.in);
            }catch(Exception e){
                opcion=0;
                sc=new Scanner(System.in);
                System.out.println("Valor numérico erróneo");
            }}while(opcion==0);
            if(opcion<=0 || opcion>2)
                System.out.println("Opcion no disponible");
        }while(opcion<=0 || opcion>1);
        ejecutarGestor();
    }
    
    public void Bienvenida(){
        System.out.println("Bienvenido "+Nombre+"\nHoy es "+Calendario.getFecha()+"\nQue desea hacer:");
        ReiniciarConsumo();
        ApagadoLocal();
        EncendidoLocal();
        ejecutarGestor();
    }
    
    public void ejecutarGestor(){
        do{
            ejecutarInicio();
            if(opcion_inicio==1 && opcion_dispo!=8){
            do{
                ejecutarDispo();
             }while(opcion_dispo!=8);
            } 
            if(opcion_inicio==2 && opcion_router!=6){
            do{
                ejecutarRouter();
             }while(opcion_router!=6);
            } 
        }while(opcion_inicio!=3);
    }
    
    public void ejecutarInicio(){
        opcion_inicio=0;         
        do{
            for(int i=0;i<opciones_inicio.length;i++)
                System.out.println(opciones_inicio[i]);
            System.out.print("Elija opción: ");    
        try{            
            opcion_inicio=sc.nextInt();   
        }
        catch(Exception e){
            opcion_inicio=0;   
            System.out.println("Opcion no valida, ha escrito un valor no numérico\n\n");
            
        }
        sc= new Scanner(System.in);
        if(opcion_inicio<1||opcion_inicio>opciones_inicio.length-1){
            System.out.println("Opcion no valida, número incorrecto\n\n"); 
          
        }
        }while(opcion_inicio<1||opcion_inicio>opciones_inicio.length-1);
        System.out.println("\n\n");
        MenuInicio();
    }
    
    public void ejecutarDispo(){
        opcion_dispo=0;         
        do{
            for(int i=0;i<opciones_dispo.length;i++)
                System.out.println(opciones_dispo[i]);
            System.out.print("Elija opción: ");    
        try{            
            opcion_dispo=sc.nextInt();   
        }
        catch(Exception e){
            opcion_dispo=0;   
            System.out.println("Opcion no valida, ha escrito un valor no numérico\n\n");
            
        }
        sc= new Scanner(System.in);
        if(opcion_dispo<1||opcion_dispo>opciones_dispo.length-1){
            System.out.println("Opcion no valida, número incorrecto\n\n"); 
          
        }
        }while(opcion_dispo<1||opcion_dispo>opciones_dispo.length-1);
        System.out.println("\n\n");
        MenuDispo();
    }
    
    public void ejecutarRouter(){
        if(Router==null){
            Router=new Router("Router_Hogar",56);
            Dispositivos.add(Router);
            Router.bienvenida();
        }else
        if(opcion_router==0)
            this.LogRouter();
        opcion_router=0;         
        do{
            for(int i=0;i<opciones_router.length;i++)
                System.out.println(opciones_router[i]);
            System.out.print("Elija opción: ");    
        try{            
            opcion_router=sc.nextInt();   
        }
        catch(Exception e){
            opcion_router=0;   
            System.out.println("Opcion no valida, ha escrito un valor no numérico\n\n");
            
        }
        sc= new Scanner(System.in);
        if(opcion_router<1||opcion_router>opciones_router.length-1){
            System.out.println("Opcion no valida, número incorrecto\n\n"); 
          
        }
        }while(opcion_router<1||opcion_router>opciones_router.length-1);
        System.out.println("\n\n");
        MenuRouter();
    
    }
    public void MenuInicio(){
       switch(opcion_inicio){
            case 1: ejecutarDispo();break;
            case 2: ejecutarRouter();break;
            case 3: salir();break;    
        }
    }
    
    public void MenuDispo(){
        switch(opcion_dispo){
            case 1: BuscarDispo();break;
            case 2: VerConsumo();break;
            case 3: ApagarDispo();break;
            case 4: EncenderDispo();break;
            case 5: ApagadoLocal();break;  
            case 6: AniadirDispo();break;  
            case 7: BorrarDispo();break;  
            case 8:break;  
        }
    }
    
    public void MenuRouter(){
        switch(opcion_router){
            case 1: ListarDispoR();break;
            case 2: CambiarContra();break;
            case 3: CambiarNombre();break;
            case 4: RegistrarDispoR();break;
            case 5: EliminarDispoR();break;  
            case 6: break;  
        }
    }
    
    
    public void BuscarDispo(){
        String aux="";
        int opcion=0;
        if(Dispositivos.size()==0)
            System.out.println("No hay dispositivos");
        else
        do{
            System.out.println("Indique el nombre del dispositivo");
            aux=sc.nextLine();
            sc=new Scanner(System.in);
            System.out.println("¿Es correcto?(1.Si 2.No)");
            opcion=SioNo();
            if(opcion==1)
            if(DarDispo(aux)==null){
                System.out.println("Nombre incorrecto,repita");
                opcion=0;
            }else{
                System.out.println(DarDispo(aux));    
            }
        }while(opcion==0);
        System.out.println("Pulsa enter para volver a inicio");
                sc.nextLine();
                sc=new Scanner(System.in);
    }
    
    public Dispositivo DarDispo(String n){
        for(Dispositivo cada: Dispositivos)
            if(cada.getNombre().equals(n))
                return cada;
        return null;
    }
    
    public int DarDispoPos(String n){
        for(int i=0;i<Dispositivos.size();i++)
            if(Dispositivos.get(i).getNombre().equals(n))
                return i;
        return -1;
    }
    
    public void LogRouter(){
        String aux="";
        boolean validador=false;
        do{
            System.out.println("Introduzca la contraseña:");
            aux=sc.nextLine();
            sc=new Scanner(System.in);
            if(aux.equals(Router.getContrasenia()))
                System.out.println("Contraseña incorrecta, vuelava a intentarlo");
            else
                validador=true;
        }while(!validador);
    }
    public void ApagarDispo(){
        String aux="";
        int opcion=0;
        do{
            System.out.println("Inidique el nombre del dispositivo");
            aux=sc.nextLine();
            sc=new Scanner(System.in);
            System.out.println("¿Es correcto?(1.Si 2.No)");
            opcion=SioNo();
            if(opcion==1)
            if(DarDispo(aux)==null){
                System.out.println("Nombre erroneo, repita");
                opcion=0;
            }else{
            Dispositivos.get(DarDispoPos(aux)).apagar();
            }
        }while(opcion==0);
    }
    
    public void AniadirDispo(){
    String aux="";
    String aux2="";
        int opcion=0;
        do{
            System.out.println("Inidique el nombre de su nuevo dispositivo");
            aux=sc.nextLine();
            sc=new Scanner(System.in);
            System.out.println("¿Es correcto?(1.Si 2.No)");
            opcion=SioNo();
            if(opcion==1)
            if(DarDispo(aux)!=null){
                System.out.println("Nombre repetido, repita");
                opcion=0;
            }
        }while(opcion==0);
        opcion=0;
        do{
            System.out.println("Inidique el tipo de su nuevo dispositivo \n1.Nevera 2.Lavadora 3.Secadora 4.Persiana \n5.Calefactor 6. Bombilla 7.Dispositivo con wifi");
            aux2=sc.nextLine();
            sc=new Scanner(System.in);
            System.out.println("¿Es correcto?(1.Si 2.No)");
            opcion=SioNo();
            if(opcion==1){
            if(aux2.equalsIgnoreCase("1")){
                DispoCocina auxi=new DispoCocina(aux,"Nevera",120);
                Dispositivos.add(auxi);
            }
            if(aux2.equalsIgnoreCase("2")){
                DispoCocina auxi=new DispoCocina(aux,"Lavadora",140);
                Dispositivos.add(auxi);
            }
            if(aux2.equalsIgnoreCase("3")){
                DispoCocina auxi=new DispoCocina(aux,"Secadora",110);
                Dispositivos.add(auxi);
            }
            if(aux2.equalsIgnoreCase("4")){
                DispoHogar auxi=new DispoHogar(aux,"Persiana",60);
                Dispositivos.add(auxi);
            }
            if(aux2.equalsIgnoreCase("5")){
                DispoHogar auxi=new DispoHogar(aux,"Calefactor",260);
                Dispositivos.add(auxi);
            }
            if(aux2.equalsIgnoreCase("6")){
                DispoHogar auxi=new DispoHogar(aux,"Bombilla",180);
                Dispositivos.add(auxi);
            }
            if(aux2.equalsIgnoreCase("7")){
                DispositivoConInternet auxi=new DispositivoConInternet(aux,300);
                Dispositivos.add(auxi);
            }}
        }while(opcion==0);
        System.out.println("Dispositivo registrado, pulse enter para volver");
        sc.nextLine();
        sc=new Scanner(System.in);
    }
    
    public void EncenderDispo(){
     String aux="";
        int opcion=0;
        do{
            System.out.println("Inidique el nombre del dispositivo");
            aux=sc.nextLine();
            sc=new Scanner(System.in);
            System.out.println("¿Es correcto?(1.Si 2.No)");
            opcion=SioNo();
            if(opcion==1)
            if(DarDispo(aux)==null){
                System.out.println("Nombre erroneo, repita");
                opcion=0;
            }else{
            Dispositivos.get(DarDispoPos(aux)).encender();
            }
        }while(opcion==0);
    
    }
    
    public void ApagadoLocal(){
        for(Dispositivo cada:Dispositivos)
            if(cada.isEncendido())
            cada.apagar();
    }
    
    public void EncendidoLocal(){
        for(Dispositivo cada:Dispositivos)
            if(!cada.isEncendido())
            cada.encender();
    }
    
    public void BorrarDispo(){
    String aux="";
        int opcion=0;
        do{
            System.out.println("Inidique el nombre del dispositivo");
            aux=sc.nextLine();
            sc=new Scanner(System.in);
            System.out.println("¿Es correcto?(1.Si 2.No)");
            opcion=SioNo();
            if(opcion==1)
            if(DarDispo(aux)==null){
                System.out.println("Nombre erroneo, repita");
                opcion=0;
            }else{
            Dispositivos.remove(DarDispoPos(aux));
            }
        }while(opcion==0);
    }
    
    public void ListarDispoR(){
    if(Dispositivos.size()==0)
            System.out.println("Aun no tiene dispositivos registrados");
            Router.ListarDipo();
    }
    
    public void CambiarContra(){
        Router.ModificarContra();
    }
    
    public void CambiarNombre(){
        Router.ModificarNombre();
    }
    
    public void RegistrarDispoR(){
        String aux="";
        int opcion=0;
        DispositivoConInternet auxi=null;
        do{
            System.out.println("Indique el nombre del dispositivo");
            aux=sc.nextLine();
            sc=new Scanner(System.in);
            System.out.println("¿Es correcto?(1.Si 2.No)");
            opcion=SioNo();
            if(opcion==1)
                if(DarDispo(aux)==null){
                    System.out.println("Incorrecto, repita");
                    opcion=0;
                }else{
                    Object o=DarDispo(aux);
                    if(o instanceof DispositivoConInternet){
                        
                        auxi=(DispositivoConInternet) o;
                        Router.AniadirDispositivo(auxi);
                    }else{
                        System.out.println("Dispositivo no compatible");
                    }
                }
        }while(opcion==0);
        System.out.println("Tarea finalizada, pulse enter para vovler a inicio");
        sc.nextLine();
        sc=new Scanner(System.in);
    }
    
    public void EliminarDispoR(){
        String aux="";
        int opcion=0;
        DispositivoConInternet auxi=null;
        do{
            System.out.println("Indique el nombre del dispositivo");
            aux=sc.nextLine();
            sc=new Scanner(System.in);
            System.out.println("¿Es correcto?(1.Si 2.No)");
            opcion=SioNo();
            if(opcion==1)
                if(DarDispo(aux)==null){
                    System.out.println("Incorrecto, repita");
                    opcion=0;
                }else{
                    if(DarDispo(aux) instanceof DispositivoConInternet){
                        Router.DesconectarDispo(aux);
                    }else{
                        System.out.println("Dispositivo no compatible");
                    }
                }
        }while(opcion==0);
        System.out.println("Tarea finalizada, pulse enter para vovler a inicio");
        sc.nextLine();
        sc=new Scanner(System.in);
    }

    private void salir() {
        int opcion=0;
        ApagadoLocal();
        System.out.println("Usted ha cerrado sesion en este gestor\nVuleva pronto");
        System.out.println("\n\n¿Quiere volver a iniciar sesion?(1.Si 2.No)");
         do{
        try{
            opcion=sc.nextInt();
            sc=new Scanner(System.in);
        }
        catch(Exception e){
            opcion=0;
            sc=new Scanner(System.in);
            System.out.println("Valor Erróneo");
        }
        if(opcion<=0 || opcion>2)
                System.out.println("Opcion no valida");
        }while(opcion<=0 || opcion>2);
         Calendario.AvanzarDia();
         if(opcion==1)
             Bienvenida();
         else
             System.out.println("Sistema apagado");
    }

    private void VerConsumo() {
        if(Dispositivos.size()==0)
            System.out.println("No hay dispositivos");
        for(Dispositivo cada: Dispositivos)
            System.out.println("Nombre: "+cada.getNombre()+" Consumo: "+cada.getConsumo()+"kwh ");
        System.out.println("Pulse enter para volver a inicio");
        sc.nextLine();
        sc=new Scanner(System.in);
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
    
       public void ReiniciarConsumo(){
        for(Dispositivo cada:Dispositivos)
            cada.CalcularConsumo();
            
    }
}
