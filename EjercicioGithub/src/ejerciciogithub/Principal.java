/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogithub;

import Utilidades.Colores;
import java.util.InputMismatchException;

/**
 *
 * @author poste
 */
public class Principal {

    /*Gestión de empleados.
 Gestión de alumnos.
 Gestión de libros.*/
 /*Si el usuario elige la opción 1:
Se pedirá la información de varios empleados. De cada empleado nos interesa: nombre,
edad y sueldo. Se van a estar pidiendo datos de empleados hasta que se inserte letras en
el sueldo. Hay que validar la edad, tiene que estar entre 18 y 65 años y que no inserte
letras. Si se indica mal, se volverá a pedir dicha edad.
Una vez parada la inserción de datos, se indicará cuantos empleados se han llegado a
insertar y se tiene que visualizar los datos del empleado que más gana. Si hay varios
empleados que coinciden, se visualizará los datos del último empleado (qué gana más*/
    public static void main(String[] args) {

        String nombre, nombreVisualizar = null;
        int edad = 0, contador = 1, edad1 = 0;
        float sueldo, sueldoMayor = Integer.MIN_VALUE;
        boolean insertarLetras = false;

        while (!insertarLetras) {
            System.out.println("\t\t\nVamos a pedir los datos del empleado número " + contador + " :");
            nombre = pedirDatos.PedirDatosTeclado.pedirString("\n\tIntroduzca el nombre del empleado/a: ");
            contador++;
            // edad = pedirDatos.PedirDatosTeclado.pedirInt("\n\tIntroduzca la edad del empleado/a: ");

            do {

                try {
                    edad = pedirDatos.PedirDatosTeclado.pedirInt("\n\tIntroduzca la edad del empleado/a: ");

                } catch (NumberFormatException errorletras) {
                    System.out.println("\n\t\t" + Colores.RED + "Valor no admitido, no inserte letras.");
                    edad = pedirDatos.PedirDatosTeclado.pedirInt("\n\tIntroduzca la edad del empleado/a: ");
                } catch (InputMismatchException error) {
                    System.out.println("\n\t\t" + Colores.RED + "Valor no admitido, no inserte letras.");
                    edad = pedirDatos.PedirDatosTeclado.pedirInt("\n\tIntroduzca la edad del empleado/a: ");
                }
            } while (edad < 18 || edad > 65);
            try {

                sueldo = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tIntroduzca el sueldo mensual del empleado/a: ");
                if (sueldo > sueldoMayor) {

                    sueldoMayor = sueldo;
                    edad1 = edad;
                    nombreVisualizar = nombre;
                }
            } catch (NumberFormatException errorletras) {
                System.out.println("\n\t\t" + Colores.RED + "Se han insertado letras. salimos de la opción.");
                insertarLetras = true;
            } catch (InputMismatchException error) {
                System.out.println("\n\t\t" + Colores.RED + "Se han insertado letras. salimos de la opción.");
                insertarLetras = true;
            }
        }
        System.out.println("\n\t" + Colores.GREEN + "Se han insertado un total de " + contador + " empleados/as.");
        System.out.println("El empleado con el mayor sueldo es: ");
        System.out.println("\n\t" + Colores.BLUE + "Nombre: " + nombreVisualizar);
        System.out.println("\n\t" + Colores.BLUE + "Edad: " + edad1);
        System.out.println("\n\t" + Colores.BLUE + "Sueldo: " + sueldoMayor);

    }

}
