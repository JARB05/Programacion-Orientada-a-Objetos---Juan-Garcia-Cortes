package edu.juan.garcia.reto3.numeros.process;
import java.util.Random;

public class Calculator {

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

    public static int obtenerSumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                suma += num;
            }
        }
        return suma;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}