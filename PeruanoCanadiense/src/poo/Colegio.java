package poo;

import java.util.List;

public class Colegio {

    private final String codigo;

    private String nombre;
    private String direccion;
    private String telefono;
    private String nombreDirector;
    private int capacidadMaxima;
    private List<Alumno> alumnos;
    
    private static int correlativo;

    private static String asignarCodigo() {
        correlativo++;
        return "U" + correlativo;
    }

}
