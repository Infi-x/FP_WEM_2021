/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordelaboratorio;

/**
 *
 * @author lunis
 */
public abstract class Analisis {

    private String id;
    private Fecha fecha;
    private Fecha finalizada;
    private Paciente paciente;
    private String tipo;
    private boolean revisado;
    private int duracion;
    private String Resultado;
    private Cultivo cultivo;
    
    public Analisis(String s, Fecha f, Paciente p){
    id=s;
    fecha=f;
    paciente=p;
    revisado=false;
    cultivo=new Cultivo(id);
}

    public void SetValorHeces(int n){
    cultivo.setValorHeces(n);
    }

    public void SetValorEcoli(int n){
    cultivo.setValorEcoli(n);
    }

    public Cultivo getCultivo() {
        return cultivo;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Fecha getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(Fecha finalizada) {
        this.finalizada = finalizada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isRevisado() {
        return revisado;
    }

    public void setRevisado(boolean revisado) {
        this.revisado = revisado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public String GetResultado(){
        return Resultado;
    }
    
    public void SetResultado(String r){
        Resultado=r;
    }
    
    public abstract String Resultado();
   
    @Override
    public String toString() {
        return "Analisis de: "+tipo+
                "\nNumero de ID: "+id+
                "\nFecha de realizacion: "+fecha+
                "\nDisponible: "+revisado;    
    }
    
    
    
}
