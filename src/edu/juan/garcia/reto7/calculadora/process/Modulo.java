package edu.juan.garcia.reto7.calculadora.process;

/**
 * Clase que representa la operación de módulo.
 * Extiende de la clase Resta.
 */
public class Modulo extends Resta {

    /**
     * Calcula el módulo de una división entre dos números.
     *
     * @param x el dividendo
     * @param y el divisor
     * @return el residuo de la división (módulo)
     * @throws ArithmeticException si se intenta realizar una operación de módulo por cero
     */

    @Override
    public double calcular(double x, double y) {
        if (y == 0) throw new ArithmeticException("Operación módulo por cero no permitida.");
        double residuo = Math.abs(x);
        while (residuo >= Math.abs(y)) {
            residuo = super.calcular(residuo, Math.abs(y)); // Utiliza el método calcular de Resta para obtener el residuo
        }
        // El residuo ya tiene el signo correcto debido a las operaciones de resta, por lo que no es necesario ajustarlo nuevamente.
        return residuo;
    }
}