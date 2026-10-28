package com.doveoverlamb.sesion24;

public class Alumno {

    private String nombre;
    private String foto;
    private int edad, practica1, practica2, practica3, examenFinal;

    public Alumno(String nombre, String foto, int edad, int practica1, int practica2, int practica3, int examenFinal) {
        this.nombre = nombre;
        this.foto = foto;
        this.edad = edad;
        this.practica1 = practica1;
        this.practica2 = practica2;
        this.practica3 = practica3;
        this.examenFinal = examenFinal;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPractica1(int practica1) {
        this.practica1 = practica1;
    }

    public void setPractica2(int practica2) {
        this.practica2 = practica2;
    }

    public void setPractica3(int practica3) {
        this.practica3 = practica3;
    }

    public void setExamenFinal(int examenFinal) {
        this.examenFinal = examenFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFoto() {
        return foto;
    }

    public int getEdad() {
        return edad;
    }

    public int getPractica1() {
        return practica1;
    }

    public int getPractica2() {
        return practica2;
    }

    public int getPractica3() {
        return practica3;
    }

    public int getExamenFinal() {
        return examenFinal;
    }
      

}
