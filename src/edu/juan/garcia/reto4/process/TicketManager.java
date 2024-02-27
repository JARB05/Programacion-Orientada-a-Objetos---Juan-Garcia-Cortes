package edu.juan.garcia.reto4.process;
import edu.juan.garcia.reto4.data.Passenger;
import edu.juan.garcia.reto4.data.Ticket;
import java.util.ArrayList;

/**
 * Esta clase gestiona los boletos de compra y proporciona funcionalidades para vender boletos y
 * mostrar información sobre las ventas.
 */
public class TicketManager {

    /** El precio por boleto. */
    private final double precioTicket = 1250.50;

    /** La lista de boletos vendidos. */
    private ArrayList<Ticket> ticketList;

    /**
     * Crea un nuevo gestor de boletos.
     */
    public TicketManager(){
        this.ticketList = new ArrayList<>();
    }

    /**
     * Vende un boleto con el nombre del comprador, la cantidad de boletos y la lista de pasajeros proporcionados.
     * @param nombreComprador El nombre del comprador del boleto.
     * @param cantidadBoletos La cantidad de boletos comprados.
     * @param passengers La lista de pasajeros asociados con el boleto.
     */
    public void venderBoleto(String nombreComprador, int cantidadBoletos, ArrayList<Passenger> passengers){
        Ticket ticket = new Ticket(nombreComprador, cantidadBoletos);
        for (Passenger passenger : passengers) {
            ticket.agregarPasajero(passenger);
        }
        ticketList.add(ticket);
    }

    /**
     * Obtiene la lista de boletos vendidos.
     * @return La lista de boletos vendidos.
     */
    public ArrayList<Ticket> getTicketList() {
        return ticketList;
    }

    /**
     * Muestra los detalles de un boleto.
     * @param ticket El boleto cuyos detalles se mostrarán.
     */
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

    /**
     * Calcula y muestra el total de todas las compras.
     * @return El total de todas las compras.
     */
    public double mostrarTotal() {
    double totalGeneral = 0;
    for (Ticket ticket : ticketList){
        totalGeneral += ticket.getCantidadBoletos() * precioTicket;
    }
    return totalGeneral;
    }

}
