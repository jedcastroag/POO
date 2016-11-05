/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaProduccion;

/**
 *
 * @author Sergio Romero
 */
public class Operario extends Personal {

    public boolean semicualificado;
    public HojaTiempo hojadetiempos;
    public Linea linea;

    public Operario(String nombre, String id) {
        this.semicualificado = false;
        this.nombre = nombre;
        this.id = id;

    }

    @Override
    public String toString() {
        return "Operario{" + " nombre: " + this.nombre + " id: " + this.id + "linea= linea" + this.linea.numlinea + '}';
    }

}
