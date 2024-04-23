package edu.juan.garcia.evidencia2.data;

/**
 * Clase que representa una película en la aplicación TecmiFlix.
 */
public class Pelicula extends Producto {

    /**
     * Constructor de la clase Pelicula.
     * @param nombre Nombre de la película.
     * @param costoBase Costo base de la película.
     * @param esEstreno Indica si la película es un estreno.
     */
    public Pelicula(String nombre, double costoBase, boolean esEstreno) {
        super(nombre, "Película", costoBase, esEstreno);
    }

    /**
     * Calcula el costo total de la película, basado en el costo base y si es un estreno o no.
     * @return Costo total de la película.
     */
    @Override
    public double calcularCosto() {
        return esEstreno ? 15 : 7;
    }
}