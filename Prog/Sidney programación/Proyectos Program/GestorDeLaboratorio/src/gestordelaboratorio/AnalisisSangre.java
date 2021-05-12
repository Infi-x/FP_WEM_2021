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
public class AnalisisSangre extends Analisis {
    private double sangre;
  
    public AnalisisSangre(String si, Fecha f,Paciente pa) {
        super(si,f,pa) ;
        super.setTipo("Sangre");
        sangre=10;
    }
    
    private int globulosR(){
        int gl=13;
        int aux=0;
        Paciente auxi=super.getPaciente();
        Random azar=new Random();
        if(auxi.BuscarPato("Anemia"))
            gl-=1;
        if(auxi.BuscarPato("Cancer_leu"))
            gl-=1;
        aux=azar.nextInt(3);
        gl-=aux;
        return gl;
    }
    
    private int globulosB(){
        int gl=11;
        int aux=0;
        Paciente auxi=super.getPaciente();
        Random azar=new Random();
        if(auxi.BuscarPato("Cancer_leu"))
            gl+=2;
        if(auxi.BuscarPato("Cancer_pro"))
            gl+=2;
        aux=azar.nextInt(6);
        gl+=aux;
        return gl;
    }
    
    private int glucosa(){
        int glu=70;
        int aux=0;
        Paciente auxi=super.getPaciente();
        Random azar=new Random();
        if(auxi.BuscarPato("Diabetes"))
            glu+=20;
        aux=azar.nextInt(91);
        glu+=aux;
        return glu;
    }
    
    private int PCA(){
        int pca=1;
        int aux=0;
        Paciente auxi=super.getPaciente();
        Random azar=new Random();
        if(auxi.BuscarPato("Cancer_pro"))
            pca+=1;
        aux=azar.nextInt(5);
        pca+=aux;
        return pca;
    }
    
    private int Plaquetas(){
        int pla=300;
        int aux=0;
        Paciente auxi=super.getPaciente();
        Random azar=new Random();
        if(auxi.BuscarPato("Cancer_leu"))
            pla-=100;
        if(auxi.BuscarPato("Diabetes"))
            pla-=60;
        aux=azar.nextInt(151);
        pla-=aux;
        return pla;
    }
    
    private int Colesterol(){
        int col=150;
        int aux=0;
        Paciente auxi=super.getPaciente();
        Random azar=new Random();
        if(auxi.BuscarPato("Cardiaco"))
            col+=20;
        aux=azar.nextInt(71);
        col+=aux;
        return col;
    }
    
    public String Resultado() {
       String aux="";
       ArrayList<String> aux1=new ArrayList();
       int cont=0;
       int glor=globulosR();
       int glob=globulosB();
       int glu=glucosa();
       int pca=PCA();
       int pla=Plaquetas();
       int col=Colesterol();
       if(glor<10){
           aux1.add("Anemia");
           cont++;
       }
       if(glor<10 && glob>13 && pla<100){
           aux1.add("Cancer de Leucemia");
           cont++;
       }
       if(glob>13 && pca>4){
           aux1.add("Cancer de Prostata");
           cont++;
       }
       if(glu>110 && pla<100){
           aux1.add("Diabetes");
           cont++;
       }
       if(col>200){
           aux1.add("Coresterol");
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
        return super.toString()+"\nCantidad de sangre: "+sangre+"ml";
    }
    
}
