package edu.juan.garcia.reto7.calculadora.process;

public class Potencia extends Multiplicacion {
    @Override
    public double calcular(double base, double exponente) {
        Division division = new Division();// Instancia de Division para usar en caso de exponentes negativos.

        if (exponente == 0) {
            // Cualquier número elevado a la potencia de 0 es 1.
            return 1;
        } else if (exponente < 0) {
            // Para exponentes negativos, se calcula la potencia del valor absoluto del exponente
            // y luego se toma el recíproco del resultado.
            base = division.calcular(1,base);
            exponente = -exponente;
        }

        double resultado = base;
        for (int i = 1; i < exponente; i++) {
            resultado = super.calcular(resultado, base); // Reutiliza el método calcular de Multiplicacion
        }
        return resultado;
    }
}