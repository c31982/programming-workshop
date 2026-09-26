package com.doveoverlamb.sesion14;

import javax.swing.JOptionPane;

public class Ejercicio06 {

    
   
    public static void main(String args[]) {
        
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        
        JOptionPane.showInternalMessageDialog(null,"El nombre de la persona es " + nombre,"Ahora",1
        );
     
    }
}
