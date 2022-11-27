/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_colas;

import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Proyecto2_Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0, nodo_informacion = 0;

        Cola cola = new Cola();
        Cola cola2 = new Cola();
        Cola cola3 = new Cola();
        Cola cola4 = new Cola();

        int CantC1;
        int CantC2;
        int CantC3;
        int CantC4;

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de opciones \n\n"
                        + "1. Hacer cola en cajero\n"
                        + "2. Realizar transaccion\n"
                        + "3. Mostrar contenido de las colas\n"
                        + "4. Salir\n\n"));

                switch (opcion) {
                    case 1:
                        CantC1 = cola.CantLista();
                        CantC2 = cola2.CantLista();
                        CantC3 = cola3.CantLista();
                        CantC4 = cola4.CantLista();

                        int CantColas[] = {CantC1, CantC2, CantC3, CantC4};

                        int menor = CantC1;

                        for (int i = 0; i < CantColas.length; i++) {

                            if (menor < CantColas[i]) {

                                menor = CantColas[i];

                            }
                        }

                        if (menor == CantC1 && menor != CantC2 && menor != CantC3 && menor != CantC4) {
                            nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Porfavor ingrese valor a guardar en el nodo"));
                            cola.Insertar(nodo_informacion);
                        }

                        if (menor == CantC2 && menor != CantC1 && menor != CantC3 && menor != CantC4) {
                            nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Porfavor ingrese valor a guardar en el nodo"));
                            cola2.Insertar(nodo_informacion);
                        }

                        if (menor == CantC3 && menor != CantC2 && menor != CantC1 && menor != CantC4) {
                            nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Porfavor ingrese valor a guardar en el nodo"));
                            cola3.Insertar(nodo_informacion);
                        }

                        if (menor == CantC4 && menor != CantC2 && menor != CantC3 && menor != CantC1) {
                            nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Porfavor ingrese valor a guardar en el nodo"));
                            cola4.Insertar(nodo_informacion);
                        }

                        if (CantC1 == CantC2 || CantC1 == CantC3 || CantC1 == CantC4
                                || CantC2 == CantC3 || CantC2 == CantC4 || CantC3 == CantC4) {

                            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "******Cajeros con similar cola******\n\n"
                                    + "Favor seleccione un cajero:\n "
                                    + "\tCajero 1\n"
                                    + "\tCajero 2\n"
                                    + "\tCajero 3\n"
                                    + "\tCajero 4\n\n"));

                            if (opcion == 1) {
                                nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Porfavor ingrese valor a guardar en el nodo"));
                                cola.Insertar(nodo_informacion);
                            }

                            if (opcion == 2) {
                                nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Porfavor ingrese valor a guardar en el nodo"));
                                cola2.Insertar(nodo_informacion);
                            }

                            if (opcion == 3) {
                                nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Porfavor ingrese valor a guardar en el nodo"));
                                cola3.Insertar(nodo_informacion);
                            }

                            if (opcion == 4) {
                                nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Porfavor ingrese valor a guardar en el nodo"));
                                cola4.Insertar(nodo_informacion);
                            }
                        }

                        break;

                    case 2:

                        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "******Cajeros con similar cola******\n\n"
                                + "Favor seleccione un cajero:\n "
                                + "\tCajero 1\n"
                                + "\tCajero 2\n"
                                + "\tCajero 3\n"
                                + "\tCajero 4\n\n"));

                        if (opcion == 1) {

                            if (!cola.ColaVacia()) {
                                JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: "
                                        + cola.Extraer());
                            } else {
                                JOptionPane.showMessageDialog(null, "La lista esta vacia");
                            }
                        }

                        if (opcion == 2) {

                            if (!cola2.ColaVacia()) {
                                JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: "
                                        + cola2.Extraer());
                            } else {
                                JOptionPane.showMessageDialog(null, "La lista esta vacia");
                            }
                        }

                        if (opcion == 3) {

                            if (!cola3.ColaVacia()) {
                                JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: "
                                        + cola3.Extraer());
                            } else {
                                JOptionPane.showMessageDialog(null, "La lista esta vacia");
                            }
                        }

                        if (opcion == 4) {

                            if (!cola4.ColaVacia()) {
                                JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: "
                                        + cola4.Extraer());
                            } else {
                                JOptionPane.showMessageDialog(null, "La lista esta vacia");
                            }
                        }

                        break;

                    case 3:
                        cola.MostrarContenido();
                        cola2.MostrarContenido();
                        cola3.MostrarContenido();
                        cola4.MostrarContenido();
                        break;

                    case 4:
                        opcion = 4;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no disponible");
                        break;

                }

            } catch (NumberFormatException e) {
            }
        } while (opcion != 4);

    }

}
