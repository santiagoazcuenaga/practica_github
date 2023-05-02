package servicios;

import entidades.Bota;
import entidades.Generador;

/**
 * SERVICIO BOTA
 */
public class servicioBota {

    public Bota bota;
    public Generador generador;

    private Integer caminar(int tiempo) {
        Integer consumo = 0;
        try {
            consumo = 20000;

        } catch (Exception e) {
            System.out.println("ERROR" + e.getMessage());
        }

        return consumo;
    }

    private void correr() {

    }

    private void propulsar() {

    }

}
