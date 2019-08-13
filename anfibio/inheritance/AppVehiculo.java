package anfibio.inheritance;

// Clase crea y usa vehículos definidos por Herencia
public class AppVehiculo {

    public static void main(String args[]) {
        // un carro es un Vehículo Terrestre y un bote es un Vehículo Acuático
        // esto se define en tiempo de COMPILACIÓN y NO puede ser variado de forma dinámica en EJECUCIÓN
        VehiculoTerrestre carro = new VehiculoTerrestre("C1", 4);
        VehiculoAcuatico bote = new VehiculoAcuatico("B1", 2);

        System.out.println("Carro - Matrícula: " + carro.getMatricula() +
                ", Medio: " + carro.getMedio() + ", Velocidad: " + carro.getVelocidad());
        System.out.println("Bote - Matrícula: " + bote.getMatricula() +
                ", Medio: " + bote.getMedio() + ", Velocidad: " + bote.getVelocidad());

        System.exit(0);
    }
}
