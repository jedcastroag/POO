/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaProduccion;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Sergio Romero
 */
public class CalendarioProduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Almacen almacen = new Almacen(1000);
        int random = (int) (Math.random() * 10 + 1);
        System.out.println("el numero de lineas y de supervisores es: " + random);
        Supervisor[] supervisores = new Supervisor[random];
        ArrayList<Linea> lineas = new ArrayList<>();

        for (int j = 0; j < random; j++) {
            String nombre = "s" + (j + 1);
            String id = "123" + (random + j);
            supervisores[j] = new Supervisor(nombre, id);
            supervisores[j].almacen = almacen;
            lineas.add(new Linea(supervisores[j], j + 1));
        }
        int i = 0;
        System.out.println("supervisor  linea");
        for (Linea linea : lineas) {
            supervisores[i].linea = linea;
            System.out.println(supervisores[i].nombre + " linea" + supervisores[i].linea.numlinea);
            i++;
        }
        ArrayList<Operario> operarios = new ArrayList<>();
        int numoperarios = (int) (Math.random() * 20 + 1) * random;
        for (int j = 0; j < numoperarios; j++) {
            String nombre = "o" + (j + 1);
            String id = "123" + (numoperarios + j);
            operarios.add(new Operario(nombre, id));
            
        }
        int j = 0,k=0;
        System.out.println("\nOperario  linea");
        for (Operario operario : operarios) {
            if (j%5 == 0) {
                operario.semicualificado = true;
            }
            k=(int)(Math.random()*random);
            operario.linea = lineas.get(k);
            lineas.get(k).operarios.add(operario);
            System.out.println(operario);
        }

        for (i = 0; i < (Calendar.SATURDAY - Calendar.MONDAY); i++) {

        }

    }

}
