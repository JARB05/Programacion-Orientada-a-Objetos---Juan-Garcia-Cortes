package edu.juan.garcia.reto5.reto5_4.data;

import java.util.ArrayList;
import java.util.List;

public class ListaContactos {

    private List<Contacto> contactos;

    public ListaContactos(){
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto){
        contactos.add(contacto);
    }

    public void eliminarContacto(Contacto contacto){
        contactos.remove(contacto);
    }

    public List<Contacto> getContactos() {
        return contactos;
    }
}
