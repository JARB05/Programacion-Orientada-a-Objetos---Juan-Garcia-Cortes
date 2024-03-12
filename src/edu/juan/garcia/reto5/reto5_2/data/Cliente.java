package edu.juan.garcia.reto5.reto5_2.data;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nombre;
    private int edad;
    private List<CuentaBancaria> cuentasBancarias;

    public Cliente(int idCliente, String nombre, int edad) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.edad = edad;
        this.cuentasBancarias = new ArrayList<>();
    }

    public void agregarCuentaBancaria(CuentaBancaria cuenta){
        cuentasBancarias.add(cuenta);
    }

    public void eliminarCuentaBancaria(CuentaBancaria cuenta){
        cuentasBancarias.remove(cuenta);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<CuentaBancaria> getCuentasBancarias() {
        return cuentasBancarias;
    }
}
