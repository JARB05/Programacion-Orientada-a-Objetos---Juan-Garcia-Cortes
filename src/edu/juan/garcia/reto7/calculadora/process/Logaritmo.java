package edu.juan.garcia.reto7.calculadora.process;

/**
 * Clase que representa la operación de logaritmo.
 * Extiende de la clase Division.
 */
public class Logaritmo extends Division {

    @Override
    public double calcular(double x, double y) {

        if (x <= 1 || y <= 0)
            throw new ArithmeticException("El logaritmo no está definido para los valores proporcionados");

        double logaritmo = 0;
        double argumento = x;
        while (argumento > 1) {
            argumento = super.calcular(argumento, y);
            logaritmo++;
        }
        return logaritmo;
    }
}