package com.doveoverlamb.sesion16;

import javax.swing.JOptionPane;
public class Ejercicio01 {

    /*
        Ejercicio 1. Serie configurable
        
        Solicite un valor inicial y uno final. 
    
        Muestre todos los números comprendidos entre ambos valores en forma ascendente y luego descendente.
     */
    public static void main(String args[]) {
        
        int valorInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para el inicio de la serie: "));
        int valorFinal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para el final de la serie: "));
        
        System.out.print("\nAscendente : ");
        for(int i = valorInicial;i<=valorFinal;i++){
            System.out.print(i+" ");
        }
        System.out.print("\nDescendente : ");
        for(int i = valorFinal;i>=valorInicial;i--){
            System.out.print(i+" ");
        }
        
        
    }
}
