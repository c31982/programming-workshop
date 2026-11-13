package com.doveoverlamb.sesion28.ejercicio02;

public class Estacionamiento {

    private static final int ZONAS = 5;
    private static final int CAPACIDAD = 7;

    private static final Auto[][] parking = new Auto[ZONAS][CAPACIDAD];

    private static int[] buscarAuto(String placa) {

        for (int i = 0; i < parking.length; i++) {
            for (int j = 0; j < parking[i].length; j++) {

                if (parking[i][j] != null && parking[i][j].getPlaca().equalsIgnoreCase(placa)) {
                    return new int[]{i, j};
                }
            }
        }

        return null;

    }

    private static boolean parquear(Auto auto, int zona) {

        if (auto == null) {
            throw new IllegalArgumentException("Ha ingresado Valores nulos");
        }

        if (buscarAuto(auto.getPlaca()) != null) {
            return false;
        }

        boolean invalido = (zona < 0 || zona >= parking.length);

        if (invalido) {
            return false;
        }

        for (int i = 0; i < parking[zona].length; i++) {
            if (parking[zona][i] == null) {
                parking[zona][i] = auto;
                return true;
            }

        }

        return false;
    }

    private static boolean retirar(String placa) {

        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Debes proporcionar una placa valida");
        }
        int[] ubicacion = buscarAuto(placa);

        if (ubicacion == null) {
            return false;
        }

        parking[ubicacion[0]][ubicacion[1]] = null;

        return true;

    }

    private static String mostrarUbicacione(String placa) {
        // Para listar las ubicaciones de una zona determinada.

        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Debes proporcionar una placa valida");
        }
        int[] ubicacion = buscarAuto(placa);
        
        if(ubicacion == null) return "No hay un auto estacionado con esa placa";
        
        return """
               Automovil encontrado
               
               Zona    : %2d
               Espacio : %2d
               
               """.formatted(ubicacion[0]+1,ubicacion[1]+1);

    }

}
