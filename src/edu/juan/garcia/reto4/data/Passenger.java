package edu.juan.garcia.reto4.data;

/**
 * Esta clase representa al pasajero que compra un boleto.
 */
public class Passenger {

    /**
     * El nombre completo del pasajero.
     */
    private String nombreCompleto;

    /**
     * Crea un nuevo objeto Passenger con el nombre completo proporcionado por el usuario.
     * @param nombreCompleto El nombre completo del pasajero.
     */
    public Passenger(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * Obtiene el nombre completo del pasajero.
     * @return El nombre completo del pasajero.
     */
    public String getNombreCompleto(){
        return nombreCompleto;
    }

}
