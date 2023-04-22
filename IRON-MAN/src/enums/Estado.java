/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author Usuario
 */
public enum Estado {
 APAGADO(0),USOBASAL(1),USOBASICO(2),USONORMAL(3),USOINTENSIVO(4),USOSUPERINTENSIVO(5);
 
 private final int estado;

    Estado(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

}
