package com.doveoverlamb.arreglosUnidimensionales;

import java.util.Scanner;

public class Ejercicio01_SistemaAnalisisVentas {

    /*
        Una tienda necesita registrar las ventas de 15 días. 
    
        Desarrolla un programa que calcule la venta mayor y menor con sus respectivas posiciones, 
        el total, el promedio y cuántas ventas superan el promedio.
    
        Reto adicional: ordenar las ventas de mayor a menor sin utilizar Arrays.sort().
     */
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        StringBuilder reporte = new StringBuilder();
        
        
        reporte.append("\n=========== REPORTE DE VENTAS ===========\n\n");

        double ventas[] = new double[5];

        double total = 0.00, promedio = 0.00, ventaMayor, ventaMenor,aux;
        int contMayor = 0, contMenor = 0, contIgual = 0, posicionMayor = 0, posicionMenor = 0, contVueltas = 0;

        for (int i = 0; i < ventas.length; i++) {

            do {
                System.out.print("\nIngrese la venta del día " + (i + 1) + ": ");
                ventas[i] = entrada.nextDouble();
                if (ventas[i] <= 0) {
                    System.out.println("\nLa venta debe ser mayor a 0");
                }
            } while (ventas[i] <= 0);

            total += ventas[i];
        }

        promedio = total / ventas.length;
        ventaMayor = ventaMenor = ventas[0];

        for (int i = 0; i < ventas.length; i++) {

            if (ventas[i] > ventaMayor) {
                ventaMayor = ventas[i];
                posicionMayor = i;
            }
            if (ventas[i] < ventaMenor) {
                ventaMenor = ventas[i];
                posicionMenor = i;
            }

            if (ventas[i] > promedio) {
                contMayor++;
            } else if (ventas[i] < promedio) {
                contMenor++;
            } else {
                contIgual++;
            }
            
            reporte.append(String.format("Día %2d: S/. %.2f%n",(i+1),ventas[i]));

        }

        do {
            contVueltas = 0;
            for (int i = 1; i < ventas.length; i++) {

                if (ventas[i] > ventas[i - 1]) {
                    aux = ventas[i - 1];
                    ventas[i - 1] = ventas[i];
                    ventas[i] = aux;
                    contVueltas++;
                }

            }
        } while (contVueltas > 0);


        for (double venta : ventas) {
            System.out.print(venta + " ");
        }

        reporte.append(String.format("%n%n------------- RESUMEN ------------------%n%n"));
        reporte.append(String.format("Total vendido: %10.2f%n",total));
        reporte.append(String.format("Promedio de ventas: %10.2f%n%n%n",promedio));
        reporte.append(String.format("Venta mayor: %10.2f%n%n",ventaMayor));
        reporte.append(String.format("Día(s) de venta mayor: %10d%n%n%n",posicionMayor));
        reporte.append(String.format("Venta menor: %10.2f%n%n",ventaMenor));
        reporte.append(String.format("Día(s) de venta menor: %10d%n%n%n",posicionMenor));
        reporte.append(String.format("Días sobre el promedio: %10d%n",contMayor));
        reporte.append(String.format("Días bajo el promedio: %10d%n",contMenor));
        reporte.append(String.format("Días iguales al promedio: %10d%n%n%n",contIgual));
        reporte.append("========================================");
//        reporte.append(String.format("Total vendido: %-20s%.2f%n"," ",total));
//        reporte.append(String.format("Promedio de ventas: %-20s%.2f%n%n%n"," ",promedio));
//        reporte.append(String.format("Venta mayor: %-20s%.2f%n%n","",ventaMayor));
//        reporte.append(String.format("Día(s) de venta mayor: %-20s%d%n%n%n"," ",posicionMayor));
//        reporte.append(String.format("Venta menor: %-20s%.2f%n%n","",ventaMenor));
//        reporte.append(String.format("Día(s) de venta menor: %-20s%d%n%n%n"," ",posicionMenor));
//        reporte.append(String.format("Días sobre el promedio: %-20s%d%n"," ",contMayor));
//        reporte.append(String.format("Días bajo el promedio: %-20s%d%n"," ",contMenor));
//        reporte.append(String.format("Días iguales al promedio: %-20s%d%n%n%n"," ",contIgual));
//        reporte.append("========================================");
        
        

        
        System.out.println(reporte);

    }
}
