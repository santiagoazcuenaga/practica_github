/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import Gagdets.Propulsor;
import javafx.scene.paint.Material;

/**
 *
 * @author Usuario
 */
public final class Bota {

    private Propulsor propulsor;
    private Boolean funcionaBota;
    private Integer nivelSaludBota;
    private Integer resistencia;
    private Material material;
//private Integer consumoPorSegundo;
    public Bota() {
    }

    public Bota(Propulsor propulsor, Boolean funcionaBota, Integer nivelSaludBota, Integer resistencia, Material material) {
        this.propulsor = propulsor;
        this.funcionaBota = funcionaBota;
        this.nivelSaludBota = nivelSaludBota;
        this.resistencia = resistencia;
        this.material = material;
    }

    public Propulsor getPropulsor() {
        return propulsor;
    }

    public void setPropulsor(Propulsor propulsor) {
        this.propulsor = propulsor;
    }

    public Boolean getFuncionaBota() {
        return funcionaBota;
    }

    public void setFuncionaBota(Boolean funcionaBota) {
        this.funcionaBota = funcionaBota;
    }

    public Integer getNivelSaludBota() {
        return nivelSaludBota;
    }

    public void setNivelSaludBota(Integer nivelSaludBota) {
        this.nivelSaludBota = nivelSaludBota;
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
