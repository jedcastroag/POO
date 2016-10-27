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
public class RegistroOperativo {
    
    private String habilidades,experiencia;
    private Fabrica fabricaactual;
    private Linea lineaactual;

    public RegistroOperativo(String habilidades, String experiencia) {
        this.habilidades = habilidades;
        this.experiencia = experiencia;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public Fabrica getFabricaactual() {
        return fabricaactual;
    }

    public void setFabricaactual(Fabrica fabricaactual) {
        this.fabricaactual = fabricaactual;
    }

    public Linea getLineaactual() {
        return lineaactual;
    }
    
    public boolean setLineaactual(Linea lineaactual) {
        if(lineaactual == null)
            throw new NullPointerException();
        this.lineaactual=lineaactual;
        return true;
    }
    
        
    
}
