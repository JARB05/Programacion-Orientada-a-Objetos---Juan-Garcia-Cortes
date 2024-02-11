package edu.juan.garcia.reto3.diccionario.process;

/**
 * Clase que representa un diccionario de palabras con sus respectivos significados.
 */

public class Dictionary {
    private final String[] palabras;
    private final String[] significados;

    /**
     * Constructor de la clase Dictionary.
     * @param palabras Arreglo de strings que contiene las palabras del diccionario.
     * @param significados Arreglo de strings que contiene los significados correspondientes a cada palabra.
     */
    public Dictionary(String[] palabras, String[] significados) {
        this.palabras = palabras;
        this.significados = significados;
    }

    /**
     * Método para enlistar todas las palabras almacenadas en el diccionario.
     */
    public void enlistarPalabras() {
        System.out.println("Palabras en el diccionario:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    /**
     * Método para buscar el significado de una palabra en el diccionario.
     * @param wordToSearch Palabra a buscar en el diccionario.
     * @return El significado de la palabra si se encuentra, o una cadena vacía si no.
     */
    public String buscarPalabra(String wordToSearch) {
        String resultado = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(wordToSearch)) {
                resultado = significados[i];
                break;
            }
        }
        return resultado;
    }

    /**
     * Método para obtener detalles del diccionario, incluyendo cantidad de palabras,
     * lista de palabras con sus longitudes y longitudes de sus significados.
     * @return Una cadena con los detalles del diccionario.
     */
    public String getDetallesDelDiccionario() {
        StringBuilder detalles = new StringBuilder();
        detalles.append("Detalle del diccionario:\n");
        detalles.append("Cantidad de palabras: ").append(palabras.length).append("\n");
        detalles.append("Lista de palabras con sus respectivas longitudes:\n");
        for (int i = 0; i < palabras.length; i++) {
            detalles.append(palabras[i]).append(" - Longitud: ").append(palabras[i].length()).append(", Longitud del significado: ").append(significados[i].length()).append("\n");
        }
        return detalles.toString();
    }
}
