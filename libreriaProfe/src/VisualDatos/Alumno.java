/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisualDatos;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.media.Media;

public class Alumno {

   
    
String titul;
    String nombre;
    /* boolean condicNotas;
    boolean condicEdad;*/
    int edad;

    float notaBD, notaPro, notaED;

    public int getEdad() {
        return edad;
    }

    void leContratamos(String titE)
    {
       
        if(nombre.equals(titE))
        {
            System.out.println("El alumno "+nombre+" puede ser contratado"); 
        }
    }
    
    public void obtenerMediaAlumno() {
        float media;

        media = devolverMedia();
        System.out.println("La media del alumno es " + media);

    }

    public float devolverMedia() {
        float media = (notaBD + notaPro + notaED) / 3;
        return media;

    }

    public float mediaFija() {
        return 10;
    }

    public void pedirTodosDatosMenosEdad(int ed) {
        String nom;
        pedirNombre();
        pedirNotaBD();
        pedirNotaED();
        pedirNotaProg();
        edad = ed;
    }

    void pedirNombre(String mensaje) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        System.out.print("\n\tInserte su nombre:");
        nombre = scanner.nextLine();

    }

    void pedirNombre() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\tInserte su nombre:");
        nombre = scanner.nextLine();
    }

    /**
     *
     * Este método es para ver si le conceden la beca y se basa en la edad o que
     * haya aprobado todas.
     *
     * @param edadInf Aquí me tienes que enviar la edad mínima que tiene que
     * tener una persona para concederle la beca
     * @param edadSup Aquí me tienes que enviar la edad más alta que tiene que
     * tener una persona para concederle la beca
     */
    public void comprobarSiTieneBeca(int edadInf, int edadSup) {
        boolean resultado;
        resultado = edad >= edadInf && edad <= edadSup || notaBD >= 5 && notaED >= 5 && notaPro >= 5;

        System.out.println("Le damos la beca??: " + resultado);
    }

    public void comprobarSiTieneBeca(int edadInf, int edadSup, String mensaje) {
        boolean resultado;

        resultado = edad >= edadInf && edad <= edadSup || notaBD >= 5 && notaED >= 5 && notaPro >= 5;

        System.out.println(mensaje + resultado);
    }

    /**
     * Es para ver si una alumno le conceden la beca pero está fijado que su
     * edad tiene que estar entre 17 y 22 años.
     */
    public void comprobarSiTieneBeca() {
        boolean resultado;
        resultado = edad >= 17 && edad <= 22 || notaBD >= 5 && notaED >= 5 && notaPro >= 5;

        System.out.println("Le damos la beca??: " + resultado);
    }

    private boolean comprobarEdad() {
        boolean condicEdad;
        condicEdad = edad >= 17 && edad <= 22;
        return condicEdad;
    }

    private boolean comprabarAprobadoTodas() {
        boolean condicNotas;
        condicNotas = notaBD >= 5 && notaED >= 5 && notaPro >= 5;
        return condicNotas;

    }

    boolean beca() {
        boolean resultado;
        boolean condicEdad, condicNotas;
        condicEdad = comprobarEdad();
        condicNotas = comprabarAprobadoTodas();
        resultado = condicEdad || condicNotas;
        System.out.println("Le damos la beca??: " + resultado);
        return resultado;
    }

    void pedirEdad(String mensaje) {

        Scanner scanner = new Scanner(System.in);
        boolean resultado;
        resultado = beca();
        System.out.println(mensaje);
        System.out.print("\n\tInserte la edad de " + nombre + ":");
        edad = scanner.nextInt();

    }

    void pedirEdad() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\tInserte la edad de " + nombre + ":");
        edad = scanner.nextInt();

    }

    void pedirNotaBD(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        System.out.print("\n\tInserte la nota que ha obtenido " + nombre + " en BD:");
        notaBD = scanner.nextFloat();

    }

    void pedirNotaBD() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\tInserte la nota que ha obtenido " + nombre + " en BD:");
        notaBD = scanner.nextFloat();

    }

    void pedirNotaProg(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        System.out.print("\n\tInserte la nota que ha obtenido " + nombre + " en programación:");
        notaPro = scanner.nextFloat();

    }

    void pedirNotaProg() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\tInserte la nota que ha obtenido " + nombre + " en programación:");
        notaPro = scanner.nextFloat();

    }

    void pedirNotaED(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        System.out.print("\n\tInserte la nota que ha obtenido " + nombre + " en entornos de desarrollo:");
        notaED = scanner.nextFloat();

    }

    void pedirNotaED() {
        Scanner scanner = new Scanner(System.in);
        ;
        System.out.print("\n\tInserte la nota que ha obtenido " + nombre + " en entornos de desarrollo:");
        notaED = scanner.nextFloat();

    }

    public void pedirTodosDatosAlumno(String mensaje) {
        pedirNombre(mensaje);
        pedirEdad(mensaje);
        pedirNotaBD(mensaje);
        pedirNotaED(mensaje);
        pedirNotaProg(mensaje);

    }

    public void pedirTodosDatosAlumno(String mensaje, String mensaje2) {
        pedirNombre(mensaje);
        pedirEdad(mensaje2);
        pedirNotaBD(mensaje2);
        pedirNotaED(mensaje);
        pedirNotaProg(mensaje2);

    }

    public void visTodosDatosAlumno() {
        System.out.println("ESTOS SON LOS DATOS DEL ALUMNO:");
        System.out.println("\tNOMBRE: " + nombre);
        System.out.println("\tEDAD:" + edad);
        System.out.println("\tNOTA EN BD: " + notaBD);
        System.out.println("\tNOTA EN entornos: " + notaED);
        System.out.println("\tNOTA EN PROGRAMACIÓN: " + notaPro);

    }

    public void pedirTodosDatosAlumnoPidMensaje() {
        String mensaje;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\tIndica el mensaje que quieres que visualicemos a la hora de pedir tus datos: ");
        mensaje = scanner.nextLine();

        System.out.println(mensaje);
        pedirTodosDatosAlumno();
    }

    public void pedirTodosDatosAlumno() {

        pedirNombre();
        pedirEdad();
        pedirNotaBD();
        pedirNotaED();
        pedirNotaProg();

    }
}
