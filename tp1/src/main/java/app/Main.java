package app;

import vehiculo.Vehiculo;
import vehiculo.VehiculoPrinter;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("AG868AL", "Audi", 2024, 1200);
        Vehiculo v2 = new Vehiculo("AE502AL", "Ford", 2021, 900);
        Vehiculo v3 = new Vehiculo("AB756GR", "JEEP", 2018, 1100);

        VehiculoPrinter printer = new VehiculoPrinter();

        System.out.println("--- Vehículo 1 ---");
        printer.imprimir(v1);

        System.out.println("\n--- Vehículo 2 ---");
        printer.imprimir(v2);

        System.out.println("\n--- Vehículo 3 ---");
        printer.imprimir(v3);
    }
}
