package poo;

public class Alumno {

    private final String codigo;
    private final String dni;
    private String nombres;
    private String apellidos;
    private int edad;
    private String nombreApoderado;
    private String telefonoApoderado;

    private static int correlativo;

    public Alumno(String dni, String nombres, String apellidos, int edad, String nombreApoderado, String telefonoApoderado) {
        this.codigo = asignarCodigo();
        if (dni == null || dni.isBlank()) {
            throw new IllegalArgumentException(
                    "El DNI del alumno es obligatorio.");
        }
        if (dni.length() > 8 || dni.length() < 8) {
            throw new IllegalArgumentException("La cantidad de caracteres de DNI deben ser 8");
        }

        this.dni = dni.strip();

        setNombres(nombres);
        setApellidos(apellidos);
        setEdad(edad);
        setNombreApoderado(nombreApoderado);
        setTelefonoApoderado(telefonoApoderado);
    }

    private static String asignarCodigo() {
        correlativo++;
        return "U" + correlativo;
    }

    public void setNombres(String nombres) {
        if (nombres == null || nombres.isBlank()) {
            throw new IllegalArgumentException(
                    "Los nombres son obligatorios.");
        }

        this.nombres = nombres.strip();
    }

    public void setApellidos(String apellidos) {
        if (apellidos == null || apellidos.isBlank()) {
            throw new IllegalArgumentException(
                    "Los apellidos son obligatorios.");
        }

        this.apellidos = apellidos.strip();
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException(
                    "La edad no puede ser negativa.");
        }

        this.edad = edad;
    }

    public void setNombreApoderado(String nombreApoderado) {
        if (nombreApoderado == null || nombreApoderado.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre del apoderado es obligatorio.");
        }

        this.nombreApoderado = nombreApoderado.strip();
    }

    public void setTelefonoApoderado(String telefonoApoderado) {
        if (telefonoApoderado == null || telefonoApoderado.isBlank()) {
            throw new IllegalArgumentException(
                    "El teléfono del apoderado es obligatorio.");
        }

        this.telefonoApoderado = telefonoApoderado.strip();
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
