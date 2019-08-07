package anfibio.inheritance;

// Clase que representa un Carro que es un VehículoTerrestre
public class Carro extends VehiculoTerrestre {

    private String matricula;

    // constructor
    public Carro(String matricula, int numeroDeRuedas) {
        super(numeroDeRuedas);
        this.matricula = matricula;
    }

    // getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // calcular velocidad, invocando el método del padre VehiculoTerrestre
    public float getVelocidad() {
        return super.getVelocidad();
    }

}
