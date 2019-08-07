package anfibio.composition;

/**
 * Clase crea y usa vehículos definidos por medio de Interfaces y Composicion/Delegación
 *
 * TAREA: Agregar el código necesario para que VehiculoAnfibio pueda también VOLAR
 */
public class AppVehiculo {

    public static void main(String args[]) {
        // un Vehículo Anfibio puede ser Terrestre o Acuático
        // esto se define en tiempo de EJECUCIÓN y SÍ puede ser variado de forma dinámica en EJECUCIÓN
        VehiculoAnfibio vehiculoAnfibio1 = new VehiculoAnfibio("VA1", new VehiculoTerrestre(4));
        VehiculoAnfibio vehiculoAnfibio2 = new VehiculoAnfibio("VA2", new VehiculoAcuatico(2));

        System.out.println("Vehiculo Anfibio 1 - Matrícula: " + vehiculoAnfibio1.getMatricula() +
                ", Medio: " + vehiculoAnfibio1.getMedio() + ", Velocidad: " + vehiculoAnfibio1.getVelocidad());

        System.out.println("Vehiculo Anfibio 2 - Matrícula: " + vehiculoAnfibio2.getMatricula() +
                ", Medio: " + vehiculoAnfibio2.getMedio() + ", Velocidad: " + vehiculoAnfibio2.getVelocidad());

        vehiculoAnfibio1.convertirA(new VehiculoAcuatico(2));
        System.out.println("Vehículo Anfibio 1 CONVERTIDO - Matrícula: " + vehiculoAnfibio1.getMatricula() +
                ", Medio: " + vehiculoAnfibio1.getMedio() + ", Velocidad: " + vehiculoAnfibio1.getVelocidad());

        vehiculoAnfibio2.convertirA(new VehiculoTerrestre(4));
        System.out.println("Vehículo Anfibio 2 CONVERTIDO - Matrícula: " + vehiculoAnfibio2.getMatricula() +
                ", Medio: " + vehiculoAnfibio2.getMedio() + ", Velocidad: " + vehiculoAnfibio2.getVelocidad());

        System.exit(0);
    }
}
