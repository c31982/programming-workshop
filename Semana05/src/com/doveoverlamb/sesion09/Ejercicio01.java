package com.doveoverlamb.sesion09;

import java.util.Scanner;

public class Ejercicio01 {

    /**
     * • Escribe un programa en Java para crear una Calculadora de Áreas. Debe
     * preguntarse al usuario por la figura (cuadrado, rectángulo, triángulo o
     * círculo) y luego solicitar los datos para calcular su área.
     *
     * • Elegir una figura requiere ingresar : *El nombre completo o las tres
     * primeras letras (“cuadrado” o “cua”, por ejemplo).
     *
     * • Usa los métodos equals y contains de la clase String para validar el
     * ingreso del usuario.
     *
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n=== Calculadora de Areas ===\n");
        System.out.println(" Cuadrado");
        System.out.println(" Rectangulo");
        System.out.println(" Triangulo");
        System.out.println(" Circulo");
        System.out.print("\nElija su opcion : ");
        String figura = entrada.nextLine().toLowerCase();

        if (figura.contains("cua")) {

            System.out.print("Ingrese el valor del lado: ");
            double lado = entrada.nextDouble();
            double area = Math.pow(lado, 2);

            System.out.println("\nEl area del cuadrado es: " + area);

        } else if (figura.contains("rec")) {
            System.out.println("\nIngrese el valor de la base: ");
            double base = entrada.nextDouble();
            System.out.println("\nIngrese el valor de la altura: ");
            double altura = entrada.nextDouble();

            double area = base * altura;

            System.out.println("\nEl area del rectangulo es: " + area);

        } else if (figura.contains("tri")) {
            System.out.println("Ingrese el valor de la base: ");
            double base = entrada.nextDouble();
            System.out.println("\nIngrese el valor de la altura: ");
            double altura = entrada.nextDouble();

            double area = (base * altura) / 2;

            System.out.println("\nEl area del triangulo es: " + area);

        } else if (figura.contains("cir")) {

            System.out.println("Ingrese el valor del radio: ");
            double radio = entrada.nextDouble();
            double area = (Math.PI) * radio;

            System.out.println("\nEl area del circulo es: " + area);

        } else {
            System.out.println("Ingrese una figura correcta");
        }

    }
}
