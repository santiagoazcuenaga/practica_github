/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author Usuario
 */
public enum Metal {
    PLATINO(40), TITANIO(36),ACERO(15),VIBRANIO(90);

    private final int durezaRockwell;

    Metal(int durezaRockwell) {
        this.durezaRockwell = durezaRockwell;
    }

    public int getDurezaRockwell() {
        return durezaRockwell;
    }
  
}
