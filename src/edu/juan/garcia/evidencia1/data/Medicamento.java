package edu.juan.garcia.evidencia1.data;

public class Medicamento {
    private String nombreQuimico;
    private String nombreGenerico;
    private String nombreRegistrado;
    private double precioPublico;
    private double precioVenta;
    private String formaFarmaceutica;

    public Medicamento(String nombreQuimico, String nombreGenerico, String nombreRegistrado, double precioPublico, double precioVenta, String formaFarmaceutica) {
        this.nombreQuimico = nombreQuimico;
        this.nombreGenerico = nombreGenerico;
        this.nombreRegistrado = nombreRegistrado;
        this.precioPublico = precioPublico;
        this.precioVenta = precioVenta;
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public String getNombreQuimico() {
        return nombreQuimico;
    }

    public void setNombreQuimico(String nombreQuimico) {
        this.nombreQuimico = nombreQuimico;
    }

    public String getNombreGenerico() {
        return nombreGenerico;
    }

    public void setNombreGenerico(String nombreGenerico) {
        this.nombreGenerico = nombreGenerico;
    }

    public String getNombreRegistrado() {
        return nombreRegistrado;
    }

    public void setNombreRegistrado(String nombreRegistrado) {
        this.nombreRegistrado = nombreRegistrado;
    }

    public double getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(double precioPublico) {
        this.precioPublico = precioPublico;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }
}
