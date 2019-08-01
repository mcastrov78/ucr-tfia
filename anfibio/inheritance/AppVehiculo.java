package anfibio.inheritance;

public class AppVehiculo {

    public static void main(String args[]) {
        Vehiculo1 vehiculo1 = new Vehiculo1("A1", 2);
        Vehiculo2 vehiculo2 = new Vehiculo2("T1", 4);

        System.out.println("Vehiculo1 Acuatico - Placa: " + vehiculo1.getPlaca() + ", Velocidad: " + vehiculo1.getVelocidad());
        System.out.println("Vehiculo1 Terrestre - Placa: " + vehiculo2.getPlaca() + ", Velocidad: " + vehiculo2.getVelocidad());

        System.exit(0);
    }
}
