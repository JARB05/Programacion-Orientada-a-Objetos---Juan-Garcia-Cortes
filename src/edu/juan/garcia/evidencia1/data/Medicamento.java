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

    //Esto lo puedes cambiar por si no te gusta como se muestra el desglose de medicamentos.
    @Override
    public String toString() {
        return "Nombre químico: " + nombreQuimico +
                ", Nombre genérico: " + nombreGenerico +
                ", Nombre registrado: " + nombreRegistrado +
                ", Precio al público: " + precioPublico +
                ", Precio de venta: " + precioVenta +
                ", Forma farmacéutica: " + formaFarmaceutica;
    }
}

