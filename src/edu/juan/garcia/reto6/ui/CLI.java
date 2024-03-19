package edu.juan.garcia.reto6.ui;

import edu.juan.garcia.reto6.data.Categoria;
import edu.juan.garcia.reto6.data.Empleado;
import edu.juan.garcia.reto6.process.CalculadoraNomina;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que representa la interfaz de usuario en línea de comandos.
 * Permite capturar datos de empleados y generar un reporte de nómina.
 */
public class CLI {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Método principal que inicia la aplicación.
     */
    public static void launchApp(){
        List<Empleado> empleados = capturarEmpleados();
        generarReporteNomina(empleados);
    }

    /**
     * Captura los datos de los empleados ingresados por el usuario.
     * @return Lista de empleados registrados.
     */
    private static List<Empleado> capturarEmpleados(){
        List<Empleado> empleados = new ArrayList<>();

        System.out.println("Ingrese la cantidad de empleados a capturar: ");
        int cantidadEmpleados = scanner.nextInt();

        for(int i = 0; i < cantidadEmpleados; i++){
            System.out.println("Empleado #" + (i + 1));
            scanner.nextLine();
            System.out.println("Nombre completo: ");
            String nombreCompleto = scanner.nextLine();

            System.out.println("Horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();

            System.out.println("Horas extras trabajadas: ");
            int horasExtras = scanner.nextInt();

            System.out.println("Teléfono: ");
            String telefono = scanner.next();

            System.out.println("Fecha de nacimiento (D/M/A): ");
            String fechaNacimientoString = scanner.next();
            Date fechaNacimiento = null;
            try{
                fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimientoString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            scanner.nextLine();

            System.out.println("Categoría (1 - Empleado de ventas, 2 - Administrador, 3 - Gerente): ");
            int opcionCategoria = scanner.nextInt();
            Categoria categoria = null;
            switch (opcionCategoria){
                case 1:
                    categoria = new Categoria("Empleado de ventas", "EV", 100.00, 50.00);
                    break;
                case 2:
                    categoria = new Categoria("Administrador", "ADM", 180.00, 100.00);
                    break;
                case 3:
                    categoria = new Categoria("Gerente", "GER", 250.00, 150.00);
                    break;
                default:
                    System.out.println("Opción de categoría no válida. Se asignará Empleado de ventas por defecto.");
                    categoria = new Categoria("Empleado de ventas", "EV", 100.00, 50.00);
                    break;
            }
            scanner.nextLine();
            empleados.add(new Empleado(nombreCompleto, horasTrabajadas, horasExtras, telefono, fechaNacimiento, categoria));
        }
        return empleados;
    }

    /**
     * Genera un reporte de nómina con los datos de los empleados.
     * @param empleados Lista de empleados registrados.
     */
    private static void generarReporteNomina(List<Empleado> empleados){
        System.out.println("\n--- Reporte de Nómina ---");
        System.out.println("Total de la nómina de la empresa: $" + CalculadoraNomina.calcularTotalNomina(empleados));
        System.out.println("Total a pagar por sueldo normal: $" + CalculadoraNomina.calcularTotalSueldoNormal(empleados));
        System.out.println("Total a pagar por horas extras: $" + CalculadoraNomina.calcularTotalHorasExtras(empleados));
        System.out.println("Total de horas laboradas en la empresa: " + CalculadoraNomina.calcularTotalHorasLaboradas(empleados));
        System.out.println("Total de personas que tienen horas extras: " + CalculadoraNomina.contarEmpleadosConHorasExtras(empleados));
        System.out.println("Total de personas que no tienen horas extras: " + CalculadoraNomina.contarEmpleadosSinHorasExtras(empleados));
        System.out.println("Total de horas extras laboradas en la empresa: " + CalculadoraNomina.calcularTotalHorasExtraLaboradas(empleados));
    }
}