package edu.juan.garcia.evidencia2;

import edu.juan.garcia.evidencia2.ui.CLI;

/**
 * La clase Main contiene el método principal para iniciar la aplicación.
 */
public class Main {

    /**
     * El método principal que inicia la aplicación de registro de medicamentos.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {

        try {
            //Lanza la interfaz de línea de comandos para el programa
            CLI.launchApp();
        } catch (Exception e) {
            //Maneja cualquier error inesperado durante la ejecución.
            System.out.println("Error inesperado " + e);
        }
    }
}