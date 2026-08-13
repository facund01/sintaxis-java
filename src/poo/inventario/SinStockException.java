package poo.inventario;

public class SinStockException extends Exception {
    public SinStockException(String message) {
        super(message);
    }
}
