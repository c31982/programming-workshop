package com.doveoverlamb.sesion15;

import javax.swing.JOptionPane;

public class EmailValido {

    /*
        Ejercicio 1. Dirección de email válida:

        Requisitos:
        - Debe tener una @
        - No debe tener más de una @
        - Debe tener al menos un punto
        - Debe tener al menos 4 caracteres

        El programa seguirá solicitando el email
        mientras no cumpla los requisitos.
     */
    public static void main(String[] args) {

        boolean valido = false;

        do {

            String email = JOptionPane.showInputDialog(
                    null,
                    "Ingrese su email:"
            );

            // Si el usuario presiona Cancelar
            if (email == null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Operación cancelada."
                );
                return;
            }

            int contArroba = 0;
            int contPunto = 0;

            if (email.length() < 4) {

                JOptionPane.showMessageDialog(
                        null,
                        "La dirección de email debe tener al menos 4 caracteres."
                );

            } else {

                // Recorremos carácter por carácter
                for (int i = 0; i < email.length(); i++) {

                    if (email.charAt(i) == '@') {
                        contArroba++;
                    }

                    if (email.charAt(i) == '.') {
                        contPunto++;
                    }
                }

                // Validamos los requisitos
                valido = contArroba == 1 && contPunto >= 1;

                if (!valido) {

                    JOptionPane.showMessageDialog(
                            null,
                            """
                            Email incorrecto.

                            Requisitos:
                            - Debe contener exactamente una @
                            - Debe contener al menos un punto
                            - Debe tener al menos 4 caracteres
                            """
                    );
                }
            }

        } while (!valido);

        JOptionPane.showMessageDialog(
                null,
                "¡La dirección de email se registró correctamente!"
        );
    }
}
