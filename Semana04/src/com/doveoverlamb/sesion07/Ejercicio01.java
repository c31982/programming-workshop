package com.doveoverlamb.sesion07;

import java.util.Scanner;

public class Ejercicio01 {

    /**
     * La evaluación de un postulante a un puesto de trabajo resulta en una
     * puntuación entre 0 y 10.
     *
     * Se desea mostrar una descripción de la evaluación alcanzada de acuerdo
     * con los siguientes criterios:
     *
     * • 0-4 → descartado • 5 → en suspenso • 6 → aceptable • 7,8 → notable • 9,
     * 10 → sobresaliente
     *
     * • Escriba un programa que solicite la puntuación de un candidato y
     * muestre la descripción que le corresponda.
     *
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String descripcion = "";

        System.out.print("\nIngrese la puntuacion del alumno: ");
        int puntuacion = entrada.nextInt();

        switch (puntuacion) {
            case 0, 1, 2, 3, 4:
                descripcion = "descartado";
                break;
            case 5:
                descripcion = "en suspenso";
                break;
            case 6:
                descripcion = "aceptable";
                break;
            case 7, 8:
                descripcion = "notable";
                break;
            case 9, 10:
                descripcion = "sobresaliente";
                break;

            default:

                break;

        }

        if (descripcion.equals("")) {
            System.out.println("\nLa puntuacion ingresada es incorrecta");
        } else {
            System.out.printf("%nLa puntuacion obtenida por el alumno genera un estado de : %s", descripcion);
        }
    }
}
