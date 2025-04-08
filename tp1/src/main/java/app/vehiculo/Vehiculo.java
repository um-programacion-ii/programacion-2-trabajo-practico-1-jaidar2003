package vehiculo;

public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    // Constructor con validaciones
    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        if (patente == null || patente.isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula o vacía");
        }
        if (anio < 1900 || anio > 2025) {
            throw new IllegalArgumentException("El año debe ser mayor a 1900 y menor o igual al año actual");
        }
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser positiva");
        }

        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }
}