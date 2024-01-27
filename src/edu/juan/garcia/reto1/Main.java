package edu.juan.garcia.reto1;

import edu.juan.garcia.reto1.ui.CLI;

/**
 * Es el launcher.
 */

public class Main {
    public static void main(String[] args) {
        try {
            CLI.LaunchCalculator();
        } catch (Exception e) {
            System.out.println("Error inesperado " + e);
        }
    }
}
