package edu.juan.garcia.reto4;

import edu.juan.garcia.reto4.ui.CLI;

public class Main {
    public static void main(String[] args) {
        try{
            CLI.launchApp();
        } catch (Exception e){
            System.out.println("Error inesperado " + e );
        }
    }
}
