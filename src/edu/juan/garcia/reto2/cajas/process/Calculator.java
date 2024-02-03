package edu.juan.garcia.reto2.cajas.process;

public class Calculator {
    public static double totalVentas = 0;
    public static double totalCompras = 0;
    public static double montoEnCaja = 0;
    public static double cantidadTotalCompras = 0;
    public static double cantidadTotalVentas = 0;

    
    public static void comprarCajas(int cantidadCompras, double costo) {
        double monto = cantidadCompras * costo;
        totalCompras += monto;
        montoEnCaja -= monto;
        cantidadTotalCompras += cantidadCompras;

        System.out.println("La compra realizada por " + cantidadCompras + " cajas al costo " + costo + " es igual a " + monto);
    }

    public static void venderCajas(int cantidadVentas, double precio) {
        double monto = cantidadVentas * precio;
        totalVentas += monto;
        montoEnCaja += monto;
        cantidadTotalVentas += cantidadVentas;

        System.out.println("La venta realizada por " + cantidadVentas + " cajas al precio de " + precio + " es igual a " + monto);
    }

    public static void mostrarReporte() {
        System.out.println("Cantidad total de ventas: " + cantidadTotalVentas);
        System.out.println("Cantidad total de compras: " + cantidadTotalCompras);
        System.out.println("Ingresos generados por ventas: " + totalVentas);
        System.out.println("Egresos generados por compras: " + totalCompras);
        System.out.println("Monto en la caja: " + montoEnCaja);
    }
}