package com.doveoverlamb.sesion14;

import java.util.Scanner;

public class Ejercicio01 {

    /*
        Ejercicio 1 - Validación de edad 
    
        - Desarrolle un programa que solicite la edad de una persona. 
        - La edad será válida únicamente si se encuentra entre 1 y 120. 
        - Mientras el usuario ingrese un valor inválido, el programa deberá volver a solicitarlo. 
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;

        do {
            System.out.print("\nIngrese su edad: ");
            edad = entrada.nextInt();

//            while (edad < 1 || edad > 120) {
//                System.out.print("\nEdad Incorrecta");
//                System.out.print("Debes ingresar una edad entre 1 y 120: ");
//                edad = entrada.nextInt();
//
//            }
            
            if(edad < 1 || edad > 120) System.out.print("\nEdad Incorrecta");

        } while (edad < 1 || edad > 120);

        System.out.println("Edad registrada correctamente.....");
        
        entrada.close();

    }
}
