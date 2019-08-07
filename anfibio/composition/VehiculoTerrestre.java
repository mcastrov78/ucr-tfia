package anfibio.composition;

// Clase que representa un Vehículo Terrestre, es desplazable
public class VehiculoTerrestre implements ObjetoDesplazable {

    private static final String MEDIO = "TIERRA";
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

    // obtener medio sobre el que se desplaza (método de la interfaz)
    public String getMedio() {
        return MEDIO;
    }

    // cálcular velocidad (método de la interfaz)
    public float getVelocidad() {
        return VELOCIDAD_BASICA * numeroDeRuedas;
    }

}
