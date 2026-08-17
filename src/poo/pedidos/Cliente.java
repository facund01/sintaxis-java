package poo.pedidos;

public class Cliente {
    private String nombreCompleto;
    private String dni;
    private String email;
    private String direccion;

    public Cliente(String nombreCompleto, String dni, String email, String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this. email = email;
        this.direccion = direccion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
