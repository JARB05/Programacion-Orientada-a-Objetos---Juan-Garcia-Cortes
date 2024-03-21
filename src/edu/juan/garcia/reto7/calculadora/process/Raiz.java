package edu.juan.garcia.reto7.calculadora.process;

/**
 * Clase que representa la operación de raíz cuadrada.
 * Extiende de la clase Operacion.
 */

public class Raiz extends Operacion {

    private static final double ERROR_TOLERADO = 0.0001;

    /**
     * Calcula la raíz cuadrada de un número.
     *
     * @param x el número del cual se desea calcular la raíz cuadrada
     * @param y no se usa, está aquí para cumplir con la firma
     * @return la raíz cuadrada del número dado
     * @throws IllegalArgumentException si se intenta calcular la raíz cuadrada de un número negativo
     */

    @Override
    public double calcular(double x, double y) { // 'y' no se usa, está aquí para cumplir con la firma.
        if (x < 0) throw new IllegalArgumentException("Raíz cuadrada de un número negativo no está definida.");

        Division division = new Division();

        double r = x;
        double rAnterior = 0;

        // Iniciar con un valor arbitrario para r, por ejemplo, la mitad de x.
        if (x != 1) {
            r = division.calcular(x, 2);
        }

        // Iterar hasta que la diferencia entre r y rAnterior sea menor que el error tolerado.
        while (Math.abs(r - rAnterior) > ERROR_TOLERADO) {
            rAnterior = r;
            // r = (r + x / r) / 2;
            double temp = division.calcular(x, r); // x / r
            temp = r + temp; // r + (x / r)
            r = division.calcular(temp, 2); // (r + (x / r)) / 2
        }
        return r;
    }
}

/*Solamente se puede sacar un aproximado o la raiz de un cuadrado perfecto ya que al no poder tener todos los decimales
de la division el resultado se queda en el numero entero mas cercano al resultado.
 */
