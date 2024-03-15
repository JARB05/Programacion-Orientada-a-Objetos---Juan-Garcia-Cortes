package edu.juan.garcia.reto7.calculadora.process;

public class Modulo extends Resta {
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