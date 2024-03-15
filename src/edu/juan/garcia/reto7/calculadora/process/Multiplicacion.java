package edu.juan.garcia.reto7.calculadora.process;

public class Multiplicacion extends Suma{
    @Override
    public double calcular(double x, double y) {
        double resultado = 0;
        for (int i = 0; i < Math.abs(y); i++){
            resultado = super.calcular(resultado,x); // Utiliza el método calcular de Suma
        }
        return y < 0 ? -resultado : resultado; // Ajusta el signo si 'y' es negativo
    }
}
