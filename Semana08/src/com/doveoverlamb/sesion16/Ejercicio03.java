package com.doveoverlamb.sesion16;

import javax.swing.JOptionPane;

public class Ejercicio03 {

    /*
        Ejercicio 3. Sumatoria y promedio
    
        Solicite la cantidad de números a ingresar. 
   
        Lea cada valor con for, calcule suma y promedio y muestre el promedio con dos decimales 
        usando String.format().

     */
    public static void main(String args[]) {

        double suma = 0, promedio = 0;
        int cantidad = 0;
        
        do {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a ingresar"));
            if(cantidad<0) JOptionPane.showMessageDialog(null,"Debe ingresar un valor positivo");
        } while (cantidad < 0);

        for (int i = 1; i <= cantidad; i++) {
            suma += Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero " + i));
        }
        promedio = suma / cantidad;
        
        String sum = String.format("La suma es : %.2f",suma);
        String prom = String.format("El promedio es : %.2f",promedio);
        
        System.out.println("\n=== REPORTE ===\n");
        System.out.println("Cantidad ingresada: "+cantidad);
        System.out.println(sum);
        System.out.println(prom);

    }
}
