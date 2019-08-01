package anfibio.composition;

public class VehiculoTerrestre implements ObjetoDesplazable {

    private static final float VELOCIDAD_BASICA = 50f;
    private int numeroDeRuedas;

    // constructor
    public VehiculoTerrestre(int numeroDeRuedas) {
        super();
        this.numeroDeRuedas = numeroDeRuedas;
    }

    // getters y setters
    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    // cálculo de velocidad
    public float getVelocidad() {
        return VELOCIDAD_BASICA * numeroDeRuedas;
    }
}
