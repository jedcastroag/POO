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
public class Almacen {

    public ArrayList<Linea> lineas;
    public ArrayList<TarjetaTrabajo> tarjetas;
    public int numproductos;

    public Almacen(int numproductos) {
        this.numproductos = numproductos;
    }    

    public boolean reabastecer(Linea linea) {
        if (linea.numproductos < linea.calcularProdTotales()) {
            linea.numproductos = (linea.calcularProdTotales()-linea.numproductos);
            return true;
        }
        return false;
    }
    public Linea buscarLinea(int clave){
        Linea l=null;
        for (Linea linea : lineas) {
            if (linea.numlinea == clave) {
                l =  linea;
                break;
            }
        }
        return l;
    }

}
