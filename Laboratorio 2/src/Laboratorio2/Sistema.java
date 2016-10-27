/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio2;

import java.util.*;

/**
 *
 * @author Jeffer
 */
public class Sistema {

    private HashMap<String, Empleado> empleados;
    private Fabrica[] fabricas;

    public Sistema() {
        this.empleados = new HashMap<>();
        this.fabricas = new Fabrica[3];
        this.fabricas[0] = new Fabrica(1);
        this.fabricas[1] = new Fabrica(2);
        this.fabricas[2] = new Fabrica(3);
    }

    public Fabrica buscarFabrica(int numerofabrica) {
        if (!(numerofabrica > 3)) {
            return this.fabricas[numerofabrica - 1];
        } else {
            return null;
        }
    }

    public ArrayList<Empleado> listarDisponibles() {
        ArrayList<Empleado> disponibles = new ArrayList<>();
        this.empleados.values().stream().filter((e) -> (e.getIncapacitado().estado==false || e.getVacaciones().estado)==false).forEach((e) -> {
            disponibles.add(e);
        });
        return disponibles;
    }

    public ArrayList<Empleado> listarNoDisponibles() {
        ArrayList<Empleado> nodisponibles = new ArrayList<>();
        Calendar hoy = Calendar.getInstance();
        hoy.set(hoy.getWeekYear(), hoy.get(Calendar.WEEK_OF_YEAR), Calendar.SATURDAY);
        for (Empleado e : this.empleados.values()) {
            if (e.getIncapacitado().estado ==true || e.getVacaciones().estado==true) {
                if (e.getIncapacitado().fechafinal.before(hoy)) {
                    nodisponibles.add(e);
                }
            }
        }
        return nodisponibles;
    }

    public ArrayList<Empleado> listarPosiblesDisponibles() {
        ArrayList<Empleado> posiblesdisponibles = new ArrayList<>();
        for (Empleado e : this.empleados.values()) {
            if (e.getIncapacitado().estado==true || !e.getVacaciones().estado==true) {
                if (e.getIncapacitado().fechafinal.getTime().getDay() < Calendar.SATURDAY) {
                    posiblesdisponibles.add(e);
                }
            }
        }
        return posiblesdisponibles;
    }

    public boolean agregarEmpleado(Empleado e) {
        if (!this.empleados.containsKey(e.getId())) {
            this.empleados.put(e.getId(), e);
            return true;
        } else {
            return false;
        }
    }

    public Empleado buscarEmpleado(String id) {
        Empleado empleado = null;
        for (Empleado e : this.empleados.values()) {
            if (e.getId().equals(id)) {
                empleado = e;
                break;
            }
        }
        return empleado;
    }
}
