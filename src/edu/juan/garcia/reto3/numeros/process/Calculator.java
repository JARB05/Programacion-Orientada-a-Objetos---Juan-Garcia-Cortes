package edu.juan.garcia.reto3.numeros.process;
import java.util.Random;

/**
 * Clase que contiene métodos para manipular matrices y realizar cálculos.
 */
public class Calculator {

    /**
     * Genera una matriz con valores aleatorios en el rango de 1 a 100.
     * @param filas Número de filas de la matriz.
     * @param columnas Número de columnas de la matriz.
     * @return La matriz generada.
     */
    public static int[][] generarMatriz(int filas, int columnas) {
        Random random = new Random();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
        return matriz;
    }

    /**
     * Cuenta la cantidad de números pares e impares por fila en una matriz.
     * @param matriz La matriz a analizar.
     * @return Una matriz donde cada fila contiene la cantidad de números pares e impares de la fila correspondiente.
     */
    public static int[][] contarParesImparesPorFilas(int[][] matriz) {
        int[][] conteoPorFilas = new int[matriz.length][2];
        for (int i = 0; i < matriz.length; i++) {
            for (int num : matriz[i]) {
                if (num % 2 == 0) {
                    conteoPorFilas[i][0]++;
                } else {
                    conteoPorFilas[i][1]++;
                }
            }
        }
        return conteoPorFilas;
    }

    /**
     * Cuenta la cantidad de números pares e impares por columna en una matriz.
     * @param matriz La matriz a analizar.
     * @return Una matriz donde cada columna contiene la cantidad de números pares e impares de la columna correspondiente.
     */
    public static int[][] contarParesImparesPorColumnas(int[][] matriz) {
        int[][] conteoPorColumnas = new int[matriz[0].length][2];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] % 2 == 0) {
                    conteoPorColumnas[j][0]++;
                } else {
                    conteoPorColumnas[j][1]++;
                }
            }
        }
        return conteoPorColumnas;
    }

    /**
     * Obtiene la suma de todos los elementos de una matriz.
     * @param matriz La matriz a sumar.
     * @return La suma total de los elementos de la matriz.
     */
    public static int obtenerSumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                suma += num;
            }
        }
        return suma;
    }

    /**
     * Muestra una matriz en la consola.
     * @param matriz La matriz a mostrar.
     */
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}