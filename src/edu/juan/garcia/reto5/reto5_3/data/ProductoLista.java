package edu.juan.garcia.reto5.reto5_3.data;

public class ProductoLista{
    private Producto producto;
    private int cantidad;
    private float importeTotal;

    public ProductoLista(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        calcularImporteTotal();
    }

    private void calcularImporteTotal(){
        this.importeTotal = producto.getPrecioUnitario() * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
        calcularImporteTotal();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        calcularImporteTotal();
    }

    public float getImporteTotal() {
        return importeTotal;
    }
}