package com.doveoverlamb.efata;

public class Paquete {

    private String referencia;
    private int peso;
    private String dni;
    private int prioridad;

    public Paquete(String referencia, int peso, String dni, int prioridad) {
        this.referencia = referencia;
        this.peso = peso;
        this.dni = dni;
        this.prioridad = prioridad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int obtenerPeso() {
        return peso;
    }

    public int obtenerPrioridad() {
        return prioridad;
    }

    public String obtenerReferencia() {
        return referencia;
    }

}
