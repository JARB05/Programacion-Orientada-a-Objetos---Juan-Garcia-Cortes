package edu.juan.garcia.reto2.cajas;
import edu.juan.garcia.reto2.cajas.ui.CLI;

public class Main {
    public static void main(String[] args) {
        try {
            CLI.LaunchCalculator();
        } catch (Exception e) {
            System.out.println("Error inesperado " + e);
        }
    }
}