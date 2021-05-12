/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipojugadorcontrato;

import java.util.*;
/**
 *
 * @author Alumnado
 */
public class Equipo {
    private String nombre;
    private HashMap<String, Contrato> contratos;
    
    public Equipo(String nom) {
        contratos = new HashMap();
        nombre = nom;
    }
    
    public void firmarContrato(Jugador j, double sal) {
        Contrato nuevo = new Contrato(j, sal);
        contratos.put(j.getNombre(), nuevo);
    }
    
    public void firmarContratos(String[] noms, int[] eds, double[] sals) {
        if (noms==null || eds==null || sals==null) throw new NullPointerException("Hay algún argumento nulo.");
        
        if (noms.length!=eds.length || noms.length!=sals.length)
            throw new IllegalArgumentException("Los vectores no tienen la misma longitud.");
        
        for (int i = 0; i < noms.length; i++) {
            Jugador nuevoJ = new Jugador(noms[i], eds[i]);
            firmarContrato(nuevoJ, sals[i]);
        }
    }
    
    public int numeroJugadores() {
        return contratos.size();
    }
    
    public void escribirJugadoresV1() {
        for (String cada:contratos.keySet()) {
            System.out.println(cada);
        }
    }
    
    public void escribirJugadoresV2() {
        Iterator<HashMap.Entry<String, Contrato>> it;
        it = contratos.entrySet().iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    public Jugador getJugador(String nom) {
        if (contratos.containsKey(nom)) {
            return contratos.get(nom).getJugador();
        } else {
            return null;
        }
    }
    
    public double getSalario(String nom) {
        if (contratos.containsKey(nom)) {
            return contratos.get(nom).getSalario();
        } else {
            return -1;
        }
    }
    
    public void borrarJugador(String nom) {
        contratos.remove(nom);
    }
    
    public Contrato getContratoMasAlto() {
        double max = 0;
        String masAlto = "";
        
        for (Contrato cada:contratos.values()) {
            if (cada.getSalario() > max) {
                max = cada.getSalario();
                masAlto = cada.getJugador().getNombre();
            }
        }
        return contratos.get(masAlto);
    }
    
    public Jugador getJugador(int pos) {
        if (pos < contratos.size()) {
            return contratos.values().toArray(new Contrato[0])[pos].getJugador();
        } else {
            return null;
        }
    }
    
    public void escribirDetallesJugadores(int[] posiciones) {
        for (int i = 0; i < posiciones.length; i++) {
            System.out.println(getJugador(posiciones[i]).toString());
        }
    }
}
