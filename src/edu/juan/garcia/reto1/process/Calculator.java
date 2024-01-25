package edu.juan.garcia.reto1.process;

/**
 * La clase Calculator proporciona métodos para calcular varios valores
 * nutricionales basados en los datos proporcionados por el usuario.
 */

public class Calculator {

    /**
     * Calcula el Índice de Masa Corporal (IMC) utilizando el peso y la estatura proporcionados por el usuario.
     * @param peso El peso se toma en kilogramos.
     * @param estatura La estatura se pide en centimetros y luego se convierte la unidad de medida a metros mediante una división.
     * @return El Índice de Masa Corporal calculado.
     */

    public static double calcularIMC(double peso, double estatura)
    {
        return peso / (estatura / 100 * estatura / 100);
    }

    /**
     * Interpreta el valor del IMC y devuelve una cadena de texto el cual contiene
     * la condición del paciente basándose en las categorías de IMC.
     * @param imc Es el valor del Índice de Masa Corporal.
     * @return una cadena de texto que contiene la condición del paciente.
     */

    public static String interpretarIMC(double imc) {
        if (imc < 18.5) {
            return "su peso es bajo";
        } else if (imc >= 18.5 && imc <= 24.99) {
            return "su peso es normal";
        } else if (imc >= 25 && imc <= 29.99) {
            return "tiene sobrepeso";
        } else if (imc >= 30 && imc <= 34.99) {
            return "tiene obesidad leve";
        } else if (imc >= 35 && imc <= 39.99) {
            return "tiene obesidad media";
        } else {
            return "tiene obesidad mórbida";
        }
    }

    /**
     * Calcula la Masa Corporal Magra utilizando el peso, la estatura y el género proporcionados.
     * @param peso El peso se toma en kilogramos.
     * @param estatura La estatura se toma en centímetros.
     * @param sexo El género del paciente (mujer o hombre).
     * @return La Masa Corporal Magra calculada.
     */

    public static double calcularMasaCorporalMagra(double peso, double estatura, String sexo){
        double factorPeso = (sexo.equalsIgnoreCase("mujer")) ? 1.07 : 1.10;
        return factorPeso * peso - 148 * Math.pow(peso, 2)/Math.pow(estatura,2);
    }

    /**
     * Calcula la Tasa Metabólica Basal utilizando el peso, la estatura,
     * la edad y el género proporcionados por el usuario.
     * "geb" se refiere al Gasto Energético Basal.
     * @param peso El peso se toma en kilogramos.
     * @param estatura La estatura se toma en centímetros.
     * @param edad La edad del paciente.
     * @param sexo El género del paciente (mujer o hombre).
     * @return La Tasa Metabólica Basal calculada ("geb").
     */

    public static double calcularMetabolismoBasal(double peso, double estatura, int edad, String sexo){
        double geb;
        if(sexo.equalsIgnoreCase("mujer")) {
            geb = 655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
        }
        else{
            geb = 66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);
        }
        return geb;
    }
}
