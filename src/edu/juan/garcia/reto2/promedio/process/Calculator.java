package edu.juan.garcia.reto2.promedio.process;

public class Calculator {
    public static double calcularPromedio(double[]calificaciones){
        double suma = 0;

        for (double calificacion : calificaciones){
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
}
