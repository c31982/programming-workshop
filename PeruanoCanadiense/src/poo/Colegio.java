package poo;

import java.util.ArrayList;
import java.util.List;

public class Colegio {

    private final String codigo;

    private final String nombre;
    private final String direccion;
    private final String telefono;
    private final String nombreDirector;
    private final int capacidadMaxima;
    private final List<Alumno> alumnos;

    //Cual es la diferencia entre List y ArrayList
    private static int correlativo;

    public Colegio(String nombre, String direccion, String telefono, String nombreDirector, int capacidadMaxima) {

        this.codigo = asignarCodigo();

        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre del colegio es obligatorio.");
        }

        if (direccion == null || direccion.isBlank()) {
            throw new IllegalArgumentException(
                    "La dirección es obligatoria.");
        }

        if (telefono == null || telefono.isBlank()) {
            throw new IllegalArgumentException(
                    "El teléfono es obligatorio.");
        }

        if (nombreDirector == null || nombreDirector.isBlank()) {
            throw new IllegalArgumentException(
                    "El nombre del director es obligatorio.");
        }

        if (capacidadMaxima <= 0) {
            throw new IllegalArgumentException(
                    "La capacidad máxima debe ser mayor que cero.");
        }

        this.nombre = nombre.strip();
        this.direccion = direccion.strip();
        this.telefono = telefono.strip();
        this.nombreDirector = nombreDirector.strip();
        this.capacidadMaxima = capacidadMaxima;

        this.alumnos = new ArrayList<>();

    }

    private static String asignarCodigo() {
        correlativo++;
        return "U" + correlativo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int obtenerCantidadAlumnos() {
        return alumnos.size();
    }

    public int obtenerVacantesDisponibles() {
        return capacidadMaxima - alumnos.size();
    }

    public Alumno buscarAlumnoPorCodigo(String codigo) {

        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException(
                    "El código de búsqueda es obligatorio.");
        }

        String codigoBuscado = codigo.strip();

        for (Alumno alumno : alumnos) {
            if (alumno.getCodigo().equals(codigoBuscado)) {
                return alumno;
            }
        }

        return null;
    }

    public boolean estaMatriculado(String codigo) {
        return buscarAlumnoPorCodigo(codigo) != null;
    }

    // Matricular Alumno
    public void matricularAlumno(Alumno alumno) {

        if (alumno == null) {
            throw new IllegalArgumentException(
                    "Debe proporcionar un alumno.");
        }

        for (Alumno matriculado : alumnos) {

            if (matriculado.getCodigo().equals(alumno.getCodigo())) {
                throw new IllegalArgumentException(
                        "Ya existe un alumno con ese código.");
            }

            if (matriculado.getDni().equals(alumno.getDni())) {
                throw new IllegalArgumentException(
                        "Ya existe un alumno con ese DNI.");
            }
        }

        if (obtenerVacantesDisponibles() == 0) {
            throw new IllegalStateException(
                    "El colegio no tiene vacantes disponibles.");
        }

        alumnos.add(alumno);
    }

    //Retirar Alumno
    public boolean retirarAlumno(String codigo) {

        Alumno alumno = buscarAlumnoPorCodigo(codigo);

        if (alumno == null) {
            return false;
        }

        return alumnos.remove(alumno);
    }

    // Obtener Alumnos del colegio
    public List<Alumno> obtenerAlumnos() {
        return new ArrayList<>(alumnos);
    }
}
