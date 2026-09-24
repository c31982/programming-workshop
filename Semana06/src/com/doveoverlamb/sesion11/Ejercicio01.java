package com.doveoverlamb.sesion11;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidad = 4;
        int posicion = 1;
        int cont = 0;
        int positivos = 0;
        int negativos = 0;

        while (cantidad >= 1) {
            System.out.printf("Ingrese el numero %d: ", posicion);
            int num = entrada.nextInt();

            posicion++;

            if (num > 0) {
                positivos++;
            } else {
                negativos++;
            }

            cantidad--;

        }

        System.out.println("La cantidad de positivos es :" + positivos);
        System.out.println("La cantidad de negativos es :" + negativos);
    }
}
