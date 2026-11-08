package com.doveoverlamb.sesion27;

public class ColeccionNombres {

    private static final int FACTOR_CRECIMIENTO = 5;
    private static String[] nombres = new String[FACTOR_CRECIMIENTO];
    private static int contadorNombres = 0;
    
    
    public static void main(String [] args){
        agregar("Felipe");
        agregar("Mario");
        agregar(new String[] {"Miriam","Mario","Jorge"});
        agregar(new String[] {"Mario","Thiago","Celina","Mario","Julia"});
        agregar("Andres");
        mostrarNombres();
        eliminar("Mario",true,true);
        mostrarNombres();
    }

    private static void agregar(String nuevoNombre) {
        if (contadorNombres == nombres.length) {
            String[] listaAuxiliar = new String[nombres.length + FACTOR_CRECIMIENTO];
            System.arraycopy(nombres, 0, listaAuxiliar, 0, nombres.length);
            nombres = listaAuxiliar;
        }

        nombres[contadorNombres++] = nuevoNombre;
    }

    private static void agregar(String[] listaDeNombres) {
        String[] listaAuxiliar = new String[contadorNombres + listaDeNombres.length];

        System.arraycopy(nombres, 0, listaAuxiliar, 0, nombres.length);
        System.arraycopy(listaDeNombres, 0, listaAuxiliar, contadorNombres, listaDeNombres.length);

        contadorNombres += listaDeNombres.length;
        nombres = listaAuxiliar;
    }

    private static void mostrarNombres() {
        for (int i = 0; i < contadorNombres; i++) {
            System.out.print(nombres[i] + ", ");
        }
        System.out.println();
    }

    private static void eliminar(String nombreBuscado, boolean ignorarMayusculaMinuscula, boolean eliminarTodasOcurrencias) {
        for (int i = 0; i < contadorNombres; i++) {
            if (nombres[i].equals(nombreBuscado) || (nombres[i].equalsIgnoreCase(nombreBuscado) && ignorarMayusculaMinuscula)) {
                for (int j = 0; j < nombres.length - 1; j++) {
                    nombres[j] = nombres[j + 1];
                }
                contadorNombres--;

                if (!eliminarTodasOcurrencias) {
                    return;
                }
            }
        }
    }
    
    
    

}
