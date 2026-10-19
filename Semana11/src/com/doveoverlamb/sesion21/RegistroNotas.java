package com.doveoverlamb.sesion21;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class RegistroNotas {

    /*
        Desarrollar un programa en Java que permita registrar las notas de 4 estudiantes en 3 evaluaciones.
        
        La información deberá almacenarse en una matriz bidimensional de tipo double, donde:
            - Cada fila representa a un estudiante.
            - Cada columna representa una evaluación.
            - Las notas deben estar comprendidas entre 0 y 20.
    
        Además, deberá utilizar arreglos paralelos para almacenar información relacionada con cada estudiante.
       
        El programa deberá solicitar el nombre de cada estudiante y sus tres notas.
        Por cada estudiante se deberá calcular:
            - La suma de sus notas.
            - El promedio de sus notas.
            - La nota mayor.
            - La nota menor.

        Finalmente, el programa deberá mostrar un reporte general con la siguiente información:

Nombre              N1      N2      N3       Suma    Promedio    Mayor    Menor
--------------------------------------------------------------------------------
Ana               15.00   17.00   13.00     45.00      15.00    17.00    13.00
Luis              12.00   10.00   16.00     38.00      12.67    16.00    10.00
Maria             18.00   19.00   17.00     54.00      18.00    19.00    17.00
Pedro             11.00   14.00   12.00     37.00      12.33    14.00    11.00
     */
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        int cantidadAlumnos;
        double sum = 0, prom = 0, notaMayor, notaMenor;

        do {
            cantidadAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos a registrar"));
            if (cantidadAlumnos < 0) {
                JOptionPane.showMessageDialog(null, "La cantidad ingresada debe ser un numero entero positivo");
            }
        } while (cantidadAlumnos < 0);

        String[] alumnos = new String[cantidadAlumnos];
        double[][] notas = new double[cantidadAlumnos][3];
        double[] suma = new double[cantidadAlumnos];
        double[] promedio = new double[cantidadAlumnos];
        double[] mayor = new double[cantidadAlumnos];
        double[] menor = new double[cantidadAlumnos];

        for (int i = 0; i < cantidadAlumnos; i++) {

            do {
                alumnos[i] = JOptionPane.showInputDialog("Ingrese el nombre del alumno");

                for (int j = 0; j < notas.length; j++) {
                    do {
                        notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota N" + (j + 1)));
                        if (notas[i][j] < 0 || notas[i][j] > 20) {
                            JOptionPane.showMessageDialog(null, "La nota debe estar entre 0 y 20");
                        }
                    } while (notas[i][j] < 0 || notas[i][j] > 20);

                    sum += notas[i][j];
                }
                prom = sum / notas.length;

                for (double nota[] : notas) {

                }

            } while (true);

        }

    }
}
