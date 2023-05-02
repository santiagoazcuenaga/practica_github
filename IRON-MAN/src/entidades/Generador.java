package entidades;

import gadgets.Cañon;

/**
 * GENERADOR
 */
public final class Generador extends DispositivoArmadura{

    private Cañon cañon;
    private final Float nivelCarga = Float.MAX_VALUE;

    public Generador() {
        this.cañon = new Cañon();
        this.consumoDeEnergia = 0F;
    }

    public Cañon getCañon() {
        return cañon;
    }

}
