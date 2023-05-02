/**
 * BOTA
 */
package entidades;

import gadgets.Propulsor;

public final class Bota extends DispositivoArmadura {

    private final Propulsor propulsor;
    //PREGUNTAR COMO PONER EL CONSUMO DE ENERGIA POR ACA;

    public Bota() {
        this.consumoDeEnergia = 150F;
        this.propulsor = new Propulsor();
    }

    public Propulsor getPropulsor() {
        return propulsor;
    }

}
