package edu.juan.garcia.evidencia1.ui;
import edu.juan.garcia.evidencia1.process.RegistroMedicamentos;
import edu.juan.garcia.evidencia1.data.Medicamento;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {
    public static void launchApp(ArrayList<Medicamento> listaMedicamentos) {
        Scanner scanner = new Scanner(System.in);
        RegistroMedicamentos registro = new RegistroMedicamentos();

        System.out.println("Bienvenido al sistema de registro de medicamentos.");

        // Solicitar usuario y contraseña
        System.out.print("Ingrese su usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        // Verificar usuario y contraseña
        if (!usuario.equals("Juan") || !contrasena.equals("1234")) {
            System.out.println("Usuario o contraseña incorrectos. Saliendo del programa.");
            return;
        }

        // Lógica de registro de medicamentos
        while (true) {
            System.out.println("\nIngrese los datos del medicamento (o 'salir' para terminar):");
            System.out.print("Nombre químico: ");
            String nombreQuimico = scanner.nextLine();
            if (nombreQuimico.equalsIgnoreCase("salir")) {
                break;
            }
            System.out.print("Nombre genérico: ");
            String nombreGenerico = scanner.nextLine();
            System.out.print("Nombre registrado: ");
            String nombreRegistrado = scanner.nextLine();
            System.out.print("Precio al público: ");
            double precioPublico = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer del scanner

            // Mostrar opciones de forma farmacéutica (lee el commit y cambialo)
            System.out.println("Opciones de forma farmacéutica: sólido, semisólido, líquido");
            System.out.print("Forma farmacéutica (ingrese la palabra sin acentos): ");
            String formaFarmaceutica = scanner.nextLine().toLowerCase();

            // Crear instancia de Medicamento y agregar a la lista
<<<<<<< HEAD
            registro.agregarMedicamento(listaMedicamentos, nombreQuimico, nombreGenerico, nombreRegistrado, precioPublico, formaFarmaceutica);
=======
            registro.agregarMedicamento(listaMedicamentos, usuario, nombreQuimico, nombreGenerico, nombreRegistrado, precioPublico, formaFarmaceutica);
>>>>>>> origin/Evidencia-1
        }

        // Generar reporte
        registro.generarReporte(usuario,listaMedicamentos);
    }
}