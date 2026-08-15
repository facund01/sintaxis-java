package poo.logistica;

public class Viaje {
    private String origen;
    private String destino;
    private double distanciaKm;
    private double cargaSolicitada; // Kg de carga o cantidad de personas
    private Vehiculo vehiculoAsignado;

    public Viaje(String origen, String destino, double distanciaKm, double cargaSolicitada, Vehiculo vehiculoAsignado) {
        this.origen = origen;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
        this.cargaSolicitada = cargaSolicitada;
        this.vehiculoAsignado = vehiculoAsignado;
    }

    public double calcularCostoTotal() {
        return distanciaKm * vehiculoAsignado.calcularCostoPorKm();
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public double getCargaSolicitada() {
        return cargaSolicitada;
    }

    public void setCargaSolicitada(double cargaSolicitada) {
        this.cargaSolicitada = cargaSolicitada;
    }

    public Vehiculo getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    public void setVehiculoAsignado(Vehiculo vehiculoAsignado) {
        this.vehiculoAsignado = vehiculoAsignado;
    }
}
