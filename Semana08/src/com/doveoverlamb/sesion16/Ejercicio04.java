package com.doveoverlamb.sesion16;

import javax.swing.JOptionPane;

public class Ejercicio04 {

    /*
        Ejercicio 4. Tabla formateada
    
        Solicite un número entre 1 y 20 y muestre su tabla del 1 al 12. 
        Use String.format() para alinear operandos y resultados.

     */
    public static void main(String args[]) {
        
        int numero;
        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
            if(numero<1 || numero > 20) JOptionPane.showMessageDialog(null,"Debe ingresar un numero entre 1 y 20");
        } while (numero<1 || numero > 20);
        
        System.out.printf("%n TABLA DE MULTIPLICAR DEL %2d%n%n",numero);
        
        for (int i = 1; i <=12; i++) {
            
            String tabla = String.format("%2d x %2d = %3d",numero,i,numero*i);
            System.out.println(tabla);
            
        }
    }
}
