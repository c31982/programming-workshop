package com.doveoverlamb.sesion27;

public class Prueba {
    
    public static void main(String [] args){
        
        String name = "Omar Machuca";
        
//        saludo(name);
        
        
        System.out.println(sumar(10,20,30,name));;
    }
    
    
    // Metodos  VOID( Realizan un procediento )
    
    public static void saludo(String nombre){
        
        System.out.println("Hola "+nombre+" te presento la suma de los numeros\n");
    }
    
    
    
    
// Metodos  Return ( Tipo de dato )( Funciones )
    public static double sumar(double a, double b, double c,String nombre) {
        
        saludo(nombre);

        return a + b + c;
    }
    public static double sumar(double a, double b, double c) {
        
       

        return a + b + c;
    }

    public static double promedio(double x, double y, double z) {

        double suma = sumar(x, y, z);

//       return suma/3;
        return sumar(x, y, z) / 3;

    }

}
