package excepciones;

public class SistemaAutenticacion {
    private final String usuarioCorrecto;
    private final String claveCorrecta;

    public SistemaAutenticacion() {
        this.usuarioCorrecto = "admin";
        this.claveCorrecta = "12345";
    }

    public void iniciarSesion(String usuario, String clave) throws CredencialesInvalidasException {
        if (usuario == null || clave == null) {
            throw new IllegalArgumentException("El campo de usuario o de contraseña se encuentra vacío.");
        }

        if (!usuario.equals(usuarioCorrecto) || !clave.equals(claveCorrecta)) {
            throw new CredencialesInvalidasException("Usuario o contraseña incorrectos.");
        }

        System.out.println("Credenciales válidas!");
    }
}
