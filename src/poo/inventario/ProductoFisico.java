package poo.inventario;

public class ProductoFisico extends Producto implements Vendible {
    private double pesoKg;

    public ProductoFisico(String nombre, double precioBase, int stock, double pesoKg) {
        super(nombre, precioBase, stock);
        this.pesoKg = pesoKg;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() + 5 * pesoKg;
    }

    public void vender(int cantidad) throws SinStockException {
        if (cantidad > getStock()) {
            throw new SinStockException("Stock insuficiente del producto. Disponible: " + getStock() + " unidades.");
        }

        setStock(getStock() - cantidad);
    }

    public double getPesoKg() {
        return pesoKg;
    }
}
