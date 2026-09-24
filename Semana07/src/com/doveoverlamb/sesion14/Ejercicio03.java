package com.doveoverlamb.sesion14;

import java.util.Scanner;

public class Ejercicio03 {

    /*
        Ejercicio 3 - Registro de notas
    
        - Solicite notas de estudiantes. Use -1 para finalizar. 
        - Las notas válidas están entre 0 y 20; cualquier otro valor debe mostrarse como inválido 
          y no debe contabilizarse.
        - Al finalizar, muestre estudiantes registrados, aprobados, desaprobados y promedio general. 
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota;
        int registrados = 0, aprobados = 0, desaprobados = 0;
        double suma = 0, promedio = 0;

        do {
            System.out.print("\nIngrese nota (-1 para finalizar): ");
            nota = entrada.nextDouble();

            if (nota < 0 || nota > 20) {
                System.out.println("Nota Invalida");
            }

            if (nota != -1 && (nota >= 0 && nota <= 20)) {
                registrados++;
                suma += nota;

                if (nota >= 12) {
                    aprobados++;
                } else {
                    desaprobados++;
                }
            }

        } while (nota != -1);

        System.out.println("\n\n ==== RESULTADOS ====");
        System.out.println("Estudiantes: " + registrados);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Desaprobados: " + desaprobados);

        if (registrados > 0) {
            promedio = suma / registrados;
            System.out.printf("Promedio: %.2f",promedio);
        } else {
            System.out.println("No se registro ninguna nota, no se pudo calcular un promedio");
        }
        
        entrada.close();

    }
}
