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
    private int numPag, numPagaComparar;
    private String autorL, autorAcomparar;
    private boolean validar = true;

    private void pedirTituloL() {
        TituloL = pedirDatos.PedirDatosTeclado.pedirString("\n\tInserte el Titulo del libro: ");
    }

    public Libro() {
        System.out.println("VAMOS A EMPEZAR PIDIENDOTE QUE INSERTE UN AUTOR Y UN NUMERO DE PAGINAS");
        pedirAutorYNumPags();
    }

    private void pedirNumPag() {
        numPag = pedirDatos.PedirDatosTeclado.pedirInt("\n\tInserte el numero de paginas: ");
    }

    private void pedirAutorL() {
        autorL = pedirDatos.PedirDatosTeclado.pedirString("\n\tIndique el Autor del libro: ");
    }

    private void pedirAutorAcomparar() {
        autorAcomparar = pedirDatos.PedirDatosTeclado.pedirString("\n\tIndique el Autor del libro: ");
    }

    private void pedirNumPagsAcomparar() {
        numPagaComparar = pedirDatos.PedirDatosTeclado.pedirInt("\n\tInserte el numero de paginas: ");
    }

    public void pedirAutorYNumPags() {
        pedirAutorL();
        pedirNumPag();
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
        int contadorIguales = 0;
        do {
            try {

                pedirAutorAcomparar();
                pedirTituloL();
                pedirNumPagsAcomparar();
//Esto es comparando las pags
                
                        if(numPag==numPagaComparar){
                           System.out.println(Colores.GREEN +"Los libros tienen el mismo numero de paginas!!! vamos a visualizar los datos: " + Colores.RESET);
                              visualizarTodo();
                                 //  contadorIguales++;
                        }
                 
                if (numPag < 0) {
                    validar = false;
                } else {
                    if (autorAcomparar.equals(autorL)) {
                        System.out.println(Colores.GREEN + "Los libros tienen el mismo autor!!! vamos a visualizar los datos: " + Colores.RESET);
                        visualizarTodo();
                        contadorIguales++;
                    }
                    System.out.println("De momento hay " + contadorIguales + " libros de ese mismo autor en la biblioteca");
                }
            } catch (NumberFormatException e) {
                System.out.println(Colores.RED + "HAS INSERTADO LETRAS, LO SIENTO MUCHO, CERRAMOS EL PROGRAMA" + Colores.RESET);
                break;
            }
        } while (validar == true);
    }
    
    //ir visualizando a medida que se vayan insertando libros y coincidan con el numero de paginas
}
