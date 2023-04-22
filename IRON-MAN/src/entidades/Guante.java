/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import Gagdets.Repulsor;
import javafx.scene.paint.Material;

/**
 *
 * @author Usuario
 */
public final class Guante {

    private Repulsor repulsor;
    private Boolean funcionaGuante;
    private Integer nivelSaludGuante;
    private Integer resistencia;
    private Material material;
//private Integer consumoPorSegundo;

    public Guante() {
    }

    public Guante(Repulsor repulsor, Boolean funcionaGuante, Integer nivelSaludGuante, Integer resistencia, Material material) {
        this.repulsor = repulsor;
        this.funcionaGuante = funcionaGuante;
        this.nivelSaludGuante = nivelSaludGuante;
        this.resistencia = resistencia;
        this.material = material;
    }

    public Repulsor getRepulsor() {
        return repulsor;
    }

    public void setRepulsor(Repulsor repulsor) {
        this.repulsor = repulsor;
    }

    public Boolean getFuncionaGuante() {
        return funcionaGuante;
    }

    public void setFuncionaGuante(Boolean funcionaGuante) {
        this.funcionaGuante = funcionaGuante;
    }

    public Integer getNivelSaludGuante() {
        return nivelSaludGuante;
    }

    public void setNivelSaludGuante(Integer nivelSaludGuante) {
        this.nivelSaludGuante = nivelSaludGuante;
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
