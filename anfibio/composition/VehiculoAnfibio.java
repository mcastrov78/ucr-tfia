package anfibio.composition;

// Clase que representa un Vehículo Anfibio, mediante composición/delegación
public class VehiculoAnfibio {

    // instancia de Propulsable al que se le delegarán acciones
    private Propulsable propulsable;
    private String matricula;

    // constructor
    public VehiculoAnfibio(String matricula, Propulsable propulsable) {
        this.matricula = matricula;
        this.propulsable = propulsable;
    }

    // getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // obtener medio sobre el que se desplaza, delegando llamado a la instancia de Propulsable
    public String getMedio() {
        return propulsable.getMedio();
    }

    // calcular velocidad, delegando llamado a la instancia de Propulsable
    public float getVelocidad() {
        return propulsable.getVelocidad();
    }

    // conversión de un tipo de Propulsable a otro
    public void convertirA(Propulsable propulsable) {
        this.propulsable = propulsable;
    }

}
