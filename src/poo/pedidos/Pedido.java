package poo.pedidos;

import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> items;
    private EstadoPedido estadoPedido;

    public Pedido(Cliente cliente, List<ItemPedido> items, EstadoPedido estadoPedido) {
        this.cliente = cliente;
        this.items = items;
        this.estadoPedido = estadoPedido;
    }

    public void agregarProducto(Producto producto, int cantidad) throws Exception {
        if (producto.consultarStock() < cantidad) {
            throw new Exception("Sin stock.");
        }
    }
}
