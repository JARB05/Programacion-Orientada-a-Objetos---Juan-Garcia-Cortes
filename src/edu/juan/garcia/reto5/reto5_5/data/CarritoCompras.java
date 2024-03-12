package edu.juan.garcia.reto5.reto5_5.data;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {

    private List<ItemCarrito> items;

    public CarritoCompras(){
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemCarrito item){
        items.add(item);
    }

    public void eliminarItem(ItemCarrito item) {
        items.remove(item);
    }

    public List<ItemCarrito> getItems(){
        return items;
    }
}
