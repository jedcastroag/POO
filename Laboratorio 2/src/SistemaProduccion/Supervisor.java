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
public class Supervisor extends Personal {

    public Linea linea;
    public Almacen almacen;

    public Supervisor(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public boolean reasignarOperario(Operario op) throws NullPointerException {
        return this.linea.operarios.add(op);
    }

    public boolean suficientesIngredientes() {
        return this.linea.calcularProdTotales() <= this.almacen.numproductos;
    }

    public boolean addHojaTiempos(HojaTiempo h,String clacve){
        if (this.linea.buscarEmpleado(clacve).hojadetiempos==null){
            this.linea.buscarEmpleado(clacve).hojadetiempos = h;
            return true;
        }
        return false;
    }
    public boolean pedirReabastecimiento(){
        return this.almacen.reabastecer(this.linea);
    }
    public boolean registrarAusencia(Tarea ausencia,String clave){
        return this.linea.buscarEmpleado(clave).hojadetiempos.tareas.add(ausencia);
    }
    public boolean TurnoLargo(int numtrabajo){
        return this.linea.buscarTurno(numtrabajo).duracion;
    }
    public ArrayList<Operario> listarOperariosOtrasLineas(){
        ArrayList<Operario> operarios = new ArrayList<>();
        for (Linea linea : this.almacen.lineas) {
            if(linea!=this.linea){
                operarios.addAll(linea.operarios);
            }
        }
        return operarios;
    }
}
