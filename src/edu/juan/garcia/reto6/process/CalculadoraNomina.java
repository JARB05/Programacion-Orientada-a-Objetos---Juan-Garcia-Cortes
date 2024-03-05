package edu.juan.garcia.reto6.process;

import edu.juan.garcia.reto6.data.Empleado;

import java.util.List;

public class CalculadoraNomina {
    public static double calcularTotalNomina(List<Empleado> empleados) {
        double totalNomina = 0;
        for (Empleado empleado : empleados) {
            totalNomina += calcularSueldoTotal(empleado);
        }
        return totalNomina;
    }

    public static double calcularTotalSueldoNormal(List<Empleado> empleados) {
        double totalSueldoNormal = 0;
        for (Empleado empleado : empleados) {
            totalSueldoNormal += empleado.getCategoria().getSueldoBase() * empleado.getHorasTrabajadas();
        }
        return totalSueldoNormal;
    }

    public static double calcularTotalHorasExtras(List<Empleado> empleados){
        double totalHorasExtras= 0;
        for (Empleado empleado : empleados){
            totalHorasExtras += empleado.getCategoria().getPagoHoraExtra() * empleado.getHorasExtras();
        }
        return totalHorasExtras;
    }

    public static int calcularTotalHorasLaboradas(List<Empleado> empleados){
        int totalHorasLaboradas = 0;
        for (Empleado empleado : empleados){
            totalHorasLaboradas += empleado.getHorasTrabajadas() + empleado.getHorasExtras();
        }
        return totalHorasLaboradas;
    }

    public static int calcularTotalHorasExtraLaboradas(List<Empleado> empleados){
        int totalHorasExtraLaboradas = 0;
        for (Empleado empleado : empleados){
            totalHorasExtraLaboradas += empleado.getHorasTrabajadas() + empleado.getHorasExtras();
        }
        return totalHorasExtraLaboradas;
    }

    public static int contarEmpleadosConHorasExtras(List<Empleado>empleados){
        int count = 0;
        for (Empleado empleado : empleados){
            if (empleado.getHorasExtras() > 0){
                count++;
            }
        }
        return count;
    }

    public static int contarEmpleadosSinHorasExtras(List<Empleado>empleados){
        int count = 0;
        for (Empleado empleado : empleados){
            if (empleado.getHorasExtras() == 0){
                count++;
            }
        }
        return count;
    }

    private static double calcularSueldoTotal(Empleado empleado){
        return empleado.getCategoria().getSueldoBase() * empleado.getHorasTrabajadas() +
                empleado.getCategoria().getPagoHoraExtra() * empleado.getHorasExtras();
    }

}

