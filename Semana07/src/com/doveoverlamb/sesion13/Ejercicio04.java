package com.doveoverlamb.sesion13;

import java.util.Scanner;

public class Ejercicio04 {

    /*
           Ejercicio guiado 4 - Menú repetitivo
    
           Construir un menú que permanezca activo hasta seleccionar la opción 0.

     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("1. Registrar");
            System.out.println("2. Consultar");
            System.out.println("3. Eliminar");
            System.out.println("0. Salir");
            System.out.print("Seleccione: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 ->
                    System.out.println("Registrar...");
                case 2 ->
                    System.out.println("Consultar...");
                case 3 ->
                    System.out.println("Eliminar...");
                case 0 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("Opción incorrecta.");
            }
        } while (opcion != 0);

    }
}
