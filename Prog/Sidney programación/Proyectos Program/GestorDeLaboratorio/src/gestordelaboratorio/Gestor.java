/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordelaboratorio;

import java.util.*;

/**
 *
 * @author dedei
 */
public class Gestor {
    private String Nombre;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Analisis> analisis;
    private Scanner sc;
    private Fecha fecha;
    private int opcion_inicio;
    private int opcion_paciente;
    private int opcion_analisis;
    private boolean validador;
    private ArrayList<Pato> pato;
    private static final String[] opciones_principal={
        "----------Menu Principal---------------",
        "- Paciente..........................1 -",
        "- Analisis..........................2 -",
        "- Salir.............................3 -"};
    private static final String[] opciones_analisis={
        "----------Menu de Analisis-------------",
        "- Registrar Analisis................1 -",
        "- Busqueda de analisis..............2 -",
        "- Visualizar todos los analisis.....3 -",
        "- Realizar un analisis..............4 -",
        "- Volver al inicio..................5 -",
        };
    private static final String[] opciones_paciente={
        "-----------Menu de Pacientes-----------",
        "- Registrar paciente................1 -",
        "- Busqueda de paciente..............2 -",
        "- Visualizar todos los pacientes....3 -",
        "- Dar de baja a un paciente.........4 -",
        "- Volver al inicio........... ......5 -",
        };
    
    
    public Gestor(String s){
    Nombre=s;
    sc=new Scanner(System.in);
    pacientes=new ArrayList();
    analisis=new ArrayList();
    pato=new ArrayList();
    pato.add(Pato.Anemia);
    fecha=new Fecha();
    pato.add(Pato.Cancer_leu);
    pato.add(Pato.Cancer_pro);
    pato.add(Pato.Celeaquia);
    pato.add(Pato.Pancreas);
    pato.add(Pato.Infeccion);
    pato.add(Pato.Renal_Leve);
    pato.add(Pato.Parasitos);
    pato.add(Pato.Renal_Grave);
    pato.add(Pato.Cardiaco);
    pato.add(Pato.Diabetes);
          
          
    }
    
    public void Bienvenida(){
        System.out.println("Bienvenido al Laboratorio "+Nombre+"\nHoy es "+fecha+"\nQue desea hacer:");
        ejecutarGestor();
    }
    
    public void ejecutarGestor(){
        do{
            ejecutarInicio();
            if(opcion_inicio==1 && opcion_paciente!=5){
            do{
                ejecutarPaciente();
             }while(opcion_paciente!=5);
            } 
            if(opcion_inicio==2 && opcion_analisis!=5){
            do{
                ejecutarAnalisis();
             }while(opcion_analisis!=5);
            } 
        }while(opcion_inicio!=3);
    }
    
    public void ejecutarInicio(){
        validador=false;
        opcion_inicio=0;         
        do{
            for(int i=0;i<opciones_principal.length;i++)
                System.out.println(opciones_principal[i]);
            System.out.print("Elija opción: ");    
        try{            
            opcion_inicio=sc.nextInt();   
        }
        catch(Exception e){
            opcion_inicio=0;   
            System.out.println("Opcion no valida, ha escrito un valor no numérico\n\n");
            validador=true;
        }
        sc= new Scanner(System.in);
        if((opcion_inicio<1||opcion_inicio>opciones_principal.length-1)&& validador==false){
            System.out.println("Opcion no valida, número incorrecto\n\n"); 
           validador=false;
        }
        }while(opcion_inicio<1||opcion_inicio>opciones_principal.length-1);
        System.out.println("\n\n");
        MenuInicio();
    }
    
    public void ejecutarAnalisis(){
        validador=false;
        opcion_analisis=0;      
        do{
            for(int i=0;i<opciones_analisis.length;i++)
                System.out.println(opciones_analisis[i]);
            System.out.print("Elija opción: ");    
        try{            
            opcion_analisis=sc.nextInt();   
        }
        catch(Exception e){
            opcion_analisis=0;   
            System.out.println("Opcion no valida, ha escrito un valor no numérico\n\n");
            validador=true;
        }
        sc= new Scanner(System.in);
        if((opcion_analisis<1||opcion_analisis>opciones_analisis.length-1)&& validador==false){
            System.out.println("Opcion no valida, número incorrecto\n\n"); 
           validador=false;
        }
        }while(opcion_analisis<1||opcion_analisis>opciones_analisis.length-1);
        System.out.println("\n\n");
        MenuAnalisis();
    }
    
