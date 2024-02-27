package edu.juan.garcia.evidencia1.data;

/**
 * La clase Medicamento representa un medicamento con sus atributos.
 */
public class Medicamento {
    private String nombreQuimico;
    private String nombreGenerico;
    private String nombreRegistrado;
    private double precioPublico;
    private double precioVenta;
    private String formaFarmaceutica;

    /**
     * Constructor para crear un nuevo objeto Medicamento.
     * @param nombreQuimico El nombre químico del medicamento.
     * @param nombreGenerico El nombre genérico del medicamento.
     * @param nombreRegistrado El nombre registrado del medicamento.
     * @param precioPublico El precio público del medicamento.
     * @param precioVenta El precio de venta del medicamento.
     * @param formaFarmaceutica La forma farmacéutica del medicamento.
     */
    public Medicamento(String nombreQuimico, String nombreGenerico, String nombreRegistrado,
                       double precioPublico, double precioVenta, String formaFarmaceutica) {
        this.nombreQuimico = nombreQuimico;
        this.nombreGenerico = nombreGenerico;
        this.nombreRegistrado = nombreRegistrado;
        this.precioPublico = precioPublico;
        this.precioVenta = precioVenta;
        this.formaFarmaceutica = formaFarmaceutica;
    }

    /**
     * Devuelve una representación en cadena que incluye los atributos del medicamento
     * @return Una cadena que representa el objeto Medicamento.
     */
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

