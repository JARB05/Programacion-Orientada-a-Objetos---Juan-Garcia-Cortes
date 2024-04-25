package edu.juan.garcia.reto9.process;

import java.io.InputStream;
import java.text.Normalizer;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Clase que proporciona funcionalidades para el análisis de libros.
 */
public class BookAnalyzer {

    /**
     * Lee las palabras de un archivo.
     *
     * @param fileName Nombre del archivo a leer.
     * @return Lista de palabras encontradas en el archivo.
     * @throws IllegalArgumentException Si el archivo no se encuentra.
     */
    public static List<String> getWordsFromFile(String fileName) {
        List<String> words = new ArrayList<>();
        try (InputStream inputStream = BookAnalyzer.class.getClassLoader().getResourceAsStream("edu/juan/garcia/reto9/resources/" + fileName)) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Archivo no encontrado");
            }
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNext()) {
                String word = Normalizer.normalize(scanner.next().toLowerCase(), Normalizer.Form.NFD)
                        .replaceAll("[^\\p{ASCII}]", "")
                        .replaceAll("[^a-zA-Z]", "");
                if (!word.isEmpty()) {
                    words.add(word);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return words;
    }

    /**
     * Cuenta el número total de vocales en una lista de palabras.
     *
     * @param words Lista de palabras.
     * @return Número total de vocales.
     */
    public static long countVowels(List<String> words) {
        return words.stream().flatMapToInt(String::chars).filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

    /**
     * Cuenta y ordena las palabras que empiezan con vocal en una lista de palabras.
     *
     * @param words Lista de palabras.
     * @return Mapa que contiene las palabras que empiezan con vocal y su frecuencia.
     */
    public static Map<String, Long> wordsStartingWithVowelCountSorted(List<String> words) {
        return words.stream()
                .filter(word -> word.matches("^[aeiou].*"))
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
    }

    /**
     * Cuenta las palabras con longitud impar en una lista de palabras.
     *
     * @param words Lista de palabras.
     * @return Mapa que contiene las palabras con longitud impar y su frecuencia.
     */
    public static Map<String, Long> wordsWithOddLengthCount(List<String> words) {
        return words.stream()
                .filter(word -> word.length() % 2 != 0)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    /**
     * Encuentra la palabra más larga en una lista de palabras.
     *
     * @param words Lista de palabras.
     * @return La palabra más larga.
     */
    public static Optional<String> findLongestWord(List<String> words) {
        return words.stream().max(Comparator.comparingInt(String::length));
    }

    /**
     * Encuentra la palabra más corta en una lista de palabras.
     *
     * @param words Lista de palabras.
     * @return La palabra más corta.
     */
    public static Optional<String> findShortestWord(List<String> words) {
        return words.stream().min(Comparator.comparingInt(String::length));
    }

    /**
     * Encuentra la primera palabra que cumple con una condición específica en una lista de palabras.
     *
     * @param words Lista de palabras.
     * @return La primera palabra que cumple con la condición especificada.
     */
    public static Optional<String> findWordWithSpecificCondition(List<String> words) {
        return words.stream()
                .filter(word -> word.matches("^[aeiou].*[aeiou]$") && word.length() >= 5)
                .findFirst();
    }
}