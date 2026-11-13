package com.doveoverlamb.sesion28.ejercicio02;

public class Auto {

    private final String placa;
    private String marca;
    private String modelo;
    private String propietario;



    public Auto(String placa, String marca, String modelo, String propietario) {

        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("Es obligatorio el ingreso correcto de la placa");
        }

        this.placa = placa.strip();
        setMarca(marca);
        setModelo(modelo);
        setPropietario(propietario);

    }

    public void setMarca(String marca) {

        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Es obligatorio el ingreso correcto de la marca");
        }
        this.marca = marca.strip();
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("Es obligatorio el ingreso correcto del modelo");
        }

        this.modelo = modelo.strip();
    }

    public void setPropietario(String propietario) {
        if (propietario == null || propietario.isBlank()) {
            throw new IllegalArgumentException("Es obligatorio el ingreso correcto del nombre del propietario");
        }

        this.propietario = propietario.strip();
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPropietario() {
        return propietario;
    }


    @Override
    public String toString() {
        return """
               Placa       : %s
               Marca       : %s
               Modelo      : %s
               Propietario : %s
               """.formatted(getPlaca(), getMarca(), getModelo(), getPropietario());
    }

}
