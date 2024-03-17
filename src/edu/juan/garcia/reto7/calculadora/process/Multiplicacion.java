package edu.juan.garcia.reto7.calculadora.process;

/**
 * Clase que representa la operación de multiplicación.
 * Extiende de la clase Suma.
 */

public class Multiplicacion extends Suma {

    /**
     * Calcula el producto de dos números.
     *
     * @param x el primer factor
     * @param y el segundo factor
     * @return el resultado de la multiplicación
     */

    @Override
    public double calcular(double x, double y) {
        double resultado = 0;
        for (int i = 0; i < Math.abs(y); i++){
            resultado = super.calcular(resultado,x); // Utiliza el método calcular de Suma
        }
        return y < 0 ? -resultado : resultado; // Ajusta el signo si 'y' es negativo
    }
}
