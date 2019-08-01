package anfibio.inheritance;

public class VehiculoAcuatico {

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

    // cálculo de velocidad
    public float getVelocidad() {
        return VELOCIDAD_BASICA * numeroDePropelas;
    }

}
