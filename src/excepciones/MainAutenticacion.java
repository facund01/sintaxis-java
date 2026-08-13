import excepciones.CredencialesInvalidasException;
import excepciones.SistemaAutenticacion;

void main() {
    SistemaAutenticacion credenciales = new SistemaAutenticacion();

    // Intento con credenciales correctas
    try {
        credenciales.iniciarSesion("admin", "12345");
    } catch (CredencialesInvalidasException e) {
        System.out.println(e.getMessage());
    } finally {
        System.out.println("Proceso finalizado.");
        System.out.println("----------");
    }

    // Intento con credenciales incorrectas
    try {
        credenciales.iniciarSesion("admin", "123");
    } catch (CredencialesInvalidasException e) {
        System.out.println(e.getMessage());
    } finally {
        System.out.println("Proceso finalizado.");
        System.out.println("----------");
    }

    // Intento pasando campos nulos
    try {
        credenciales.iniciarSesion("admin", null);
    } catch (IllegalArgumentException | CredencialesInvalidasException e) {
        System.out.println(e.getMessage());
    } finally {
        System.out.println("Proceso finalizado.");
        System.out.println("----------");
    }
}
