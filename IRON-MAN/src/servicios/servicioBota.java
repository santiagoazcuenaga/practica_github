/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Bota;
import entidades.Generador;
import enums.Estado;


/**
 *
 * @author Usuario
 */
public class servicioBota {

    public Bota bota;
public Generador generador;


private Integer caminar(int tiempo){
 Integer consumo = 0;
 try {
  consumo = 20000;     
     
    } catch (Exception e) {
        System.out.println("ERROR"+e.getMessage());
    }
     
 return consumo;   
}
private void correr(){
    
}
private void propulsar(){
    
}



}
