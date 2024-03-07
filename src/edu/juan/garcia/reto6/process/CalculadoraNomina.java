package edu.juan.garcia.reto6.process;

import edu.juan.garcia.reto6.data.Empleado;

import java.util.List;

/**
 * Clase en la que se realizan las operaciones necesarias para calcular lo solicitado.
 */
public class CalculadoraNomina {

    /**
     * Calcula el total de la nómina.
     * @param empleados Lista de empleados registrados por el usuario.
     * @return El total de la nómina.
     */
    public static double calcularTotalNomina(List<Empleado> empleados) {
        double totalNomina = 0;
        for (Empleado empleado : empleados) {
            totalNomina += calcularSueldoTotal(empleado);
        }
        return totalNomina;
    }

    /**
     * Calcula el total del sueldo normal de cada empleado.
     * @param empleados Lista de empleados registrados por el usuario.
     * @return El total del sueldo normal del empleado.
     */
    public static double calcularTotalSueldoNormal(List<Empleado> empleados) {
        double totalSueldoNormal = 0;
        for (Empleado empleado : empleados) {
            totalSueldoNormal += empleado.getCategoria().getSueldoBase() * empleado.getHorasTrabajadas();
        }
        return totalSueldoNormal;
    }

    /**
     * Calcula el sueldo total de las horas extras laboradas por el empleado.
     * @param empleados Lista de empleados registrados por el usuario.
     * @return El sueldo total por horas extras.
     */
    public static double calcularTotalHorasExtras(List<Empleado> empleados){
        double totalHorasExtras= 0;
        for (Empleado empleado : empleados){
            totalHorasExtras += empleado.getCategoria().getPagoHoraExtra() * empleado.getHorasExtras();
        }
        return totalHorasExtras;
    }

    /**
     * Calcula el total de las horas laboradas en la empresa.
     * @param empleados Lista de empleados registrados por el usuario.
     * @return El total de las horas laboradas en la empresa.
     */
    public static int calcularTotalHorasLaboradas(List<Empleado> empleados){
        int totalHorasLaboradas = 0;
        for (Empleado empleado : empleados){
            totalHorasLaboradas += empleado.getHorasTrabajadas() + empleado.getHorasExtras();
        }
        return totalHorasLaboradas;
    }

    /**
     * Calcula el total de horas extras laboradas en la empresa.
     * @param empleados Lista de empleados registrados por el usuario.
     * @return El total de horas extras laboradas en la empresa.
     */
    public static int calcularTotalHorasExtraLaboradas(List<Empleado> empleados){
        int totalHorasExtraLaboradas = 0;
        for (Empleado empleado : empleados){
            totalHorasExtraLaboradas += empleado.getHorasExtras();
        }
        return totalHorasExtraLaboradas;
    }

    /**
     * Calcula cuántos empleados cuentan con horas extra.
     * @param empleados Lista de empleados registrados por el usuario.
     * @return La cantidad de empleados con horas extra.
     */
    public static int contarEmpleadosConHorasExtras(List<Empleado>empleados){
        int count = 0;
        for (Empleado empleado : empleados){
            if (empleado.getHorasExtras() > 0){
                count++;
            }
        }
        return count;
    }

    /**
     * Calcula cuántos empleados no cuentan con horas extra.
     * @param empleados Lista de empleados registrados por el usuario.
     * @return La cantidad de empleados sin horas extra.
     */
    public static int contarEmpleadosSinHorasExtras(List<Empleado>empleados){
        int count = 0;
        for (Empleado empleado : empleados){
            if (empleado.getHorasExtras() == 0){
                count++;
            }
        }
        return count;
    }

    /**
     * Calcula el sueldo total del empleado.
     * @param empleado El empleado registrado por el usuario.
     * @return El sueldo total del empleado.
     */
    private static double calcularSueldoTotal(Empleado empleado){
        return empleado.getCategoria().getSueldoBase() * empleado.getHorasTrabajadas() +
                empleado.getCategoria().getPagoHoraExtra() * empleado.getHorasExtras();
    }
}