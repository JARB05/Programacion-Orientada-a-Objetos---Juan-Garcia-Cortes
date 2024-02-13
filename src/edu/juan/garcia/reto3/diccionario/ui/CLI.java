package edu.juan.garcia.reto3.diccionario.ui;
import edu.juan.garcia.reto3.diccionario.process.Dictionary;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que proporciona una interfaz de línea de comandos para interactuar con el diccionario.
 */
public class CLI {

    /**
     * Genera una línea con un carácter específico y longitud dada.
     *
     * @param caracter Carácter para generar la línea.
     * @param longitud Longitud de la línea.
     * @return La línea generada como una cadena de caracteres.
     */
    public static String generarLineas(char caracter, int longitud){
        char[] lineaChars = new char[longitud];
        Arrays.fill(lineaChars,caracter);
        return new String(lineaChars);
    }

    /**
     * Método para iniciar la aplicación de la interfaz de línea de comandos.
     * @param dictionary Instancia del diccionario con el que se interactuará.
     */
    public static void launchApp(Dictionary dictionary){
        Scanner scanner = new Scanner(System.in);

        char opcion;

        do{
            System.out.println(generarLineas('=',40));
            System.out.println("          Menú Principal          ");
            System.out.println(generarLineas('=',40));
            System.out.println("\nA. Enlistar palabras del diccionario");
            System.out.println("B. Buscar palabra en el diccionario");
            System.out.println("C. Detalle del diccionario");
            System.out.println("S. Salir del programa");
            System.out.println("\u200E"); //Esto es un caracter en blanco y lo estoy utilizando como salto de linea.
            System.out.println(generarLineas('=',40));
            System.out.println("\nSeleccione una opción ingresando la letra correspondiente:");

            opcion = scanner.next().charAt(0);
            scanner.nextLine();

            switch (opcion){

                case 'A':
                    /*
                     * Caso A: Enlista todas las palabras del diccionario.
                     */
                    System.out.println(generarLineas('=',40));
                    dictionary.enlistarPalabras();
                    break;
                case 'B':
                    /*
                     * Caso B: Busca una palabra en el diccionario e imprime su significado si existe.
                     * Si no se encuentra la palabra, imprime un mensaje de error.
                     */
                    System.out.println(generarLineas('=',40));
                    System.out.println("Ingrese la palabra que desea buscar:");
                    String palabraBuscada = scanner.nextLine();
                    String significado = dictionary.buscarPalabra(palabraBuscada);
                    if (!significado.isEmpty()) {
                        System.out.println("El significado de '" + palabraBuscada + "' es: " + significado);
                    } else {
                        System.out.println("La palabra '" + palabraBuscada + "' no se encuentra en el diccionario.");
                    }
                    break;
                case 'C':
                    /*
                     * Caso C: Muestra el detalle del diccionario, incluyendo la cantidad de palabras,
                     * la lista de palabras con sus longitudes y las longitudes de sus significados.
                     */
                    System.out.println(generarLineas('=',40));
                    System.out.println(dictionary.getDetallesDelDiccionario());
                    break;
                case 'S':
                    /*
                     * Caso S: Sale del programa.
                     */
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
        /*
         * Mientras el usuario no elija la opción 'S' se seguira mostrando el Menú.
         */
        while (opcion != 'S');
    }
}
