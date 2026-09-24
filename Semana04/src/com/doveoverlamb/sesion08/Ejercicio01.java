package com.doveoverlamb.sesion08;

import java.util.Scanner;
public class Ejercicio01 {

    /**
     * Escribir un programa que le permita a un docente, 
     * 
     * 1. Ingresar la nota de un alumno y le devuelva el mensaje “Usted obtuvo la mención de #mencion#”,
     * 2. Reemplazando la expresión #mencion# por el valor correspondiente (String.replace), según el cuadro mostrado:
     * 
     *               Nota                   Mención
     * 
     *          > 18  y  <= 20             Excelente
     *          > 15  y  <= 18               Bueno
     *          >= 13 y  <= 15              Regular
     *          < 13  y  >= 0              Deficiente
     */
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String mensaje = "\nUsted obtuvo la mención de #mencion#";
        
        System.out.print("\nIngrese la nota del alumno: ");
        
        Integer nota = entrada.nextInt();
        
        String msj = switch(nota){
            case Integer n when(n > 18  && n <= 20)-> "Excelente";
            case Integer n when(n > 15  && n <= 18)-> "Bueno";
            case Integer n when(n >= 13  && n <= 15)-> "Regular";
            case Integer n when(n >= 0  && n <  13)-> "Deficiente";
            default -> "";
        };
        
        String reporte = msj.equals("") 
                ?"\nDebe ingresar una nota correcta"
                : mensaje.replace("#mencion#",msj);
        
        System.out.println(reporte);
        
        
        

    }
}
