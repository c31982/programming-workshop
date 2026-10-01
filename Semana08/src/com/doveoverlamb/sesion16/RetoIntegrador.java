package com.doveoverlamb.sesion16;

import java.util.Scanner;

public class RetoIntegrador {

    /*
            Registro de notas de estudiantes
        
            Una institución desea registrar las notas de 5 estudiantes. 
            Cada estudiante posee 3 notas. 
            Utilice un for externo para recorrer estudiantes y un for interno para registrar sus tres notas. 
        
            Las notas válidas están entre 0 y 20.
                •	Calcule el promedio de cada estudiante.
                •	Muestre el promedio con dos decimales.
                •	Indique APROBADO si el promedio es mayor o igual a 11; de lo contrario, DESAPROBADO.
                •	Al finalizar muestre cuántos estudiantes aprobaron y cuántos desaprobaron.

     */
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        int cantAprobados = 0, cantDesaprobados = 0;

        for (int i = 1; i <= 3; i++) {
            double nota;
            double suma = 0, promedio = 0;

            System.out.println("\nESTUDIANTE " + i);

            for (int j = 1; j <= 3; j++) {

                do {
                    System.out.printf("%nIngrese la nota %d: ", j);
                    nota = entrada.nextDouble();

                    if (nota >= 0 && nota <= 20) {
                        suma += nota;
                    }

                    if (nota < 0 || nota > 20) {
                        System.out.println("Las notas validas estan entre 0 y 20");
                    }
                } while (nota < 0 || nota > 20);

            }

            promedio = suma / 3;
            String detalle;

            if (promedio >= 11) {
                detalle = "APROBADO";
                cantAprobados++;

            } else {
                detalle = "DESAPROBADO";
                cantDesaprobados++;
            }

            System.out.printf("%nEl promedio del alumno es: %.2f - %s%n", promedio, detalle);

        }

        System.out.println("\n==== REPORTE ALUMNO ====\n");
        System.out.println("Alumnos Aprobados: " + cantAprobados);
        System.out.println("Alumnos Desaprobados: " + cantDesaprobados);

    }
}
