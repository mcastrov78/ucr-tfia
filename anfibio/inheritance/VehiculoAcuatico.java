package anfibio.inheritance;

// Clase que representa un Vehículo Acuático
public class VehiculoAcuatico extends Vehiculo {

    private static final String MEDIO = "AGUA";
    private static final float VELOCIDAD_BASICA = 10f;

    private int numeroDePropelas;

    // constructor
    public VehiculoAcuatico(String matricula, int numeroDePropelas) {
        this.matricula = matricula;
        this.numeroDePropelas = numeroDePropelas;
    }

    // getters y setters
    public int getNumeroDePropelas() {
        return numeroDePropelas;
    }

    public void setNumeroDePropelas(int numeroDePropelas) {
        this.numeroDePropelas = numeroDePropelas;
    }

    // obtener medio sobre el que se desplaza
    public String getMedio() {
        return MEDIO;
    }

    // calcular velocidad
    public float getVelocidad() {
        return VELOCIDAD_BASICA * numeroDePropelas;
    }

}
