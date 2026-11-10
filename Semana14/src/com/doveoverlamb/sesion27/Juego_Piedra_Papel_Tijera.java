package com.doveoverlamb.sesion27;

import java.util.Random;
import java.util.Scanner;

public class Juego_Piedra_Papel_Tijera {

    static int contUSer = 0;
    static int contComp = 0;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Juego_Piedra_Papel_Tijera.mostrarMenu();
        int menu = entrada.nextInt();
        Juego_Piedra_Papel_Tijera.ronda(menu, entrada);

    }

    // Metodos del Juego 
    // Piedra = 1
    // Papel = 2
    // Tijera = 3
    public static void juego(int user, int comp) {

        if (user == comp) {
            System.out.println("\nEmpate");

        } else if ((user == 1 && comp == 3) || (user == 2 && comp == 1) || (user == 3 && comp == 2)) {

            System.out.println("\nFelictaciones ganaste un punto ");
            contUSer++;
        } else {
            contComp++;
            System.out.println("\nJajaaja te gano la computadora!!!!!! ");
        }

    }

    public static void mostrarMenu() {
        System.out.println("\n====== MENU DEL JUEGO ======");
        System.out.println("1. Nueva Ronda");
        System.out.println("2. Salir del Juego");
        System.out.print("Seleciona que deseas hacer : ");
    }

    public static void seleccionaJugada() {
        System.out.println("\nJUGADAS A ELEGIR\n");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.print("Seleccion tu jugada : ");
    }

    public static boolean validaSalida(int opcion) {
        return (opcion == 2);

    }

    public static void ronda(int menu, Scanner entrada) {

        while (!(validaSalida(menu))) {
            seleccionaJugada();
            int user = entrada.nextInt();
            Random num = new Random();
            int comp = num.nextInt(3) + 1;

            Juego_Piedra_Papel_Tijera.juego(user, comp);
            Juego_Piedra_Papel_Tijera.mostrarMenu();
            menu = entrada.nextInt();

        }

        System.out.println(Juego_Piedra_Papel_Tijera.reporte(contUSer, contComp));

    }

    public static String reporte(int contUSer, int contComp) {

        StringBuilder reporte = new StringBuilder();

        reporte.append("\n===== REPORTE GENERAL =====");

        if (contUSer == 0 && contComp == 0) {

            reporte.append("\nAun no se ha realizado ningun juego");

            return reporte.toString();

        }

        reporte.append(String.format("%nPuntuacion del Jugador  : %2d", contUSer));
        reporte.append(String.format("%nPuntuacion del Programa : %2d", contComp));

        return reporte.toString();
    }

}
