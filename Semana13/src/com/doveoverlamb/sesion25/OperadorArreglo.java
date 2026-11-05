package com.doveoverlamb.sesion25;
public class OperadorArreglo {

    private int[] arreglo;

    public OperadorArreglo(int[] array) {

        this.arreglo = new int[array.length];

        System.arraycopy(array, 0, arreglo, 0, array.length);
    }

    public int obtenerMaximo() {
        int maximo = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            
            if(arreglo[i]>maximo) maximo = arreglo[i];

        }
        
        return maximo;
    }
    
    
    public int[] eliminarValor(int valor){
        int cantidad=0;
        for(int n : arreglo){
            if(n != valor) cantidad++ ;
        }
        
        int[]vector = new int[cantidad];
        
        for(int i=0,indice=0;i<arreglo.length;i++){
            if(arreglo[i]==valor) continue;
            
            vector[indice++]=arreglo[i];
        }
        
        return vector;
    }

    
    public int[] obtenerArreglo(){
        
        // Creamos una copia
        int [] copia = new int[arreglo.length];
        
        System.arraycopy(arreglo, 0, copia, 0,arreglo.length);
        
        return copia;
        
    }
}
