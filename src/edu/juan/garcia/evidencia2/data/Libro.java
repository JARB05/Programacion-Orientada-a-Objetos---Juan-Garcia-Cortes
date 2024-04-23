package edu.juan.garcia.evidencia2.data;

/**
 * Clase que representa un libro en la aplicación TecmiFlix.
 */
public class Libro extends Producto {
    /** Número de días que el usuario ha leído el libro */
    private int diasLeidos;

    /** Género del libro */
    private String genero;

    /**
     * Constructor de la clase Libro.
     * @param nombre Nombre del libro.
     * @param costoBase Costo base del libro.
     * @param esEstreno Indica si el libro es un estreno.
     * @param diasLeidos Número de días que el usuario ha leído el libro.
     * @param genero Género del libro (puede ser "novela", "tecnología" u otro género).
     */
    public Libro(String nombre, double costoBase, boolean esEstreno, int diasLeidos, String genero) {
        super(nombre, "Libro", costoBase, esEstreno);
        this.diasLeidos = diasLeidos;
        this.genero = genero;
    }

    /**
     * Calcula el costo total del libro, basado en el costo base, el número de días leídos
     * y el género del libro. También se tiene en cuenta si el libro es un estreno.
     * @return Costo total del libro.
     */
    @Override
    public double calcularCosto() {
        double costoAdicional = 1;
        switch (genero) {
            case "novela":
                costoAdicional += 1;
                break;
            case "tecnología":
                costoAdicional += 2;
                break;
            default:
                costoAdicional += 0.5;
        }
        costoAdicional += esEstreno ? 0.5 : 0;
        return costoBase + (costoAdicional * diasLeidos);
    }
}