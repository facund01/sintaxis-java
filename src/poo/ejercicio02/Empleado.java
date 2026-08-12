package poo.ejercicio02;

public abstract class Empleado {
    private String nombre;
    private String id;

    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public double calcularSalario() {
        return 0.0;
    }

    public void mostrarInformacion() {
        System.out.println(nombre + " | " + id);
    }
}
