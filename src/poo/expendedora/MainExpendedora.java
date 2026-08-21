import poo.expendedora.MaquinaExpendedora;
import poo.expendedora.Producto;

void main() {
    MaquinaExpendedora maquina = new MaquinaExpendedora();

    Producto cocaCola = new Producto("Coca Cola", 1000, 5);
    Producto agua = new Producto("Agua", 700, 3);
    Producto papas = new Producto("Papas", 1200, 2);

    maquina.agregarProducto(cocaCola);
    maquina.agregarProducto(agua);
    maquina.agregarProducto(papas);

    maquina.mostrarProductos();

    maquina.ingresarDinero(1500);
    maquina.comprar("Coca Cola");

    maquina.mostrarProductos();
}
