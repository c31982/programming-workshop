package com.doveoverlamb.sesion12;

import java.util.Scanner;

public class Ejercicio05 {

    /*
     *  Ingresar números enteros hasta escribir -1. 
     *  
     *  Al finalizar, mostrar cantidad de números, suma, promedio, 
     *  cantidad de pares, cantidad de impares, número mayor y número menor.
     *
     *  • No considerar -1 dentro de las estadísticas. 
     *  • Controlar correctamente el caso en que no se haya ingresado ningún número válido.
     *
     *   Mide: integración de contadores, acumuladores, máximo y mínimo.
     *
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num = 1, cantNumeros = 0, cantPares = 0, cantImpares = 0, numMayor=0 , numMenor=0 ;
        int suma = 0, promedio = 0;
        
        System.out.println(" \n==== EJERCICIO 05 ====\n");

        while (num != -1) {
            System.out.println("Ingrese el numero : ");
            num = entrada.nextInt();

            while (num != -1 && num < 0) {
                System.out.println("Por favor ingresa un numero entero positivo: ");
                num = entrada.nextInt();
            }

            if (num != -1) {
                cantNumeros++;

                if (num % 2 == 0) {
                    cantPares++;
                } else {
                    cantImpares++;
                }
                
                if(cantNumeros==1){
                    numMayor=numMenor=num;
                }
                
 
                if (num > numMayor) {
                    numMayor = num;
                }

                if (num <= numMenor) {
                    numMenor = num;
                }

                suma += num;

            }

        }

        System.out.println("\n==== REPORTE ESTADISTICA DE NUMEROS =====\n");
        System.out.println("La cantidad de numeros son: " + cantNumeros);
        System.out.println("La cantidad de numeros pares es: " + cantPares);
        System.out.println("La cantidad de numeros impares es: " + cantImpares);
        System.out.println("El numero mayor es: " + numMayor);
        System.out.println("La numero menor es: " + numMenor);
        System.out.println("La suma de numeros es: " + suma);

        if (cantNumeros > 0) {
            promedio = suma / cantNumeros;
            System.out.println("El promedio de los numeros es: " + promedio);
        } else {
            System.out.println("No se ingreso ningun numero , el promedio de los numeros es: " + promedio);
        }
        
        entrada.close();
    }
}
