package com.doveoverlamb.sesion22;

import java.util.Arrays;

public class Ejercicio02_OredenarMatriz {

    /*
      Escribir un programa en Java que implemente el ordenamiento 
      de una matriz por fila o columna.
     */
    public static void main(String args[]) {

        int[][] matriz = {{5, 4, 7}, {1, 3, 8}, {2, 9, 6}};
        int[][] matriz2 = {{5, 4, 7}, {1, 3, 8}, {2, 9, 6}};

        System.out.println("\n MATRIZ PRINCIPAL");
        for (int[] fila : matriz) {

            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.print("\n");
        }

        System.out.println("\n MATRIZ ORDENADO FILA");
        for (int[] fila : matriz) {
            Arrays.sort(fila);
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\n MATRIZ ORDENADO COLUMNA");

        int[] vector = new int[3];

        for (int f = 0; f < matriz2.length; f++) {
//            int indice = 0;
            for (int c = 0, indice = 0; c < matriz2[f].length; c++) {

                vector[indice++] = matriz2[c][f];
//                 System.out.print(matriz[c][f]+" ");
            }
            Arrays.sort(vector);
            for (int k = 0, indice = 0; k < vector.length; k++) {
               
                    matriz[k][c] = vector[indice++];
                }
            }

//            for (int nume : vector) {
//                System.out.print(nume +" ");
//            }

            System.out.print("\n");
        }

//        for (int[] fila : matriz) {
//
//            for (int elemento : fila) {
//                System.out.print(elemento + " ");
//            }
//            System.out.print("\n");
//        }
    }
}
