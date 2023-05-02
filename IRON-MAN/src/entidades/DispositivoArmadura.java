package entidades;

/**
 * DISPOSITIVO ARMADURA
 */
public abstract class DispositivoArmadura {

    protected Float consumoDeEnergia;
    protected Boolean funciona = true;
    protected Float nivelSalud = 100F;

    protected Float getConsumoDeEnergia() {
        return consumoDeEnergia;
    }

    protected Boolean getFunciona() {
        return funciona;
    }

    protected void setFunciona(Boolean funciona) {
        this.funciona = funciona;
    }

    protected Float getNivelSalud() {
        return nivelSalud;
    }

    protected void setNivelSalud(Float nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

} //end DispositivoArmadura
