/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaProduccion;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Sergio Romero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Format f = new SimpleDateFormat("HH:mm:ss/dd/MM/yyyy");
        Calendar cali = Calendar.getInstance();
        Calendar calf = Calendar.getInstance();
        cali.set(2016, 9, 31);
        calf = cali;
        //calf.add(Calendar, 1);
        System.out.println(f.format(cali.getTime()));
    }
    
}
