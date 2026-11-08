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
    
    public double [] getNotas() {
        return notas;
    }

    private boolean validaNota(double nota) {

        if (nota > 20 || nota < 0) {

            throw new IllegalArgumentException("La nota debe estar entre 0 y 20");

        }

        return true;
    }

    public void asignarNotas(double pc1, double pc2, double pc3, double ef) {

        notas = new double[4];

        if (validaNota(pc1) && validaNota(pc2) && validaNota(pc3) && validaNota(ef)) {
            this.notas[0] = pc1;
            this.notas[1] = pc2;
            this.notas[2] = pc3;
            this.notas[3] = ef;
        }

    }

    public void asignarNotas(double[] valores) {

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
        System.arraycopy(valores, 0, notas, 0, valores.length);

    }

// Implementa obtenerPromedio() con retorno double.
    public double obtenerPromedio(double[] valores) {
        double suma = 0;
        for (double nota : valores) {
            suma += nota;
        }

        return suma / valores.length;
    }

    /*
Actividad 3. Sobrescritura simple (10 min)
Incorpora @Override public String toString() para devolver código y nombre. 
    No crees una superclase propia.
     */
    @Override

    public String toString() {
        
        StringBuilder reporte = new StringBuilder();
        
        for (double nota : this.notas) {
            reporte.append(nota);
        }

        return """
               Codigo : %s
               Nombre : %s
               Notas  : %s
               """.formatted(this.codigo, this.nombre,reporte);
    }

}
