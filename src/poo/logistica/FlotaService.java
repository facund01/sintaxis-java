package poo.logistica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlotaService {
    private Map<String, Vehiculo> inventarioVehiculos;
    private List<Viaje> historialViajes;

    public FlotaService() {
        this.inventarioVehiculos = new HashMap<>();
        this.historialViajes = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        inventarioVehiculos.put(vehiculo.getPatente(), vehiculo);
    }

    public Vehiculo buscarVehiculo(String patente) throws VehiculoNoEncontradoException {
        if (!inventarioVehiculos.containsKey(patente)) {
            throw new VehiculoNoEncontradoException("Vehículo no encontrado.");
        }

        return inventarioVehiculos.get(patente);
    }

    public Viaje asignarViaje(String patente, String origen, String destino, double distancia, double carga) throws VehiculoNoEncontradoException, VehiculoNoDisponibleException, CapacidadExcedidaException {
        Vehiculo vehiculo = buscarVehiculo(patente);

        if (!(vehiculo.getEstado() == EstadoVehiculo.DISPONIBLE)) {
            throw new VehiculoNoDisponibleException("El vehículo solicitado no se encuentra disponible.");
        }

        if (carga > vehiculo.obtenerCapacidadMaxima()) {
            throw new CapacidadExcedidaException("La carga excede el límite.");
        }

        vehiculo.setEstado(EstadoVehiculo.EN_VIAJE);
        vehiculo.registrarKilometros(distancia);
        Viaje viaje = new Viaje(origen, destino, distancia, carga, vehiculo);
        historialViajes.add(viaje);
        return viaje;
    }

    public void finalizarViaje(Viaje viaje) {
        if (viaje.getVehiculoAsignado().necesitaMantenimiento()) {
            viaje.getVehiculoAsignado().setEstado(EstadoVehiculo.EN_MANTENIMIENTO);
            return;
        }

        viaje.getVehiculoAsignado().setEstado(EstadoVehiculo.DISPONIBLE);
    }

    public List<Vehiculo> listarVehiculosParaMantenimiento() {
        List<Vehiculo> vehiculosParaMantenimiento = new ArrayList<>();
        for (Vehiculo vehiculo : inventarioVehiculos.values()) {
            if (vehiculo.necesitaMantenimiento()) {
                vehiculosParaMantenimiento.add(vehiculo);
            }
        }

        return vehiculosParaMantenimiento;
    }
}
