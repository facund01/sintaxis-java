import poo.ejercicio01.CuentaBancaria;

void main() {
    CuentaBancaria cuenta01 = new CuentaBancaria("Facundo Lara", "CA-001", 5000.00);

    cuenta01.obtenerInformacion();

    cuenta01.retirar(1200);

    cuenta01.obtenerInformacion();

    cuenta01.depositar(4000);

    cuenta01.obtenerInformacion();
}
