package com.doveoverlamb.sesion24;

import java.awt.Desktop;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class ReporteAlumno {

    public static void main(String args[]) {

        Alumno alumno1 = new Alumno("Omar", "juan.png", 38, 15, 17, 13, 18);
        Alumno alumno2 = new Alumno("Abigail", "foto2.png", 34, 17, 16, 15, 19);

        StringBuilder html = new StringBuilder();

        html.append("<html>");
        html.append("<body>");
        html.append("<h1>Listado de notas</h1>");
        html.append("<table border='1'>");

        html.append("<tr>");
        html.append("<th>Foto</th>");
        html.append("<th>Nombre</th>");
        html.append("<th>Edad</th>");
        html.append("</tr>");

        html.append("<tr>");

        html.append(String.format(
                "<td><img src='Semana12/src/images/%s' width='80'></td>",
                alumno1.getFoto()
        ));
        html.append(String.format(
                "<td>%s</td>",
                alumno1.getNombre()
        ));
        html.append(String.format(
                "<td>%d</td>",
                alumno1.getEdad()
        ));
        html.append("</tr>");

        html.append("</table>");
        html.append("</body>");
        html.append("</html>");

        try {
            // Ruta del archivo HTML
            Path ruta = Path.of("Semana12/reporte.html");

            // Guardar el contenido HTML
            Files.writeString(ruta, html.toString());

            System.out.println("Reporte generado correctamente.");

            // Abrir automáticamente en el navegador
            if (Desktop.isDesktopSupported()
                    && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {

                Desktop.getDesktop().browse(
                        ruta.toAbsolutePath().toUri()
                );

            } else {
                System.out.println("No se puede abrir el navegador automáticamente.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
