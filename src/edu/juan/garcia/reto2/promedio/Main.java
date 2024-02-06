package edu.juan.garcia.reto2.promedio;

import edu.juan.garcia.reto2.promedio.ui.CLI;

/**
 * Clase principal (Main) que inicia la ejecución del programa de control de compra y venta de cajas de papel.
 * Utiliza la interfaz de línea de comandos (CLI) para interactuar con el usuario y gestionar las operaciones.
 */
public class Main {
        public static void main(String[] args) {
            try {
                //Lanza la interfaz de línea de comandos para el programa de control de cajas de papel.
                CLI.launchApp();
            } catch (Exception e) {
                //Maneja cualquier error inesperado durante la ejecución.
                System.out.println("Error inesperado " + e);
            }
        }
}