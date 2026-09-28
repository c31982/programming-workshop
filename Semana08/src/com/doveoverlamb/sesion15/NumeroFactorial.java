package com.doveoverlamb.sesion15;

import javax.swing.JOptionPane;

public class NumeroFactorial {

    /*
        Ejercicio 2. Número factorial:
 
        En este ejercicio, se pide el cálculo del factorial de un número introducido por el usuario desde una ventana JOptionPane. 
        El factorial de un número es igual a ese número multiplicado por todos los que le preceden. 
    
            Por ejemplo, el factorial de 5 es igual a 5x4x3x2x1, es decir, 120.
     */
    public static void main(String args[]) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un numero"));

        if (numero < 0) {

            JOptionPane.showMessageDialog(
                    null,
                    "No se puede calcular el factorial de un número negativo."
            );

        } else {

            long factorial = 1;

            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            JOptionPane.showMessageDialog(
                    null,
                    "El factorial de " + numero + " es: " + factorial
            );
        }

    }
}
