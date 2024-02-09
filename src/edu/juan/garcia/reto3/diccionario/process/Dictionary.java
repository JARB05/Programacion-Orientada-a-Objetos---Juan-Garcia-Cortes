package edu.juan.garcia.reto3.diccionario.process;

public class Dictionary {
    private final String[] palabras;
    private final String[] significados;

    public Dictionary(String[] palabras, String[] significados) {
        this.palabras = palabras;
        this.significados = significados;
    }
    public void enlistarPalabras() {
        System.out.println("Palabras en el diccionario:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

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
