/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaProduccion;

import java.util.ArrayList;

/**
 *
 * @author Sergio Romero
 */
public class TurnoProduccion {
    
    public String id;
    public boolean duracion;
    public TarjetaTrabajo tarjeta;
    public ArrayList<Tarea> actividades;
    public int NumTarjeta=0;

    public TurnoProduccion() {
        this.tarjeta = new TarjetaTrabajo(NumTarjeta);
        this.NumTarjeta++;
    }  
    
}
