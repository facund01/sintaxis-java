void main() {
    String nombre = "Teclado Gamer";
    double precio = 149.99;
    int stock = 50;
    boolean disponible = true;

    double total = calcularTotalInventario(precio, stock);

    System.out.println("Producto: " + nombre);
    System.out.println("Total: " + total);
}

double calcularTotalInventario(double precio, int stock) {
    return precio * stock;
}
