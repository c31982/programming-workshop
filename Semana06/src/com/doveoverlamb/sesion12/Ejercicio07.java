package com.doveoverlamb.sesion12;

import java.util.Scanner;

public class Ejercicio07 {

    /*
        Ejercicio 7. ¿Desea continuar?
    
        Solicitar un número entre 1 y 100. Después preguntar “¿Desea continuar? (Si/No)”. 
        Mientras la respuesta sea Si, repetir el proceso.
        Validar el número para que esté entre 1 y 100.
    
        • Validar mediante otro while que la respuesta sea únicamente Si o No.
        • Puede utilizar equalsIgnoreCase para comparar la respuesta.
        • No utilizar expresiones regulares.
    
        Mide: variable de control, validación y while anidado.
     */
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        boolean numeroInvalido = true;
        boolean continuar = true;
        String respuesta = "";

        while (continuar) {

            while (numeroInvalido) {

                System.out.print("\nIngrese un numero entre 1 y 100: ");
                int numero = entrada.nextInt();
                entrada.nextLine();

                numeroInvalido = numero < 1 || numero > 100;

            }

            while (!(respuesta.equalsIgnoreCase("Si") || respuesta.equalsIgnoreCase("No"))) {
                System.out.print("\n¿Desea Continuar? (Si/No) : ");
                respuesta = entrada.nextLine();
            }
            
            continuar = respuesta.equalsIgnoreCase("Si");
            numeroInvalido = true;
            respuesta = "";

        }
        
        System.out.println("\nMuchas gracias por usar el sistema \nVuelva Pronto!!!!!");

    }
}
