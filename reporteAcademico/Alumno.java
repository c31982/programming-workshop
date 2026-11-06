package com.doveoverlamb.reporteAcademico;

public class Alumno {

    private final String codigo;
    private String nombre;
    private double[] notas;

    public Alumno(String codigo, String nombre) {

        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El codigo del alumno es obligatorio");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del alumno es obligatorio");
        }

        this.codigo = codigo.strip();
        this.nombre = nombre.strip();

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    private boolean validaNota(int nota) {
       
        if()
        
        if (nota > 20 || nota < 0) {
            return false;
            //throw new IllegalArgumentException("La nota debe estar entre 0 y 20");    

        }

        return true;
    }

    public void asignarNotas(int pc1, int pc2, int pc3, int ef) {

        
            
        }
    

    public void asignarNotas(int[] valores) {

        if (valores.length == 0) {
            throw new IllegalArgumentException("Es necesario que exista el arreglo de notas");
        }

        for (double nota : valores) {
            if (nota > 20 || nota < 0) {
                throw new IllegalArgumentException("La nota debe estar entre 0 y 20");
            }

        }

        for (int i = 0; i < valores.length; i++) {
            this.notas[i] = valores[i];
        }

    }

// Implementa obtenerPromedio() con retorno double.
    /*
Actividad 3. Sobrescritura simple (10 min)
Incorpora @Override public String toString() para devolver código y nombre. No crees una superclase propia.
     */
}