    public void ejecutarPaciente(){
        validador=false;
        opcion_paciente=0;          
        do{
            for(int i=0;i<opciones_paciente.length;i++)
                System.out.println(opciones_paciente[i]);
            System.out.print("Elija opción: ");    
        try{            
            opcion_paciente=sc.nextInt();   
        }
        catch(Exception e){
            opcion_paciente=0;   
            System.out.println("Opcion no valida, ha escrito un valor no numérico\n\n");
            validador=true;
        }
        sc= new Scanner(System.in);
        if((opcion_paciente<1||opcion_paciente>opciones_paciente.length-1)&& validador==false){
            System.out.println("Opcion no valida, número incorrecto\n\n"); 
           validador=false;
        }
        }while(opcion_paciente<1||opcion_paciente>opciones_paciente.length-1);
        System.out.println("\n\n");
        MenuPaciente();
    }
    
    public void MenuInicio(){
        switch(opcion_inicio){
            case 1: ejecutarPaciente();break;
            case 2: ejecutarAnalisis();break;
            case 3: salir();break;
        }
    }
    
    public void MenuAnalisis(){
        switch(opcion_analisis){
            case 1: RegistrarAnalisis();break;
            case 2: BuscarPorAnalisis();break;
            case 3: VisualizarAnalisis();break;
            case 4: RealizarAnalisis();break;
            case 5: break;
        }
    }
    
    public void MenuPaciente(){
        switch(opcion_paciente){
            case 1: RegistrarPaciente();break;
            case 2: BuscarPorPaciente();break;
            case 3: VisualizarPacientes();break;
            case 4: DarDeBaja();break;
            case 5: break;
        }
    }
    
    public void VisualizarAnalisis(){
        System.out.println("Mostrando listado de analisis:");
        for(Analisis cada:analisis)
            System.out.println("Id: "+cada.getId()+"\nFecha: "+cada.getFecha()+"\nDisponibilidad: "+cada.isRevisado()+"\n");
        System.out.println("\n\nListado de:"+analisis.size()+" analisis, pulse enter para volver al menu");
        sc.nextLine();
        sc=new Scanner(System.in);
    }
    
    public void VisualizarPacientes(){
        System.out.println("Mostrando listado de pacientes:");
        for(Paciente cada:pacientes)
            System.out.println("Nombre: "+cada.getNombre()+"\nid: "+cada.getId());
        System.out.println("\n\nListado de:"+pacientes.size()+" pacientes, pulse enter para volver al menu");
        sc.nextLine();
        sc=new Scanner(System.in);
    }
    
