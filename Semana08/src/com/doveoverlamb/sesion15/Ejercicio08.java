package com.doveoverlamb.sesion15;

public class Ejercicio08 {

    /*
        Ejercicio 8. Triángulo creciente
    
        Generar cinco filas con cantidad creciente de asteriscos.
     */
    public static void main(String args[]) {
        for (int fila = 1; fila <= 5; fila++) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
