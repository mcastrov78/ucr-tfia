package anfibio.composition;

public class Vehiculo {

    private ObjetoDesplazable objetoDesplazable;
    private String placa;

    // constructor
    public Vehiculo(String placa, ObjetoDesplazable objetoDesplazable) {
        this.placa = placa;
        this.objetoDesplazable = objetoDesplazable;
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
        return objetoDesplazable.getVelocidad();
    }

    // conversión
    public void convertirA(ObjetoDesplazable objetoDesplazable) {
        this.objetoDesplazable = objetoDesplazable;
    }
}
