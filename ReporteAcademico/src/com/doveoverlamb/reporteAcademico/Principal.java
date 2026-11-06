package com.doveoverlamb.reporteAcademico;

public class Principal {

    /*
    Un docente desea registrar cuatro evaluaciones por estudiante, 
    obtener promedios y mostrar un reporte consolidado de forma automática. 
    
    El sistema deberá organizar los cálculos dentro de los objetos Alumno 
    y concentrar la visualización del reporte en una clase utilitaria.
     */
    
    public static void main(String args[]) {
        
        Alumno al1 = new Alumno("Al001","Omar Machuca");
        Alumno al2 = new Alumno("Al002","Sandra Machuca");
        
        
        al1.asignarNotas(15.00,17.00,14.00,18.00);
        
        
        ReporteAcademico.mostrarAlumno(al1);
        
        
        

    }
}
