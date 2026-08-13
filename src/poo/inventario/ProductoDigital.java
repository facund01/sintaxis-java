package poo.inventario;

public class ProductoDigital extends Producto {
    public ProductoDigital(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() * 1.10;
    }
}
