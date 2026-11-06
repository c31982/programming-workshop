package com.doveoverlamb.reporteAcademico;

public class ReporteAcademico {

    public static void mostrarAlumno(Alumno alumno) {

        System.out.println("""
                           
                           Codigo : %s
                           Nombre : %s
                           """.formatted(alumno.getCodigo(), alumno.getNombre()));

    }

//    public static void mostrarResumen(Alumno[] alumno) {
//    }

}
