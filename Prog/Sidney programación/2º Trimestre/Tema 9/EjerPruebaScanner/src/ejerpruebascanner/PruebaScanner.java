/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerpruebascanner;

import java.util.*;
import java.io.*;
/**
 *
 * @author Alumnado
 */
public class PruebaScanner {
    private Scanner fnotas;
    private ArrayList<Alumno> alumnos;
    private PrintWriter fmedias;
    
    public PruebaScanner(String nameIn, String nameOut) throws IOException {
        try {
            alumnos = new ArrayList();
            fnotas = new Scanner(new File(nameIn));
            fmedias = new PrintWriter(new BufferedWriter(new FileWriter(nameOut)));
        }
        catch (FileNotFoundException e) {
            System.out.println("El archivo no se ha podido encontrar.");
        }
        catch (IOException e) {
            System.out.println("Error al crear el archivo.");
        }
    }
    
    public void cargarDeFichero() {
        String[] datos;
                
        while (fnotas.hasNextLine()) {
            
        }
    }
    
    public void generarMedias() {
        
    }
}
