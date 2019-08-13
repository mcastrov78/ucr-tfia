package anfibio.composition;

// Clase que representa un objeto con Propulsión Terrestre
public class PropulsionTerrestre implements Propulsable {

    private static final String MEDIO = "TIERRA";
    private static final float VELOCIDAD_BASICA = 50f;

    private int numeroDeRuedas;

    // constructor
    public PropulsionTerrestre(int numeroDeRuedas) {
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
