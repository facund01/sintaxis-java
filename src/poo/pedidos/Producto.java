package poo.pedidos;

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void aumentarStock(int cantidad) {
        stock += cantidad;
    }

    public void reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        }
    }

    public int consultarStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }
}
