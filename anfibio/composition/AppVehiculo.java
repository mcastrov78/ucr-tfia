package anfibio.composition;

public class AppVehiculo {

    public static void main(String args[]) {
        Vehiculo vehiculo1 = new Vehiculo("A1", new VehiculoAcuatico(2));
        Vehiculo vehiculo2 = new Vehiculo("T1", new VehiculoTerrestre(4));

        System.out.println("Vehiculo1 1 - Placa: " + vehiculo1.getPlaca() + ", Velocidad: " + vehiculo1.getVelocidad());
        System.out.println("Vehiculo1 2 - Placa: " + vehiculo2.getPlaca() + ", Velocidad: " + vehiculo2.getVelocidad());

        vehiculo1.convertirA(new VehiculoTerrestre(4));
        System.out.println("Vehículo1 convertido - Placa: " + vehiculo1.getPlaca() + ", Velocidad: " + vehiculo1.getVelocidad());

        System.exit(0);
    }
}
