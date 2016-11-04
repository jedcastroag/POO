/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaProduccion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Sergio Romero
 */
public class Programa {
    
    private TreeMap<String,Linea> lineas;
    private TreeMap<String,Turno> turnos;
    private File programa;

    public Programa() throws IOException{
        this.lineas=new TreeMap<>();
        this.programa = new File("Programa.txt");
            
    }
    
}
