package edu.juan.garcia.reto2.cajas.ui;
import edu.juan.garcia.reto2.cajas.process.Calculator;

import java.util.Arrays;
import java.util.Scanner;

public class CLI {

    public static String generarLineas(char caracter, int longitud){
        char[] lineaChars = new char[longitud];
        Arrays.fill(lineaChars,caracter);
        return new String(lineaChars);
    }

    public static void LaunchCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(generarLineas('=',40));
        System.out.println("          Bienvenido al Sistema          ");
        System.out.println(generarLineas('=',40));

        System.out.println("Ingrese usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese contraseña:");
        String contrasena = scanner.nextLine();

        while (!usuario.equals("Juan") || !contrasena.equals("contrasena")) {
            System.out.println("Usuario o contraseña incorrectos. Inténtelo de nuevo.");
            System.out.println("Ingrese usuario:");
            usuario = scanner.nextLine();
            System.out.println("Ingrese contraseña:");
            contrasena = scanner.nextLine();
        }
        int opcion;
        do {
            System.out.println(generarLineas('=',40));
            System.out.println("          Menú Principal          ");
            System.out.println(generarLineas('=',40));
            System.out.println("1. Comprar cajas de papel");
            System.out.println("2. Vender cajas de papel");
            System.out.println("3. Mostrar reporte");
            System.out.println("4. Salir del programa");
            System.out.println(generarLineas('=',40));
            System.out.println("Seleccione una opción ingresando el número correspondiente:");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el número de cajas a comprar:");
                    int cantidadCompra = scanner.nextInt();
                    System.out.println("Ingrese el costo de las cajas a comprar:");
                    double costoCompra = scanner.nextDouble();

                    Calculator.comprarCajas(cantidadCompra, costoCompra);
                    break;

                case 2:
                    System.out.println("Ingrese el número de cajas a vender:");
                    int cantidadVenta = scanner.nextInt();
                    System.out.println("Ingrese el precio de las cajas a vender:");
                    double precioVenta = scanner.nextDouble();

                    Calculator.venderCajas(cantidadVenta, precioVenta);
                    break;

                case 3:
                    Calculator.mostrarReporte();
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 4);

        System.out.println(generarLineas('=',40));
        System.out.println("Cantidad de operaciones realizadas: " +Calculator.contadorDeOperaciones);
        System.out.println("Cantidad total de ventas: " +Calculator.cantidadTotalVentas);
        System.out.println("Cantidad total de compras: " +Calculator.cantidadTotalCompras);
        System.out.println("Monto en la caja : " +Calculator.montoEnCaja);
        System.out.println("Ingresos generados por ventas: " +Calculator.totalVentas);
        System.out.println("Egresos generados por compras: " +Calculator.totalCompras);
        System.out.println("¡Hasta luego, " + usuario + "!");
        System.out.println(generarLineas('=',40));

    }
}