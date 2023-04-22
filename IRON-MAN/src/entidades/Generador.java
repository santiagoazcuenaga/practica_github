/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import Gagdets.Cañon;
import enums.Estado;
import javafx.scene.paint.Material;

/**
 *
 * @author Usuario
 */
public final class Generador  {
    private Cañon cañon;
    private Integer resistencia;
    private Material material;
    private Long carga;

    public Generador() {
    }

    public Generador(Cañon cañon, Integer resistencia, Material material, Long carga) {
        this.cañon = cañon;
        this.resistencia = resistencia;
        this.material = material;
        this.carga = carga;
    }

    public Cañon getCañon() {
        return cañon;
    }

    public void setCañon(Cañon cañon) {
        this.cañon = cañon;
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

    public Long getCarga() {
        return carga;
    }

    public void setCarga(Long carga) {
        this.carga = carga;
    }

 
}
