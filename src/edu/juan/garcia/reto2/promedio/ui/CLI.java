package edu.juan.garcia.reto2.promedio.ui;

import edu.juan.garcia.reto2.promedio.process.Calculator;

import java.util.Arrays;
import java.util.Scanner;

public class CLI {
    public static String generarLineas(char caracter, int longitud){
        char[] lineaChars = new char[longitud];
        Arrays.fill(lineaChars,caracter);
        return new String(lineaChars);
    }
    public static void LaunchCalculator(){
        Scanner scanner = new Scanner(System.in);

        System.out.println(generarLineas('=',40));
        System.out.println(" Bienvenido al Calculador de Promedios");
        System.out.println(generarLineas('=',40));

        System.out.println("Ingrese la cantidad de calificaciones a capturar:");
        int cantidadCalificaciones = scanner.nextInt();

        double[] calificaciones = new double[cantidadCalificaciones];

        for (int i = 0; i < cantidadCalificaciones; i++){
            System.out.println("Ingrese la calificación " + (i + 1) + ":");
            calificaciones[i] = scanner.nextDouble();
        }

        double promedio = Calculator.calcularPromedio(calificaciones);
        System.out.println("El promedio del alumno es: " +promedio);

        System.out.println(generarLineas('=',40));
        System.out.println("             ¡Hasta luego!          ");
        System.out.println(generarLineas('=',40));
    }
}
