package edu.juan.garcia.reto4;

import edu.juan.garcia.reto4.ui.CLI;

/**
 * Clase principal que inicia la aplicación del sistema de registro de ventas.
 */
public class Main {

    /**
     * Método principal que inicia la aplicación.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        try{
            //Lanza la interfaz de línea de comandos para el programa de control de cajas de papel.
            CLI.launchApp();
        } catch (Exception e){
            //Maneja cualquier error inesperado durante la ejecución.
            System.out.println("Error inesperado " + e );
        }
    }
}
