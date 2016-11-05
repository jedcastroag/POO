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
public class Linea {
    
    public int numlinea,numproductos;
    public Supervisor supervisor;
    public HojaRegistroProduccion hojaderegistro;
    public ArrayList<TurnoProduccion> turnos;
    public ArrayList<Operario> operarios;
    

    public Linea(Supervisor supervisor,int numlinea) {
        this.numlinea = numlinea;
        this.supervisor = supervisor;
        this.operarios = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }
    
    public int calcularProdTotales(){
        int total=0;
        for (TurnoProduccion turno : this.turnos) {
            for (Tarea tarea : turno.actividades) {
                total += tarea.numproductos;
            }
        }
        return total;
    }
    
    public Operario buscarEmpleado(String clave){
        Operario op = null;
        for (Operario o : this.operarios) {
            if (o.id.equals(clave)) {
                op = o;
                break;
            }
        }
        return op;
    }
    
    public TurnoProduccion buscarTurno(int num){
        TurnoProduccion t = null;
        for (TurnoProduccion turno : turnos) {
            if (turno.tarjeta.numtrabajo == num) {
                t = turno;
                break;
            }
        }
        return t;
    }
}
