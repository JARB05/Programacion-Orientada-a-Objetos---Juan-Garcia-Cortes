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
     *Método principal que inicia la interfaz de línea de comandos y
     * permite al usuario realizar cáclulos relacionados con la nutrición.
     * <p>
     * El usuario puede seleccionar las siguientes opciones:
     * A - Cálculo de masa corporal.
     * B - Cálculo de masa corporal magra.
     * C - Cálculo de metabolismo basal.
     * D - Salir del programa.
     */

    public static void LaunchCalculator() {
        Scanner scanner = new Scanner(System.in);
        double peso, estatura;
        String sexo;

        while (true) {
            mostrarMenu();
            char opcion = scanner.next().charAt(0);

            switch (opcion) {

                /**
                 * Este case se encarga de recopilar los datos peso y estatura para así poder calcular
                 * el Índice de Masa Corporal.
                 */

                case 'A':
                    System.out.println("Ingrese su peso en kg:");
                    peso = scanner.nextDouble();
                    System.out.println("Ingrese su estatura en cm:");
                    estatura = scanner.nextDouble();

                    double imc = Calculator.calcularIMC(peso, estatura);
                    System.out.println("Su Índce de masa Corporal es: " +imc);
                    System.out.println("Esto indica que : " +Calculator.interpretarIMC(imc));
                    break;

                /**
                 * Este case se encarga de recopilar los datos peso, estatura y su género para así poder calcular
                 * la Masa Corporal Magra.
                 */

                case 'B':
                    System.out.println("Ingrese su peso en kg:");
                    peso = scanner.nextDouble();
                    System.out.println("Ingrese su estatura en cm:");
                    estatura = scanner.nextDouble();
                    System.out.println("Ingrese el sexo (mujer/hombre):");
                    sexo = scanner.next().toLowerCase();
                    validarGenero(sexo);

                    double masaCorporalMagra = Calculator.calcularMasaCorporalMagra(peso, estatura, sexo);
                    System.out.println("Su Masa Corporal Magra es: " +masaCorporalMagra);
                    break;

                /**
                 * Este case se encarga de recopilar los datos peso, estatura, edad y su género para así poder calcular
                 * el Metabolismo Basal.
                 */
                case 'C':
                    System.out.println("Ingrese su peso en kg:");
                    peso = scanner.nextDouble();
                    System.out.println("Ingrese su estatura:");
                    estatura = scanner.nextDouble();
                    System.out.println("Ingrese su edad:");
                    int edad = scanner.nextInt();
                    System.out.println("Ingrese el sexo (mujer/hombre):");
                    sexo = scanner.next().toLowerCase();
                    validarGenero(sexo);

                    double metabolismoBasal = Calculator.calcularMetabolismoBasal(peso, estatura, edad, sexo);
                    System.out.println("Su Metabolismo Basal es : " +metabolismoBasal);
                    break;

                /**
                 * Este case cierra la aplicación cuando el usuario elige la opción 'D'.
                 */
                case 'D':
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Intentelo de nuevo");
            }
        }
    }

    /**
     *Valida el género ingresado por el usuario. Pide al usuario que ingrese el género nuevamente
     * hasta que se proporcione una entrada válida ('hombre' o 'mujer').
     *
     * @param sexo El género ingresado por el usuario.
     */
    private static void validarGenero(String sexo) {
        while (!sexo.equals("hombre") && !sexo.equals("mujer")) {
            System.out.println("Género no válido. Por favor, ingrese 'hombre' o 'mujer':");
            Scanner scanner = new Scanner(System.in);
            sexo = scanner.next().toLowerCase();
        }
    }
}