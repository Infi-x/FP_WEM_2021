/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordelaboratorio;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author lunis
 */
public class AnalisisHeces extends Analisis{
    private Concistencia concistencia;
    private Color color;

    public AnalisisHeces(String s,Fecha f, Paciente p, Concistencia c,Color co) {
        super(s, f, p);
        super.setTipo("Heces");
        concistencia=c;
        color=co;
    }
    
    private int ObtenerCon(){
    Paciente aux=super.getPaciente();
    int si=0;
    if(aux.BuscarPato("Celeaquia"))
        si+=20;
    if(concistencia==Concistencia.Liquida)
        si+=25;
    if(concistencia==Concistencia.Blanda)
        si+=20;
    if(concistencia==Concistencia.Media)
        si+=15;
    if(concistencia==Concistencia.Dura)
        si+=10;
    
    return si;
    }
    
    private int ObtenerCol(){
    Paciente aux=super.getPaciente();
    int si=0;
    if(aux.BuscarPato("Pancreas"))
        si+=40;
    if(color==Color.Amarilla)
        si+=35;
    if(color==Color.Blanco)
        si+=30;
    if(color==Color.Negro)
        si+=25;
    if(color==Color.Rojo)
        si+=20;
    if(color==Color.Verde)
        si+=15;
    return si;
    }
    
    private boolean parasitos(){
    Paciente aux=super.getPaciente();
    int si=20;
    if(aux.BuscarPato("Parasitos"))
        si+=40;
     Random azar=new Random();
     int auxi=azar.nextInt(101);
     super.SetValorHeces(si);
     if(auxi>0 && auxi<si){
         return true;
     }
     else
         return false;
    }
    
    @Override
    public String Resultado() {
      String aux="";
      ArrayList<String> aux1=new ArrayList();
      int cont=0;
      int poruno=ObtenerCon();
      int pordos=ObtenerCol();
      Random azar=new Random();
      int num=0;
      if(parasitos()){
        if(super.getCultivo().RevisarParasitos()){
        aux1.add("Parasitos");
        cont++;
        }
      }
      num=azar.nextInt(101);
      if(num>0 && num<poruno){
        aux1.add("Celeaquia");
        cont++;
      }
      num=azar.nextInt(101);
      if(num>0 && num<pordos){
          aux1.add("deficiencias en el Pancreas");
      cont++;
      }
      if(cont==0)
           aux+="El paciente esta con todas las constantes correctas";
       else{
       aux+="El paciente padece ";
       for(int i=0;i<aux1.size()-1;i++){
           aux+=aux1.get(i)+", ";
       }
       aux+=aux1.get(aux1.size()-1);    
       }
      super.setFinalizada(new Fecha());
      super.SetResultado(aux);
      super.setRevisado(true);
      return aux;
    }

    @Override
    public String toString() {
         return super.toString()+"\nColor de la muestra"+color+"\nConcistencia de la muestra: "+concistencia;
    }
  
    
}
