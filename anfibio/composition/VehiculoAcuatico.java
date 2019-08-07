package anfibio.composition;

// Clase que representa un Vehículo Acuático, es desplazable
public class VehiculoAcuatico implements ObjetoDesplazable {

    private static final String MEDIO = "AGUA";
    private static final float VELOCIDAD_BASICA = 10f;
    private int numeroDePropelas;

    // constructor
    public VehiculoAcuatico(int numeroDePropelas) {
        super();
        this.numeroDePropelas = numeroDePropelas;
    }

    // getters y setters
    public int getNumeroDePropelas() {
        return numeroDePropelas;
    }

    public void setNumeroDePropelas(int numeroDePropelas) {
        this.numeroDePropelas = numeroDePropelas;
    }

    // obtener medio sobre el que se desplaza (método de la interfaz)
    public String getMedio() {
        return MEDIO;
    }

    // calcular velocidad (método de la interfaz)
    public float getVelocidad() {
        return VELOCIDAD_BASICA * numeroDePropelas;
    }

}
