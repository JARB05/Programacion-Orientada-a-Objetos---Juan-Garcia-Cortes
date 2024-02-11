package edu.juan.garcia.reto3.diccionario;
import edu.juan.garcia.reto3.diccionario.process.Dictionary;
import edu.juan.garcia.reto3.diccionario.ui.CLI;

public class Main {

    /**
     * Clase principal que inicia la aplicación del diccionario.
     */
    public static void main(String[] args) {
        String[] palabras = {"Aleación", "Actuador", "Amperio", "Batería", "Corrosión", "Electricidad",
                "Electroimán", "Generador", "GPS", "Hardware"};
        String[] significados = {"Mezcla de dos o más metales",
                "Dispositivo que convierte una señal de control en movimiento",
                "Unidad de medida de la intensidad de corriente eléctrica",
                "Dispositivo que almacena energía",
                "Degradación de un material por reacción química con su entorno",
                "Flujo de electrones",
                "Imán creado por un campo eléctrico",
                "Dispositivo que convierte energía mecánica en energía eléctrica",
                "Sistema de posicionamiento global",
                "Componentes físicos de un sistema informático"};
        Dictionary dictionary = new Dictionary(palabras,significados);
        try {
            //Lanza la interfaz de línea de comandos.
            CLI.launchApp(dictionary);
        } catch (Exception e) {
            //Maneja cualquier error inesperado durante la ejecución.
            System.out.println("Error inesperado " + e);
        }
    }
}
