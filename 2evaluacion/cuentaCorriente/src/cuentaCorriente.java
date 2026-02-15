package BANCO;

import java.util.Scanner;

public class cuentaCorriente {
    private long iban;
    private double saldo;
    private cliente titular;
    private static long contIban = 1;

    public cuentaCorriente(long iban, double saldo, Cliente titular) {
        this.iban = iban++;
        this.saldo = 0;
        this.titular = titular;
    }

    public long getIban() {
        return iban;
    }

    public void setIban(long iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void sacarDinero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuanto dinero quieres sacar?");
        double cantidad = teclado.nextDouble();

        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void ingresarDinero(double cantidad) {
        System.out.println("Cuanto dinero quieres ingresar?");
        saldo += cantidad;
    }

    public void mostrarInformacion() {
        System.out.println(titular.getNombre() + " " + titular.getApellidos());
        System.out.println(getIban());
        System.out.println(getSaldo());
    }

    public void traspasarDinero(cuentaCorriente cuentaDestino, double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            this.saldo -= cantidad;
            cuentaDestino.ingresarDinero(cantidad);
            System.out.println("Has traspasado" + cantidad + "euros a la cuenta con IBAN" + cuentaDestino.getIban());
        } else {
            System.out.println("No se puede realizar la transaccion");
        }
    }

    public void cambioTitular() {

    }

}
