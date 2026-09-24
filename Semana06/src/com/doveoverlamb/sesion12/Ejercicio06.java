package com.doveoverlamb.sesion12;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroSecreto = 45;
        boolean encontrado = false;
        int intentos = 0;

        while (!encontrado) {

            System.out.print("\nAdivine el número: ");
            int num = entrada.nextInt();

            intentos++;

            if (num < numeroSecreto) {
                System.out.println("El número secreto es mayor que " + num);
            } else if (num > numeroSecreto) {
                System.out.println("El número secreto es menor que " + num);
            }

            encontrado = (num == numeroSecreto);
        }

        System.out.println("\n¡Felicitaciones! Encontró el número secreto.");
        System.out.println("Cantidad de intentos: " + intentos);

        entrada.close();
    }
}