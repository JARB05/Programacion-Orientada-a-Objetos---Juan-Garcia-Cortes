package edu.juan.garcia.reto9.ui;

import edu.juan.garcia.reto9.process.BookAnalyzer;
import java.util.*;

/**
 * Clase que proporciona la interfaz de línea de comandos (CLI) para la aplicación.
 */
public class CLI {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Muestra el menú para seleccionar el idioma.
     */
    public static void mostrarMenuIdiomas() {
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.println("║           Bienvenido al CLI           ║");
        System.out.println("╠═══════════════════════════════════════╣");
        System.out.println("║           Seleccione su idioma        ║");
        System.out.println("║           1- Español                  ║");
        System.out.println("║           2- English                  ║");
        System.out.println("╚═══════════════════════════════════════╝");
    }

    /**
     * Obtiene el idioma seleccionado por el usuario.
     *
     * @return El código del idioma seleccionado.
     * @throws IllegalArgumentException Si se ingresa una opción inválida.
     */
    private static String obtenerIdiomaSeleccionado() {
        int idioma;
        try {
            idioma = Integer.parseInt(scanner.nextLine());
            switch (idioma) {
                case 1:
                    return "ESP";
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
     * Obtiene el nombre del archivo del libro seleccionado por el usuario.
     *
     * @return El nombre del archivo del libro seleccionado.
     * @throws IllegalArgumentException Si se ingresa una opción inválida.
     */
    private static String obtenerNombreArchivo() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║           Seleccione su libro          ║");
        System.out.println("║           1- Blanca Nieves             ║");
        System.out.println("║           2- El Gato con Botas         ║");
        System.out.println("║           3- Los Tres Cerditos         ║");
        System.out.println("║           4- Pinocho                   ║");
        System.out.println("║           5- Ricitos de Oro            ║");
        System.out.println("╚════════════════════════════════════════╝");
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
     * Inicia la aplicación CLI, proporcionando una interfaz de usuario para interactuar con el análisis de libros.
     * Este método guía al usuario a través de la selección de idioma y la elección del libro a analizar.
     * Luego, muestra varias estadísticas sobre el libro seleccionado, como el número total de vocales,
     * las palabras que comienzan con vocal, las palabras con longitud impar, la palabra más larga,
     * la palabra más corta y una palabra que cumple con una condición específica.
     * Finalmente, muestra las 10 palabras más utilizadas en el libro.
     */
    public static void launchApp() {
        mostrarMenuIdiomas();
        String idioma = obtenerIdiomaSeleccionado();

        Idiomas.getInstance(idioma);

        System.out.println();
        System.out.println(Idiomas.MENU);

        String nombreArchivo = obtenerNombreArchivo();
        List<String> words = BookAnalyzer.getWordsFromFile(nombreArchivo);

        System.out.println(Idiomas.VOCALES_TOTALES + BookAnalyzer.countVowels(words));

        Map<String, Long> wordsStartingWithVowelCountSorted = BookAnalyzer.wordsStartingWithVowelCountSorted(words);
        System.out.println(Idiomas.PALABRAS_INICIAN_VOCAL + ":");
        wordsStartingWithVowelCountSorted.forEach((word, count) -> System.out.println(word + ": " + count));

        Map<String, Long> oddLengthWordsCount = BookAnalyzer.wordsWithOddLengthCount(words);
        System.out.println(Idiomas.PALABRAS_NUMERO_IMPAR_LETRAS + ":");
        oddLengthWordsCount.forEach((word, count) -> System.out.println(word + ": " + count));

        Optional<String> longestWord = BookAnalyzer.findLongestWord(words);
        longestWord.ifPresent(word -> System.out.println(Idiomas.PALABRA_MAS_LARGA + word));

        Optional<String> shortestWord = BookAnalyzer.findShortestWord(words);
        shortestWord.ifPresent(word -> System.out.println(Idiomas.PALABRA_MAS_CORTA + word));

        Optional<String> wordWithSpecificCondition = BookAnalyzer.findWordWithSpecificCondition(words);
        wordWithSpecificCondition.ifPresentOrElse(
                word -> System.out.println(Idiomas.PALABRA_ESPECIAL + word),
                () -> System.out.println(Idiomas.NO_HAY_PALABRAS)
        );

        Map<String, Long> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0L) + 1);
        }
        System.out.println(Idiomas.PALABRAS_MAS_USADAS);
        wordCounts.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(10)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}