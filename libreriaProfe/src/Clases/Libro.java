/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;
import pedirDatos.PedirDatosTeclado;

public class Libro {

    private int isbn;
    private String tituLibro;
    private int numPag;
    private int estanteria;

    public int getNumPag() {
        return numPag;
    }

    
    
    public Libro() {
        pedirTodosDatos();
    }

    public Libro(int numP) {
        numPag = numP;
        pedirTodosDatosMenosNumPag();

    }

    void pedirTodosDatosMenosNumPag() {
        pedirIsbn();
        pedirTitLibro();

        pedirEstanteria();
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    void pedirTodosDatos() {
        pedirTodosDatosMenosNumPag();
        pedirNumPag();

    }
    
 public   void visDatosLibro()
    {
        System.out.println("LOS DATOS DEL LIBRO SON: ");
        System.out.println("\tISBN: "+isbn);
        System.out.println("\tNÚMERO DE PÁGINAS "+numPag);
        System.out.println("\tTÍTULO: "+tituLibro);
        System.out.println("\tESTANTERÍA: "+estanteria);
    }

    void pedirTitLibro() {
        
        tituLibro = PedirDatosTeclado.pedirString("\n\tInserte, por favor, el título del libro: ");
    }

    void pedirIsbn() {

        isbn = PedirDatosTeclado.pedirInt("Inserte el ISBN del libro: ");

    }

    public void pedirNumPag() {
        numPag = PedirDatosTeclado.pedirInt("Indique el número de páginas: ");

    }

    void pedirEstanteria() {
        estanteria = PedirDatosTeclado.pedirInt("Indique la estantería donde está el libro " + tituLibro + ": ");
    }

}
