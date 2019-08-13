package anfibio.composition;

// Clase que representa un objeto con Propulsión Acuática
public class PropulsionAcuatica implements Propulsable {

    private static final String MEDIO = "AGUA";
    private static final float VELOCIDAD_BASICA = 10f;

    private int numeroDePropelas;

    // constructor
    public PropulsionAcuatica(int numeroDePropelas) {
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
