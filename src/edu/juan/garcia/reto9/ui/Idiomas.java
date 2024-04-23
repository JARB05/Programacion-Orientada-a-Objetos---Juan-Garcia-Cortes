package edu.juan.garcia.reto9.ui;

/**
 * Clase que proporciona los textos de los menús y mensajes en diferentes idiomas.
 */
public class Idiomas {

    /** Texto del menú principal */
    private String MENU;

    /** Texto para indicar las palabras más usadas */
    private String PALABRAS_MAS_USADAS;

    /** Texto para indicar que son las palabras más usadas */
    private String SON;

    /**
     * Constructor de la clase Idiomas.
     * @param MENU Texto del menú principal.
     * @param PALABRAS_MAS_USADAS Texto para indicar las palabras más usadas.
     * @param SON Texto para indicar que son las palabras más usadas.
     */
    public Idiomas(String MENU, String PALABRAS_MAS_USADAS, String SON) {
        this.MENU = MENU;
        this.PALABRAS_MAS_USADAS = PALABRAS_MAS_USADAS;
        this.SON = SON;
    }

    /**
     * Obtiene el texto del menú principal.
     * @return Texto del menú principal.
     */
    public String getMENU() {
        return MENU;
    }

    /**
     * Obtiene el texto para indicar las palabras más usadas.
     * @return Texto para indicar las palabras más usadas.
     */
    public String getPALABRAS_MAS_USADAS() {
        return PALABRAS_MAS_USADAS;
    }

    /**
     * Obtiene el texto para indicar que son las palabras más usadas.
     * @return Texto para indicar que son las palabras más usadas.
     */
    public String getSON() {
        return SON;
    }

    /**
     * Obtiene una instancia de la clase Idiomas según el idioma seleccionado.
     * @param idioma Código del idioma (ES para español, ENG para inglés).
     * @return Instancia de la clase Idiomas con los textos correspondientes al idioma seleccionado.
     * @throws IllegalArgumentException Si el idioma seleccionado no es válido.
     */
    public static Idiomas getInstance(String idioma) {
        switch (Idioma.valueOf(idioma)) {
            case ES:
                return new Idiomas("""
                        --------------Menú--------------
                        Libros disponibles:
                        1. Blanca nieves.
                        2. El gato con botas.
                        3. Los tres cerditos.
                        4. Pinocho.
                        5. Ricitos de oro.
                        --------------------------------""",
                        "Las 10 palabras más usadas en el libro ",
                        "son: ");
            case ENG:
                return new Idiomas("""
                        --------------Menu--------------
                        Books available:
                        1. Blanca nieves.
                        2. El gato con botas.
                        3. Los tres cerditos.
                        4. Pinocho.
                        5. Ricitos de oro.
                        --------------------------------""",
                        "Top 10 most used words in the book ",
                        "are: ");

            default:
                throw new IllegalArgumentException("Idioma no disponible / Language not available");
        }
    }

    /** Enumeración de los idiomas disponibles */
    enum Idioma {
        ES, ENG
    }
}