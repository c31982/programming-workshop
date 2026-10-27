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
        StringBuilder lista = new StringBuilder();

        boolean esEntero;
        boolean valido;

        String[] alumnos;
        int[] edades, grados;
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
        edades = new int[cantidadRegistros];
        grados = new int[cantidadRegistros];
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

            do {
                System.out.printf("Ingrese la edad del alumno %d: ", orden);
                valido = entrada.hasNextInt();
                edades[i] = valido ? entrada.nextInt() : -1;
                if (edades[i] < 0) {
                    System.out.println("Debe ingresar una edad correcta");
                }
                entrada.nextLine();
            } while (!valido);
            do {
                System.out.printf("Ingrese el grado del alumno %d: ", orden);
                valido = entrada.hasNextInt();
                grados[i] = valido ? entrada.nextInt() : -1;
                if (grados[i] < 0) {
                    System.out.println("Debe ingresar un grado correcto");
                }
                entrada.nextLine();
            } while (!valido);
            orden++;

            int sum = 0;
            for (int k = 0, n = 1; k < notas[i].length; k++) {

                do {
                    String note = (k != (notas[i].length) - 1)
                            ? String.format("Ingrese la nota de PC%d: ", n)
                            : "Ingrese la nota del EF: ";

                    System.out.print(note);
                    notas[i][k] = entrada.nextDouble();
                    if (notas[i][k] < 0 || notas[i][k] > 20) {
                        System.out.println("Debe ingresar una nota entre 0 y 20");
                    }
                    entrada.nextLine();
                } while (notas[i][k] < 0 || notas[i][k] > 20);

                n++;
                sum += notas[i][k];
            }

            promedios[i] = sum / notas[i].length;

            promedioTotal += promedios[i];

        }

        for (int i = 0; i < cantidadRegistros; i++) {

            String registro = String.format("%n%-40s %4s %5s ",
                    alumnos[i], edades[i], grados[i]);
            for (int j = 0; j < cantidadNotas; j++) {

                registro += String.format("%4s ",
                        notas[i][j]);
            }
              registro += String.format("%7s",
                        promedios[i]);

            lista.append(registro+"\n");
        }

        String cabecera = String.format("%n%-40s %4s %5s %4s %4s %4s %4s %7s%n%n",
                "NOMBRE", "EDAD", "GRADO",
                "PC1", "PC2", "PC3", "EF", "PROM");

        reporte.append("#".repeat(80) + "\n\n");
        reporte.append("#".repeat(31) + " REPORTE DE NOTAS " + "#".repeat(31) + "\n\n");
        reporte.append("#".repeat(80) + "\n");
        reporte.append(cabecera);
        reporte.append("#".repeat(80) + "\n");
        reporte.append(lista);
        reporte.append("#".repeat(80) + "\n");
        reporte.append(String.format("%n%-30s%30.2f%n%n", "PROMEDIO TOTAL:", promedioTotal));
        reporte.append("#".repeat(80) + "\n");

        System.out.println(reporte);
        entrada.close();
    }
}
