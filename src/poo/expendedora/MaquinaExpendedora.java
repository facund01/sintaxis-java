package poo.expendedora;

import java.util.ArrayList;
import java.util.List;

public class MaquinaExpendedora {
    private List<Producto> productos;
    private double dineroIngresado;

    public MaquinaExpendedora() {
        productos = new ArrayList<>();
        dineroIngresado = 0;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(
                    producto.getNombre() +
                            " - $" + producto.getPrecio() +
                            " - Stock: " + producto.getStock()
            );
        }
    }

    public void ingresarDinero(double dinero) {
        if (dinero > 0) {
            dineroIngresado += dinero;
        }
    }

    public void comprar(String nombreProducto) {
        Producto producto = buscarProducto(nombreProducto);

        if (producto == null) {
            System.out.println("El producto no existe.");
            return;
        }

        if (!producto.tieneStock()) {
            System.out.println("Sin stock del producto.");
            return;
        }

        if (dineroIngresado < producto.getPrecio()) {
            System.out.println("Dinero insuficiente.");
            return;
        }

        producto.disminuirStock();
        double vuelto = dineroIngresado - producto.getPrecio();
        System.out.println("Compra realizada: " + producto.getNombre());
        System.out.println("Su vuelto: " + vuelto);

        dineroIngresado = 0;
    }

    private Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }

        return null;
    }
}
