package com.doveoverlamb.sesion12;

import java.util.Scanner;

public class Ejercicio02 {

    /*
        Ejercicio 2. Suma y promedio de números
    
        Solicitar la cantidad de números que se ingresarán. 
    
        Luego pedir cada número y, al finalizar, mostrar la suma total y el promedio.

        La cantidad ingresada debe ser mayor que 0.

        Utilizar un contador y un acumulador.
    
        Mide: contador, acumulador y cálculo posterior al ciclo.
     */
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        int cantidad = 0, num = 0, contador = 1;
        double sumaTotal = 0, promedio = 0;
        boolean invalido = true;

        while (invalido) {
            System.out.print("\nCantidad de numeros a evaluar: ");

            cantidad = entrada.nextInt();

            invalido = cantidad < 0;

        }

        /*
         * Creamos la variable contCantidad, lo igualamos al valor que tiene "cantidad"
         * para poder contabilizar el # de veces que debo ingresar un numero.
         */
        int contCantidad = cantidad;

        while (contCantidad > 0) {
            invalido = true;
            while (invalido) {
                // Aca uso contador para imprimir la posicion de cada numero ingresado
                System.out.printf("\nIngrese el numero en la posicion %d: ",contador);
                num = entrada.nextInt();
                invalido = num < 0;
            }

            contador++;
            sumaTotal += num;
            contCantidad--;

        }

        promedio = sumaTotal / cantidad;

        System.out.println("\n===== REPORTE - SUMA Y PROMEDIO NUMEROS =====\n");
        System.out.println("La suma total de numeros es: " + sumaTotal);
        System.out.printf("El promedio es: %.2f" ,promedio);
    }
}
