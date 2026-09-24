package com.doveoverlamb.sesion12;

import java.util.Scanner;

public class Ejercicio01 {

    /*
     *  Ejercicio 1. Conteo ascendente y descendente
     *
     *  Solicitar un número entero positivo N. 
     *  Mostrar los números desde 1 hasta N.
     *  Después, mostrar los números desde N hasta 1.
     *
     * • Validar que N sea mayor que 0. 
     * • Utilizar exclusivamente while.
     *
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cont = 1;

        System.out.print("\nIngresa un numero entero positivo: ");
        int numero = entrada.nextInt();
        entrada.nextLine();

        if (numero <= 0) {
            System.out.println("\nIngrese correctamente el numero a evaluar");
            System.out.print("\nIngresa un numero entero positivo: ");
            numero = entrada.nextInt();
            entrada.nextLine();
        }

        System.out.println("\n=== Mostramos numeros desde 1 hasta N ===\n");
        while (cont <= numero) {
            System.out.println(cont);
            cont++;
        }
        cont = numero;
        System.out.println("\n=== Mostramos numeros desde N hasta 1 ===\n");
        while (cont >= 1) {
            System.out.println(cont);
            cont--;
        }

    }

}
