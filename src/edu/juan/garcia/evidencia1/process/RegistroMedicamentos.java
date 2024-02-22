package edu.juan.garcia.evidencia1.process;

import edu.juan.garcia.evidencia1.data.Medicamento;
import java.util.ArrayList;
import java.util.Date;

public class RegistroMedicamentos {


    public void agregarMedicamento(ArrayList<Medicamento> listaMedicamentos, String nombreQuimico, String nombreGenerico, String nombreRegistrado, double precioPublico, String formaFarmaceutica) {
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

        Medicamento medicamento = new Medicamento(nombreQuimico, nombreGenerico, nombreRegistrado, precioPublico, precioVenta, formaFarmaceutica);
        listaMedicamentos.add(medicamento);
        }

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