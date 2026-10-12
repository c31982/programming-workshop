package com.doveoverlamb.ejerciciosArray;

import java.util.Scanner;

public class Ejercicio03_AlmacenarAleatoriosArray {

    /*
        En este ejercicio debes crear un array de 100 elementos 
        Que guarde en cada una de las posiciones un nº aleatorio entre 1 y 100. 
    
        El programa debe imprimir en consola todos los valores almacenados en el array. 
        Utiliza un bucle for-each para leer los valores almacenados. 
    
        (Debes utilizar el método random() de la clase Math).
     */
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        int elementos[] = new int[100];

        for (int i = 0; i < elementos.length; i++) {

            elementos[i] = (int) ((Math.random() * 100) + 1);

        }
        
        for(int elemento : elementos){
            System.out.println(elemento);
        }

    }
}
