package com.doveoverlamb.sesion14;

import java.util.Scanner;

public class Ejercicio04 {

    /*
        Ejercicio 4 - Contraseña con máximo de intentos
    
        - Defina una contraseña correcta, por ejemplo Java123. 
        - El usuario tendrá como máximo tres intentos. 
        - Si acierta, muestre “Acceso concedido”. 
        - Si agota los intentos, muestre “Acceso bloqueado”.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String contrasena = "Java123";
        int intentos = 0;

        boolean valido = false;

        do {

            intentos++;
            System.out.print("Ingrese contraseña: ");
            String password = entrada.nextLine();

            valido = password.equals(contrasena);

            if (valido) {
                System.out.println("Acceso Concedido");
            } else {
                System.out.println("Incorrecto");
            }

        } while (!valido && intentos < 3);

        if (!valido) {
            System.out.println("Cuenta Bloqueada");
        }
        
        entrada.close();

    }
}
