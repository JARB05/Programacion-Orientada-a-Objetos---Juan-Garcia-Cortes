package edu.juan.garcia.reto7.calculadora.process;

public class Logaritmo extends Operacion {

    @Override
    public double calcular(double base, double valor) {
        if (base <= 1 || valor <= 0) {
            throw new ArithmeticException("El logaritmo no está definido para base <= 1 o valor <= 0.");
        }
        Potencia potencia= new Potencia();

        double resultado = 0; // Este será el exponente que estamos buscando.
        double potenciaActual = 1; // Comenzamos con la base elevada a la 0.

        // Incrementamos el resultado hasta que la potenciaActual supere o iguale al valor.
        while (potenciaActual < valor) {
            resultado++;
            potenciaActual = potencia.calcular(base, resultado);
        }
        return resultado;
    }
}