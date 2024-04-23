package edu.juan.garcia.evidencia2.data;

/**
 * Clase abstracta que representa un producto en la aplicación TecmiFlix.
 * Un producto puede ser una canción, película, libro o videojuego.
 */

public abstract class Producto {

    /** Nombre del producto */
    protected String nombre;

    /** Tipo del producto (canción, película, libro, videojuego) */
    protected String tipo;

    /** Costo base del producto */
    protected double costoBase;

    /** Indica si el producto es un estreno */
    protected boolean esEstreno;

    /**
     * Constructor de la clase Producto.
     * @param nombre Nombre del producto.
     * @param tipo Tipo del producto (canción, película, libro, videojuego).
     * @param costoBase Costo base del producto.
     * @param esEstreno Indica si el producto es un estreno.
     */
    public Producto(String nombre, String tipo, double costoBase, boolean esEstreno) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.costoBase = costoBase;
        this.esEstreno = esEstreno;
    }

    /**
     * Método abstracto para calcular el costo del producto.
     * @return Costo del producto.
     */
    public abstract double calcularCosto();
}
//Como el sistema es el que genera la lista no es necesario agregar los Getter y Setter