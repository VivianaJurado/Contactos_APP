package moviles.aplicaciones.contactos_proyecto;

public class Contacto {
    private String apellidos;
    private String nombres;
    private String correo;
    private String telefono;
    private String celular;

    public Contacto(String apellidos, String nombres, String correo, String telefono, String celular) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.correo = correo;
        this.telefono = telefono;
        this.celular = celular;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
