/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisualDatos;

import Clases.Libro;

public class GestionBiblioteca {

    static public void visDatosTodosLibros(Libro l1, Libro l2, Libro l3, Libro l4, Libro l5) {

        System.out.println("\nVAmos a visualizar los libros de la biblioteca");
        l1.visDatosLibro();
        l2.visDatosLibro();
        l3.visDatosLibro();
        l4.visDatosLibro();
        l5.visDatosLibro();

    }
}
