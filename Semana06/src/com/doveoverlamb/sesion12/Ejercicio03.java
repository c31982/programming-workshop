package com.doveoverlamb.sesion12;

import java.util.Scanner;

public class Ejercicio03 {

    /*
     * Ejercicio 3. Validación de una nota
     * 
     * Solicitar una nota entre 0 y 20. 
     * Mientras el usuario ingrese un valor fuera del rango, volver a solicitarla. 
     * Cuando la nota sea válida, mostrar el mensaje “Nota registrada”.
     *
     * • No terminar el programa ante una nota inválida. 
     * • La validación debe realizarse mediante while.
     *
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean invalido = true;

        while (invalido) {
            System.out.print("\nIngrese una nota entre 0 y 20: ");
            double nota = entrada.nextDouble();
            
            invalido =(nota<0 || nota>20);
            
            }
        System.out.println("\nNota Registrada");
        }
    }

