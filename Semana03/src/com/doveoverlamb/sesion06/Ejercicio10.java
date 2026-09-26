package com.doveoverlamb.sesion06;

import javax.swing.JOptionPane;

public class Ejercicio10 {

    /*
        Debes crear un programa que permita calcular el peso ideal de una persona teniendo en cuenta lo siguiente:

            - Si la persona es una mujer, el peso ideal será igual a la altura en cm -120
            - Si la persona es un hombre, el peso ideal será igual a la altura en cm -110

        El programa pedirá al usuario mediante una ventana emergente de tipo JOptionPane dos datos:
    
            - La altura en cm
            - El género, pudiendo ser este hombre o mujer.
 
        En función de los datos introducidos, el programa imprimirá en consola el peso ideal.
     */
    public static void main(String[] args) {
        
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura en cm"));
        String genero = JOptionPane.showInputDialog("Ingrese su genero").toLowerCase();
        
        if(genero.equals("hombre")){
            System.out.println("El peso ideal del hombre es: " + (altura-110));
        }else{
            System.out.println("El peso ideal de la mujer es: " + (altura-120));
        }

    }
}
