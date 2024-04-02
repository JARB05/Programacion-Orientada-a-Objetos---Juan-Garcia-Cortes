package edu.juan.garcia.reto7.calculadora.process;

/**
 * Clase que representa la operación de raíz.
 * Extiende de la clase Multiplicacion.
 */
public class Raiz2 extends Multiplicacion {

    @Override
    public double calcular(double x, double y) {
        if (x < 0) throw new ArithmeticException("No se puede calcular la raíz de un número negativo");

        if (y < 0) throw new ArithmeticException("No se puede calcular la raíz con un indice negativo");

        double raiz;
        double potencia = 0;
        int validacion = 0;
        int aproximacion = 1;

        while (potencia < x) {
            validacion = aproximacion;
            potencia = 1;
            for (int i = 0; i < y; i++) {
                potencia = super.calcular(potencia, aproximacion);
            }
            aproximacion++;
        }
        raiz = validacion;

        return raiz;
    }
}