package edu.juan.garcia.evidencia2.ui;

/**
 * Clase que proporciona cadenas de texto en inglés para la interfaz de usuario de la aplicación TecmiFlix.
 * Esta clase hereda de la clase Textos y proporciona implementaciones específicas para el idioma inglés.
 */
public class Eng extends Textos {

    /** Constructor que inicializa las cadenas de texto en inglés */
    public Eng() {
        TITULO = "TecmiFlix";
        USUARIO = "Enter your username: ";
        CONTRASENA = "Enter your password: ";
        COSTO = "The cost to pay is: ";
        DESGLOSEP = "Do you want to see the breakdown of purchases? (Y/N)";
        DESGLOSE = "Purchase breakdown:";
        NOVALIDO = "Invalid option. Showing the breakdown of default purchases.";
    }
}