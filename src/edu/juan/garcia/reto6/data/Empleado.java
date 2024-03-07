package edu.juan.garcia.reto6.data;

import java.util.Date;

/**
 * Clase que representa a un Empleado de la empresa.
 */
public class Empleado {

    private String nombreCompleto;
    private int horasTrabajadas;
    private int horasExtras;
    private String telefono;
    private Date fechaNacimiento;
    private Categoria categoria;

    /**
     * Constructor de la Clase Empleado.
     * @param nombreCompleto Nombre completo del empleado.
     * @param horasTrabajadas Horas trabajadas del empleado.
     * @param horasExtras Horas extras trabajadas del empleado.
     * @param telefono Teléfono del empleado.
     * @param fechaNacimiento Fecha de nacimiento del empleado.
     * @param categoria Categoría del empleado (empleado ventas, administrador y gerente).
     */
    public Empleado(String nombreCompleto, int horasTrabajadas, int horasExtras, String telefono, Date fechaNacimiento, Categoria categoria) {
        this.nombreCompleto = nombreCompleto;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
    }

    /**
     * Obtiene el nombre completo del empleado.
     * @return El nombre completo del empleado.
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Obtiene las horas trabajadas del empleado.
     * @return Las horas trabajadas del empleado.
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * Obtiene las horas extras trabajadas del empleado.
     * @return Las horas extras trabajadas del empleado.
     */
    public int getHorasExtras() {
        return horasExtras;
    }

    /**
     * Obtiene el teléfono del empleado.
     * @return El teléfono del empleado.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Obtiene la fecha de nacimiento del empleado.
     * @return La fecha de nacimiento del empleado.
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Obtiene la categoría del empleado.
     * @return La categoría del empleado.
     */
    public Categoria getCategoria() {
        return categoria;
    }

}