package app;

import vehiculo.Vehiculo;
import vehiculo.Camion;
import vehiculo.Auto;  // Importamos la nueva clase Auto
import vehiculo.VehiculoPrinter;

public class Main {
    public static void main(String[] args) {
        // Instanciamos vehículos de tipo Vehiculo y Auto (subclase)
        Vehiculo v1 = new Vehiculo("AG868AL", "Audi", 2024, 1200);
        Vehiculo v2 = new Vehiculo("AE502AL", "Ford", 2021, 900);
        Vehiculo v3 = new Vehiculo("AB756GR", "JEEP", 2018, 1100);

        // Creamos un Camión y un Auto
        Camion camion1 = new Camion("ZK123OP", "Mercedes", 2020, 1500, true);
        Auto auto1 = new Auto("AX123YT", "Toyota", 2022, 1000, 5);  // Nuevo Auto con 5 pasajeros

        VehiculoPrinter printer = new VehiculoPrinter();

        // Imprimimos la información de los vehículos y camiones
        System.out.println("--- Vehículo 1 ---");
        printer.imprimir(v1);

        System.out.println("\n--- Vehículo 2 ---");
        printer.imprimir(v2);

        System.out.println("\n--- Vehículo 3 ---");
        printer.imprimir(v3);

        System.out.println("\n--- Camión 1 ---");
        printer.imprimir(camion1);

        System.out.println("\n--- Auto 1 ---");
        printer.imprimir(auto1);  // Imprimimos el Auto
    }
}
