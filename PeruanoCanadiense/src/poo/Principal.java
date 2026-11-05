package poo;

public class Principal {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("44995634", "Omar David", "Machuca Ñuflo", 38, "Julio Machuca", "984523569");
        Alumno alumno2 = new Alumno("44992790", "Sandra Noemi", "Machuca Ñuflo", 33, "Cristina Ñuflo", "962308524");

        System.out.println(alumno1.toString());
        System.out.println(alumno2.toString());
        System.out.println(alumno2.obtenerNombreCompleto());

    }
}
