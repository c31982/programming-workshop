package com.doveoverlamb.reporteAcademico;

public class ReporteAcademico {

    public static void mostrarAlumno(Alumno alumno) {

        double notas[] = alumno.getNotas();

        StringBuilder reporteNotas = new StringBuilder();

        reporteNotas.append("Notas:\n");

        for (int i = 0; i < notas.length; i++) {
            reporteNotas.append("\nPC " + (i + 1) + ": " + notas[i]);
        }

//        for (double nota : alumno.getNotas()) {
//            reporteNotas.append(" Notas");
//        }
        System.out.println("""
                           
                           Codigo : %s
                           Nombre : %s
                           """.formatted(alumno.getCodigo(), alumno.getNombre()));

        System.out.println(reporteNotas);

    }

//    public static void mostrarResumen(Alumno[] alumno) {
//    }
}
