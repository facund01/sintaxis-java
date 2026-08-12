package poo.ejercicio01;

public class CuentaBancaria {
    private String titular;
    private String nroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String nroCuenta, double saldo) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("La cantidad a depositar debe ser mayor a 0.");
        }

        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("La cantidad a retirar debe ser mayor a 0.");
        }

        if (monto > saldo) {
            throw new IllegalStateException("Saldo insuficiente.");
        }

        saldo -= monto;
    }

    public void obtenerInformacion() {
        System.out.println(titular + " | " + nroCuenta + " | $" + saldo);
    }
}