    public void RegistrarPaciente(){
        String Nombre="";
        String id="";
        int edad=0;
        Fecha nac;
        int dia=0;
        int mes=0;
        int anio=0;
        double peso=0;
        int opcion=0;
        ArrayList<Pato>p=new ArrayList();
        Nombre=this.RegistrarNombre();
        id=this.RegistrarId();
        edad=this.RegistrarEdad();
        nac=this.RegistrarFecha();
        peso=this.RegistrarPeso();
        p=this.RegistrarPato();
        pacientes.add(new Paciente(Nombre,id,edad,nac,peso,p));
        System.out.println("Registro completado\nPulse enter para volver a inicio ..>");
        sc.nextLine();
        
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    public boolean revisarRepetidoPato(ArrayList<Pato> p,String s){
        for(int i=0;i<p.size();i++)
            if(p.get(i).name().equalsIgnoreCase(s))
                return true;
    return false;
    }
    
    public Pato cualEs(int s){
        switch(s){
            case 1: return Pato.Cardiaco;
            case 2: return Pato.Anemia;
            case 3: return Pato.Diabetes;
            case 4: return Pato.Cancer_pro;
            case 5: return Pato.Cancer_leu;
            case 6: return Pato.Celeaquia;
            case 7: return Pato.Pancreas;
            case 8: return Pato.Infeccion;
            case 9: return Pato.Renal_Grave;
            case 10: return Pato.Renal_Leve;
            case 11:  return Pato.Parasitos;
        }
        return Pato.No_Exsite;
    }
    
    private boolean revisarRepetidoPaciente(String id){
        for(int i=0;i<pacientes.size();i++)
            if(pacientes.get(i).getId().equalsIgnoreCase(id))
                return true;
    return false;
    }
    
    public void RegistrarAnalisis(){
        String id="";
        String id_paciente="";
        Color co=null;
        Concistencia ca=null;
        int opcion=0;
        int opcion_dos=0;
        Fecha f=new Fecha();
        do{
        System.out.print("¿Qué analisis desea registrar? 1. Sangre 2.Heces 3.Orina\n..>");
            try{
            opcion=sc.nextInt();
            sc=new Scanner(System.in);
            }catch(Exception e){
                opcion=0;
                sc=new Scanner(System.in);
                System.out.println("Valor erroneo");
        }
            if(opcion<1 || opcion>3)
                System.out.println("Opción no disponible, vuelva a intentarlo");
        }while(opcion<=0 ||opcion>3);
           if(opcion==2 || opcion==3){
                System.out.println("En este analisis se revisan resultados mediante cultivos");
            }
        do{
            System.out.print("\nIndique el id del paciente\n..>");
                id_paciente=sc.nextLine();
                sc=new Scanner(System.in);
                if(!this.revisarRepetidoPaciente(id_paciente))
                    System.out.println("Paciente no encontrado, vuelva a ingresar el id");
            }while(!this.revisarRepetidoPaciente(id_paciente));
            do{
                System.out.println("¿La fecha del analisis es la de hoy o es una mas antigua?(1.Antigua 2.Actual)");
                try{
            opcion_dos=sc.nextInt();
            sc=new Scanner(System.in);
            }catch(Exception e){
                opcion_dos=0;
                sc=new Scanner(System.in);
                System.out.println("Valor erroneo");
        }
            if(opcion_dos<1 || opcion_dos>2)
                System.out.println("Opción no disponible, vuelva a intentarlo");
          }while(opcion_dos==0);
            if(opcion_dos==1){
                System.out.println("Ha seleccionado una fecha antigua");
                f=this.RegistrarFecha();
            }   
            if(opcion_dos==2){
                System.out.println("Ha seleccionado la fecha de hoy");
                f=new Fecha();
            }
            if(opcion==1){
            id="S"+id_paciente+ContarAnalisis(id_paciente, "Sangre");
            AnalisisSangre s=new AnalisisSangre(id,f,DevolverPaciente(id_paciente));
            analisis.add(s);
            }
            if(opcion==2){
                do{
                System.out.println("Indique la concistencia de la muestra (1.Liquida 2.Blanda 3.Media 4.Dura)");
                try{
                    opcion_dos=sc.nextInt();
                    sc=new Scanner(System.in);
                
                }catch(Exception e){
                opcion_dos=0;
                sc=new Scanner(System.in);
                System.out.println("Valor erroneo");
                }
                    if(opcion_dos<0 || opcion_dos>4)
                        System.out.println("Opcion no disponible");
                }while(opcion_dos==0);
                switch(opcion_dos){
                    case 1: ca=Concistencia.Liquida;break;
                    case 2: ca=Concistencia.Blanda;break;
                    case 3: ca=Concistencia.Media;break;
                    case 4: ca=Concistencia.Dura;break;
                }
                do{
                System.out.println("Indique el color de la muestra (1.Negro 2.Rojo 3.Verde 4.Blanco 5.Amarillo)");
                try{
                    opcion_dos=sc.nextInt();
                    sc=new Scanner(System.in);
                
                }catch(Exception e){
                opcion_dos=0;
                sc=new Scanner(System.in);
                System.out.println("Valor erroneo");
                }
                    if(opcion_dos<0 || opcion_dos>5)
                        System.out.println("Opcion no disponible");
                }while(opcion_dos<=0 || opcion_dos>5);
                switch(opcion_dos){
                    case 1: co=Color.Negro;break;
                    case 2: co=Color.Rojo;break;
                    case 3: co=Color.Verde;break;
                    case 4: co=Color.Blanco;break;
                    case 5: co=Color.Amarilla;break;
                }
                id="H"+id_paciente+ContarAnalisis(id_paciente, "Heces");
                AnalisisHeces h=new AnalisisHeces(id,f,DevolverPaciente(id_paciente),ca,co);
                analisis.add(h);
            }
            
            if(opcion==3){
            do{
                System.out.println("Indique el color de la muestra (1.Rojo 2.Blanco 3.Amarilla)");
                try{
                    opcion_dos=sc.nextInt();
                    sc=new Scanner(System.in);
                
                }catch(Exception e){
                opcion_dos=0;
                sc=new Scanner(System.in);
                System.out.println("Valor erroneo");
                }
                    if(opcion_dos<0 || opcion_dos>3)
                        System.out.println("Opcion no disponible");
                }while(opcion_dos<=0 || opcion_dos>3);
                switch(opcion_dos){
                    case 1: co=Color.Rojo;break;
                    case 2: co=Color.Blanco;break;
                    case 3: co=Color.Amarilla;break;
                    }
                id="O"+id_paciente+ContarAnalisis(id_paciente, "Orina");
                AnalisisOrina o=new AnalisisOrina(id,f,DevolverPaciente(id_paciente),co);
                analisis.add(o);
            }
            System.out.print("\nAnalisis registrado, pulse enter para volver a inicio\n..>");
            sc.nextLine();
            sc=new Scanner(System.in);
            
    }
    
    public int ContarAnalisis(String id, String s){
    int cont=0;
        for(int i=0;i<analisis.size();i++)
            if(analisis.get(i).getPaciente().getId().equalsIgnoreCase(id) && analisis.get(i).getTipo().equalsIgnoreCase(s))
                cont++;
        return cont;
    }
    
    private Paciente DevolverPaciente(String id){
        for(Paciente cada:pacientes)
            if(id.equalsIgnoreCase(cada.getId()))
                return cada;
        return null;
    }
    
    public ArrayList<String> BuscarIdDisponible(){
    ArrayList<String> aux=new ArrayList();
        for(Analisis Cada:analisis)
            if(!Cada.isRevisado())
                aux.add(Cada.getId());
        if(aux.isEmpty())
        return null;
        return aux;
    }
    
    private boolean estaDentro(String id){
        for(Analisis cada: analisis)
            if(id.equalsIgnoreCase(cada.getId()))
                return true;
        return false;
    }
    
    public Analisis DarAnalisis(String id){
        for(Analisis cada:analisis)
            if(id.equalsIgnoreCase(cada.getId()))
                return cada;
        return null;
    }
    
    public void BorrarAnalisis(String id){
        
        for(int i=0;i<analisis.size();i++)
            if(id.equalsIgnoreCase(analisis.get(i).getPaciente().getId())){
                analisis.remove(analisis.get(i));
                i--;
            }
    }
    
    public void RealizarAnalisis(){
       String id="";
       ArrayList<String> aux=new ArrayList();
       Analisis a=null;
       String resul="";
       aux=BuscarIdDisponible();
       if(aux==null)
            System.out.println("No hay analisis disponibles, pulsa enter para volver");
       else{
        System.out.println("Analisis disponibles para realizar");
       
        for(String cada: aux)
            System.out.println("id: "+cada);
       do{
           System.out.println("Selecione un id de los disponibles para relizar el analisis");
           id=sc.nextLine();
           sc=new Scanner(System.in);
           if(!estaDentro(id))
               System.out.println("Id no encontrado, vuelva a introducir");
       }while(!estaDentro(id));
       a=this.DarAnalisis(id);
       resul=a.Resultado();
        System.out.print("\nResultado listo, pulse enter para verlo\n..>");
        sc.nextLine();
        sc=new Scanner(System.in);
        System.out.println(resul+"\n\n");
        String[] auxi=resul.split(" ");
        ArrayList<Pato> auxii=new ArrayList();
        for(int i=0;i<auxi.length;i++){
            for(int j=0;j<pato.size();j++)
                if(pato.get(j).name().equalsIgnoreCase(auxi[i]))
                    if(!this.revisarRepetidoPato(a.getPaciente().getPatologias(),auxi[i])){
                        auxii.clear();
                        auxii=a.getPaciente().getPatologias();
                        auxii.add(pato.get(j));
                        a.getPaciente().setPatologias(auxii);
                    }
            if(auxi[i].equalsIgnoreCase("Cancer")){
                if(auxi[i+2].equalsIgnoreCase("Prostata"))
                    if(!this.revisarRepetidoPato(a.getPaciente().getPatologias(),"Cancer_pro")){
                        auxii.clear();
                        auxii=a.getPaciente().getPatologias();
                        auxii.add(Pato.Cancer_pro);
                        a.getPaciente().setPatologias(auxii); 
                } 
                if(auxi[i+2].equalsIgnoreCase("Leucemia"))
                    if(!this.revisarRepetidoPato(a.getPaciente().getPatologias(),"Cancer_leu")){
                        auxii.clear();
                        auxii=a.getPaciente().getPatologias();
                        auxii.add(Pato.Cancer_leu);
                        a.getPaciente().setPatologias(auxii); 
                }
                    }
            if(auxi[i].equalsIgnoreCase("Renal")){
                if(auxi[i++].equalsIgnoreCase("Leve"))
                    if(!this.revisarRepetidoPato(a.getPaciente().getPatologias(),"Renal_Leve")){
                        auxii.clear();
                        auxii=a.getPaciente().getPatologias();
                        auxii.add(Pato.Renal_Leve);
                        a.getPaciente().setPatologias(auxii); 
                } 
                if(auxi[i++].equalsIgnoreCase("Grave"))
                    if(!this.revisarRepetidoPato(a.getPaciente().getPatologias(),"Renal_Grave")){
                        auxii.clear();
                        auxii=a.getPaciente().getPatologias();
                        auxii.add(Pato.Renal_Grave);
                        a.getPaciente().setPatologias(auxii); 
                }
                    }
            if(auxi[i].equalsIgnoreCase("Coresterol")){
                    if(!this.revisarRepetidoPato(a.getPaciente().getPatologias(),"Cardiaco")){
                        auxii.clear();
                        auxii=a.getPaciente().getPatologias();
                        auxii.add(Pato.Cardiaco);
                        a.getPaciente().setPatologias(auxii); 
                }
        }
           
    }
           System.out.println("Pulsa enter para volver");
       } 
       sc.nextLine();
       sc=new Scanner(System.in);
    }
 
    public void BuscarPorPaciente(){
        String id="";
        do{
        System.out.println("Indique el Id del Paciente");
        id=sc.nextLine();
        sc=new Scanner(System.in);
            if(!this.revisarRepetidoPaciente(id))
                System.out.println("Vuelva a introducir el id, paciente no encontrado");
        }while(!this.revisarRepetidoPaciente(id));
        Paciente p=this.DevolverPaciente(id);
        int num=this.ContarAnalisis(id, "Sangre")+this.ContarAnalisis(id, "Heces")+this.ContarAnalisis(id, "Orina");
        System.out.println(p+"\nNumeros de analisis realizados: "+num);
        System.out.println("Pulse enter para volver");
        sc.nextLine();
        sc=new Scanner(System.in);
        
    }
    
    public void BuscarPorAnalisis(){
        String id="";
        do{
        System.out.println("Indique el Id del Analisis");
        id=sc.nextLine();
        sc=new Scanner(System.in);
            if(!this.estaDentro(id))
                System.out.println("Vuelva a introducir el id, analisis no encontrado");
        }while(!this.estaDentro(id));
        Analisis p=this.DarAnalisis(id);
        String resul="";
        if(p.isRevisado()){
         resul=p.GetResultado();
         System.out.println(p+"\nResumen: "+resul);
        }else
            System.out.println(p);
        System.out.println("Pulse enter para volver");
        sc.nextLine();
        sc=new Scanner(System.in);
    }
    
    
    public void DarDeBaja(){
        int opcion=0;
        String id="";
        System.out.println("Recuerde que desde que se elimine el paciente todos su analisis serán borrados,"
                + "\n¿Esta de acuerdo?(1.Si 2.No)");
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
        if(opcion==1){
            do{
                System.out.println("Indique el id del paciente");
                id=sc.nextLine();
                sc=new Scanner(System.in);
        if(!this.revisarRepetidoPaciente(id))
                System.out.println("Paciente no encontrado");
        }while(!this.revisarRepetidoPaciente(id));
            Paciente p=this.DevolverPaciente(id);
            this.BorrarAnalisis(id);
            pacientes.remove(p);
            System.out.println("El paciente "+p.getNombre()+" ha sido dado de baja,\ny con el se han borrado sus analisis");
        }
        
    }
    
    public void salir(){
        int opcion=0;
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
         fecha.avanzarDia(fecha);
         if(opcion==1)
             Bienvenida();
         else
             System.out.println("Sistema apagado");
        
    }

    public String RegistrarNombre(){
    String Nombre="";
    int opcion=0;
    do{
            System.out.print("Introduzca el nombre del nuevo paciente\n..>");
            Nombre=sc.nextLine();
            sc=new Scanner(System.in);
            System.out.println("¿Es "+Nombre+" correcto?(1.Si 2.No)");
        try{            
            opcion=sc.nextInt();
            sc=new Scanner(System.in);
        }
        catch(Exception e){
            opcion=0;
            sc=new Scanner(System.in);
            System.out.println("Valor incorrecto");
        }
        if(opcion>0 && opcion>2)
                System.out.println("Opcion no contemplada, por favor repita");
        }while(opcion!=1 || opcion==0);
    return Nombre;
    }
    
    public String RegistrarId(){
    String id="";
    int opcion=0;
    do{
            System.out.print("\nIntroduzca el id\n...>");
            id=sc.nextLine();
            sc=new Scanner(System.in);
            System.out.println("¿Es "+id+" correcto?(1.Si 2.No)");
        try{            
            opcion=sc.nextInt();
            sc=new Scanner(System.in);
        }
        catch(Exception e){
            opcion=0;
            sc=new Scanner(System.in);
            System.out.println("Valor incorrecto");
        }
        {
           if(revisarRepetidoPaciente(id)) {
                System.out.println("Lo sentimos, el id ya está en la base de datos, vuelva a intentarlo");
                opcion=0;
           }
           if(opcion>0 && opcion>2)
                System.out.println("Opcion no contemplada, por favor repita");
        }
        }while((opcion!=1 || opcion==0));
    return id;
    }
    
    public int RegistrarEdad(){
    int edad=0;
    int opcion=0;
    do{
            do{
            System.out.print("\nIntroduzca la edad\n..>");
            
                try{
                    edad=sc.nextInt();
                    sc=new Scanner(System.in);
                }catch(Exception e){
                    edad=0;
                    sc=new Scanner(System.in);
                    System.out.println("Valor incorrecto");
            }
                if(edad!=0)
                System.out.println("¿Es "+edad+" correcto?(1.Si 2.No)");
            }while(edad==0);
        try{            
            opcion=sc.nextInt();
            sc=new Scanner(System.in);
        }
        catch(Exception e){
            opcion=0;
            sc=new Scanner(System.in);
            System.out.println("Valor incorrecto");
        }
        if(opcion>0 && opcion>2)
                System.out.println("Opcion no contemplada, por favor repita");
        }while(opcion!=1 || opcion==0);
    return edad;
    }
    
    public Fecha RegistrarFecha(){
    Fecha auc;
    int dia=0;
    int mes=0;
    int anio=0;
    int opcion=0;
    do{
        System.out.print("\nIntroduzca la fecha ");
        
        do{
        System.out.print("\nIntroduzca el dia\n..>");
        try{            
            dia=sc.nextInt();
            sc=new Scanner(System.in);
        }
        catch(Exception e){
            dia=0;
            sc=new Scanner(System.in);
            System.out.println("Valor incorrecto");
        } 
        }while(dia==0);
        do{
        System.out.print("\nIntroduzca el mes\n..>");
        try{            
            mes=sc.nextInt();
            sc=new Scanner(System.in);
        }
        catch(Exception e){
            mes=0;
            sc=new Scanner(System.in);
            System.out.println("Valor incorrecto");
        } 
        }while(mes==0);
        do{
        System.out.print("\nIntroduzca el año\n..>");
        try{            
            anio=sc.nextInt();
            sc=new Scanner(System.in);
        }
        catch(Exception e){
            anio=0;
            sc=new Scanner(System.in);
            System.out.println("Valor incorrecto");
        } 
        }while(anio==0);
        do{
        System.out.println("¿Es "+dia+"/"+mes+"/"+anio+" correcto?(1.Si 2.No)");
        try{            
            opcion=sc.nextInt();
            sc=new Scanner(System.in);
        }
        catch(Exception e){
            opcion=0;
            sc=new Scanner(System.in);
            System.out.println("Valor incorrecto");
        }
            if(opcion>0 && opcion>2)
                System.out.println("Opcion no contemplada, por favor repita");
        }while(opcion==0);
        }while(opcion!=1 || opcion==0);
    auc=new Fecha(dia,mes,anio);
    return auc;
    }
    
    public double RegistrarPeso(){
    double peso=0;
    int opcion=0;
    do{
            do{
            System.out.print("\nIntroduzca el peso\n..>");
            
                try{
                    peso=sc.nextDouble();
                    sc=new Scanner(System.in);
                }catch(Exception e){
                    peso=0;
                    sc=new Scanner(System.in);
                    System.out.println("Valor incorrecto");
            }
                if(peso!=0)
                System.out.println("¿Es "+peso+" correcto?(1.Si 2.No)");
            }while(peso==0);
        try{            
            opcion=sc.nextInt();
            sc=new Scanner(System.in);
        }
        catch(Exception e){
            opcion=0;
            sc=new Scanner(System.in);
            System.out.println("Valor incorrecto");
        }
        if(opcion>0 && opcion>2)
                System.out.println("Opcion no contemplada, por favor repita");
        }while(opcion!=1 || opcion==0);
    return peso;
    }
    
    public ArrayList<Pato> RegistrarPato(){
    ArrayList<Pato>p=new ArrayList();
    int opcion=0;
    ArrayList<Integer> num=new ArrayList();
    String auxi="";
    do{
    System.out.print("\n¿Tiene el paciente alguna patología? 1.Si 2.No\n..>");
    try{            
            opcion=sc.nextInt();
            sc=new Scanner(System.in);
        }
        catch(Exception e){
            opcion=0;
            sc=new Scanner(System.in);
            System.out.println("Valor incorrecto");
        }
        if(opcion>0 && opcion>2)
                System.out.println("Opcion no contemplada, por favor repita");
    }while(opcion!=1 || opcion==0);
    do{
    do{
        System.out.print("\nDe las siguentes patologías,\nindique cual son las correspondientes al paciente(Ej:1,2,3,4,5)\n"
                + "01.Enfermedad cardiaca...........02.Anemia.................03.Diabetes\n"
                + "04.Cancer de próstata............05.Cancer de leucemia.....06.Celeaquia\n"
                + "07.Pancreatitis..................08.Infeccion urinaria.....09.Insuficiencia renal leve\n"
                + "10.Insuficiencia renal grave.....11.Parasitosis\n..>");
        auxi=sc.nextLine();
        sc=new Scanner(System.in);
        System.out.println("¿Es "+auxi+" correcto?(1.Si 2.No)\n..>");
        do{
        try{            
            opcion=sc.nextInt();
            sc=new Scanner(System.in);
        }
        catch(Exception e){
            opcion=0;
            sc=new Scanner(System.in);
            System.out.println("Valor incorrecto");
        }
        if(opcion>0 && opcion>2)
                System.out.println("Opcion no contemplada, por favor repita");
        }while(opcion==0);
    }while(opcion!=1 || opcion==0);
    try{
        String[] aux=auxi.split(",");
        for(int i=0;i<aux.length;i++)
            num.add(Integer.parseInt(aux[i]));
    }catch(Exception e){
        num.clear();
        System.out.println("Ha introducido un valor incorrecto, por favor repita");
    }
        for(int i=0;i<num.size();i++){
            if(cualEs(num.get(i))==Pato.No_Exsite){
                num.clear();
                p.clear();
                System.out.println("Ha surgido un error, por favor repita");
                break;
            }else if (revisarRepetidoPato(p,cualEs(num.get(i)).name())) {
            num.clear();
            p.clear();
            System.out.println("Ha surgido un error, por favor repita");
            break;
        }else {
                Pato a=this.cualEs(num.get(i));
                p.add(a);
        }
        }
            
    }while(num.size()==0);
    
    
       
    return p;
    }
}
/*      "- Listar dispositivos...............1 -",
        "- Cambiar contraseña................2 -",
        "- Cambiar Nombre....................3 -",
        "- Regristrar nuevo dispositivo......4 -",
        "- Eliminar Dispositivos.............2 -",
        "- Volver al inicio........... ......5 -",*/