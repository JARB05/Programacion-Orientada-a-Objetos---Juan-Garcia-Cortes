package edu.juan.garcia.reto6.data;

public class Categoria {

    private String nombre;
    private String clave; //Las claves son: EV, ADM, GER
    private double sueldoBase;
    private double pagoHoraExtra;

    public Categoria(String nombre, String clave, double sueldoBase, double pagoHoraExtra) {
        this.nombre = nombre;
        this.clave = clave;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }
}
