public class cuentaCorriente {
    private String IBAN;
    private double saldo;
    private String titular; // Luego podemos cambiarlo a Cliente

    public cuentaCorriente(String IBAN, double saldo, String titular) {
        this.IBAN = IBAN;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void mostrarInfo() {
        System.out.println("IBAN: " + IBAN + ", Saldo: " + saldo + ", Titular: " + titular);
    }
}