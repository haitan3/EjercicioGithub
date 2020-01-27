
import Utilidades.Colores;
import ejerciciogithub.Empleado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author poste
 */
public class Gestor {

    public static void visualizarSueldoMasAlto(Empleado empleado) {
        float sueldoMayor = Integer.MIN_VALUE;
        int edad = 0;
        String nombreVisualizar = null;
        if (empleado.getSueldo() > sueldoMayor) {

            sueldoMayor = empleado.getSueldo();
            edad = empleado.getEdad();
            nombreVisualizar = empleado.getNombre();
        }

        System.out.println("El empleado con el mayor sueldo es: ");
        System.out.println("\n\t" + Colores.BLUE + "Nombre: " + nombreVisualizar);
        System.out.println("\n\t" + Colores.BLUE + "Edad: " + edad);
        System.out.println("\n\t" + Colores.BLUE + "Sueldo: " + sueldoMayor);
    }
}
