package edu.juan.garcia.reto7.calculadora.process;

/**
 * Clase que representa la operación de resta.
 * Extiende de la clase Operacion.
 */

public class Resta extends Operacion{

    /**
     * Calcula la resta entre dos números.
     *
     * @param x el minuendo
     * @param y el sustraendo
     * @return el resultado de la resta (x - y)
     */

    @Override
    public double calcular(double x, double y) {
        return x - y;
    }
}
