package edu.juan.garcia.reto9.ui;

import edu.juan.garcia.reto9.process.BookAnalyzer;

import java.util.*;

/**
 * Clase que representa la interfaz de línea de comandos (CLI) para interactuar con el programa de análisis de libros.
 */
public class CLI {

    /** Objeto Scanner para la entrada del usuario */
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Muestra el menú de selección de idiomas.
     */
    public static void mostrarMenuIdiomas() {
        System.out.println("------------------Idioma------------------");
        System.out.println("Escoja un idioma:");
        System.out.println("1- Español");
        System.out.println("2- English");
        System.out.println("-------------------------------------------");
    }

    /**
     * Obtiene el idioma seleccionado por el usuario.
     * @return El código de idioma seleccionado (ES para español, ENG para inglés).
     * @throws IllegalArgumentException Si el idioma seleccionado no es válido.
     */
    private static String obtenerIdiomaSeleccionado() {
        int idioma;
        try {
            idioma = Integer.parseInt(scanner.nextLine());
            switch (idioma) {
                case 1:
                    return "ES";
                case 2:
                    return "ENG";
                default:
                    throw new IllegalArgumentException("Idioma no disponible");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Opción inválida");
        }
    }

    /**
     * Obtiene el nombre del archivo de libro seleccionado por el usuario.
     * @return El nombre del archivo del libro seleccionado.
     * @throws IllegalArgumentException Si la opción seleccionada no es válida.
     */
    private static String obtenerNombreArchivo() {
        int libro;
        try {
            libro = Integer.parseInt(scanner.nextLine());
            switch (libro) {
                case 1:
                    return "blanca_nieves.txt";
                case 2:
                    return "el_gato_con_botas.txt";
                case 3:
                    return "los_tres_cerditos.txt";
                case 4:
                    return "pinocho.txt";
                case 5:
                    return "ricitos_de_oro.txt";
                default:
                    throw new IllegalArgumentException("Opción inválida");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Opción inválida");
        }
    }

    /**
     * Método principal para iniciar la aplicación.
     */
    public static void launchApp() {

        mostrarMenuIdiomas();
        String idioma = obtenerIdiomaSeleccionado();
        Idiomas idiomas = Idiomas.getInstance(idioma);

        System.out.println();

        System.out.println(idiomas.getMENU());
        String nombreArchivo = obtenerNombreArchivo();
        List<Map.Entry<String, Integer>> listaPalabras = BookAnalyzer.countWords(nombreArchivo);

        System.out.println();

        System.out.println(idiomas.getPALABRAS_MAS_USADAS() + nombreArchivo + " " + idiomas.getSON());
        for (int i = 0; i < 10 && i < listaPalabras.size(); i++) {
            System.out.println((i + 1) + ". " + listaPalabras.get(i).getKey() + ": "
                    + listaPalabras.get(i).getValue());
        }
    }
}