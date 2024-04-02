package edu.juan.garcia.evidencia2.ui;

/**
 * Clase que proporciona cadenas de texto en español para la interfaz de usuario de la aplicación TecmiFlix.
 * Esta clase hereda de la clase Textos y proporciona implementaciones específicas para el idioma español.
 */
public class Esp extends Textos {

    /** Constructor que inicializa las cadenas de texto en español */
    public Esp() {
        TITULO = "TecmiFlix";
        USUARIO = "Ingrese su nombre de usuario: ";
        CONTRASENA = "Ingrese su contraseña: ";
        COSTO = "El costo a pagar es: ";
        DESGLOSEP = "¿Desea ver el desglose de las compras? (S/N)";
        DESGLOSE = "Desglose de las compras:";
        NOVALIDO = "Opción no válida. Mostrando el desglose de las compras por defecto.";
    }
}