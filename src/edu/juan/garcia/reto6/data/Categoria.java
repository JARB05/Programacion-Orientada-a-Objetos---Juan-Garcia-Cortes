package edu.juan.garcia.reto6.data;

/**
 * Clase que representa las categorías existentes en la empresa.
 */
public class Categoria {

    private String nombre; // Nombre de la categoría
    private String clave; // Abreviatura de la categoría (EV, ADM, GER)
    private double sueldoBase; // Sueldo base de la categoría
    private double pagoHoraExtra; // Pago por horas extra de la categoría

    /**
     * Constructor de la clase Categoria.
     * @param nombre Nombre de la categoría.
     * @param clave Abreviatura de la categoría.
     * @param sueldoBase Sueldo base de la categoría.
     * @param pagoHoraExtra Pago por horas extra de la categoría.
     */
    public Categoria(String nombre, String clave, double sueldoBase, double pagoHoraExtra) {
        this.nombre = nombre;
        this.clave = clave;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
    }

    /**
     * Obtiene el nombre de la categoría.
     * @return El nombre de la categoría.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la clave de la categoría.
     * @return La clave de la categoría.
     */
    public String getClave() {
        return clave;
    }

    /**
     * Obtiene el sueldo base de la categoría.
     * @return El sueldo base de la categoría.
     */
    public double getSueldoBase() {
        return sueldoBase;
    }

    /**
     * Obtiene el pago por horas extra de la categoría.
     * @return El pago por horas extra de la categoría.
     */
    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }
}