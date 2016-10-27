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
public class Incapacidad extends Ausencia{
    
    private String motivo;
    private int diasdeincapacidad;

    public Incapacidad(String motivo, int diasdeincapacidad, boolean estado) {
        this.estado = estado;
        this.motivo = motivo;
        this.diasdeincapacidad = diasdeincapacidad;
    }  

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getDiasdeincapacidad() {
        return diasdeincapacidad;
    }

    public void setDiasdeincapacidad(int diasdeincapacidad) {
        this.diasdeincapacidad = diasdeincapacidad;
    }
    
}
