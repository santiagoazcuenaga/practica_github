/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import Gagdets.Consola;
import Gagdets.Sintetizador;
import javafx.scene.paint.Material;

/**
 *
 * @author Usuario
 */
public final class Casco {
    private Consola consola;
    private Sintetizador sintetizador;
    private Boolean funcionaCasco;
    private Integer nivelSaludCasco;
    private Integer resistencia;
    private Material material;

    public Casco() {
    }

    public Casco(Consola consola, Sintetizador sintetizador, Boolean funcionaCasco, Integer nivelSaludCasco, Integer resistencia, Material material) {
        this.consola = consola;
        this.sintetizador = sintetizador;
        this.funcionaCasco = funcionaCasco;
        this.nivelSaludCasco = nivelSaludCasco;
        this.resistencia = resistencia;
        this.material = material;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }

    public Boolean getFuncionaCasco() {
        return funcionaCasco;
    }

    public void setFuncionaCasco(Boolean funcionaCasco) {
        this.funcionaCasco = funcionaCasco;
    }

    public Integer getNivelSaludCasco() {
        return nivelSaludCasco;
    }

    public void setNivelSaludCasco(Integer nivelSaludCasco) {
        this.nivelSaludCasco = nivelSaludCasco;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    
    
}
