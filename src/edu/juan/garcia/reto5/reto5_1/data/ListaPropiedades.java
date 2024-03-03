package edu.juan.garcia.reto5.reto5_1.data;

import java.util.ArrayList;
import java.util.List;

public class ListaPropiedades {
    private List<PropiedadInmobiliaria> propiedades;

    public ListaPropiedades() {
        this.propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(PropiedadInmobiliaria propiedad) {
        propiedades.add(propiedad);
    }

    public void eliminarPropiedad(PropiedadInmobiliaria propiedad) {
        propiedades.remove(propiedad);
    }

    public List<PropiedadInmobiliaria> getPropiedades() {
        return propiedades;
    }
}
