package poo.logistica;

public class CamionDeCarga extends Vehiculo {
    private double capacidadEnToneladas;

    public CamionDeCarga(String patente, String marca, String modelo, double kilometraje, double kilometrosDesdeUltimoService, TipoCombustible tipoCombustible, double capacidadEnToneladas) {
        super(patente, marca, modelo, kilometraje, kilometrosDesdeUltimoService, tipoCombustible);
        this.capacidadEnToneladas = capacidadEnToneladas;
    }

    @Override
    public double obtenerCapacidadMaxima() {
        return capacidadEnToneladas * 1000;
    }

    @Override
    double calcularCostoPorKm() {
        double tarifaBase = 100.0;

        if (getTipoCombustible() == TipoCombustible.DIESEL) {
            return tarifaBase + 20;
        }

        return tarifaBase;
    }

    @Override
    public boolean necesitaMantenimiento() {
        return getKilometrosDesdeUltimoService() >= 10000;
    }

    public double getCapacidadEnToneladas() {
        return capacidadEnToneladas;
    }

    public void setCapacidadEnToneladas(double capacidadEnToneladas) {
        this.capacidadEnToneladas = capacidadEnToneladas;
    }
}
