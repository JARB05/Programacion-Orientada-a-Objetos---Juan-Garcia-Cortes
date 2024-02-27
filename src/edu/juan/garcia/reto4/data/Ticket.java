package edu.juan.garcia.reto4.data;

import java.util.ArrayList;

/**
 * Esta clase representa un boleto de compra que contiene información sobre el comprador y los pasajeros asociados.
 */
public class Ticket {

    /** El nombre del comprador del boleto. */
    private final String nombreComprador;

    /** La cantidad de boletos comprados. */
    private int cantidadBoletos;

    /** La lista de pasajeros asociados con este boleto. */
    private ArrayList<Passenger> passengers;

    /**
     * Crea un nuevo onjeto Ticket con el nombre del comprador y la cantidad de boletos proporcionados.
     * @param nombreComprador El nombre del comprador del boleto.
     * @param cantidadDeTickets La cantidad de boletos comprados.
     */
    public Ticket(String nombreComprador, int cantidadDeTickets){
        this.nombreComprador = nombreComprador;
        this.cantidadBoletos = cantidadDeTickets;
        this.passengers = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del comprador del boleto.
     * @return El nombre del comprador del boleto.
     */
    public String getNombreComprador(){
        return nombreComprador;
    }

    /**
     * Obtiene la cantidad de boletos comprados.
     * @return La cantidad de boletos comprados.
     */
    public int getCantidadBoletos(){
        return cantidadBoletos;
    }

    /**
     * Agrega un pasajero asociado con este boleto.
     * @param passenger El pasajero a agregar.
     */
    public void agregarPasajero(Passenger passenger){
        passengers.add(passenger);
    }

    /**
     * Obtiene la lista de pasajeros asociados con este boleto.
     * @return La lista de pasajeros asociados con este boleto.
     */
    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }
}
