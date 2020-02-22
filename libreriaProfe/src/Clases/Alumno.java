/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.media.Media;

public class Alumno {

    String nombre;
    /* boolean condicNotas;
    boolean condicEdad;*/
    int edad;

    float notaBD, notaPro, notaED;

    public Alumno() {
        pedirNotas();
    }

    public Alumno(float notaBD, float notaPro, float notaED) {
        this.notaBD = notaBD;
        this.notaPro = notaPro;
        this.notaED = notaED;
    }

    public Alumno(int pos) {

        System.out.println("Alumno " + pos + ":");
        pedirNotas();
    }
public boolean tiene23AñosYAprobTodas()
{
    if(edad>=23 &&(comprabarAprobadoTodas()))
    {
        System.out.println("\nVoy a visualizar los datos de este alumno");
        System.out.println("\tya que tiene más de 23 años y ha aprobado todas");
        visTodosDatosAlumno();
        return true;
    }
    else return false;
}
  public  boolean estáEntre22Y30_12Cara() {
        if (edad >= 22 && edad <= 30 || nombre.length() == 12) {
            System.out.println("\n\tVamos a visualizar los datos del alumno que su edad está ");
            System.out.println("\t\tentre 22 y 30 años o su nombre tiene 12 caracteres.");
            visTodosDatosAlumno();

            return true;
        } else {
            return false;
        }
    }

    public void pedirNombreEdad() {
        pedirNombre();
        pedirEdad();
    }

    void pedirNotas() {
        pedirNotaBD(7);
        pedirNotaProg(3);
        pedirNotaED(2);
    }


    /* boolean alMenosHaAprobadoAlguna()
    {
        boolean resultado;
        if(notaBD>=5 || notaED>=5 || notaPro>=5)
        {
           resultado=true;
        }
        else
            resultado=false;
        
        return resultado;
    }  */

 /* boolean alMenosHaAprobadoAlguna()
    {
        boolean resultado=notaBD>=5 || notaED>=5 || notaPro>=5;
       
        
        return resultado;
    }*/
    public boolean alMenosHaAprobadoAlguna() {

        return notaBD >= 5 || notaED >= 5 || notaPro >= 5;
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
        resultado = edad >= 17 && edad <= 22 || comprabarAprobadoTodas();

        System.out.println("Le damos la beca??: " + resultado);
    }

    private boolean comprobarEdad() {
        boolean condicEdad;
        condicEdad = edad >= 17 && edad <= 22;
        return condicEdad;
    }

    public boolean comproAprobaTodasVisDatos()
    {
        if(comprabarAprobadoTodas())
        {
            visTodosDatosAlumno();
            return true;
        }
        else
            return false;
                    
    }
    
    public boolean aprobaTodasMediaMay9()
    {
        if(comprabarAprobadoTodas()&& devolverMedia()>=9)
        {
            System.out.println("\n\tVamos a visualizar los datos, de esta persona");
            System.out.println("\t\tporque ha aprobado todas y tiene una media superior a 9");
            visTodosDatosAlumno();
            return true;
        }
        else
            return false;
    }
    public boolean haAprobadoBD()
    {
        if(notaBD>=5)
        {
            System.out.println("\nVoy a visualizar los datos de esta persona");
            System.out.println("\tPorque ha aprobado BD");
            visTodosDatosAlumno();
            return true;
        }
        else
            return false;
    }
    public boolean comprabarAprobadoTodas() {
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

    /**
     *
     * @param m Enviame lo que quieras, es para distinguir del otro método que
     * visualiza el nombre
     */
    void pedirNotaBD(int m) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\tInserte la nota que ha obtenido  en BD:");
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

    /**
     *
     * @param m Enviame lo que quieras, es para distinguir del otro método que
     * visualiza el nombre
     */
    void pedirNotaProg(int m) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n\tInserte la nota que ha obtenido en programación:");
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

    /**
     *
     * @param m Enviame lo que quieras, es para distinguir del otro método que
     * visualiza el nombre
     */
    void pedirNotaED(int m) {
        Scanner scanner = new Scanner(System.in);
        ;
        System.out.print("\n\tInserte la nota que ha obtenido en entornos de desarrollo:");
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
