package com.doveoverlamb.sesion15;

public class Ejercicio09 {

    /*
        Ejercicio 9. Tablas del 1 al 5
    
        Mostrar cinco tablas, cada una del 1 al 12.
     */
    public static void main(String args[]) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("\n==== TABLA DE MULTIPLICAR " + i + " ====\n");
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));

            }

        }
    }
}
