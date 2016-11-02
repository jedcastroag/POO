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

    public void read() throws FileNotFoundException {
        Scanner lectura = new Scanner(this.programa);
        lectura.useDelimiter(",");
        while (lectura.hasNext()) {
            int numlineas = lectura.nextInt();
            for (int i = 0; i < numlineas; i++) {
                String numlinea = lectura.next();
                this.lineas.put(numlinea, new Linea());
            }
            int numturnos = lectura.nextInt();
            for (int i = 0; i < numturnos; i++) {
                Turno t = new Turno();
                TarjetaTrabajo tar = new TarjetaTrabajo();
                t.tarjeta = tar;
                int numact = lectura.nextInt();
                for (int j = 0; j < numact; j++) {
                   String idact = lectura.next();
                   Actividad a = new Actividad();
                   a.id=idact;
                   t.actividades.add(a);
                }
                
            }
        }
        lectura.close();
    }
    
}
