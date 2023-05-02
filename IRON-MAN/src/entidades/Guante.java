/**
 * GUANTE
 */

package entidades;

import gadgets.Repulsor;


public final class Guante extends DispositivoArmadura {

    private Repulsor repulsor;

    public Guante() {
        this.repulsor = new Repulsor();
        this.consumoDeEnergia = 100F;
    }

    public Repulsor getRepulsor() {
        return repulsor;
    }

}
