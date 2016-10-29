/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaFooCo;

/**
 *
 * @author Jeffer
 */
public class Empleado {
    
    private String nombre;
    private String id; 
    private Vacacion vacaciones;
    private Incapacidad incapacitado;
    private RegistroOperativo registro;

    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.vacaciones = new Vacacion(false);
        this.incapacitado = new Incapacidad(null, 0,false);
        this.registro = new RegistroOperativo(null,null);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public Vacacion getVacaciones() {
        return vacaciones;
    }

    public Incapacidad getIncapacitado() {
        return incapacitado;
    }

    public RegistroOperativo getRegistro() {
        return registro;
    }

    @Override
    public String toString() {
        return "Empleado " + "nombre=" + nombre + ", id=" + id ;
    }
    
}
