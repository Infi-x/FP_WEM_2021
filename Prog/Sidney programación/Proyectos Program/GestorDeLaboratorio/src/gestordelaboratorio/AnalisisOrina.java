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
public class AnalisisOrina extends Analisis{
    private double orina;
    private Color color;
    public AnalisisOrina(String s, Fecha f, Paciente p, Color co) {
        super(s,f, p);
        color=co;
        super.setTipo("Orina");
        this.orina=10;
    }
    
    public int ObtenerConcentracion(){
      Paciente auxi=super.getPaciente();
      Random azar=new Random();
      double proteina=0;
      proteina=azar.nextDouble()*10;
      if(proteina<5)proteina-=3;
      if(auxi.BuscarPato("Renal_Leve")){
          if(proteina>2.0 && proteina<2.7)
              return 1;
          if(proteina>2.8)
              return 2;
      }
      if(auxi.BuscarPato("Renal_Grave")){
          if(proteina>1.5 && proteina<2.4)
              return 1;
          if (proteina>2.5)
           return 2;
      }
      if(proteina>2.6 && proteina<3.2)
          return 1;
      if(proteina>3.3)
          return 2;
      return 0;
    }
    
    public int infeccion(){
      Paciente auxi=super.getPaciente();
      int ecoli=0;
      if(auxi.BuscarPato("Infeccion"))
          ecoli+=30;
      super.SetValorEcoli(ecoli);
      return ecoli;
    }
    @Override
    public String Resultado() {
        String aux="";
        ArrayList<String> aux1=new ArrayList();
        int cont=0;
        int poruno=ObtenerConcentracion();
        int pordos=infeccion();
        int num=0;
        Random azar=new Random();
        num=azar.nextInt(101);
        if(num>0 && num<pordos){
            if(super.getCultivo().RevisarInfeccion()){
            aux1.add("Infeccion urinaria");
            cont++;
            }
        }
        if(pordos==1){       
            aux1.add("insuficiencia Renal Leve");
            cont++;
        }
        if(pordos==2){
            aux1.add("insuficiencia Renal Grave");
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
        return super.toString()+"\nColor de la muestra"+color+"\nCantidad de orina: "+orina+"ml";
    }
 
}
