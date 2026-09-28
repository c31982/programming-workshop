package com.doveoverlamb.sesion15;

import java.util.Scanner;

public class Ejercicio04 {

    /*
        Ejercicio 4. Sumatoria de 1 hasta N
    
        Calcular 1 + 2 + ... + N.
     */
    public static void main(String args[]) {

        int suma = 0;

        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        for (int i = 1; i < numero; i++) {
            suma += i;
        }
        System.out.println("Suma = "+ suma);
    }
}
