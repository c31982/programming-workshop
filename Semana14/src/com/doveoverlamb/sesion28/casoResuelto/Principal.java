package com.doveoverlamb.sesion28.casoResuelto;

public class Principal {

    // public Proyecto(String nombre, double presupuesto, int integrantes, String fecha) {
    public static void main(String[] args) {
        GestorProyectos gProyectos = new GestorProyectos();
        gProyectos.agregar(new Proyecto("Consola Juegos", 25800, 16, "10/11/2026"));
        gProyectos.agregar(new Proyecto("Redes y Cableado", 38500, 34, "11/11/2026"));
        gProyectos.agregar(new Proyecto("Software Contable", 12600, 8, "10/11/2026"));
        gProyectos.insertar(new Proyecto("Procesar encuestas", 1900, 5, "11/11/2026"), 2);
        gProyectos.agregar(new Proyecto("Página Web", 5800, 6, "10/11/2026"));
        gProyectos.agregar(new Proyecto("Configuración", 1360, 11, "11/11/2026"));
        gProyectos.agregar(new Proyecto("Base de Datos", 14900, 7, "10/11/2026"));
        gProyectos.insertar(new Proyecto("Distribuir noificaciones", 760, 3, "11/11/2026"), 4);
        gProyectos.agregar(new Proyecto("Encriptado de claves", 4600, 3, "10/11/2026"));

        Proyecto proyectoA = gProyectos.buscar(16);
        Proyecto proyectoB = gProyectos.buscar("Web");

        System.out.println(proyectoA != null ? proyectoA : "Proyecto con código 16 No encontrado");
        System.out.println(proyectoB != null ? proyectoB : "Proyecto de nombre 'Web' No encontrado");
    }
}
