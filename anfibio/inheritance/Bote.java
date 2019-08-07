package anfibio.inheritance;

// Clase que representa un Carro que es un VehículoAcuático
public class Bote extends VehiculoAcuatico {

    private String matricula;

    // constructor
    public Bote(String matricula, int numeroDePropelas) {
        super(numeroDePropelas);
        this.matricula = matricula;
    }

    // getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // calcular velocidad, invocando el método del padre VehiculoAcuatico
    public float getVelocidad() {
        return super.getVelocidad();
    }

}
