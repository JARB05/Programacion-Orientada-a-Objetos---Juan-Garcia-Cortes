package edu.juan.garcia.reto2.promedio.ui;

import edu.juan.garcia.reto2.promedio.process.Calculator;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que implementa la interfaz de línea de comandos (CLI) para interactuar con el Calculador de Promedios.
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
     * Inicia la interfaz de línea de comandos para el Calculador de Promedios.
     */
    public static void launchApp(){
        Scanner scanner = new Scanner(System.in);

        System.out.println(generarLineas('=',40));
        System.out.println(" Bienvenido al Calculador de Promedios");
        System.out.println(generarLineas('=',40));

        //Solicita al usuario cuantas calificaciones quiere evaluar.
        System.out.println("Ingrese la cantidad de calificaciones a capturar:");
        int cantidadCalificaciones = scanner.nextInt();

        double[] calificaciones = new double[cantidadCalificaciones];

        //Solicita al usuario cada calificación.
        for (int i = 0; i < cantidadCalificaciones; i++){
            System.out.println("Ingrese la calificación " + (i + 1) + ":");
            calificaciones[i] = scanner.nextDouble();
        }

        //Se utiliza el metodo de la clase Calculator para sacar el promedio.
        double promedio = Calculator.calcularPromedio(calificaciones);
        System.out.println("El promedio del alumno es: " +promedio);

        System.out.println(generarLineas('=',40));
        System.out.println("             ¡Hasta luego!          ");
        System.out.println(generarLineas('=',40));
    }
}
