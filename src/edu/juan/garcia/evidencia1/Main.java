package edu.juan.garcia.evidencia1;

import edu.juan.garcia.evidencia1.data.Medicamento;
import edu.juan.garcia.evidencia1.ui.CLI;
import java.util.ArrayList;


/**
 * La clase Main contiene el método principal para iniciar la aplicación de registro de medicamentos.
 */
public class Main {

    /**
     * El método principal que inicia la aplicación de registro de medicamentos.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();
        try {
            //Lanza la interfaz de línea de comandos para el programa de registro de medicamentos
            CLI.launchApp(listaMedicamentos);
        } catch (Exception e) {
            //Maneja cualquier error inesperado durante la ejecución.
            System.out.println("Error inesperado " + e);
        }
    }
}
