package com.doveoverlamb.sesion25;
public class Test {


    public static void main(String args[]) {
        
        int [] array = {12,24,64,11,82,30,4};
        
        OperadorArreglo operador = new OperadorArreglo(array);
        
        int maximo = operador.obtenerMaximo();
        int [ ] vector = operador.eliminarValor(64);
        
        System.out.println("\nEl numero maximo es: "+ maximo);
        
        System.out.println("\n Vector Antiguo");
        for (int num : array) {
            System.out.print(num + " ");
        }
                
        System.out.println("\n Vector nuevo");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        
        
        
  
    }
}
