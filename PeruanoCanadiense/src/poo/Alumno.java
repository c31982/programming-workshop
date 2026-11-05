package poo;

public class Alumno {

    private final String codigo;
    private String dni;
    private String nombres;
    private String apellidos;
    private int edad;
    private String nombreApoderado;
    private String telefonoApoderado;

    private static int correlativo;

    public Alumno(String dni, String nombres, String apellidos, int edad, String nombreApoderado, String telefonoApoderado) {
        this.codigo = asignarCodigo();
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nombreApoderado = nombreApoderado;
        this.telefonoApoderado = telefonoApoderado;
    }

    private static String asignarCodigo() {
        correlativo++;
        return "U" + correlativo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombreApoderado(String nombreApoderado) {
        this.nombreApoderado = nombreApoderado;
    }

    public void setTelefonoApoderado(String telefonoApoderado) {
        this.telefonoApoderado = telefonoApoderado;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombreApoderado() {
        return nombreApoderado;
    }

    public String getTelefonoApoderado() {
        return telefonoApoderado;
    }

    public static int getCorrelativo() {
        return correlativo;
    }

    public String obtenerNombreCompleto() {
        return this.nombres + " " + this.apellidos;
    }

    @Override
    public String toString() {
        return """
              Codigo : %s
              Nombre : %s
              """.formatted(this.codigo, this.nombres);
    }

}
