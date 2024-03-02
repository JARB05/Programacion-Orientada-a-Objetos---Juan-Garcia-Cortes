package edu.juan.garcia.reto5.reto5_3.data;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {

    private List<ProductoLista> productos;

    public CarritoDeCompras() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(ProductoLista producto) {
        productos.add(producto);
    }

    public void eliminarProducto(ProductoLista producto) {
        productos.remove(producto);
    }

    public float calcularTotal() {
        float total = 0;
        for (ProductoLista producto : productos) {
            total += producto.getImporteTotal();
        }
        return total;
    }
}