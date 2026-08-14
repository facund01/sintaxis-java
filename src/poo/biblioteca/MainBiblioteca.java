import poo.biblioteca.Biblioteca;
import poo.biblioteca.Libro;
import poo.biblioteca.LibroNoEncontradoException;
import poo.biblioteca.LibroYaPrestadoException;

void main() {
    Biblioteca biblioteca = new Biblioteca();

    Libro libro1 = new Libro("978-8419260246", "Mistborn I", "Brandon Sanderson");
    Libro libro2 = new Libro("978-8419260253", "Mistborn II", "Brandon Sanderson");
    Libro libro3 = new Libro("978-8466658911", "Mistborn III", "Brandon Sanderson");

    biblioteca.agregarLibro(libro1);
    biblioteca.agregarLibro(libro2);
    biblioteca.agregarLibro(libro3);

    // Prestar un libro existente con éxito
    try {
        biblioteca.prestarLibro("978-8419260246");
    } catch (LibroNoEncontradoException | LibroYaPrestadoException e) {
        System.out.println(e.getMessage());
    } finally {
        System.out.println("Proceso finalizado.");
        System.out.println("----------");
    }

    // Intentar prestar nuevamente el mismo libro
    try {
        biblioteca.prestarLibro("978-8419260246");
    } catch (LibroNoEncontradoException | LibroYaPrestadoException e) {
        System.out.println(e.getMessage());
    } finally {
        System.out.println("Proceso finalizado.");
        System.out.println("----------");
    }

    // Intentar buscar o prestar un libro con un ISBN que no existe
    try {
        biblioteca.prestarLibro("978-1111111111");
    } catch (LibroNoEncontradoException | LibroYaPrestadoException e) {
        System.out.println(e.getMessage());
    } finally {
        System.out.println("Proceso finalizado.");
        System.out.println("----------");
    }

    // Devolver un libro con éxito
    try {
        biblioteca.devolverLibro("978-8419260246");
    } catch (LibroNoEncontradoException e) {
        System.out.println(e.getMessage());
    } finally {
        System.out.println("Proceso finalizado.");
        System.out.println("----------");
    }

    List<Libro> disponibles = biblioteca.obtenerLibrosDisponibles();

    for (Libro libro : disponibles) {
        System.out.println(libro.getIsbn() + " | " + libro.getTitulo() + " | " + libro.getAutor());
    }
}
