package edu.juan.garcia.reto5.reto5_1.data;

public class UbicacionGeografica {
    private double latitud;
    private double altitud;

    public UbicacionGeografica(double latitud, double altitud) {
        this.latitud = latitud;
        this.altitud = altitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }
}