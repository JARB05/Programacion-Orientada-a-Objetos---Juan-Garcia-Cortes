package edu.juan.garcia.reto2.cajas.process;

/**
 * Clase que proporciona funciones para el control de compra y venta de cajas de papel.
 */
public class Calculator {

    /**
     * Monto total de ventas.
     */
    public static double totalVentas = 0;
    /**
     * Monto total de compras.
     */
    public static double totalCompras = 0;
    /**
     * Monto actual en la caja.
     */
    public static double montoEnCaja = 0;
    /**
     * Cantidad total de compras realizadas.
     */
    public static double cantidadTotalCompras = 0;
    /**
     * Cantidad total de ventas realizadas.
     */
    public static double cantidadTotalVentas = 0;
    /**
     * Contador de operaciones realizadas.
     */
    public static int contadorDeOperaciones = 0;

    /**
     * Realiza la compra de cajas de papel.
     *
     * @param cantidadCompras Cantidad de cajas a comprar.
     * @param costo Costo de las cajas a comprar.
     */
    public static void comprarCajas(int cantidadCompras, double costo) {
        double monto = cantidadCompras * costo;
        totalCompras += monto;
        montoEnCaja -= monto;
        cantidadTotalCompras += cantidadCompras;
        contadorDeOperaciones++;

        System.out.println("La compra realizada por " + cantidadCompras + " cajas al costo " + costo + " es igual a " + monto);
    }

    /**
     * Realiza la venta de caja de papel.
     *
     * @param cantidadVentas Cantidad de cajas a vender.
     * @param precio Precio de las cajas a vender.
     */
    public static void venderCajas(int cantidadVentas, double precio) {
        double monto = cantidadVentas * precio;
        totalVentas += monto;
        montoEnCaja += monto;
        cantidadTotalVentas += cantidadVentas;
        contadorDeOperaciones++;

        System.out.println("La venta realizada por " + cantidadVentas + " cajas al precio de " + precio + " es igual a " + monto);
    }

    /**
     * Muestra un reporte con información sobre las operaciones realizadas.
     */
    public static void mostrarReporte() {
        System.out.println("Cantidad total de ventas: " + cantidadTotalVentas);
        System.out.println("Cantidad total de compras: " + cantidadTotalCompras);
        System.out.println("Ingresos generados por ventas: " + totalVentas);
        System.out.println("Egresos generados por compras: " + totalCompras);
        System.out.println("Monto en la caja: " + montoEnCaja);
    }
}