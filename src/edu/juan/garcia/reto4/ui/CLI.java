package edu.juan.garcia.reto4.ui;
import java.util.Scanner;
public class CLI {
    public static void launchApp(){
        Scanner scanner = new Scanner(System.in);
        char opcion = scanner.next().charAt(0);

        do{
            System.out.println("Sistema de registro de ventas");
            System.out.println("\nA. Comprar boletos.");
            System.out.println("B. Mostrar datos de su compra.");
            System.out.println("S. Finalizar programa.");
            switch(opcion){
                case 'A':
                    break;
                case 'B':
                    break;
                case 'S':
                    break;
                default:
            }
        }
        while (opcion != 'S');
    }
}
