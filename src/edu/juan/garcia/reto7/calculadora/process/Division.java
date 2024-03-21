package edu.juan.garcia.reto7.calculadora.process;

/**
 * Clase que representa una operación de división.
 * Extiende de la clase Resta.
 */
public class Division extends Resta {

    /**
     * Calcula el cociente de una división entre dos números.
     *
     * @param x el dividendo
     * @param y el divisor
     * @return el cociente de la división
     * @throws ArithmeticException si se intenta dividir por cero
     */

    @Override
    public double calcular(double x, double y) {
        if (y == 0) throw new ArithmeticException("División por cero.");
        int contador = 0;
        double residuo = Math.abs(x);
        while (residuo >= Math.abs(y)) {
            residuo = super.calcular(residuo, Math.abs(y)); // Utiliza el método calcular de Resta
            contador++;
        }
        if ((x < 0 && y > 0) || (x > 0 && y < 0)) {
            contador = -contador; // Ajusta el signo si es necesario
        }
        // Este método solo retorna el cociente. El residuo se calcula pero no se retorna.
        return contador;
    }
}