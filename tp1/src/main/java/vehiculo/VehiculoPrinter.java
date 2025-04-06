package vehiculo;

public class VehiculoPrinter {
    public void imprimir(Vehiculo vehiculo) {
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Año: " + vehiculo.getAnio());
        System.out.println("Capacidad de carga: " + vehiculo.getCapacidadCargaKg() + " kg");
    }
}
