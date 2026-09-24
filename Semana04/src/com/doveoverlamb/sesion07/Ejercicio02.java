package com.doveoverlamb.sesion07;

import java.util.Scanner;

public class Ejercicio02 {

    /**
     * Hoy la cotización del dólar y del euro son la siguientes: • 1 dólar =
     * 3.82 soles • 1 euro = 4.17 soles
     *
     * • Escribe un programa para convertir entre dólares, euros y soles. • El
     * usuario elegirá las monedas de origen y destino e ingresará el monto a
     * convertir
     *
     */
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        double dolares = 3.82;
        double euros = 4.17;

        double soles = 0, monto = 0, montoConvertido = 0;
        String monedaOrigen = "", monedaDestino = "";

        System.out.println("\n === MONEDAS DISPONIBLES ===\n");
        System.out.println(" 1. Soles");
        System.out.println(" 2. Dolares");
        System.out.println(" 3. Euros");

        System.out.print("\nSelecione la Moneda de Origen: ");
        int origen = entrada.nextInt();
        System.out.print("\nSelecione la Moneda de Destino: ");
        int destino = entrada.nextInt();

        System.out.print("\nIngrese el monto a convertir: ");
        monto = entrada.nextDouble();

        switch (origen) {
            case 1: {
                monedaOrigen = "S/.";
                soles = monto;
                break;
            }
            case 2: {
                monedaOrigen = "$";
                /**
                 * Tener en cuenta en la linea 20 hemos declarado una variable
                 * llamada dolares y le hemos asignado el valor que nos indica
                 * el problema de 3.82 soles.
                 */
                soles = monto * dolares;
                break;
            }
            case 3: {
                monedaOrigen = "E";
                soles = monto * euros;
                break;
            }

            default: {
                monedaOrigen = "";

            }
        }
        switch (destino) {
            case 1: {
                monedaDestino = "S/. ";
                montoConvertido = soles;
                break;
            }
            case 2: {
                monedaDestino = "$";
                montoConvertido = soles / dolares;
                break;
            }
            case 3: {
                monedaDestino = "E";
                montoConvertido = soles / euros;
                break;
            }

            default: {
                monedaDestino = "";

            }

        }

        if (soles == 0) {

            System.out.println("\nNo ha seleccionado una moneda de origen o destino de manera correcta");

        } else {
            System.out.printf("%nEl cambio de %s%.2f es de %s%.2f%n", monedaOrigen, monto, monedaDestino, montoConvertido);
        }
    }
}
