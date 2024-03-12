package edu.juan.garcia.reto5.reto5_2.data;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nombre;
    private final List<Cliente> clientes;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente){
        clientes.remove(cliente);
    }

    public Cliente buscarClientePorId(int idCliente){
        for (Cliente cliente : clientes){
            if (cliente.getIdCliente() == idCliente){
                return cliente;
            }
        }
        return null;
    }

    public Cliente buscarClientePorNombre(String nombreCliente){
        for (Cliente cliente : clientes){
            if (cliente.getNombre().equals(nombreCliente)){
                return cliente;
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
