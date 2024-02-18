package edu.juan.garcia.reto4.data;

import java.util.ArrayList;

public class Ticket {
    private final String nombreComprador;
    private int cantidadBoletos;
    private ArrayList<Passenger> passengers;

    public Ticket(String nombreComprador, int cantidadDeTickets){
        this.nombreComprador = nombreComprador;
        this.cantidadBoletos = cantidadDeTickets;
        this.passengers = new ArrayList<>();
    }

    public String getNombreComprador(){
        return nombreComprador;
    }

    public int getCantidadBoletos(){
        return cantidadBoletos;
    }

    public void agregarPasajero(Passenger passenger){
        passengers.add(passenger);
    }

    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }
}
