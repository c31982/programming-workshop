package com.doveoverlamb.tallerRepaso;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class RetoIntegrador_SistemasVentas {

    /*
     
      * Una tienda desea registrar las ventas realizadas durante el día. 
      * El programa debe solicitar : 
            a) Cuántas ventas se registrarán, 
            b) Guardar los importes en un arreglo 
            c) Generar un reporte estadístico.

        Requisitos obligatorios

        1.  Solicitar una cantidad de ventas mayor que 0.

        2.  Crear un arreglo double[] con esa cantidad de posiciones.

        3.  Ingresar cada venta y validar que sea mayor que 0.

        4.  Calcular total, promedio, venta mayor y venta menor.

        5.  Contar ventas mayores y menores que el promedio.

        6.  Mostrar el detalle de todas las ventas con dos decimales.

        7.  Utilizar al menos una estructura repetitiva y el arreglo de forma correcta.
    
     */
    public static void main(String args[]) {

        int cantidad;
        int ventasMayores = 0, ventasMenores = 0;
        double total = 0, promedio = 0, ventaMayor = 0, ventaMenor = 0;

        StringBuilder reporte = new StringBuilder();

        reporte.append("==============================\n");
        reporte.append("REPORTE DE VENTAS\n");
        reporte.append("==============================\n");

        do {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas a registrar"));

            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(null, "La cantidad de ventas a registrar debe ser mayor a 0");
            }

        } while (cantidad <= 0);

        double[] ventas = new double[cantidad];

        for (int i = 0; i < ventas.length; i++) {

            do {
                ventas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la venta " + (i + 1) + ""));
                if (ventas[i] <= 0) {
                    JOptionPane.showMessageDialog(null, "El monto de venta debe ser mayor a 0");
                }
            } while (ventas[i] <= 0);

            total += ventas[i];

        }

        promedio = total / ventas.length;
        ventaMayor = ventas[0];
        ventaMenor = ventas[0];

        StringBuilder detalle = new StringBuilder();

        detalle.append("==============================\n");
        detalle.append("DETALLE DE VENTAS\n");
        detalle.append("==============================\n");
      

        for (int i = 0; i < ventas.length; i++) {

            if (ventas[i] > ventaMayor) {
                ventaMayor = ventas[i];
            }
            if (ventas[i] < ventaMenor) {
                ventaMenor = ventas[i];
            }
            if (ventas[i] > promedio) {
                ventasMayores++;
            }
            if (ventas[i] < promedio) {
                ventasMenores++;
            }

            detalle.append(String.format("Venta %d : S/. %.2f%n", (i + 1), ventas[i]));

        }

        reporte.append(String.format("Cantidad de ventas : %d%n", cantidad));
        reporte.append(String.format("Venta total : S/.%.2f%n", total));
        reporte.append(String.format("Promedio : S/.%.2f%n", promedio));
        reporte.append(String.format("Venta mayor : S/.%.2f%n", ventaMayor));
        reporte.append(String.format("Venta menor : S/.%.2f%n", ventaMenor));
        reporte.append(String.format("Mayores al promedio : %d%n", ventasMayores));
        reporte.append(String.format("Menores al promedio : %d%n", ventasMenores));
        reporte.append(detalle);
        reporte.append("==============================");

        JOptionPane.showMessageDialog(null, reporte);

    }
}
