package poo.logistica;

import java.util.Objects;

public abstract class Vehiculo implements Mantenible {
    private String patente;
    private String marca;
    private String modelo;
    private double kilometraje;
    private double kilometrosDesdeUltimoService;
    private EstadoVehiculo estado;
    private TipoCombustible tipoCombustible;

    public Vehiculo(String patente, String marca, String modelo, double kilometraje, double kilometrosDesdeUltimoService, TipoCombustible tipoCombustible) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.kilometrosDesdeUltimoService = kilometrosDesdeUltimoService;
        this.estado = EstadoVehiculo.DISPONIBLE;
        this.tipoCombustible = tipoCombustible;
    }

    abstract double calcularCostoPorKm();

    abstract double obtenerCapacidadMaxima();

    public void registrarKilometros(double kilometros) {
        kilometraje += kilometros;
        kilometrosDesdeUltimoService += kilometros;
    }

    @Override
    public void realizarMantenimiento() {
        estado = EstadoVehiculo.DISPONIBLE;
        kilometrosDesdeUltimoService = 0;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getKilometrosDesdeUltimoService() {
        return kilometrosDesdeUltimoService;
    }

    public void setKilometrosDesdeUltimoService(double kilometrosDesdeUltimoService) {
        this.kilometrosDesdeUltimoService = kilometrosDesdeUltimoService;
    }

    public EstadoVehiculo getEstado() {
        return estado;
    }

    public void setEstado(EstadoVehiculo estado) {
        this.estado = estado;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(patente, vehiculo.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(patente);
    }
}
