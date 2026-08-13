package poo.inventario;

public interface Vendible {
    void vender(int cantidad) throws SinStockException;
}
