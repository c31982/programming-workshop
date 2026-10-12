package com.doveoverlamb.ejerciciosArray;

import java.util.Scanner;

public class Ejercicio02_MediaPosicionesParesArray {

    /*
        En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola. 
    
        Los números se almacenarán en un array y el programa calculará :
    
           * la media de los números introducidos en las posiciones pares del array. 
    
        (Debes utilizar el operador módulo “%”).
     */
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[10];
        int suma = 0, cont = 0;
        double media;

        for (int i = 0; i < numeros.length; i++) {

            System.out.printf("Ingrese el número %d: ", i + 1);
            numeros[i] = entrada.nextInt();

            if (i % 2 == 0) {
                suma += numeros[i];
                cont++;
            }
        }

        media = (double) suma / cont;

        System.out.println("\n===== REPORTE =====");
        System.out.println("Suma: " + suma);
        System.out.println("Cantidad: " + cont);
        System.out.printf("Media de posiciones pares: %.2f%n", media);

        entrada.close();

    }
}
