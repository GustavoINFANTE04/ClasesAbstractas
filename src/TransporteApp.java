public class TransporteApp {
    public static void main(String[] args) {

        Vehiculo miVehiculo = new Auto("Toyota", "Corolla");
        miVehiculo.encender();
        miVehiculo.acelerar(60);
        miVehiculo.apagar();

        System.out.println();

        miVehiculo = new Moto("Yamaha", "R3");
        miVehiculo.encender();
        miVehiculo.acelerar(80);
        miVehiculo.apagar();
    }
}

