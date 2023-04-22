/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import enums.Color;
import enums.Metal;

/**
 *
 * @author Usuario
 */
public class Armadura {
private Color colorPrimario;
private Color colorSecundario;
private Guante guanteIzq;
private Guante guanteDer;
private Bota botaIzq;
private Bota botaDer;
private Casco casco;
private Metal material;
private Integer resistencia = material.getDurezaRockwell() * 10;
private Integer nivelSalud = 100;
private Generador generador;

    public Armadura() {
    }

    public Armadura(Color colorPrimario, Color colorSecundario, Guante guanteIzq, Guante guanteDer, Bota botaIzq, Bota botaDer, Casco casco, Metal material, Generador generador) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.guanteIzq = guanteIzq;
        this.guanteDer = guanteDer;
        this.botaIzq = botaIzq;
        this.botaDer = botaDer;
        this.casco = casco;
        this.material = material;
        this.generador = generador;
    }

    public Color getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Guante getGuanteIzq() {
        return guanteIzq;
    }

    public void setGuanteIzq(Guante guanteIzq) {
        this.guanteIzq = guanteIzq;
    }

    public Guante getGuanteDer() {
        return guanteDer;
    }

    public void setGuanteDer(Guante guanteDer) {
        this.guanteDer = guanteDer;
    }

    public Bota getBotaIzq() {
        return botaIzq;
    }

    public void setBotaIzq(Bota botaIzq) {
        this.botaIzq = botaIzq;
    }

    public Bota getBotaDer() {
        return botaDer;
    }

    public void setBotaDer(Bota botaDer) {
        this.botaDer = botaDer;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    public Metal getMaterial() {
        return material;
    }

    public void setMaterial(Metal material) {
        this.material = material;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }

    public Integer getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(Integer nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

}
