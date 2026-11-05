package com.doveoverlamb.efata;

import java.util.Scanner;

public class Uso_Sucursal_y_Paquetes {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n BIENVENIDOS A EFATA \n");

        System.out.println("Ingrese su numero de sucursal");
        int nsucursal = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese su direccion");
        String direccion = entrada.nextLine();

        System.out.println("Cual es su ciudad");
        String ciudad = entrada.nextLine();

        System.out.println("Cuantos paquetes va enviar");
        int cantidadPaquetes = entrada.nextInt();

        Paquete[] paquetes = new Paquete[cantidadPaquetes];

        Sucursal sucursal = new Sucursal(direccion, ciudad, nsucursal);

        for (int i = 0; i < cantidadPaquetes; i++) {
           

                String dato = "paquete" + (i + 1);

                System.out.println("Ingrese la referencia del Envio para el paquete " + (i + 1));
                String referencia = entrada.nextLine();
                System.out.println("Ingrese el DNI del remitente");
                String dni = entrada.nextLine();
                System.out.println("Ingrese el peso del paquete");
                int peso = entrada.nextInt();
                System.out.println("Ingrese la prioridad del envío");
                int prioridad = entrada.nextInt();

                paquetes[i] = new Paquete(referencia, peso, dni, prioridad);

            
        }

        // REPORTES 
        System.out.println("\nDATOS DE LA SUCURSAL");

        // Nº, Dirección y Ciudad) y los datos de cada paquete (Referencia, Peso, Prioridad y Precio)
        System.out.println("N° de Sucursal : " + sucursal.obtenerSucursal());
        System.out.println("Direccion      : " + sucursal.obtenerDireccion());
        System.out.println("Ciudad         : " + sucursal.obtenerCiudad());

        System.out.println("\nDATOS DE CADA PAQUETE");

        // Nº, Dirección y Ciudad) y los datos de cada paquete (Referencia, Peso, Prioridad y Precio)
        for (Paquete paquete : paquetes) {

            System.out.println("Referencia : " + paquete.obtenerReferencia());
            System.out.println("Peso       : " + paquete.obtenerPeso());
            System.out.println("Prioridad  : " + paquete.obtenerPrioridad());
            System.out.println("Precio     : " + sucursal.calcularPrecio(paquete));

        }

    }
}
