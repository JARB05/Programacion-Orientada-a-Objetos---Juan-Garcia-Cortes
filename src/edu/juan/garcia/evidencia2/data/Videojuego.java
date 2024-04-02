package edu.juan.garcia.evidencia2.data;

/**
 * Clase que representa un videojuego en la aplicación TecmiFlix.
 */
public class Videojuego extends Producto {

    /** Número de días que el usuario ha jugado al videojuego */
    private int diasJugados;

    /**
     * Constructor de la clase Videojuego.
     * @param nombre Nombre del videojuego.
     * @param costoBase Costo base del videojuego.
     * @param esEstreno Indica si el videojuego es un estreno.
     * @param diasJugados Número de días que el usuario ha jugado al videojuego.
     */
    public Videojuego(String nombre, double costoBase, boolean esEstreno, int diasJugados) {
        super(nombre, "Videojuego", costoBase, esEstreno);
        this.diasJugados = diasJugados;
    }

    /**
     * Calcula el costo total del videojuego, basado en el costo base y el número de días jugados.
     * @return Costo total del videojuego.
     */
    @Override
    public double calcularCosto() {
        return costoBase + (10 * diasJugados);
    }
}