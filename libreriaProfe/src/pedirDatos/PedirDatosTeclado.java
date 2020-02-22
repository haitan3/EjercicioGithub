
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedirDatos;

import Clases.ErrorLetraNoValida;
import Utilidades.Colores;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PedirDatosTeclado {

    public static String pedirString(String mensajeVis) {
        String cadenaTecleada;
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensajeVis);
        cadenaTecleada = scanner.nextLine();
        return cadenaTecleada;
    }

    public static int pedirInt(String menVis) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print(menVis);
        num = scanner.nextInt();
        // System.out.println("El dato insertado es " + num);
        return num;
    }

    public static int pedirIntFormaAntigua(String mensVis) throws NumberFormatException {
        int num = 0;
        InputStreamReader pedirDatos = new InputStreamReader(System.in);
        BufferedReader pedirDat = new BufferedReader(pedirDatos);
        try {
            System.out.println(mensVis);
            String informacionTecleada = pedirDat.readLine();
            num = Integer.parseInt(informacionTecleada);
        } catch (IOException ex) {
            Logger.getLogger(PedirDatosTeclado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException e) {
            System.out.println("Lo siento, has insertado letras.");
            System.out.println("El error lanzado es : " + e.toString());
            System.out.println("El error lanzado, información de getMessage: " + e.getMessage());
            throw e;
        }
        return num;
    }

    public static int pedirIntValidInsLetra(String menVis) throws InputMismatchException, Exception {
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print(menVis);
            num = scanner.nextInt();

        } catch (InputMismatchException fallo) {
            System.out.println(Colores.RED + "Ten cuidado, se han introducido letras.");
            throw fallo;
            /*  
                System.out.println("\n\t" + Colores.RED + "Operación no permitida en el juego.");
                System.out.println("\n\t\t" + Colores.RED + "* para multiplicar.");
                System.out.println("\n\t\t" + Colores.RED + "+ para sumar.");
                System.out.println("\n\t\t" + Colores.RED + "- para restar.");
                System.out.println("\n\t\t" + Colores.RED + "/ para dividir.");
                scanner.nextLine();*/

        } catch (Exception e) {
            System.out.println("Se ha producido un error desconocido");
        }

        // System.out.println("El dato insertado es " + num);
        return num;
    }

    public static int pedirIntValidInsLetra(String menVis, int maxErrores, int valorDevolver) {
        int num = valorDevolver, contador = 0;
        Scanner scanner = new Scanner(System.in);
        do {

            try {
                System.out.print(menVis);
                num = scanner.nextInt();
                contador = maxErrores;
            } catch (InputMismatchException fallo) {
                System.out.println("Se ha insertado letras, vuelva a intertarlo.");
                scanner.nextLine();
                contador++;
            }
        } while (contador < maxErrores);

        // System.out.println("El dato insertado es " + num);
        return num;
    }

    public static int pedirIntValidInsError(String menVis) {
        int num = 0, contador;
        Scanner scanner = new Scanner(System.in);

        do {
            contador = 0;
            try {
                System.out.print(menVis);
                num = scanner.nextInt();
            } catch (InputMismatchException fallo) {
                System.out.println("Se ha insertado caracteres erroneos, vuelva a intertarlo.");
                scanner.nextLine();
                contador++;
            }
        } while (contador == 1);

        // System.out.println("El dato insertado es " + num);
        return num;
    }

    public static int pedirChar(String menVis) {
        char caracter;
        Scanner scanner = new Scanner(System.in);

        System.out.print(menVis);
        caracter = scanner.nextLine().charAt(0);

        // System.out.println("El dato insertado es " + num);
        return caracter;
    }

    public static int pedirCharValidInsError(String menVis) {
        char caracter = 0, contador;
        Scanner scanner = new Scanner(System.in);

        do {
            contador = 0;
            try {
                System.out.print(menVis);
                caracter = scanner.nextLine().charAt(0);
            } catch (InputMismatchException fallo) {
                System.out.println("Se ha insertado caracteres erroneos, vuelva a intertarlo.");
                scanner.nextLine();
                contador++;
            }
        } while (contador == 1);

        // System.out.println("El dato insertado es " + num);
        return caracter;
    }

    public static float pedirFloat(String menVis) {
        float num;
        Scanner scanner = new Scanner(System.in);
        System.out.print(menVis);
        num = scanner.nextInt();
        // System.out.println("El dato insertado es " + num);
        return num;

    }

    public static float pedirFloatValidLeras(String menVis) {
        float num = 0;
        try {

            Scanner scanner = new Scanner(System.in);
            do {

                System.out.print(menVis);
                num = scanner.nextInt();
            } while (true);

        } catch (InputMismatchException e) {
            System.out.println("Lo siento, ha insertado letras, no está permitido.");
            System.out.println("\n\tVuelve a intentarlo.");
        }
        // System.out.println("El dato insertado es " + num);
        return num;

    }

    public static char pedirCharLanzaError(String mensaje) throws StringIndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);
        char caracter = 0;

        try {
            System.out.print(mensaje);
            caracter = scanner.nextLine().charAt(0);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Lo siento, no ha insertado nada.");
            throw e;
        }

        return caracter;

    }

    public static char pedirCharControlado(String mensaje, int m) throws StringIndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);
        char caracter = 0;

        try {
            System.out.print(mensaje);
            caracter = scanner.nextLine().charAt(0);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Lo siento, no ha insertado nada.");

        }

        return caracter;

    }

    public static char pedirCharCaracterConcretos(String mensaje) throws StringIndexOutOfBoundsException, ErrorLetraNoValida {
        Scanner scanner = new Scanner(System.in);
        char caracter = 0;
        ErrorLetraNoValida error = new ErrorLetraNoValida();

        try {
            System.out.print(mensaje);
            caracter = scanner.nextLine().charAt(0);
            caracter = Character.toUpperCase(caracter);
            if ((caracter < 'A' || caracter > 'Z')) {
                throw error;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Lo siento, no ha insertado nada.");
            throw e;
        }

        return caracter;

    }

    public static char pedirCharConRead(String mensaje) {
        char caracter;
        System.out.println(mensaje);
        try {

            caracter = (char) System.in.read();
            return caracter;
        } catch (IOException e) {
            return 0;
        }

    }

}
