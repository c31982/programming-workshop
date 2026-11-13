package com.doveoverlamb.sesion28.casoResuelto;

public class Proyecto {

    private String codigo;
    private String nombre;
    private double presupuesto;
    private int integrantes;
    private String fecha;

    private static int correlativo = 0;

    public Proyecto() {

    }

    public Proyecto(String nombre, double presupuesto, int integrantes, String fecha) {

        setNombre(nombre);
        setPresupuesto(presupuesto);
        setIntegrantes(integrantes);
        setFecha(fecha);
        this.codigo = asignarCodigo();

    }

    public static String asignarCodigo() {
        correlativo++;
        String codigo = String.format("P000%d", correlativo);
        return codigo;
    }

    public String setNombre(String nombre) {
        if (nombre.equals(null) || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre es obligatorio");

        }
        return this.nombre = nombre.strip();
    }

    public String setFecha(String fecha) {
        if (fecha.equals(null) || fecha.isBlank()) {
            throw new IllegalArgumentException("El fecha es obligatoria");

        }
        return this.fecha = fecha.strip();
    }

    public double setPresupuesto(double presupuesto) {
        if (presupuesto < 0) {
            throw new IllegalArgumentException("El presupuesto debe ser positivo");

        }
        return this.presupuesto = presupuesto;
    }

    public int setIntegrantes(int integrantes) {
        if (integrantes < 1) {
            throw new IllegalArgumentException("La cantidad de integrantes debe ser mayor o igual a 1");

        }
        return this.integrantes = integrantes;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public String getFecha() {
        return fecha;
    }
    
    

}
