package edu.juan.garcia.reto4.process;
import edu.juan.garcia.reto4.data.Passenger;
import edu.juan.garcia.reto4.data.Ticket;
import java.util.ArrayList;

public class TicketManager {
    private final double precioTicket = 1250.50;
    private ArrayList<Ticket> ticketList;

    public TicketManager(){
        this.ticketList = new ArrayList<>();
    }

    public void venderBoleto(String nombreComprador, int cantidadBoletos, ArrayList<Passenger> passengers){
        Ticket ticket = new Ticket(nombreComprador, cantidadBoletos);
        for (Passenger passenger : passengers) {
            ticket.agregarPasajero(passenger);
        }
        ticketList.add(ticket);
    }

    public ArrayList<Ticket> getTicketList() {
        return ticketList;
    }

    public void displayTicket(Ticket ticket) {
        System.out.println("Nombre del comprador: " + ticket.getNombreComprador());
        System.out.println("Cantidad de boletos: " + ticket.getCantidadBoletos());
        System.out.println("Detalle de pasajeros: ");
        for (Passenger passenger : ticket.getPassengers()){
            System.out.println("- " + passenger.getNombreCompleto());
        }
        double total = precioTicket * ticket.getCantidadBoletos();
        System.out.println("Importe total: $" + total + "MXN");
    }

    public double mostrarTotal() {
    double totalGeneral = 0;
    for (Ticket ticket : ticketList){
        totalGeneral += ticket.getCantidadBoletos() * precioTicket;
    }
    return totalGeneral;
    }

}
