package edu.juan.garcia.reto5.reto5_3.data;

import java.util.List;

public class TicketCompra {
    private List<ProductoLista> productos;
    private float importeTotal;

    public TicketCompra(List<ProductoLista> productos) {
        this.productos = productos;
        calcularImporteTotal();
    }

    private void calcularImporteTotal(){
        importeTotal = 0;
        for (ProductoLista producto : productos){
            importeTotal += producto.getImporteTotal();
        }
    }

    public List<ProductoLista> getProductos() {
        return productos;
    }

    public float getImporteTotal() {
        return importeTotal;
    }
}
