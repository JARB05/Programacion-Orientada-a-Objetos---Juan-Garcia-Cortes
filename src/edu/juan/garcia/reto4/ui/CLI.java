package edu.juan.garcia.reto4.ui;
import edu.juan.garcia.reto4.data.Passenger;
import edu.juan.garcia.reto4.data.Ticket;
import edu.juan.garcia.reto4.process.TicketManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class CLI {

    public static String generarLineas(char caracter, int longitud){
        char[] lineaChars = new char[longitud];
        Arrays.fill(lineaChars,caracter);
        return new String(lineaChars);
    }

    public static void launchApp(){
        TicketManager ticketManager = new TicketManager();
        Scanner scanner = new Scanner(System.in);
        char opcion;


        do{
            System.out.println(generarLineas('=',40));
            System.out.println("------Sistema de registro de ventas-----");
            System.out.println(generarLineas('=',40));

            System.out.println("\nA. Comprar boletos.");
            System.out.println("B. Mostrar datos de su compra.");
            System.out.println("C. Mostrar Total de su compra. ");
            System.out.println("S. Finalizar programa.");
            System.out.println("\nSeleccione una opción ingresando la letra correspondiente:");
            opcion = scanner.next().charAt(0);
            scanner.nextLine();

            switch(opcion){
                case 'A':
                    System.out.println(generarLineas('-',40));
                    System.out.println("Ingrese el nombre del comprador: ");
                    String nombreComprador = scanner.nextLine();
                    System.out.println("Ingrese la cantidad de boletos a comprar: ");
                    int cantidadBoletos = scanner.nextInt();
                    ArrayList<Passenger> passengers = new ArrayList<>();
                    scanner.nextLine();
                    for (int i = 1; i < cantidadBoletos; i++) {
                        System.out.println("Ingrese el nombre completo del pasajero " + i + ": ");
                        String nombrePasajero = scanner.nextLine();
                        passengers.add(new Passenger(nombrePasajero));
                    }
                    ticketManager.venderBoleto(nombreComprador, cantidadBoletos, passengers);
                    break;

                case 'B':
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
                    double Total = ticketManager.mostrarTotal();
                    System.out.println(generarLineas('-',40));
                    System.out.println("Total de todas las compras: $" + Total + " MXN");
                    System.out.println(generarLineas('-',40));
                    break;

                case 'S':
                    System.out.println("¡Hasta luego!");
                    break;
                default:
            }
        } while (opcion != 'S');
    }
}
