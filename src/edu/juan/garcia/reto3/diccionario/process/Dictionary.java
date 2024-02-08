package edu.juan.garcia.reto3.diccionario.process;

public class Dictionary {

    public static final String[]palabras = {"Aleación", "Actuador", "Amperio", "Batería", "Corrosión", "Electricidad", "Electroimán",
            "Generador", "GPS", "Hardware"
    };

    public static final String[]significado = {"Mezcla de dos o más metales",
            "Dispositivo que convierte una señal de control en movimiento",
            "Unidad de medida de la intensidad de corriente eléctrica",
            "Dispositivo que almacena energía",
            "Degradación de un material por reacción química con su entorno",
            "Flujo de electrones",
            "Imán creado por un campo eléctrico",
            "Dispositivo que convierte energía mecánica en energía eléctrica",
            "Sistema de posicionamiento global",
            "Componentes físicos de un sistema informático"
    };

    public static void listarPalabras(){
        for (String palabra : palabras){
            System.out.println(palabra);
        }
    }
}
