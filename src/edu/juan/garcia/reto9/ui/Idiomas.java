package edu.juan.garcia.reto9.ui;

/**
 * Clase que proporciona los textos de los menús y mensajes en diferentes idiomas.
 */
public class Idiomas {

    public static String MENU;
    public static String MENU_IDIOMA;
    public static String SELECCION_IDIOMA;
    public static String LIBROS_DISPONIBLES;
    public static String OPCION_ELEGIDA;
    public static String OPCION_INVALIDA;
    public static String ARCHIVO_NO_ENCONTRADO;
    public static String ERROR_INESPERADO;
    public static String VOCALES_TOTALES;
    public static String PALABRAS_INICIAN_VOCAL;
    public static String PALABRAS_NUMERO_IMPAR_LETRAS;
    public static String PALABRA_MAS_LARGA;
    public static String PALABRA_MAS_CORTA;
    public static String PALABRA_ESPECIAL;
    public static String PALABRAS_MAS_USADAS;
    public static String NO_HAY_PALABRAS;
    public static String CUMPLAN_CONDICION;
    public static String SON;
    public static String ES;

    /**
     * Obtiene una instancia de la clase `Idiomas` basada en el idioma proporcionado.
     *
     * @param idioma El idioma seleccionado, puede ser "ESP" para español o "ENG" para inglés.
     * @throws IllegalArgumentException Si el idioma proporcionado no es válido.
     */
    public static void getInstance(String idioma) {
        Textos opcion = Textos.valueOf(idioma);
        switch (opcion) {
            case ESP:
                MENU = "--------------Menú--------------";
                MENU_IDIOMA = "------------------Idioma------------------";
                SELECCION_IDIOMA = "Escoja un idioma:";
                LIBROS_DISPONIBLES = "Libros disponibles:";
                OPCION_ELEGIDA = "Opción elegida:";
                OPCION_INVALIDA = "Opción inválida";
                ARCHIVO_NO_ENCONTRADO = "Archivo no encontrado.";
                ERROR_INESPERADO = "Error inesperado ";
                VOCALES_TOTALES = "\nEl número total de vocales en el libro: ";
                PALABRAS_INICIAN_VOCAL = "\nLas palabras que inician con vocal en el libro: ";
                PALABRAS_NUMERO_IMPAR_LETRAS = "\nLas palabras con un número impar de letras en el libro: ";
                PALABRA_MAS_LARGA = "\nLa palabra más larga del libro: ";
                PALABRA_MAS_CORTA = "\nLa palabra más corta del libro: ";
                PALABRA_ESPECIAL = "\nLas palabras que empiecen y terminen con vocal; " +
                        "y además tengan al menos 5 letras, en el libro: ";
                PALABRAS_MAS_USADAS = "Las 10 palabras más utilizadas en el libro: ";
                NO_HAY_PALABRAS = "\nNo se han encontrado palabras dentro del libro: ";
                CUMPLAN_CONDICION = "que cumplan con esta condición";
                SON = " son: ";
                ES = " es: ";
                break;
            case ENG:
                MENU = "--------------Menu--------------";
                MENU_IDIOMA = "------------------Language------------------";
                SELECCION_IDIOMA = "Choose a language:";
                LIBROS_DISPONIBLES = "Books available:";
                OPCION_ELEGIDA = "Selected option:";
                OPCION_INVALIDA = "Invalid option";
                ARCHIVO_NO_ENCONTRADO = "File not found.";
                ERROR_INESPERADO = "Unexpected error ";
                VOCALES_TOTALES = "\nThe total number of vowels in the book: ";
                PALABRAS_INICIAN_VOCAL = "\nThe words that start with a vowel in the book: ";
                PALABRAS_NUMERO_IMPAR_LETRAS = "\nThe words with an odd number of letters in the book: ";
                PALABRA_MAS_LARGA = "\nThe longest word in the book: ";
                PALABRA_MAS_CORTA = "\nThe shortest word in the book: ";
                PALABRA_ESPECIAL = "\nThe words that begin and end with a vowel; " +
                        "and also have at least 5 letters in the book: ";
                PALABRAS_MAS_USADAS = "The 10 most used words in the book: ";
                NO_HAY_PALABRAS = "\nNo words found within the book: ";
                CUMPLAN_CONDICION = "that meet this condition";
                SON = " are: ";
                ES = " is: ";
                break;
            default:
                throw new IllegalArgumentException("Idioma no disponible");
        }
    }

    /**
     * Enumeración que representa los diferentes textos disponibles en idiomas.
     */
    enum Textos {
        ESP, ENG
    }
}