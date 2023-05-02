package entidades;

import gadgets.Consola;
import gadgets.Sintetizador;

/**
 * CASCO
 */
public final class Casco extends DispositivoArmadura {

    private Consola consola;
    private Sintetizador sintetizador;

    public Casco() {
        this.consumoDeEnergia = 100F;
        this.consola = new Consola();
        this.sintetizador = new Sintetizador();
    }

    public Consola getConsola() {
        return consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

}
