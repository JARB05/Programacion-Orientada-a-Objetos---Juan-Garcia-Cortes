package edu.juan.garcia.reto4.data;

import java.util.ArrayList;

public class Ticket {
    private String nombreComprador;
    private int cantidadDeTickets;
    private ArrayList<Passenger> passengers;

    public Ticket(String nombreComprador, int cantidadDeTickets){
        this.nombreComprador = nombreComprador;
        this.cantidadDeTickets = cantidadDeTickets;
        this.passengers = new ArrayList<>();
    }

    public String getNombreComprador(){
        return nombreComprador;
    }

    public int getCantidadDeTickets(){
        return cantidadDeTickets;
    }

    public void agregarPasajero(Passenger passenger){
        passengers.add(passenger);
    }

    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }
}
