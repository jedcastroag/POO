/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaProduccion;

import java.util.Calendar;

/**
 *
 * @author Sergio Romero
 */
public class Tarea {
    
    public Calendar horainicio,horafinal;
    public String descripcion;
    public int numproductos;
    public boolean ausencia;

    public Tarea() {
        this.numproductos = 0;
        this.ausencia = false;
    }
    
    
    
}
