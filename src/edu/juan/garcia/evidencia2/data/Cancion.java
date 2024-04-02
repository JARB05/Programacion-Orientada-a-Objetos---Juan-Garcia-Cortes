package edu.juan.garcia.evidencia2.data;

/**
 * Clase que representa una canción en la aplicación TecmiFlix.
 */

public class Cancion extends Producto {

    /** Número de reproducciones de la canción */
    private int numeroDeReproducciones;

    /**
     * Constructor de la clase Cancion.
     * @param nombre Nombre de la canción.
     * @param costoBase Costo base de la canción.
     * @param esEstreno Indica si la canción es un estreno.
     * @param numeroDeReproducciones Número de reproducciones de la canción.
     */
    public Cancion(String nombre, double costoBase, boolean esEstreno, int numeroDeReproducciones) {
        super(nombre, "Canción", costoBase, esEstreno);
        this.numeroDeReproducciones = numeroDeReproducciones;
    }

    /**
     * Calcula el costo de la canción, teniendo en cuenta el costo base y el número de reproducciones.
     * Si la canción es un estreno, se aplica un costo adicional mayor.
     * @return Costo total de la canción.
     */
    @Override
    public double calcularCosto() {
        double costoAdicional = esEstreno ? 1.5 : 0.5;
        return costoBase + (costoAdicional * numeroDeReproducciones);
    }
}