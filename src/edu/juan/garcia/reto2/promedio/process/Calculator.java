package edu.juan.garcia.reto2.promedio.process;

/**
 * Clase que proporciona funciones para calcular el promedio de un conjunto de calificaciones.
 */
public class Calculator {

    /**
     * Calcula el promedio de un conjunto de calificaciones.
     *
     * @param calificaciones Arreglo de calificaciones.
     * @return El promedio de las calificaciones.
     */
    public static double calcularPromedio(double[]calificaciones){
        double suma = 0;

        for (double calificacion : calificaciones){
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
}
