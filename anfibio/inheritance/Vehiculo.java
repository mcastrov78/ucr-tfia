package anfibio.inheritance;

// Clase abstracta que representa un Vehículo
public abstract class Vehiculo {

    protected String matricula;

    // getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // obtener medio sobre el que se desplaza
    public abstract String getMedio();

    // calcular velocidad
    public abstract float getVelocidad();

}
