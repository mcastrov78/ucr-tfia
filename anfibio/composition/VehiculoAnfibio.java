package anfibio.composition;

// Clase que representa un Vehículo Anfibio, mediante composición/delegación
public class VehiculoAnfibio {

    // instancia de ObjetoDesplazable al que se le delegarán acciones
    private ObjetoDesplazable objetoDesplazable;
    private String matricula;

    // constructor
    public VehiculoAnfibio(String matricula, ObjetoDesplazable objetoDesplazable) {
        this.matricula = matricula;
        this.objetoDesplazable = objetoDesplazable;
    }

    // getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // calcular medio sobre el que se desplaza, delegando llamado a la instancia de ObjetoDesplazable
    public String getMedio() {
        return objetoDesplazable.getMedio();
    }

    // calcular velocidad, delegando llamado a la instancia de ObjetoDesplazable
    public float getVelocidad() {
        return objetoDesplazable.getVelocidad();
    }

    // conversión de un tipo de ObjetoDesplazable a otro
    public void convertirA(ObjetoDesplazable objetoDesplazable) {
        this.objetoDesplazable = objetoDesplazable;
    }

}
