/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogithub;

import Utilidades.Colores;
import java.util.InputMismatchException;
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;
import sun.font.EAttribute;

/**
 *
 * @author poste
 */
public class Principal {

    /*Gestión de empleados.
 Gestión de alumnos.
 Gestión de libros.*/
 /*Si el usuario elige la opción 2:
Se pedirá la información de una serie de alumnos. De cada alumno nos interesa: nombre,
edad y sus notas. Todos los alumnos tienen cinco notas. Se dejará de pedir datos de
alumnos cuando inserte, como nombre, la palabra “fin”. Hay que validar las notas, tienen
que estar entre 0 y 10 y que no inserte letras. Si se indica mal, se volverá a pedir todas las
notas (no solamente la que ha insertado mal).
Una vez parada la inserción de datos, hay que visualizar los datos del alumno con la peor
media. Si hay varios alumnos que coinciden, se visualizará los datos del primer alumno
que encontremos con la peor media*/
    public static void main(String[] args) throws NumberFormatException, InputMismatchException {

        String nombre, nombreVisualizar = null;
        int edad = 0, contador = 1, edad1 = 0, opcion;
        float sueldo, sueldoMayor = Integer.MIN_VALUE, mediaBaja = Integer.MAX_VALUE;
        Empleado empleado = null;
        boolean insertarLetras = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija una opción para comenzar con la gestión:"
                + " \n\t Gestión de empleados. \n\t Gestión de alumnos.\n\t Gestión de libros.");
        opcion = scanner.nextInt();
        if (opcion == 1) {

            Alumno alumno = new Alumno();
            while (!("Fin".equalsIgnoreCase(alumno.getNombre()))) {
                alumno.pedirNombre();
                alumno.pedirEdad();
                do {
                    try {
                        alumno.pedirNotas();
                    } catch (InputMismatchException | NumberFormatException e) {
                        System.out.println("\n\t\t" + Colores.RED + "Se han insertado letras.");
                    }
                } while (alumno.comprobarProgramacion() && alumno.comprobarBd() && alumno.comprobarLenguajes() && alumno.comprobarApp() && alumno.comprobarApp() && alumno.comprobarSistemas());
                if (alumno.mediaNotas() < mediaBaja) {

                    mediaBaja = alumno.mediaNotas();
                    edad1 = alumno.getEdad();
                    nombreVisualizar = alumno.getNombre();
                }
            }
            System.out.println("Este es el/la alumno/a con peor media de asignaturas.");
            System.out.println("\n\t" + Colores.BLUE + "Nombre: " + nombreVisualizar);
            System.out.println("\n\t" + Colores.BLUE + "Edad: " + edad1);
            System.out.println("\n\t" + Colores.BLUE + "Media de asignaturas: " + alumno.mediaNotas());
            /*{
                try {
                    alumno.pedirNotas();
                } catch (InputMismatchException | NumberFormatException e) {
                    System.out.println("\n\t\t" + Colores.RED + "Se han insertado letras.");
                }
            }*/
        }
        if (opcion == 2) {
        while (!insertarLetras) {
            System.out.println("\t\t\nVamos a pedir los datos del empleado número " + (contador) + " :");
            try {

                empleado = new Empleado();
                contador++;
                if (empleado.getSueldo() > sueldoMayor) {

                    sueldoMayor = empleado.getSueldo();
                    edad1 = empleado.getEdad();
                    nombreVisualizar = empleado.getNombre();
                }
            } catch (InputMismatchException | NumberFormatException e) {
                insertarLetras = true;
            }
        }
        // empleado.visualizarSueldoMasAlto();
        System.out.println("\n\t" + Colores.GREEN + "Se han insertado un total de " + contador + " empleados/as.");
        System.out.println("El empleado con el mayor sueldo es: ");
        System.out.println("\n\t" + Colores.BLUE + "Nombre: " + nombreVisualizar);
        System.out.println("\n\t" + Colores.BLUE + "Edad: " + edad1);
        System.out.println("\n\t" + Colores.BLUE + "Sueldo: " + sueldoMayor);

    }
    }

}
