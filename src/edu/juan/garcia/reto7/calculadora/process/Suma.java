package edu.juan.garcia.reto7.calculadora.process;

/**
 * Clase que representa la operación de suma.
 * Extiende de la clase Operacion.
 */

public class Suma extends Operacion {

    /**
     * Calcula la suma de dos números.
     *
     * @param x el primer sumando
     * @param y el segundo sumando
     * @return el resultado de la suma (x + y)
     */

    @Override
    public double calcular(double x, double y){
        return x + y;
    }
}
