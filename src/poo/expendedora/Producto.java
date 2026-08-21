package poo.expendedora;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public boolean tieneStock() {
        return stock > 0;
    }

    public void reponerStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
        }
    }

    public void disminuirStock() {
        if (tieneStock()) {
            stock --;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
}
