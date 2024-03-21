package edu.juan.garcia.reto7.calculadora.process;

/**
 * Clase abstracta que representa una operación matemática.
 */

public abstract class Operacion {

    /**
     * Calcula el resultado de la operación matemática para los números dados.
     *
     * @param x el primer número
     * @param y el segundo número
     */

    public abstract double calcular(double x, double y);
}