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
public class Empleado {

    String nombre, nombreVisualizar;
    int edad = 0, edad1 = 0, contador = 1;
    float sueldo, sueldoMayor = 0;
    boolean insertarLetras = false;

    public Empleado() {

        pedirNombre();
        pedirEdad();
        pedirSueldo();

    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        contador++;
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    void pedirNombre() {
        nombre = pedirDatos.PedirDatosTeclado.pedirString("\n\tIntroduzca el nombre del empleado/a: ");
    }

    void pedirEdad() {
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
    }

    void pedirSueldo() throws NumberFormatException, InputMismatchException {
        try {

            sueldo = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tIntroduzca el sueldo mensual del empleado/a: ");
           
        } catch (NumberFormatException | InputMismatchException errorletras) {
            System.out.println("\n\t\t" + Colores.RED + "Se han insertado letras. salimos de la opción.");
            //insertarLetras = true;
            //System.exit(0);
            throw errorletras;
        }
        //insertarLetras = true;
        //System.exit(0);
        

    }

    void visualizarSueldoMasAlto() {

        System.out.println("El empleado con el mayor sueldo es: ");
        System.out.println("\n\t" + Colores.BLUE + "Nombre: " + nombreVisualizar);
        System.out.println("\n\t" + Colores.BLUE + "Edad: " + edad1);
        System.out.println("\n\t" + Colores.BLUE + "Sueldo: " + sueldoMayor);
    }
}
