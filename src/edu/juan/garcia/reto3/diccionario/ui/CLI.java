package edu.juan.garcia.reto3.diccionario.ui;
import edu.juan.garcia.reto3.diccionario.process.Dictionary;

import java.util.Arrays;
import java.util.Scanner;

public class CLI {

    public static String generarLineas(char caracter, int longitud){
        char[] lineaChars = new char[longitud];
        Arrays.fill(lineaChars,caracter);
        return new String(lineaChars);
    }

    public static void launchApp(Dictionary dictionary){
        Scanner scanner = new Scanner(System.in);

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
                    dictionary.enlistarPalabras();
                    break;
                case 'B':
                    System.out.println("Ingrese la palabra que desea buscar:");
                    String palabraBuscada = scanner.nextLine();
                    String significado = dictionary.buscarPalabra(palabraBuscada);
                    if (!significado.isEmpty()) {
                        System.out.println("El significado de '" + palabraBuscada + "' es: " + significado);
                    } else {
                        System.out.println("La palabra '" + palabraBuscada + "' no se encuentra en el diccionario.");
                    }
                    break;
                case 'C':
                    System.out.println(dictionary.getDetallesDelDiccionario());
                    break;
                case 'S':
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }while (opcion != 'S');
    }
}
