package poo.inventario;

public abstract class Producto {
    private String nombre;
    private double precioBase;
    private int stock;

    // Constructor para productos físicos (con stock)
    public Producto(String nombre, double precioBase, int stock) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    // Constructor para productos digitales (sin stock)
    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioFinal();

    public int getStock() {
        return stock;
    }

    public void setStock(int nuevoStock) {
        this.stock = nuevoStock;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getNombre() {
        return nombre;
    }
}
