package edu.juan.garcia.reto5.reto5_4.data;

public class Contacto {
    private String nombre;
    private String direccion;
    private String telefonoCasa;
    private String telefonoTrabajo;

    public Contacto(String nombre, String direccion, String telefonoCasa, String telefonoTrabajo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefonoCasa = telefonoCasa;
        this.telefonoTrabajo = telefonoTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    public void setTelefonoCasa(String telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }

    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }
}
