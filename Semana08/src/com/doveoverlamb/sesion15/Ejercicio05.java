package com.doveoverlamb.sesion15;

public class Ejercicio05 {

    /*
        Ejercicio 5. Tabla de multiplicar
    
        Mostrar la tabla de un número del 1 al 12.
     */
    public static void main(String args[]) {

        int numero = 7;
        
        System.out.println("\n=== TABLA DE MULTIPLICAR ===\n");

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }
}
