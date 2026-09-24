package com.doveoverlamb.sesion12;

import java.util.Scanner;

public class Ejercicio04 {

    /*
     * Ejercicio 4. Registro de estudiantes con centinela
     *
     * Solicitar notas repetidamente.
     * El valor -1 finalizará el ingreso.
     * Al terminar, mostrar cantidad de estudiantes, aprobados,
     * desaprobados, suma de notas y promedio.
     *
     * Las notas válidas están entre 0 y 20.
     * Considerar aprobado desde 12.
     * El valor -1 no debe formar parte de los cálculos.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cont = 0;
        int aprobados = 0;
        int desaprobados = 0;

        double nota = 0;
        double suma = 0;
        double promedio = 0;

        while (nota != -1) {

            System.out.print("\nIngrese la nota respectiva (-1 para finalizar): ");
            nota = entrada.nextDouble();

            while (nota != -1 && (nota < 0 || nota > 20)) {

                System.out.print("Nota inválida. Ingrese una nota entre 0 y 20: ");
                nota = entrada.nextDouble();
            }

            if (nota != -1) {

                cont++;
                suma += nota;

                if (nota >= 12) {
                    aprobados++;
                } else {
                    desaprobados++;
                }
            }
        }

        System.out.println("\n===== REPORTE DE NOTAS =====");
        System.out.println("Cantidad de estudiantes: " + cont);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);
        System.out.println("Suma de notas: " + suma);

        if (cont > 0) {
            promedio = suma / cont;
            System.out.println("Promedio de notas: " + promedio);
        } else {
            System.out.println("Promedio de notas: No se ingresaron notas.");
        }

        entrada.close();
    }
}