package edu.juan.garcia.evidencia1;

import edu.juan.garcia.evidencia1.data.Medicamento;
import edu.juan.garcia.evidencia1.ui.CLI;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();
        try {
            //Lanza la interfaz de línea de comandos para el programa de control de cajas de papel.
            CLI.launchApp(listaMedicamentos);
        } catch (Exception e) {
            //Maneja cualquier error inesperado durante la ejecución.
            System.out.println("Error inesperado " + e);
        }
    }
}
