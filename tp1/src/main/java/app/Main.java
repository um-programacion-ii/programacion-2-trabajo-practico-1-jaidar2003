package app;

import java.util.ArrayList;
import vehiculo.Vehiculo;
import vehiculo.Camion;
import vehiculo.Auto;
import vehiculo.VehiculoPrinter;

public class Main {
    public static void main(String[] args) {
        // Crear la lista de vehículos
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        // Crear vehículos y agregarlos a la lista
        Vehiculo v1 = new Vehiculo("AG868AL", "Audi", 2024, 1200);
        Vehiculo v2 = new Vehiculo("AE502AL", "Ford", 2021, 900);
        Vehiculo v3 = new Vehiculo("AB756GR", "JEEP", 2018, 1100);
        Camion camion1 = new Camion("ZK123OP", "Mercedes", 2020, 1500, true);
        Auto auto1 = new Auto("AX123YT", "Toyota", 2022, 1000, 5);  // Nuevo Auto con 5 pasajeros

        // Agregar vehículos a la lista
        vehiculos.add(v1);
        vehiculos.add(v2);
        vehiculos.add(v3);
        vehiculos.add(camion1);
        vehiculos.add(auto1);

        // Crear el objeto VehiculoPrinter
        VehiculoPrinter printer = new VehiculoPrinter();

        // Recorrer la lista de vehículos e imprimir la información
        for (Vehiculo vehiculo : vehiculos) {
            printer.imprimir(vehiculo);
            System.out.println("------------------");
        }

        // Opcional: Buscar por patente
        String patenteBuscada = "AE502AL";  // Cambia la patente según lo que quieras buscar
        Vehiculo vehiculoEncontrado = buscarPorPatente(vehiculos, patenteBuscada);
        if (vehiculoEncontrado != null) {
            System.out.println("\nVehículo encontrado:");
            printer.imprimir(vehiculoEncontrado);
        } else {
            System.out.println("\nVehículo con patente " + patenteBuscada + " no encontrado.");
        }
    }

    // Método para buscar un vehículo por patente
    public static Vehiculo buscarPorPatente(ArrayList<Vehiculo> vehiculos, String patente) {
        for (Vehiculo v : vehiculos) {
            if (v.getPatente().equals(patente)) {
                return v;
            }
        }
        return null;  // Retorna null si no se encuentra el vehículo
    }
}
