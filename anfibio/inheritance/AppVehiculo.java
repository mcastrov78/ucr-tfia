package anfibio.inheritance;

// Clase crea y usa vehículos definidos por Herencia
public class AppVehiculo {

    public static void main(String args[]) {
        // un Carro es un Vehículo Terrestre y un Bote es un Vehículo Acuático
        // esto se define en tiempo de COMPILACIÓN y NO puede ser variado de forma dinámica en EJECUCIÓN
        Carro carro = new Carro("C1", 4);
        Bote bote = new Bote("B1", 2);

        System.out.println("Carro - Matrícula: " + carro.getMatricula() +
                ", Medio: " + carro.getMedio() + ", Velocidad: " + carro.getVelocidad());
        System.out.println("Bote - Matrícula: " + bote.getMatricula() +
                ", Medio: " + bote.getMedio() + ", Velocidad: " + bote.getVelocidad());

        System.exit(0);
    }
}
