package com.doveoverlamb.sesion27;

import java.util.Random;

public class Main {

    // DECLARACION DE VARIABLES GLOBALES
    static Random generador = new Random();

    public static void main() {
        //ARREGLO DE NOTAS Y NOMBRES
        int[] arregloNotas = new int[20];
        String[] arregloNombres = new String[20];

        Main objPrograma = new Main();

        objPrograma.generarArreglos(arregloNotas, arregloNombres);
        objPrograma.imprimirArreglos(arregloNotas, arregloNombres);
        objPrograma.imprimirNotaMayor(arregloNotas, arregloNombres);
        objPrograma.imprimirNotaMenor(arregloNotas, arregloNombres);

    }

    private void generarArreglos(int[] arrNotas, String[] arrNombres) {
        //VARIABLE LOCAL
        int contador;
        for (contador = 0; contador < arrNotas.length; contador++) {
            // GENERA UNA NOTA ALEATORIA ENTRE 1 Y 20
            arrNotas[contador] = generador.nextInt(19) + 1;
            // GENERA NOMBRE ALEATORIO
            arrNombres[contador] = "Alumno " + (generador.nextInt(200) + 1);

        }

    }

    private void imprimirArreglos(int[] arrNotas, String[] arrNombres) {
        for (int con = 0; con < arrNotas.length; con++) {
            // IMPRIME POR PANTALLA CADA ELEMENTO DEL ARREGLO
            System.out.print("Nombre " + (con + 1) + " : " + arrNombres[con] + " -> ");
            System.out.print(arrNotas[con] + "\n");
        }
    }

    private void imprimirNotaMayor(int[] arrNotas, String[] arrNombres) {

        int aux = arrNotas[0];
        String alumno = arrNombres[0];
        for (int con = 1; con < arrNotas.length; con++) {
            // COMPARO LA VARIABLE CON EL ARREGLO
            if (arrNotas[con] > aux) {
                aux = arrNotas[con];
                alumno = arrNombres[con];
            }
        }

        System.out.println("\nAlumno : " + alumno + " con Nota Mayor : " + aux);

    }

    private void imprimirNotaMenor(int[] arrNotas, String[] arrNombres) {

        int aux = arrNotas[0];
        String alumno = arrNombres[0];
        for (int con = 1; con < arrNotas.length; con++) {
            // COMPARO LA VARIABLE CON EL ARREGLO
            if (arrNotas[con] < aux) {
                aux = arrNotas[con];
                alumno = arrNombres[con];
            }
        }
        System.out.println("\nAlumno : " + alumno + " con Nota Menor : " + aux);

    }
}
