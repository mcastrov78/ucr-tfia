package anfibio.inheritance;

// Clase que representa un Vehículo Terrestre
public class VehiculoTerrestre extends Vehiculo {

    private static final String MEDIO = "TIERRA";
    private static final float VELOCIDAD_BASICA = 50f;

    private int numeroDeRuedas;

    // constructor
    public VehiculoTerrestre(String matricula, int numeroDeRuedas) {
        this.matricula = matricula;
        this.numeroDeRuedas = numeroDeRuedas;
    }

    // getters y setters
    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    // obtener medio sobre el que se desplaza
    public String getMedio() {
        return MEDIO;
    }

    // calcular velocidad
    public float getVelocidad() {
        return VELOCIDAD_BASICA * numeroDeRuedas;
    }

}
