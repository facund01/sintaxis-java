import poo.inventario.Producto;
import poo.inventario.ProductoDigital;
import poo.inventario.ProductoFisico;
import poo.inventario.SinStockException;

void main() {
    Producto[] productos = new Producto[2];
    productos[0] = new ProductoFisico("Joystick PS5", 40.0, 8, 0.4);
    productos[1] = new ProductoDigital("GTA VI", 80.0);

    // Venta exitosa de un producto físico
    try {
        ((ProductoFisico) productos[0]).vender(2);
        System.out.println("Venta proesada con éxito | " + productos[0].getNombre());
        System.out.println("Precio del producto: $" + productos[0].getPrecioBase());
        System.out.println("Precio de envío: $" + 5 * ((ProductoFisico) productos[0]).getPesoKg());
        System.out.println("Prefio final: $" + productos[0].calcularPrecioFinal());
        System.out.println("----------");
    } catch (SinStockException e) {
        System.out.println(e.getMessage());
    } finally {
        System.out.println("Proceso finalizado.");
        System.out.println("----------");
    }

    // Venta de un producto físico intentando solicitar más productos que el stock
    try {
        ((ProductoFisico) productos[0]).vender(10);
    } catch (SinStockException e) {
        System.out.println(e.getMessage());
    } finally {
        System.out.println("Proceso finalizado.");
        System.out.println("----------");
    }

    // Venta de un producto digital
    System.out.println("Venta proesada con éxito | " + productos[1].getNombre());
    System.out.println("Precio del producto: $" + productos[1].getPrecioBase());
    System.out.println("Prefio final: $" + productos[1].calcularPrecioFinal());
    System.out.println("----------");
}
