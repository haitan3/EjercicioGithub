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
public class Alumno {

    String nombre;
    int edad;
    float prog, bd, lenguaje, aplicaciones, sistemas;

    /*public Alumno() {
        pedirNombre();
        pedirEdad();
        pedirNotasValid();
    }*/
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getProg() {
        return prog;
    }

    public float getBd() {
        return bd;
    }

    public float getLenguaje() {
        return lenguaje;
    }

    public float getAplicaciones() {
        return aplicaciones;
    }

    public float getSistemas() {
        return sistemas;
    }

    void pedirNombre() {
        nombre = pedirDatos.PedirDatosTeclado.pedirString("\n\tIntroduzca el nombre del alumno/a: ");
    }

    void pedirEdad() {
        edad = pedirDatos.PedirDatosTeclado.pedirInt("\n\tIntroduzca la edad del alumno/a: ");
    }

    void pedirNotaProgramacion() {
        prog = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tInserte la nota de la asignatura Programación: ");

        while (prog < 0 || prog > 10) {
            prog = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tInserte la nota de la asignatura Programación: ");
        }

    }

    void pedirNotaBD() {
        bd = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tInserte la nota de la asignatura Base de Datos: ");

        while (bd < 0 || bd > 10) {
            bd = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tInserte la nota de la asignatura Base de Datos: ");
        }

    }

    void pedirNotaLenguajes() {
        lenguaje = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tInserte la nota de la asignatura Lenguaje de Marcas: ");

        while (lenguaje < 0 || lenguaje > 10) {
            lenguaje = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tInserte la nota de la asignatura Lenguaje de Marcas: ");
        }
    }

    boolean comprobarProgramacion() {
        boolean comProg;
        comProg = prog <= 0 || prog >= 10;
        return comProg;
    }

    boolean comprobarBd() {
        boolean comBd;
        comBd = bd <= 0 || bd >= 10;
        return comBd;
    }

    boolean comprobarLenguajes() {
        boolean compLen;
        compLen = lenguaje <= 0 || lenguaje >= 10;
        return compLen;
    }

    boolean comprobarApp() {
        boolean compApp;
        compApp = aplicaciones <= 0 || aplicaciones >= 10;
        return compApp;
    }

    boolean comprobarSistemas() {
        boolean comSis;
        comSis = sistemas <= 0 || sistemas >= 10;
        return comSis;
    }

    void pedirNotaApp() {
        aplicaciones = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tInserte la nota de la asignatura Aplicaciones Web: ");

        while (aplicaciones < 0 || aplicaciones > 10) {
            aplicaciones = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tInserte la nota de la asignatura Aplicaciones Web: ");
        }

    }

    void pedirNotaSistemas() {
        sistemas = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tInserte la nota de la asignatura Sistemas Informáticos: ");

        while (sistemas < 0 || sistemas > 10) {
            sistemas = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tInserte la nota de la asignatura Sistemas Informáticos: ");
        }

    }

    void pedirNotas() {
        prog = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tInserte la nota de la asignatura Programación: ");
        bd = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tInserte la nota de la asignatura Base de Datos: ");
        lenguaje = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tInserte la nota de la asignatura Lenguaje de Marcas: ");
        aplicaciones = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tInserte la nota de la asignatura Aplicaciones Web: ");
        sistemas = pedirDatos.PedirDatosTeclado.pedirFloat("\n\tInserte la nota de la asignatura Sistemas Informáticos: ");
    }

    float mediaNotas() {
        float media;
        media = (prog + lenguaje + bd + aplicaciones + sistemas) / 5;
        return media;
    }

    void pedirNotasValid() {
        while (!(comprobarProgramacion() && comprobarBd() && comprobarLenguajes() && comprobarApp() && comprobarSistemas())) {
            try {
                pedirNotas();
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("\n\t\t" + Colores.RED + "Se han insertado letras.");
            }
            /*pedirNotaProgramacion();
        pedirNotaBD();
        pedirNotaLenguajes();
        pedirNotaApp();
        pedirNotaSistemas();*/
        }
    }

    boolean comprobarNotas() {
        boolean comprobar;
        comprobar = prog >= 0 && bd >= 0 && lenguaje >= 0 && aplicaciones >= 0 && sistemas >= 0;
        return comprobar;
    }

    void pedirNotasVali() {

    }
    /*Si el usuario elige la opción 2:
Se pedirá la información de una serie de alumnos. De cada alumno nos interesa: nombre,
edad y sus notas. Todos los alumnos tienen cinco notas. Se dejará de pedir datos de
alumnos cuando inserte, como nombre, la palabra “fin”. Hay que validar las notas, tienen
que estar entre 0 y 10 y que no inserte letras. Si se indica mal, se volverá a pedir todas las
notas (no solamente la que ha insertado mal).
Una vez parada la inserción de datos, hay que visualizar los datos del alumno con la peor
media. Si hay varios alumnos que coinciden, se visualizará los datos del primer alumno
que encontremos con la peor media*/
}
