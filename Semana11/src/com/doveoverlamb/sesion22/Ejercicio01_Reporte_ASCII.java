package com.doveoverlamb.sesion22;

import java.util.Scanner;

public class Ejercicio01_Reporte_ASCII {

    /*
        • Utiliza arreglos paralelos, siendo uno de ellos una matriz que almacene las notas de PC1, PC2, PC3 y EF.
        
        • Los arreglos deben inicializarse con los datos mostrados.
        • Todos los promedios deben ser calculados por el programa.
        • Deberá mostrarse el reporte ordenado por nombre.
     */
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        StringBuilder reporte = new StringBuilder();

        reporte.append("##################### REPORTE DE NOTAS #####################\n");

        boolean esEntero;
        boolean valido;

        String[] alumnos;
        double[][] notas;
        double[] promedios;
        double promedioTotal = 0;

        int cantidadRegistros, cantidadNotas;

        do {
            System.out.print("Ingrese la cantidad de alumnos a registrar: ");

            esEntero = entrada.hasNextInt();
            cantidadRegistros = esEntero ? entrada.nextInt() : 0;

            if (cantidadRegistros <= 0) {
                System.out.println("La cantidad debe ser mayor a 0");
            }

            if (!esEntero) {
                entrada.nextLine();
            }
            entrada.nextLine();
        } while (cantidadRegistros <= 0);

        do {
            System.out.print("Ingrese la cantidad de notas a registrar: ");

            esEntero = entrada.hasNextInt();
            cantidadNotas = esEntero ? entrada.nextInt() : -1;

            if (!esEntero) {
                entrada.nextLine();
            }

            if (cantidadNotas < 0) {
                System.out.println("La nota debe estar entre 0 y 20");
            }
            entrada.nextLine();
        } while (cantidadNotas < 0);

        alumnos = new String[cantidadRegistros];
        notas = new double[cantidadRegistros][cantidadNotas];
        promedios = new double[cantidadRegistros];

        for (int i = 0, orden = 1; i < alumnos.length; i++) {

            do {
                System.out.printf("Ingrese el nombre el Alumno %d: ", orden);
                valido = entrada.hasNextLine();
                alumnos[i] = valido ? entrada.nextLine() : null;
                if (alumnos[i].equals(null)) {
                    System.out.println("Debe ingresar un nombre adecuado");
                }
            } while (!valido);
            orden++;

            for (int j = 0; j < notas.length; j++) {
                int sum = 0;
                for (int k = 0, n = 1; k < notas[j].length; k++) {
                    do {
                        String note = (k != (notas[j].length) - 1)
                                ? String.format("Ingrese la nota de PC%d: ", n)
                                : "Ingrese la nota del EF: ";

                        System.out.print(note);
                        notas[j][k] = entrada.nextDouble();
                        if (notas[j][k] < 0 || notas[j][k] > 20) {
                            System.out.println("Debe ingresar una nota entre 0 y 20");
                        }

                    } while (notas[j][k] < 0 || notas[j][k] > 20);
                    n++;
                    sum += notas[j][k];
                }

                promedios[i] = sum / notas[j].length;

                promedioTotal += promedios[i];

            }

        }

        reporte.append("############################################################\n");
        reporte.append(String.format("%-30s%30.2f%n", "PROMEDIO TOTAL:", promedioTotal));
        reporte.append("############################################################");
        
        System.out.println(reporte);
        entrada.close();
    }
}
