package edu.juan.garcia.evidencia1.process;

import edu.juan.garcia.evidencia1.data.Medicamento;
import java.util.ArrayList;
import java.util.Date;

/**
 * La clase RegistroMedicamentos contiene métodos para agregar medicamentos y generar reportes.
 */
public class RegistroMedicamentos {

    /**
     * Agrega un nuevo medicamento a la lista de medicamentos (al ArrayList).
     * @param listaMedicamentos La lista de medicamentos a la que se agregará el medicamento.
     * @param nombreQuimico El nombre químico del medicamento.
     * @param nombreGenerico El nombre genérico del medicamento.
     * @param nombreRegistrado El nombre registrado del medicamento.
     * @param precioPublico El precio público del medicamento.
     * @param formaFarmaceutica La forma farmacéutica del medicamento.
     */
    public void agregarMedicamento(ArrayList<Medicamento> listaMedicamentos, String nombreQuimico,
                                   String nombreGenerico, String nombreRegistrado,
                                   double precioPublico, String formaFarmaceutica) {
        double precioVenta = precioPublico;
        switch (formaFarmaceutica){
            case "solido":
                precioVenta *= 1.09;
                break;
            case "semisolido":
                precioVenta *= 1.12;
                break;
            case "liquido":
                precioVenta *= 1.13;
                break;
            default:
                System.out.println("Forma farmacéutica desconocida. No se aplicará descuento al precio de venta.");
        }

        Medicamento medicamento = new Medicamento(nombreQuimico, nombreGenerico,
                nombreRegistrado, precioPublico, precioVenta, formaFarmaceutica);
        listaMedicamentos.add(medicamento);
        }

    /**
     * Genera un reporte de los medicamentos en la lista.
     * @param usuario El usuario que solicita el reporte.
     * @param listaMedicamentos La lista de medicamentos para generar el reporte.
     */
    public void generarReporte(String usuario, ArrayList<Medicamento> listaMedicamentos){
        Date fecha = new Date();
        int cantidadMedicamentos = listaMedicamentos.size();

        System.out.println("Reporte generado por: " + usuario);
        System.out.println("Fecha de generación: " +fecha);
        System.out.println("Cantidad de medicamentos en la lista: " +cantidadMedicamentos);
        System.out.println("Desglose de medicamentos: ");

        for (Medicamento medicamento : listaMedicamentos) {
            System.out.println(medicamento.toString());
        }
    }
}