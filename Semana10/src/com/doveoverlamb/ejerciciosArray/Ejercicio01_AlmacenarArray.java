package com.doveoverlamb.ejerciciosArray;

import java.util.Scanner;

public class Ejercicio01_AlmacenarArray {

    /*
        En este ejercicio se pide al usuario que introduzca 10 números enteros por consola. 
        Los números introducidos se almacenarán en un array. 
        El programa imprime en consola cuántos números negativos, positivos y valores 0 hay en el array.
     */
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        int cantidad, positivos = 0, negativos = 0, valores0 = 0;

        do {
            System.out.print("Ingrese la cantidad de números a registrar: ");
            cantidad = entrada.nextInt();
            if (cantidad <= 0) {
                System.out.println("\nLa cantidad debe ser positiva");
            }

        } while (cantidad <= 0);

        int numeros[] = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {

            System.out.printf("%nIngrese el numero %d: ", (i + 1));
            numeros[i] = entrada.nextInt();

            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                valores0++;
            }
        }

        System.out.println("==== REPORTE ======");
        System.out.println("Cantidad de Numeros Positivos: " + positivos);
        System.out.println("Cantidad de Numeros Negativos: " + negativos);
        System.out.println("Cantidad de Valores 0: " + valores0);

    }
}
