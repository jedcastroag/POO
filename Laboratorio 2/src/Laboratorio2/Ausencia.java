/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2;

/**
 *
 * @author Jeffer
 */
public abstract class Ausencia {
    
    public boolean estado;
    protected Fecha fechainicio,fechafinal;

    public Ausencia(boolean estado) {
        this.estado = estado;
    }

    public abstract boolean getEstado();

    public abstract void setEstado(boolean estado);
    
    
    
}
