package edu.juan.garcia.reto9.process;

import java.io.InputStream;
import java.text.Normalizer;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BookAnalyzer {

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

    public static long countVowels(List<String> words) {
        return words.stream().flatMapToInt(String::chars).filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

    public static Map<String, Long> wordsStartingWithVowelCountSorted(List<String> words) {
        return words.stream()
                .filter(word -> word.matches("^[aeiou].*"))
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
    }

    public static Map<String, Long> wordsWithOddLengthCount(List<String> words) {
        return words.stream()
                .filter(word -> word.length() % 2 != 0)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static Optional<String> findLongestWord(List<String> words) {
        return words.stream().max(Comparator.comparingInt(String::length));
    }

    public static Optional<String> findShortestWord(List<String> words) {
        return words.stream().min(Comparator.comparingInt(String::length));
    }

    public static Optional<String> findWordWithSpecificCondition(List<String> words) {
        return words.stream()
                .filter(word -> word.matches("^[aeiou].*[aeiou]$") && word.length() >= 5)
                .findFirst();
    }
}