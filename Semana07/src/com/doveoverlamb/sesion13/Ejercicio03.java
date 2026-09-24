package com.doveoverlamb.sesion13;

import java.util.Scanner;

public class Ejercicio03 {

    /*
        Ejercicio guiado 3 - Centinela y acumulador
    
        Ingresar números hasta que el usuario escriba 0. Mostrar la suma de los valores ingresados.

     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int suma = 0;

        do {
            System.out.print("Ingrese número (0 para terminar): ");
            numero = entrada.nextInt();

            if (numero != 0) {
                suma += numero;
            }
        } while (numero != 0);

        System.out.println("Suma: " + suma);

    }
}
