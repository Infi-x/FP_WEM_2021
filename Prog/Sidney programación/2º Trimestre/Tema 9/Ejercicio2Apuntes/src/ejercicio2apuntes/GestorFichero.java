/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2apuntes;

import java.io.*;
/**
 *
 * @author AAlonsinho
 */
public class GestorFichero {
    private String nombreFichero;
    private PrintWriter fsalida;
    
    public GestorFichero(String n) {
        if (n==null) throw new NullPointerException();
        nombreFichero = n;
    }
    
    public void abrirFichero() {
        try {
            if (fsalida!=null) fsalida.close();
            fsalida = new PrintWriter(new BufferedWriter(new FileWriter(nombreFichero)));
        }
        catch(FileNotFoundException e) {
            System.out.println("No existe el fichero "+nombreFichero);
        }
        catch (SecurityException e) {
            System.out.println("No tiene permiso para abrir "+nombreFichero);
        }
        catch(IOException e) {
            System.out.println("Error al crear el fichero "+nombreFichero);
        }
    }
    
    public void cerrarFichero() {
        try {
            fsalida.close();
        }
        catch(NullPointerException e) {
            System.out.println("Error al cerrar el fichero "+nombreFichero);
        }
    }
    
    public void escribirDatos() {
        try {
            fsalida.println("GRACIAS ANGEL MI NIÑO");
            fsalida.println("348324834834");
            int n = 40;
            fsalida.println(n);
        }
        catch(NullPointerException e) {
            System.out.println("No se ha creado ningún fichero con ese nombre.");
        }
    }
    
    public void abrirFicheroAniadiendo() {
        try {
            if (fsalida!=null) fsalida.close();
            fsalida = new PrintWriter(new BufferedWriter(new FileWriter(nombreFichero, true)));
        }
        catch(FileNotFoundException e) {
            System.out.println("No existe el fichero "+nombreFichero);
        }
        catch (SecurityException e) {
            System.out.println("No tiene permiso para abrir "+nombreFichero);
        }
        catch(IOException e) {
            System.out.println("Error al crear el fichero "+nombreFichero);
        }
    }
}
