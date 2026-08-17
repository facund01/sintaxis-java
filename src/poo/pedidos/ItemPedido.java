package poo.pedidos;

public class ItemPedido {
    private Producto producto;
    private int cantidad;

    public ItemPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotalItem() {
        return producto.getPrecio() * cantidad;
    }
}
