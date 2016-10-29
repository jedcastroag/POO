/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaFooCo;

import java.util.*;

/**
 *
 * @author Jeffer
 */
public class Fabrica {
    
    private int numfabrica;
    private TreeMap<String,Linea> lineas;

    public Fabrica(int numfabrica) {
        this.numfabrica = numfabrica;
        this.lineas = new TreeMap<>();
    }

    public int getNumfabrica() {
        return numfabrica;
    }

    public void setNumfabrica(int numfabrica) {
        this.numfabrica = numfabrica;
    }
    
    public void addLinea(Linea linea){
        this.lineas.put(linea.getNombre(), linea);
    }
    public Linea getLinea(String nombre){
            return lineas.get(nombre);
    }

    public TreeMap<String, Linea> getLineas() {
        return lineas;
    }
    
    
}
