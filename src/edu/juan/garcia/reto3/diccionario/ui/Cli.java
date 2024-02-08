package edu.juan.garcia.reto3.diccionario.ui;
import edu.juan.garcia.reto3.diccionario.process.Dictionary;

import java.util.Arrays;
import java.util.Scanner;

public class Cli {
    public static String generarLineas(char caracter, int longitud){
        char[] lineaChars = new char[longitud];
        Arrays.fill(lineaChars,caracter);
        return new String(lineaChars);
    }

    public static void launchApp(){
        Scanner scanner = new Scanner(System.in);

        System.out.println(generarLineas('=',40));
        System.out.println("          Bienvenido al Sistema          ");
        System.out.println(generarLineas('=',40));

        char opcion;

        do{
            System.out.println(generarLineas('=',40));
            System.out.println("          Menú Principal          ");
            System.out.println(generarLineas('=',40));
            System.out.println("A. Enlistar palabras del diccionario");
            System.out.println("B. Buscar palabra en el diccionario");
            System.out.println("C. Detalle del diccionario");
            System.out.println("S. Salir del programa");
            System.out.println(generarLineas('=',40));
            System.out.println("Seleccione una opción ingresando la letra correspondiente:");

            opcion = scanner.next().charAt(0);
            scanner.nextLine();

            switch (opcion){

                case 'A':
                    Dictionary.listarPalabras();
                    break;
                case 'B':
                    System.out.println("Ingrese la palabra que a buscar: ");
                    String palabra = scanner.nextLine();
                    String significado = Dictionary.buscarPalabra(palabra);
                    System.out.println(significado);
                    break;
                case 'C':
                    break;
                case 'S':
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }while (opcion != 'S');
    }
}
