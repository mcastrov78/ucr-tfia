package anfibio.inheritance;

public class Vehiculo1 extends VehiculoAcuatico {

    private String placa;

    // constructor
    public Vehiculo1(String placa, int numeroDePropelas) {
        super(numeroDePropelas);
        this.placa = placa;
    }

    // getters y setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // cálculo de velocidad
    public float getVelocidad() {
        return super.getVelocidad();
    }

}
