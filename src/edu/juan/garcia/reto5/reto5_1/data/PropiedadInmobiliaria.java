package edu.juan.garcia.reto5.reto5_1.data;

public class PropiedadInmobiliaria {
    private int idPropiedad;
    private String direccion;
    private double precio;
    private boolean enVenta;
    private boolean enRenta;

    public PropiedadInmobiliaria(int idPropiedad, String direccion, double precio, boolean enVenta, boolean enRenta) {
        this.idPropiedad = idPropiedad;
        this.direccion = direccion;
        this.precio = precio;
        this.enVenta = enVenta;
        this.enRenta = enRenta;
    }

    public int getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(int idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEnVenta() {
        return enVenta;
    }

    public void setEnVenta(boolean enVenta) {
        this.enVenta = enVenta;
    }

    public boolean isEnRenta() {
        return enRenta;
    }

    public void setEnRenta(boolean enRenta) {
        this.enRenta = enRenta;
    }
}