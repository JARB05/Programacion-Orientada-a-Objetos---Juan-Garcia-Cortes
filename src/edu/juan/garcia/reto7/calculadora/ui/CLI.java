package edu.juan.garcia.reto7.calculadora.ui;
import edu.juan.garcia.reto7.calculadora.process.*;

import java.util.Scanner;

/**
 * Esta clase representa la interfaz de usuario de la calculadora en línea de comandos.
 * Permite al usuario realizar diversas operaciones aritméticas.
 */

public class CLI {

    /*Este metodo sirve para mostar el menu al usuario y que pueda elegir la opcion que
     corresponda a la operacion que decea hacer.
     Las opciones son las siguientes:
     a. Suma
     b. Resta
     c. Multiplicacion
     d. Division
     e. Modulo
     f. Potencia
     g. Raiz
     h. Logaritmo*/

    /**
     * Muestra el menú de operaciones disponibles al usuario.
     */
    public static void showMenu() {
        System.out.println("------------------Calculadora------------------");
        System.out.println("Elija la operacion que desea realizar:");
        System.out.println("a. Suma");
        System.out.println("b. Resta");
        System.out.println("c. Multiplicacion");
        System.out.println("d. Division");
        System.out.println("e. Modulo");
        System.out.println("f. Potencia");
        System.out.println("g. Raiz");
        System.out.println("h. Logaritmo");
        System.out.println("-----------------------------------------------");
    }

    /*Aqui se definen las variables de los valores con los cuales se
    realizara la operacion que indique el usuario*/
    public static double valorx = 0;
    public static double valory = 0;

    /*Este metodo sirve para inicar la calculadora, mostrando el menu y
    leyendo la opcion que seleccione el usuario; y, en base en esa seleccion,
    poder realizar la operacion correspondiente a la opcion que alla elegido;
    esto utilizando un "switch case".*/
    public static void launchApp() {
        Scanner scanner = new Scanner(System.in);

        showMenu();
        String operacion = scanner.nextLine();

        Operacion operacionAritmetica;
        /*Este switch lee la opcion que seleccione el usuario y lo redirecciona a la case
        correspondiente, dependiendo de la operacion que desea hacer.*/
        switch (operacion){

            case "a":
                System.out.println("Ingrese el primer valor de la suma");
                valorx = scanner.nextDouble();
                System.out.println("Ingrese el segundo valor de la suma");
                valory = scanner.nextDouble();
                operacionAritmetica = new Suma();
                double resultadoSuma = operacionAritmetica.calcular(valorx, valory);
                System.out.println("El resultado de su suma es: " + resultadoSuma);
                break;

            case "b":
                System.out.println("Ingrese el primer valor de la resta");
                valorx = scanner.nextDouble();
                System.out.println("Ingrese el segundo valor de la resta");
                valory = scanner.nextDouble();
                operacionAritmetica = new Resta();
                double resultadoResta = operacionAritmetica.calcular(valorx, valory);
                System.out.println("El resultado de su resta es: " + resultadoResta);
                break;

            case "c":
                System.out.println("Ingrese el primer valor de la multipicacion");
                valorx = scanner.nextDouble();
                System.out.println("Ingrese el segundo valor de la multipicacion");
                valory = scanner.nextDouble();
                operacionAritmetica = new Multiplicacion();
                double resultadoMultiplicacion = operacionAritmetica.calcular(valorx, valory);
                System.out.println("El resultado de su multiplicación es: " + resultadoMultiplicacion);
                break;

            case "d":
                System.out.println("Ingrese el dividendo");
                valorx = scanner.nextInt();
                System.out.println("Ingrese el divisor");
                valory = scanner.nextInt();
                operacionAritmetica = new Division();
                double resultadoDivision = operacionAritmetica.calcular(valorx, valory);
                System.out.println("El resultado de su división es: " +resultadoDivision);
                break;

            case "e":
                System.out.println("Ingrese el dividendo");
                valorx = scanner.nextInt();
                System.out.println("Ingrese el divisor");
                valory = scanner.nextInt();
                operacionAritmetica = new Modulo();
                double resultadoModulo = operacionAritmetica.calcular(valorx, valory);
                System.out.println("El resultado del modulo (residuo) es igual a: " +resultadoModulo);
                break;

            case "f":
                System.out.println("Ingrese el valor de la base");
                valorx = scanner.nextInt();
                System.out.println("Ingrese el valor del exponente");
                valory = scanner.nextInt();
                operacionAritmetica = new Potencia();
                double resultadoPotencia = operacionAritmetica.calcular(valorx, valory);
                System.out.println("El resultado de " +valorx + "elevado a la potencia " +valory+ "es igual a: " +resultadoPotencia);
                break;

            case "g":
                System.out.println("Ingrese el valor del radical");
                valorx = scanner.nextDouble();
                valory = 0; // Valor no necesario para la operación de raíz cuadrada.
                operacionAritmetica = new Raiz();
                double resultadoRaiz = operacionAritmetica.calcular(valorx, valory);
                System.out.println("El valor de su raíz es: " + resultadoRaiz);
                break;

            case "h":
                System.out.println("Ingrese el valor del argumento (número al que desea calcularle el logaritmo)");
                valorx = scanner.nextDouble();
                System.out.println("Ingrese el valor de la base del logaritmo");
                valory = scanner.nextDouble();
                operacionAritmetica = new Logaritmo();
                double resultadoLogaritmo = operacionAritmetica.calcular(valorx, valory);
                System.out.println("El valor de su logaritmo es: " + resultadoLogaritmo);
                break;

            /*Este comando se activa cuando el usuario ingresa un dato no valido o
            una opcion que no se encuentra en el menu.*/
            default:
                throw new IllegalStateException("\nDato no valido: "+operacion+"\nReinicie");
        }
    }
}