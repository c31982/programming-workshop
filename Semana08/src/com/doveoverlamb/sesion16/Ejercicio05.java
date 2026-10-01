package com.doveoverlamb.sesion16;

import javax.swing.JOptionPane;

public class Ejercicio05 {

    /*
        Ejercicio 5. Patrón triangular
    
        Solicite una cantidad de filas entre 2 y 10. 
    
        En cada fila repita el número de la fila tantas veces como indique dicha fila.

     */
    public static void main(String args[]) {

        int cantidad;

        do {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas"));
            if (cantidad < 2 || cantidad > 20) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un numero entre 2 y 20");
            }
        } while (cantidad < 2 || cantidad > 20);

        for (int i = 1; i <= cantidad; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }

    }
}
