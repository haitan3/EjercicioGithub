/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogithub;

import Utilidades.Colores;

/**
 *
 * @author alex2
 */
public class Libro {

    private String TituloL;
    private int numPag;
    private String autorL;
    private boolean validar = true;

    private void pedirTituloL() {
        TituloL = pedirDatos.PedirDatosTeclado.pedirString("\n\tInserte el Titulo del libro");
    }

    private void pedirNumPag() {
        numPag = pedirDatos.PedirDatosTeclado.pedirInt("\n\tInserte el numero de paginas");
    }

    private void pedirAutorL() {
        autorL = pedirDatos.PedirDatosTeclado.pedirString("\n\tIndique el Autor del libro");
    }

    public void pedirTodosLosDatos() {
        pedirTituloL();
        pedirNumPag();
        pedirAutorL();
    }

    private void visualizarTituloL() {
        System.out.println("\n\tEl Titulo del libro es: " + TituloL);
    }

    private void visualizarNumPag() {
        System.out.println("\n\tEl libro " + TituloL + " tiene " + numPag);
    }

    private void visualizarAutorL() {
        System.out.println("\n\tEl autor es " + autorL);
    }

    public void visualizarTodo() {
        visualizarTituloL();
        visualizarNumPag();
        visualizarAutorL();
    }

    public void validarLibros() {
        do {
            try {

                pedirTodosLosDatos();
                if (numPag < 0) {
                    validar = false;
                } else {
                    visualizarTodo();
                }
            } catch (NumberFormatException e) {
                System.out.println(Colores.RED+"HAS INSERTADO LETRAS, LO SIENTO MUCHO, CERRAMOS EL PROGRAMA"+Colores.RESET);
                break;
            }
        } while (validar == true);
    }
}
