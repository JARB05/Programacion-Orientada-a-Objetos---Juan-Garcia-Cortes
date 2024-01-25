package edu.juan.garcia.reto1.ui;
import java.util.Scanner;
import edu.juan.garcia.reto1.process.Calculator;

/**
 * La clase CLI proporciona una interfaz de línea de comandos para interactuar
 * con las operaciones de la clase Calculator y así poder realizar cálculos
 * relacionados con la nutrición.
 */

public class CLI {

    /**
     * Muestra el menú de opciones disponibles.
     */

    public static void mostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("A. Cálculo de masa corporal");
        System.out.println("B. Cálculo de masa corporal magra");
        System.out.println("C. Cálculo de metabolismo basal");
        System.out.println("D. Salir");
    }

    /**
     *
     */

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        double peso, estatura;
        String sexo;

        while (true) {
            mostrarMenu();
            char opcion = scanner.next().charAt(0);

            switch (opcion) {

                case 'A':
                    System.out.println("Ingrese su peso en kg:");
                    peso = scanner.nextDouble();
                    System.out.println("Ingrese su estatura en cm:");
                    estatura = scanner.nextDouble();

                    double imc = Calculator.calcularIMC(peso, estatura);
                    System.out.println("Su Índce de masa Corporal es: " +imc);
                    System.out.println("Esto indica que : " +Calculator.interpretarIMC(imc));
                    break;

                case 'B':
                    System.out.println("Ingrese su peso en kg:");
                    peso = scanner.nextDouble();
                    System.out.println("Ingrese su estatura en cm:");
                    estatura = scanner.nextDouble();
                    System.out.println("Ingrese el sexo (mujer/hombre):");
                    sexo = scanner.next();

                    double masaCorporalMagra = Calculator.calcularMasaCorporalMagra(peso, estatura, sexo);
                    System.out.println("Su Masa Corporal Magra es: " +masaCorporalMagra);
                    break;

                case 'C':
                    System.out.println("Ingrese su peso en kg:");
                    peso = scanner.nextDouble();
                    System.out.println("Ingrese su estatura:");
                    estatura = scanner.nextDouble();
                    System.out.println("Ingrese su edad:");
                    int edad = scanner.nextInt();
                    System.out.println("Ingrese el sexo (mujer/hombre):");
                    sexo = scanner.next();

                    double metabolismoBasal = Calculator.calcularMetabolismoBasal(peso, estatura, edad, sexo);
                    System.out.println("Su Metabolismo Basal es : " +metabolismoBasal);
                    break;
                case 'D':
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intentelo de nuevo");
            }
        }
    }
}
