package com.doveoverlamb.sesion14;

import java.util.Scanner;

public class Ejercicio05 {

    /*
        Ejercicio 5 - Reto integrador: calculadora con menú 
    
        - Construya una calculadora que mantenga el menú activo hasta elegir 0. 
        - Debe permitir sumar, restar, multiplicar y dividir. 
        - Valide la división entre cero.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
//        double resultado;

        do {

            System.out.println("\n==== CALCULADORA ====\n ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.print("\nSeleccione: ");
            opcion = entrada.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("\nNumero 1: ");
                double numero1 = entrada.nextDouble();
                System.out.print("Numero 2: ");
                double numero2 = entrada.nextDouble();

                if (opcion == 4 && numero2 == 0) {

                    System.out.println("No se puede dividir entre cero.");

                } else {

                    double resultado = switch (opcion) {

                        case 1 ->
                            numero1 + numero2;
                        case 2 ->
                            numero1 - numero2;
                        case 3 ->
                            numero1 * numero2;
                        case 4 ->
                            numero1 / numero2;
                        default ->
                            0;

                    };
                    System.out.printf("Resultado: %.2f%n", resultado);

                }

            }
        } while (opcion != 0);
    }
}
