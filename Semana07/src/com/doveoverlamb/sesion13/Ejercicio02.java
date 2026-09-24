package com.doveoverlamb.sesion13;

import java.util.Scanner;

public class Ejercicio02 {

    /*
        Ejercicio guiado 2 - Validación de nota
    
        Solicitar una nota y volver a pedirla mientras el valor esté fuera del rango de 0 a 20.

     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nota;

        do {
            System.out.print("Ingrese una nota entre 0 y 20: ");
            nota = entrada.nextInt();

            if (nota < 0 || nota > 20) {
                System.out.println("Nota inválida.");
            }
        } while (nota < 0 || nota > 20);

    }
}
