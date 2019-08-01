package anfibio.inheritance;

public class Vehiculo2 extends VehiculoTerrestre {

    private String placa;

    // constructor
    public Vehiculo2(String placa, int numeroDeRuedas) {
        super(numeroDeRuedas);
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
