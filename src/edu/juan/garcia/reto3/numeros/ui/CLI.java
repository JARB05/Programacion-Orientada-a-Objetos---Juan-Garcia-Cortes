package edu.juan.garcia.reto3.numeros.ui;

import edu.juan.garcia.reto3.numeros.process.Calculator;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que proporciona una interfaz de línea de comandos para interactuar con la aplicación.
 */
public class CLI {

    /**
     * Genera una línea con un carácter específico y longitud dada.
     *
     * @param caracter Carácter para generar la línea.
     * @param longitud Longitud de la línea.
     * @return La línea generada como una cadena de caracteres.
     */
    public static String generarLineas(char caracter, int longitud) {
        char[] lineaChars = new char[longitud];
        Arrays.fill(lineaChars, caracter);
        return new String(lineaChars);
    }

    /**
     * Método principal que inicia la interfaz de línea de comandos.
     * Permite al usuario ingresar la cantidad de filas y columnas para generar la matriz.
     * Llama a los métodos de la clase Calculator para generar la matriz,
     * contar pares e impares por filas y columnas, y obtener la suma total.
     * Muestra la matriz generada, el conteo de pares e impares por filas y columnas, y la suma total en la consola.
     */
    public static void launchApp() {
        Scanner scanner = new Scanner(System.in);
        int filas, columnas;
        do {
            System.out.print("Ingrese la cantidad de filas y columnas (N x M): ");
            filas = scanner.nextInt();
            columnas = scanner.nextInt();
            if (filas != columnas) {
                System.out.println("Los valores de filas y columnas deben ser iguales. Intente nuevamente.");
            }
        } while (filas != columnas);

        int[][] matriz = Calculator.generarMatriz(filas, columnas);
        int[][] conteoPorFilas = Calculator.contarParesImparesPorFilas(matriz);
        int[][] conteoPorColumnas = Calculator.contarParesImparesPorColumnas(matriz);
        int suma = Calculator.obtenerSumaMatriz(matriz);

        System.out.println("\nLa matriz generada es:");
        System.out.println(generarLineas('=',40));
        Calculator.mostrarMatriz(matriz);
        System.out.println(generarLineas('=',40));

        System.out.println("Conteo de números pares e impares por filas:");
        for (int i = 0; i < conteoPorFilas.length; i++) {
            System.out.printf("Fila %d: Pares = %d, Impares = %d\n", i + 1, conteoPorFilas[i][0], conteoPorFilas[i][1]);
        }

        System.out.println(generarLineas('=',40));
        System.out.println("Conteo de números pares e impares por columnas:");
        for (int j = 0; j < conteoPorColumnas.length; j++) {
            System.out.printf("Columna %d: Pares = %d, Impares = %d\n", j + 1, conteoPorColumnas[j][0], conteoPorColumnas[j][1]);
        }

        System.out.println("\nLa suma total de los valores del vector es: " + suma);
    }
}