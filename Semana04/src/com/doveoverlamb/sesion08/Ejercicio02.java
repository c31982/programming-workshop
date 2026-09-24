package com.doveoverlamb.sesion08;

import java.util.Scanner;

public class Ejercicio02 {

    /**
     * • Escribir un programa que lea un número entero entre 1 y 50 y lo escriba
     * en números romanos. • Preguntar al usuario si desea mostrar el valor en
     * mayúsculas o minúsculas (String.toUpperCase y String.toLowerCase)
     *
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("\nIngrese un numero 1 - 50 : ");
        int num = entrada.nextInt();

        if (num < 1 || num > 50) {
            System.out.println("\nDebe ingresar un numero entre 1 y 50\n");

        } else {

            int unidades = num % 10;
            int decenas = num / 10;

            String romanoDecenas = switch (decenas) {
                case 1 ->
                    "X";
                case 2 ->
                    "XX";
                case 3 ->
                    "XXX";
                case 4 ->
                    "XL";
                case 5 ->
                    "L";
                default ->
                    "";
            };
            String romanoUnidades = switch (unidades) {
                case 1 ->
                    "I";
                case 2 ->
                    "II";
                case 3 ->
                    "III";
                case 4 ->
                    "IV";
                case 5 ->
                    "V";
                case 6 ->
                    "VI";
                case 7 ->
                    "VII";
                case 8 ->
                    "VIII";
                case 9 ->
                    "IX";
                default ->
                    "";
            };

            System.out.println("\n¿Como desea mostrar el resultado?\n");
            System.out.println(" 1. Mayusculas");
            System.out.println(" 2. Minusculas");
            System.out.print("\nSeleccione como desea visualizar el reporte: ");

            int opcion = entrada.nextInt();

            String reporte = switch (opcion) {
                case 1 ->
                    (romanoDecenas + romanoUnidades).toUpperCase();
                case 2 ->
                    (romanoDecenas + romanoUnidades).toLowerCase();
                default ->
                    "";
            };

            System.out.printf(reporte.equals("")
                    ? "%nOpcion invalida%n" 
                    :"%nEl valor en romanos: %s%n", reporte);
        }
    }
}
