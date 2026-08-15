import poo.logistica.*;

void main() {
    FlotaService flota = new FlotaService();
    Vehiculo camionDeCarga = new CamionDeCarga("ABC123", "Iveco", "2015", 62000.0, 2100.0, TipoCombustible.DIESEL, 3.2);
    Vehiculo autobusPasajeros = new AutobusPasajeros("ABC124", "Mercedes", "2024", 42000.0, 4500,TipoCombustible.ELECTRICO, 50);

    flota.agregarVehiculo(camionDeCarga);
    flota.agregarVehiculo(autobusPasajeros);

    // Asignar y finalizar viaje exitosamente
    try {
        Viaje viaje = flota.asignarViaje("ABC124", "BsAs", "MdP", 400.0, 40);
        System.out.println("=== ASIGNACIÓN EXITOSA ===");
        System.out.println("Origen: " + viaje.getOrigen());
        System.out.println("Destino: " + viaje.getDestino());
        System.out.println("Distancia: " + viaje.getDistanciaKm() + " km");
        System.out.println("Costo total: $" + viaje.calcularCostoTotal());

        flota.finalizarViaje(viaje);

        System.out.println("\n=== FINALIZACIÓN DEL VIAJE ===");
        System.out.println("Estado del camión: " + camionDeCarga.getEstado());
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    // Intentar asignar un viaje con una carga superior a la capacidad máxima
    try {
        flota.asignarViaje("ABC123", "CABA", "CBA", 800.0, 6000.0);
    } catch (VehiculoNoEncontradoException | VehiculoNoDisponibleException | CapacidadExcedidaException e) {
        System.out.println("\n=== ERROR DE CAPACIDAD ===");
        System.out.println(e.getMessage());
    }

    // Intentar asignar un viaje a una patente inexistente
    try {
        flota.asignarViaje("AAA123", "Mendoza", "La Pampa", 2000.0, 50.0);
    } catch (VehiculoNoEncontradoException | VehiculoNoDisponibleException | CapacidadExcedidaException e) {
        System.out.println("\n=== VEHÍCULO NO ENCONTRADO ===");
        System.out.println(e.getMessage());
    }

    // Intentar asignar un vehículo que está ocupado o en mantenimiento
    try {
        flota.asignarViaje("ABC124", "Salta", " Corrientes", 2000.0, 40.0);
        flota.asignarViaje("AAA124", "Buenos Aires", "Santa Fe", 230.0, 20.0);
    } catch (VehiculoNoDisponibleException | VehiculoNoEncontradoException | CapacidadExcedidaException e) {
        System.out.println("\n=== VEHÍCULO NO DISPONIBLE ===");
        System.out.println(e.getMessage());
    }

    // Realizar mantenimiento
    System.out.println("\n=== MANTENIMIENTO ===");

    camionDeCarga.realizarMantenimiento();

    System.out.println("Estado del camión: " + camionDeCarga.getEstado());

    System.out.println("Necesita mantenimiento: " + camionDeCarga.necesitaMantenimiento());

}