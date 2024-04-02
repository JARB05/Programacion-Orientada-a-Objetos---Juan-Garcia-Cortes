package edu.juan.garcia.evidencia2.ui;

import edu.juan.garcia.evidencia2.data.Producto;
import edu.juan.garcia.evidencia2.process.Calculadora;

import java.util.List;
import java.util.Scanner;


/**
 * Clase que representa la interfaz de línea de comandos (CLI) de la aplicación TecmiFlix.
 * Esta clase proporciona métodos para mostrar menús, solicitar entrada al usuario y lanzar la aplicación.
 */
public class CLI {
    /** Scanner para leer entrada del usuario */
    public static final Scanner scanner = new Scanner(System.in);

    /** Muestra el menú de selección de idioma */
    public static void showLanguageMenu(){
        System.out.println("Seleccione su idioma / Choose your language:");
        System.out.println("1. Español");
        System.out.println("2. English");
    }

    /**
     * Muestra el menú principal de la aplicación.
     * Solicita al usuario su nombre de usuario y contraseña, genera productos aleatorios,
     * muestra el desglose de las compras y el costo total.
     * @param textos Objeto de la clase Textos que contiene las cadenas de texto para el idioma seleccionado.
     */
    public static void showMenu(Textos textos) {
        System.out.println("------------------" + Textos.TITULO + "------------------");
        System.out.println(Textos.USUARIO);
        String username = scanner.next();

        System.out.println(Textos.CONTRASENA);
        String password = scanner.next();
        System.out.println("-----------------------------------------------");

        List<Producto> productos = Calculadora.generarProductosAleatorios();
        showBreakdown(productos);

        double costoTotal = Calculadora.calcularCostoTotal(productos);
        System.out.println(Textos.COSTO + costoTotal);
    }

    /**
     * Muestra el desglose de las compras si el usuario lo solicita.
     * @param productos Lista de productos comprados.
     */
    public static void showBreakdown(List<Producto> productos){
        System.out.println(Textos.DESGLOSEP);
        String opcion = scanner.next();
        if (opcion.equalsIgnoreCase("S")) {
            System.out.println(Textos.DESGLOSE);
            for (Producto producto : productos) {
                System.out.println("- " + producto.getClass().getSimpleName() + ": " + producto.calcularCosto());
            }
        } else if (!opcion.equalsIgnoreCase("N")) {
            System.out.println(Textos.NOVALIDO);
            System.out.println(Textos.DESGLOSE);
            for (Producto producto : productos) {
                System.out.println("- " + producto.getClass().getSimpleName() + ": " + producto.calcularCosto());
            }
        }
    }

    /** Lanza la aplicación TecmiFlix */
    public static void launchApp() {
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
    }
}