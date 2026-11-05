package com.doveoverlamb.efata;

public class Sucursal {

    private int nSucursal;
    private String direccion;
    private String ciudad;

    // Metodo Constructor
    public Sucursal(String direcc, String ciudad, int numero) {

        this.direccion = direcc;
        this.ciudad = ciudad;
        this.nSucursal = numero;
    }

    // Metodos Setters
    public double calcularPrecio(Paquete paquete) {

        int tipo = paquete.obtenerPrioridad();
        double precio = paquete.obtenerPeso();

       double price = switch (tipo) {
            case 0 ->
                precio;
            case 1 ->
                precio + 10;
            case 2 ->
                precio + 20;
            default ->
                0;
        };
        
        return price;
    }

    // Metodos Getters ( Obtenemos la información correspondiente )
    public int obtenerSucursal() {
        return nSucursal;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

}
