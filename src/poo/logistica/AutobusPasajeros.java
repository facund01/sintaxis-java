package poo.logistica;

public class AutobusPasajeros extends Vehiculo {
    private int capacidadPasajeros;

    public AutobusPasajeros(String patente, String marca, String modelo, double kilometraje, double kilometrosDesdeUltimoService, TipoCombustible tipoCombustible, int capacidadPasajeros) {
        super(patente, marca, modelo, kilometraje, kilometrosDesdeUltimoService, tipoCombustible);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    double obtenerCapacidadMaxima() {
        return capacidadPasajeros;
    }

    @Override
    double calcularCostoPorKm() {
        double tarifaBase = 50.0;

        return tarifaBase * obtenerCapacidadMaxima();
    }

    @Override
    public boolean necesitaMantenimiento() {
        return getKilometrosDesdeUltimoService() >= 5000;
    }
}
