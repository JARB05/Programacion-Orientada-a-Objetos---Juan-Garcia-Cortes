package edu.juan.garcia.reto9.process;

import java.io.InputStream;
import java.text.Normalizer;
import java.util.*;

/**
 * Clase que proporciona métodos para analizar un libro y contar las palabras más usadas.
 */
public class BookAnalyzer {

    /**
     * Cuenta las palabras más usadas en un libro.
     * @param fileName Nombre del archivo del libro.
     * @return Una lista de pares (palabra, frecuencia) ordenada por frecuencia descendente.
     * @throws IllegalArgumentException Si el archivo no se encuentra.
     */
    public static List<Map.Entry<String, Integer>> countWords(String fileName) {
        Map<String, Integer> wordCount = new HashMap<>();

        try {
            InputStream inputStream = BookAnalyzer.class.getClassLoader().getResourceAsStream
                    ("edu/juan/garcia/reto9/resources/" + fileName);
            if (inputStream != null) {
                Scanner fileScanner = new Scanner(inputStream);
                while (fileScanner.hasNext()) {
                    String word = fileScanner.next().toLowerCase();
                    word = Normalizer.normalize(word, Normalizer.Form.NFD).replaceAll
                            ("[^\\p{ASCII}]", ""); // Eliminar acentos
                    word = word.replaceAll("[^a-zA-Z]", ""); // Eliminar caracteres no alfabéticos
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
                fileScanner.close();
            } else {
                throw new IllegalArgumentException("Archivo no encontrado");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sortWords(wordCount);
    }

    /**
     * Ordena las palabras según su frecuencia de uso.
     * @param wordCount Mapa de palabras y sus frecuencias.
     * @return Una lista de pares (palabra, frecuencia) ordenada por frecuencia descendente.
     */
    private static List<Map.Entry<String, Integer>> sortWords(Map<String, Integer> wordCount) {
        List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCount.entrySet());
        wordList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        return wordList;
    }
}