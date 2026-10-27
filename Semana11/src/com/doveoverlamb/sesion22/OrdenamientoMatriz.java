package com.doveoverlamb.sesion22;

import java.util.Arrays;

public class OrdenamientoMatriz {

    public static void main(String args[]) {

        int[][] matriz = {{13, 12, 11, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}};

        int[] vector = new int[16];
        int[] vector2 = new int[4];

        System.out.println("Matriz Principal : \n");

        for (int[] filas : matriz) {
            for (int numero : filas) {

                System.out.print(numero + "   ");

            }
            System.out.println("\n");
        }

        System.out.print("Vector: ");
        int indice = 0;
        for (int[] filas : matriz) {
            for (int numero : filas) {
                vector[indice] = numero;
                System.out.print(vector[indice] + " ");
                indice++;
            }
        }
        System.out.println("\n");
        int[][] matriz2 = new int[4][4];

        System.arraycopy(matriz, 0, matriz2, 0, matriz.length);

        indice = 0;
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                if (i == 0) {
                    vector2[indice++] = matriz[i][j];
                }
                System.out.print(matriz2[i][j] + "  ");
                
            }
            System.out.println("\n");
        }

        Arrays.sort(vector2);
        System.out.print("Vector 2: ");
        for (int elemento : vector2) {
            System.out.print(elemento + " ");

        }
        indice = 0;
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {

                if (i == 0) {
                    matriz[i][j] = vector2[indice++];
                }

            }
        }
        System.out.println("\nMatriz Secundaria : \n");
        for (int[] filas : matriz2) {
            for (int numero : filas) {

                System.out.print(numero + "   ");

            }
            System.out.println("\n");
        }

    }
}
