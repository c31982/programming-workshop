package com.doveoverlamb.sesion09;

import java.util.Scanner;

public class Ejercicio02 {

    /**
     * • Una tienda de celulares ofrece distintos planes tarifarios en función
     * de la marca que se compre, así como descuentos aplicados de acuerdo con
     * el plazo de pago promocional escogido (ver tablas).
     *
     * • Escribe un programa en Java que solicite al usuario la marca del
     * celular y el plazo de pago, y muestre el monto del plan, el descuento que
     * le corresponda y el monto final a pagar.
     *
     * • Mostrar un mensaje de error si alguna opción ingresada es incorrecta.
     *
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double monto = 0.00, descuento = 0.00, total = 0.00;

        System.out.println("\n=== MARCAS DE CELULAR ===\n");
        System.out.println("  Celular           Plan\n");
        System.out.println("1. Motorola        29.90");
        System.out.println("2. LG              36.00");
        System.out.println("3. Samsung         46.00");
        System.out.println("4. Huawei          62.00");
        System.out.println("5. iPhone          71.00");
        System.out.print("\nSeleccione la marca a comprar: ");
        int marca = entrada.nextInt();

        if (marca < 1 || marca > 5) {

            System.out.println("\nSeleccione una opcion de marca correcta\n");

        } else {

            System.out.println("\n=== PLAZOS DE PAGO ===\n");
            System.out.println("1. A 06 meses        13.2%");
            System.out.println("2. A 12 meses       12.0%");
            System.out.println("3. A 18 meses       11.2%");
            System.out.print("\nSeleccione el plazo de pago: ");
            int plazo = entrada.nextInt();

            if (plazo < 1 || plazo > 3) {
                System.out.println("\nSeleccione una opcion de plazo correcta");
            } else {

                total = switch (marca) {
                    case 1 -> {
                        monto = 29.90;
                        descuento = switch (plazo) {
                            case 1 ->
                                monto * 0.132;
                            case 2 ->
                                monto * 0.12;
                            case 3 ->
                                monto * 0.112;
                            default ->
                                0.00;
                        };

                        yield monto - descuento;
                    }
                    case 2 -> {
                        monto = 36.00;
                        descuento = switch (plazo) {
                            case 1 ->
                                monto * 0.132;
                            case 2 ->
                                monto * 0.12;
                            case 3 ->
                                monto * 0.112;
                            default ->
                                0.00;
                        };

                        yield monto - descuento;
                    }
                    case 3 -> {
                        monto = 46.00;
                        descuento = switch (plazo) {
                            case 1 ->
                                monto * 0.132;
                            case 2 ->
                                monto * 0.12;
                            case 3 ->
                                monto * 0.112;
                            default ->
                                0.00;
                        };

                        yield monto - descuento;
                    }
                    case 4 -> {
                        monto = 62.00;
                        descuento = switch (plazo) {
                            case 1 ->
                                monto * 0.132;
                            case 2 ->
                                monto * 0.12;
                            case 3 ->
                                monto * 0.112;
                            default ->
                                0.00;
                        };

                        yield monto - descuento;
                    }
                    case 5 -> {
                        monto = 71.00;
                        descuento = switch (plazo) {
                            case 1 ->
                                monto * 0.132;
                            case 2 ->
                                monto * 0.12;
                            case 3 ->
                                monto * 0.112;
                            default ->
                                0.00;
                        };

                        yield monto - descuento;
                    }
                    default ->
                        0.00;

                };

                System.out.printf("%nMonto de Plan: %.2f%n", monto);
                System.out.printf("Descuento Aplicado: %.2f%n", descuento);
                System.out.printf("Total a Pagar: %.2f%n", total);
            }

        }

    }
}
