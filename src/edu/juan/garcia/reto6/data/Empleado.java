package edu.juan.garcia.reto6.data;

import java.util.Date;

public class Empleado {

    private String nombreCompleto;
    private int horasTrabajadas;
    private int horasExtras;
    private String telefono;
    private Date fechaNacimiento;
    private Categoria categoria;

    public Empleado(String nombreCompleto, int horasTrabajadas, int horasExtras, String telefono, Date fechaNacimiento, Categoria categoria) {
        this.nombreCompleto = nombreCompleto;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public String getTelefono() {
        return telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

}
