package com.doveoverlamb.sesion22;

import java.util.Arrays;

public class Ejercicio02_OrdenarMatriz {

    /*
      Escribir un programa en Java que implemente el ordenamiento 
      de una matriz por fila o columna.
     */
    public static void main(String args[]) {

        int[][] matriz = {{5, 4, 7}, {1, 3, 8}, {2, 9, 6}};
        int[][] matriz2 = {{5, 4, 7}, {1, 3, 8}, {2, 9, 6}};

        System.out.println("\nMATRIZ PRINCIPAL\n");
        for (int[] fila : matriz) {

            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.print("\n");
        }

        System.out.println("\nMATRIZ ORDENADO FILA\n");
        for (int[] fila : matriz) {
            Arrays.sort(fila);
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.print("\n");
        }

        System.out.println("\nMATRIZ 2\n");

        // Definimos cual es el mayor numero de columnas.
        int columna = 0;
        for (int[] fila : matriz2) {
            if (fila.length > columna) {
                columna = fila.length;
            }
            for (int e : fila) {
                System.out.print(e + " ");
            }
            System.out.print("\n");
        }

        // Recorremos una por una las columnas de la MATRIZ 2 , para poder ordenarlas.
        for (int c = 0; c < columna; c++) {

            // Contamos los elementos existentes en la columna
            int cantidad = 0;

            for (int f = 0; f < matriz2.length; f++) {
                if (c < matriz2[f].length) {
                    cantidad++;
                }
            }

            // Este vector lo utilizamos para guardar los elementos de cada columna. Para luego ordenarla.
            int[] vector = new int[cantidad];

            for (int f = 0, indice = 0; f < matriz2.length; f++) {
                if (c < matriz2[f].length) {
                    vector[indice++] = matriz2[f][c];
                }
            }
            //  40040
            Arrays.sort(vector);

//            for(int e : vector){
//               System.out.print(e+" "); 
//            }
            for (int f = 0, indice = 0; f < matriz2.length; f++) {
                if (c < matriz2[f].length) {
                    matriz2[f][c] = vector[indice++];
                }
            }
   
        }

        System.out.println("\nMATRIZ 2 ORDENADO COLUMNA\n");

        for (int[] fila : matriz2) {
            for (int e : fila) {
                System.out.print(e + " ");
            }
            System.out.print("\n");
        }

    }
}
