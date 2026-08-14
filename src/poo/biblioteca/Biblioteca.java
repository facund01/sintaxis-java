package poo.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    private Map<String, Libro> catalogo;

    public Biblioteca() {
        catalogo = new HashMap<>();
    }

    public void agregarLibro(Libro libro) {
        catalogo.put(libro.getIsbn(), libro);
    }

    public Libro buscarLibro(String isbn) throws LibroNoEncontradoException {
        if (!catalogo.containsKey(isbn)) {
            throw new LibroNoEncontradoException("Libro no encontrado.");
        }

        return catalogo.get(isbn);
    }

    public void prestarLibro(String isbn) throws LibroNoEncontradoException, LibroYaPrestadoException {
        Libro libro = buscarLibro(isbn);

        if (!libro.isDisponible()) {
            throw new LibroYaPrestadoException("El libro solicitado se encuentra prestado.");
        }

        libro.setDisponible(false);
        System.out.println("Libro prestado correctamente: " + libro.getTitulo());
    }

    public void devolverLibro(String isbn) throws LibroNoEncontradoException {
        Libro libro = buscarLibro(isbn);

        libro.setDisponible(true);
        System.out.println("Devolución realizada correctamente: " + libro.getTitulo());
    }

    public List<Libro> obtenerLibrosDisponibles() {
        List<Libro> disponibles = new ArrayList<>();

        for (Libro libro : catalogo.values()) {
            if (libro.isDisponible()) {
                disponibles.add(libro);
            }
        }

        return disponibles;
    }
}
