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

    public Incapacidad(String motivo, boolean estado) {
        super(estado);
        this.motivo = motivo;
        this.estado = estado;
    }

    

    @Override
    public boolean getEstado() {
        return estado;
    }

    @Override
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public Fecha diasAFecha(int dias){
    }

    public Fecha getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Fecha fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Fecha getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Fecha fechafinal) {
        this.fechafinal = fechafinal;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
}
