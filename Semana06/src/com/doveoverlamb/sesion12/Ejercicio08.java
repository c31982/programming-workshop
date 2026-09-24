package com.doveoverlamb.sesion12;

import java.util.Scanner;

public class Ejercicio08 {

    /*
        Ejercicio 8. Tablas de multiplicar con while anidado
    
        Primera parte: solicitar un número entre 1 y 10 y mostrar su tabla de multiplicar del 1 al 10.
        Segunda parte: mostrar las tablas del 1 al 10 utilizando dos ciclos while.
    
        • La segunda parte debe utilizar un while externo y un while interno.
        • Reiniciar correctamente el contador interno para cada tabla.
    
        Mide: ciclos while anidados y control de múltiples contadores.

     */
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        boolean invalido = true;
        int numero = 0, inicio = 1;

        while (invalido) {
            System.out.print("\nIngresa un numero entre 1 y 10: ");
            numero = entrada.nextInt();

            invalido = numero < 1 || numero > 10;

        }

        System.out.println("\n=== TABLA DE MULTIPLICAR DE " + numero + " ===\n");

        while (inicio <= 10) {
            System.out.printf("%d x %d = %d%n", numero, inicio, (inicio * numero));
            inicio++;
        }

        inicio = 1;

        while (inicio <= 10) {

            System.out.println("\n=== TABLA DE MULTIPLICAR DE " + inicio + " ===\n");

            int num2 = 1;
            while (num2 <= 10) {

                System.out.printf("%d x %d = %d%n", inicio, num2, (inicio * num2));
                num2++;

            }

            inicio++;

        }

    }
}
