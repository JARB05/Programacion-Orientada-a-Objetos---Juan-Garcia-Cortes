package edu.juan.garcia.reto4.ui;
import edu.juan.garcia.reto4.data.Passenger;
import edu.juan.garcia.reto4.data.Ticket;
import edu.juan.garcia.reto4.process.TicketManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase proporciona la interfaz de línea de comandos para interactuar con el sistema de registro de ventas.
 */
public class CLI {

    /**
     * Genera una línea compuesta por un caracter específico repetido una cierta cantidad de veces.
     * @param caracter El caracter con el que se construirá la línea.
     * @param longitud La longitud de la línea a generar.
     * @return Una cadena que representa la línea generada.
     */
    public static String generarLineas(char caracter, int longitud){
        char[] lineaChars = new char[longitud];
        Arrays.fill(lineaChars,caracter);
        return new String(lineaChars);
    }

    /**
     * Inicia la aplicación del sistema de registro de ventas y permite interactuar con él a través de la línea de comandos.
     */
    public static void launchApp(){

        // Se crea una instancia de TicketManager para gestionar los boletos de compra.
        TicketManager ticketManager = new TicketManager();
        Scanner scanner = new Scanner(System.in);
        char opcion;

        // Se ejecuta un bucle que continuará hasta que el usuario seleccione la opción para finalizar el programa.
        do{
            System.out.println(generarLineas('=',40));
            System.out.println("------Sistema de registro de ventas-----");
            System.out.println(generarLineas('=',40));

            // Se muestran las opciones del menú.
            System.out.println("\nA. Comprar boletos.");
            System.out.println("B. Mostrar datos de su compra.");
            System.out.println("C. Mostrar Total de su compra. ");
            System.out.println("S. Finalizar programa.");
            System.out.println("\nSeleccione una opción ingresando la letra correspondiente:");

            // Se lee la opción ingresada por el usuario.
            opcion = scanner.next().charAt(0);
            scanner.nextLine();

            switch(opcion){
                case 'A':
                    // Se solicita al usuario que ingrese el nombre del comprador y la cantidad de boletos a comprar.
                    System.out.println(generarLineas('-',40));
                    System.out.println("Ingrese el nombre del comprador: ");
                    String nombreComprador = scanner.nextLine();
                    System.out.println("Ingrese la cantidad de boletos a comprar: ");
                    int cantidadBoletos = scanner.nextInt();

                    // Se crea una lista para almacenar los pasajeros asociados con los boletos.
                    ArrayList<Passenger> passengers = new ArrayList<>();
                    scanner.nextLine();

                    // Se solicita al usuario que ingrese el nombre completo de cada pasajero y se agregan a la lista.
                    for (int i = 1; i < cantidadBoletos; i++) {
                        System.out.println("Ingrese el nombre completo del pasajero " + i + ": ");
                        String nombrePasajero = scanner.nextLine();
                        passengers.add(new Passenger(nombrePasajero));
                    }
                    // Se vende el boleto llamando al método correspondiente en TicketManager (venderBoleto).
                    ticketManager.venderBoleto(nombreComprador, cantidadBoletos, passengers);
                    break;

                case 'B':
                    // Se muestra los datos de la compra llamando al método
                    // correspondiente en TicketManager (displayTicket).
                    System.out.println("-----Datos de su compra-----");
                    ArrayList<Ticket> ticketList = ticketManager.getTicketList();
                    if (ticketList.isEmpty()){
                        System.out.println("No hay compras registradas. ");
                    }
                    else{
                        for (int i = 0; i < ticketList.size(); i++){
                            System.out.println("Compra #" + (i + 1));
                            ticketManager.displayTicket(ticketList.get(i));
                            System.out.println(generarLineas('-',40));
                        }
                    }
                    break;

                case 'C':
                    // Opción adicional la cual muestra el total de todas las compras llamando
                    // al método correspondiente en TicketManager (mostrarTotal).
                    double Total = ticketManager.mostrarTotal();
                    System.out.println(generarLineas('-',40));
                    System.out.println("Total de todas las compras: $" + Total + " MXN");
                    System.out.println(generarLineas('-',40));
                    break;

                case 'S':
                    // Se imprime un mensaje de despedida y se sale del bucle finalizando el programa.
                    System.out.println("¡Hasta luego!");
                    break;
                default:
            }
        } while (opcion != 'S');
    }
}
