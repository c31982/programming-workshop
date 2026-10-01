package com.doveoverlamb.sesion16;

public class Ejercicio06 {

    /*
        Ejercicio 6. Tabla bidimensional
    
        Con dos for anidados genere una tabla de multiplicación del 1 al 10. 
        Use String.format() para alinear las columnas.

     */
    public static void main(String args[]) {
        
        String mensaje = "=== TABLA BIDIMENSIONAL ===";
        
        int columnas = 12;
        int anchoColumnas = 4;
        int anchoTabla = columnas * anchoColumnas;
        
        int espacios = (anchoTabla - mensaje.length())/2;
       
        System.out.println(String.format("%n%s%s%n",(" ".repeat(espacios)),mensaje));
//        System.out.println(String.format(" ".repeat(espacios)));
        
        for (int i = 1; i <= 10; i++) {
            
            for (int j = 1; j <= 12; j++) {
                
                System.out.print(String.format("%3d ",i*j));
            }
            System.out.println(" ");
        }
    }
}
