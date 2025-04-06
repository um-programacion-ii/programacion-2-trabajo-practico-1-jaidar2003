package vehiculo;

import vehiculo.Vehiculo;
/**
 * Clase base Vehiculo para representar vehículos genéricos.
 */
public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    /**
     * Constructor con validaciones.
     * @param patente Patente del vehículo
     * @param marca Marca del vehículo
     * @param anio Año de fabricación
     * @param capacidadCargaKg Capacidad de carga en kilogramos
     */
    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser vacía.");
        }
        if (anio < 1900 || anio > java.time.Year.now().getValue()) {
            throw new IllegalArgumentException("El año debe estar entre 1900 y el actual.");
        }
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser positiva.");
        }

        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        this.capacidadCargaKg = capacidadCargaKg;
    }

    /**
     * Método que imprime la información del vehículo.
     */
    public void mostrarInformacion() {
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anio);
        System.out.println("Capacidad de carga: " + capacidadCargaKg + " kg");
    }
}
