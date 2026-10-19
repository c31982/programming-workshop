package com.doveoverlamb.sesion21;

import javax.swing.JOptionPane;

public class Ejercicio01 {

    /*
        Escribir un programa en Java que solicite números reales para una matriz de 3x3.
        Calcular, por fila, la suma y promedio.
            
            • Almacenar los resultados en vectores paralelos y mostrarlos en pantalla.
     */
    public static void main(String args[]) {
        
        StringBuilder reporte = new StringBuilder();

//        double[][] matriz = new double[3][3];
        double [] suma = new double[3],promedio = new double[3];
        double sum=0,prom=0;
        
        double[][] matriz = {{11,12,13},{21,22,23},{31,32,33}};
        
        for (int i = 0; i < matriz.length; i++) {
            sum=0;
            prom=0;
            for (int j = 0; j < matriz[0].length; j++) {
//                do {
//                    matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog(String.format("Ingrese el valor de [%d][%d]: ", i, j)));
//                    if (matriz[i][j] < 0) {
//                        JOptionPane.showMessageDialog(null, "El valor debe ser positivo");
//                    }
//                } while (matriz[i][j] < 0);
                
                sum += matriz[i][j];
            }
            prom = sum/matriz[0].length;
            
            suma[i] = sum;
            promedio[i]=prom;
        }
        
        reporte.append(String.format("%-15s%-15s%12s%12s%n"," ","Matriz","Suma","Promedio")); 
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                 reporte.append(String.format(" %8.2f ",matriz[i][j]));    
            }
            
            reporte.append(String.format("%12.2f%12.2f%n",suma[i],promedio[i]));  
            
        }

        
        JOptionPane.showMessageDialog(null, reporte);
        System.out.println(reporte);

    }
}
