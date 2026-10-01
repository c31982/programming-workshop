package com.doveoverlamb.sesion16;
import javax.swing.JOptionPane;
public class Ejercicio02 {

    /*
       Ejercicio 2. Clasificación de números
    
       Solicite N > 0. 
       Recorra del 1 a N y determine cuántos números son pares, cuántos impares y cuántos múltiplos de 5.

     */
    public static void main(String args[]) {
        
        int numero,contPares=0,contImpares=0,contMult=0;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Determine el ultimo valor del rango a contar"));
            if(numero < 0)JOptionPane.showMessageDialog(null,"Debe ingresar un numero entero positivo");
        }while(numero < 0);
        
        
        for (int i = 1; i <=numero; i++) {
            if(i%2==0) contPares++;
            if(i%2==1) contImpares++;
            if(i%5==0) contMult++;
        }
        System.out.println("\n=== REPORTE ===\n");
        System.out.println("Cantidad de Pares: "+contPares);
        System.out.println("Cantidad de Impares: "+contImpares);
        System.out.println("Cantidad de Multiplos de 5: "+contMult);
    }
}
