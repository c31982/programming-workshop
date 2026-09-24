package com.doveoverlamb.sesion14;

import java.util.Scanner;

public class Ejercicio02 {

    /*
        Ejercicio 2 - Estadísticas de números
    
        - Solicite números enteros hasta que el usuario ingrese -1. 
        - Al finalizar, muestre la cantidad de números ingresados, la suma y el promedio. 
        - El valor -1 no debe formar parte de los cálculos. 
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        int cantidad = 0, suma = 0;
        double promedio = 0;

        do {
            System.out.print("\nIngrese número (-1 para terminar): ");
            numero = entrada.nextInt();

            while (numero != -1 && numero < 1) {
                System.out.print("\nIngrese un numero entero positivo (-1 para terminar): ");
                numero = entrada.nextInt();
            }

            if (numero != -1) {
                cantidad++;
                suma += numero;
            }

        } while (numero != -1);

        System.out.println("\n ==== RESULTADOS ====");
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Suma: " + suma);

        if (cantidad > 0) {
            promedio = suma / cantidad;
            System.out.printf("Promedio: %.2f",promedio);
        } else {
            System.out.println("No se ingreso ninguna nota , no se logra obtener un promedio. ");
        }
        
        entrada.close();

    }
}
