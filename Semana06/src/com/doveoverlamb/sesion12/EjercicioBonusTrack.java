package com.doveoverlamb.sesion12;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class EjercicioBonusTrack {

    /*
        Debes crear un programa que genere un número aleatorio entre 1 y 100 y lo guarde en una variable. 
        Al ejecutar el programa este pedirá por consola la introducción de un número entre 1 y 100.

        Si el nº introducido por el usuario es mayor que el generado por el programa aleatoriamente, saldrá un mensaje en consola              indicando que «el nº es menor».

        Si el nº introducido por el usuario es menor que el generado por el programa aleatoriamente, saldrá un mensaje en consola              indicando que «el nº es mayor».

        La operativa se repetirá indefinidamente hasta que el usuario adivine el nº aleatorio generado por el programa. 
        Cuando se adivine el nº aleatorio, debe salir un mensaje en consola que diga «Correcto» y el nº de intentos consumidos para            averiguar el nº
     */
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random() * 100)+1;
        int intentos = 0, numero = 0;



        while (numero != numeroAleatorio) {
            System.out.print("\nIngrese un numero entre 1 y 100: ");
            numero = entrada.nextInt();

            intentos++;

            if (numero > numeroAleatorio) {
                System.out.println("\nEl numero aleatorio es menor");
            } else if (numero < numeroAleatorio) {
                System.out.println("\nEl numero aleatorio es mayor");
            }
        }

        System.out.printf("""
                          
                           Correcto!!!!!!
                           Numero de intentos : %d
                          
                          """, intentos);
        
        entrada.close();

    }
}
