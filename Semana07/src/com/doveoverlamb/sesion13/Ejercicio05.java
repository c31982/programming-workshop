package com.doveoverlamb.sesion13;

import java.util.Scanner;

public class Ejercicio05 {

    /*
        Mini reto final
    
        Modificar el menú para que, si el usuario ingresa una opción inválida, 
        se muestre un mensaje y el menú vuelva a aparecer sin terminar el programa.

     */
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n==== MENU RECURSIVO ====\n");

            System.out.println("1. Registrar");
            System.out.println("2. Consultar");
            System.out.println("3. Eliminar");
            System.out.println("0. Salir");
            System.out.print("\nSeleccione: ");
            opcion = entrada.nextInt();

           
            String msj = switch (opcion) {
                case 1 ->
                    "Registrar...";

                case 2 ->
                    "Consultar...";

                case 3 ->
                    "Eliminar...";

                case 0 ->
                    "Saliendo...";

                default ->
                    "";

            };

            String mensaje = !msj.equals("")
                    ? "\nUsted ha seleccionado la opcion de: " + msj
                    : "\nOpción inválida. Intente nuevamente.";
            
            System.out.println(mensaje);

        } while (opcion != 0);
        entrada.close();
    }
}
