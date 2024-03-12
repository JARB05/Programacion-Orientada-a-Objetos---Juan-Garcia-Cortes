package edu.juan.garcia.reto5.reto5_2.data;

public class CuentaBancaria {
    private int idCuenta;
    private String tipo;
    private double saldo;

    public CuentaBancaria(int idCuenta, String tipo, double saldo) {
        this.idCuenta = idCuenta;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public void depositar(double cantidad){
        saldo += cantidad;
    }

    public void retirar(double cantidad){
        saldo += cantidad;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
