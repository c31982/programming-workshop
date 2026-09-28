package com.doveoverlamb.sesion15;

public class Ejercicio06 {

    /*
        Ejercicio 6. Factorial
    
        Calcular el factorial de un número no negativo.
     */
    public static void main(String args[]) {

        int numero = 5;
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println(numero + "! = " + factorial);

    }
}
