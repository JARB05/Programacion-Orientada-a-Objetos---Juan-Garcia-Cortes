package edu.juan.garcia.reto7.calculadora.ui;
import edu.juan.garcia.reto7.calculadora.process.*;
import java.util.Scanner;

/**
 * Esta clase representa la interfaz de usuario de la calculadora en línea de comandos.
 * Permite al usuario realizar diversas operaciones aritméticas.
 */

public class CLI {

    public static void showLanguageMenu(){
        System.out.println("Seleccione su idioma / Choose your language:");
        System.out.println("1. Español");
        System.out.println("2. English");
    }

    public static void showMenu(Textos textos) {
        System.out.println("------------------" + Textos.CALCULADORA + "------------------");
        System.out.println(Textos.ELECCION);
        System.out.println(Textos.SUMA);
        System.out.println(Textos.RESTA);
        System.out.println(Textos.MULTIPLICACION);
        System.out.println(Textos.DIVISION);
        System.out.println(Textos.MODULO);
        System.out.println(Textos.POTENCIA);
        System.out.println(Textos.RAIZ);
        System.out.println(Textos.LOGARITMO);
        System.out.println(Textos.SALIR);
        System.out.println("-----------------------------------------------");
    }

    public static void printResult(Operacion operacion, double valorx, double valory){
        System.out.println(Textos.RESULTADO + operacion.getClass().getSimpleName()
                + Textos.ES + operacion.calcular(valorx,valory));
    }

    public static double valorx = 0;
    public static double valory = 0;

    public static void launchApp() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        do {
            showLanguageMenu();
            int idioma = scanner.nextInt();

            switch (idioma) {
                case 1:
                    Textos textosEsp = new Esp();
                    showMenu(textosEsp);
                    break;
                case 2:
                    Textos textosEng = new Eng();
                    showMenu(textosEng);
                    break;
                default:
                    System.out.println("Opción no válida / Invalid option");
                    return;
            }

            scanner.nextLine();

            String opcion = scanner.nextLine();

            Operacion operacion;

            switch (opcion) {
                case "A":
                    System.out.println(Textos.VALOR1);
                    valorx = scanner.nextDouble();
                    System.out.println(Textos.VALOR2);
                    valory = scanner.nextDouble();
                    operacion = new Suma();
                    printResult(operacion, valorx, valory);
                    break;
                case "B":
                    System.out.println(Textos.VALOR1);
                    valorx = scanner.nextDouble();
                    System.out.println(Textos.VALOR2);
                    valory = scanner.nextDouble();
                    operacion = new Resta();
                    printResult(operacion, valorx, valory);
                    break;
                case "C":
                    System.out.println(Textos.VALOR1);
                    valorx = scanner.nextDouble();
                    System.out.println(Textos.VALOR2);
                    valory = scanner.nextDouble();
                    operacion = new Multiplicacion();
                    printResult(operacion, valorx, valory);
                    break;
                case "D":
                    System.out.println(Textos.DIVIDENDO);
                    valorx = scanner.nextInt();
                    System.out.println(Textos.DIVISOR);
                    valory = scanner.nextInt();
                    operacion = new Division();
                    printResult(operacion, valorx, valory);
                    break;
                case "E":
                    System.out.println(Textos.DIVIDENDO);
                    valorx = scanner.nextInt();
                    System.out.println(Textos.DIVISOR);
                    valory = scanner.nextInt();
                    operacion = new Modulo();
                    printResult(operacion, valorx, valory);
                    break;
                case "F":
                    System.out.println(Textos.BASE);
                    valorx = scanner.nextInt();
                    System.out.println(Textos.EXPONENTE);
                    valory = scanner.nextInt();
                    operacion = new Potencia();
                    printResult(operacion, valorx, valory);
                    break;
                case "G":
                    System.out.println(Textos.RADICAL);
                    valorx = scanner.nextDouble();
                    System.out.println(Textos.INDICE);
                    valory = scanner.nextDouble();
                    operacion = new Raiz2();
                    printResult(operacion, valorx, valory);
                    break;
                case "H":
                    System.out.println(Textos.ARGUMENTO);
                    valorx = scanner.nextDouble();
                    System.out.println(Textos.BASE);
                    valory = scanner.nextDouble();
                    operacion = new Logaritmo();
                    printResult(operacion, valorx, valory);
                    break;
                case "I":
                    salir = true;
                    break;
                default:
                    System.out.println(Textos.DATO_NO_VALIDO + opcion + Textos.REINICIE);
                    break;
            }
        } while (!salir);
    }
}