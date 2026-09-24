package com.doveoverlamb.sesion13;

import java.util.Scanner;

public class Ejercicio01 {

    /*
        Ejercicio guiado 1 - Ejecución mínima
    
        Objetivo: demostrar que el bloque se ejecuta una vez incluso cuando la condición es falsa desde el inicio.

     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 10;

        do {
            System.out.println(numero);
        } while (numero < 5);

    }
}
