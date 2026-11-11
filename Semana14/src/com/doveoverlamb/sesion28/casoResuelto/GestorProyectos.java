package com.doveoverlamb.sesion28.casoResuelto;

public class GestorProyectos {

    private static final int LONGITUD_ARREGLO = 10;
    private static Proyecto[] proyectos = new Proyecto[LONGITUD_ARREGLO];
    private static int numeroProyectos = 0;

    public void agregar(Proyecto proyecto) {
        if (numeroProyectos < proyectos.length) {
            proyectos[numeroProyectos++] = proyecto;
        }

    }

    public void insertar(Proyecto proyecto, int posicion) {

        // Se evalua si la posicion es mayor que la cantidad de 
        if (posicion < numeroProyectos && numeroProyectos < proyectos.length) {
            if (posicion == numeroProyectos - 1) {
                proyectos[numeroProyectos++] = proyecto;
            } else {
                for (int i = numeroProyectos; i > posicion; i--) {
                    proyectos[i] = proyectos[i - 1];
                }

                proyectos[posicion] = proyecto;
                numeroProyectos++;
            }

        }

    }

    static Proyecto buscar(int codigo) {
        for (int i = 0; i < numeroProyectos; i++) {
            if (proyectos[i].getCodigo().equalsIgnoreCase("P000" + codigo)) {
                return proyectos[i];
            }
        }
        return null;
    }

    static Proyecto buscar(String nombre) {
        for (int i = 0; i < numeroProyectos; i++) {
            if (proyectos[i].getNombre().equalsIgnoreCase(nombre)) {
                return proyectos[i];
            }
        }
        return null;
    }

}
