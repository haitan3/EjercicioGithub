/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

public class MetodosInteresantes {

    public static void tablaMultiplicar(int num) {
        int resultado;
        System.out.println("\n\tvamos a visualizar la tabla de multiplicar del número " + num);
        for (int mul = 1; mul <= 10; mul++) {
            resultado = num * mul;
            System.out.println("\t\t" + num + "X" + mul + "=" + resultado);

        }

        System.out.println("\tHEMOS ACABADO CON LA TABLA DE MULTIPLICAR DEL NÚMERO " + num);

    }

    public static boolean primerCaracterEsDigito() {
        String nombre;
        boolean esDigito;
        nombre = pedirDatos.PedirDatosTeclado.pedirString("Inserte un nombre, por favor: ");
        esDigito = Character.isDigit(nombre.charAt(0));
        return esDigito;
    }

    public static void comprobarSiEstaDentroDeUnIntervalo(int num, int extIz, int extDrch) {
        if (num >= extIz && num <= extDrch) {
            System.out.println("Genial, el número " + num + " está dentro del intervalo " + extIz + " y " + extDrch + " .");
        } else {
            System.out.println("Error, el número " + num + " NO está dentro del intervalo " + extIz + " y " + extDrch + " .");
        }
    }

    public static void sacarDivisores(int numero) {

        System.out.println("Vamos a visualizar los divisores del número insertado.");
        for (int veces = 1; veces <= numero / 2; veces++) {
            if (numero % veces == 0) {
                System.out.println("\t " + veces);
            }
        }
    }

    public static void visualizarMedia(float x, float y) {
        float resultado = 9;
        if (x < 0 || y < 0) //  System.out.println(resultado);
        {
            System.out.println("\n\t\tLos dos números tienen que ser positivos");
        } else {
            resultado = (x + y) / 2;
            System.out.println("\n\t\tLa media es " + resultado);
        }
    }

    public static void cociente(int dividendo, int divisor) throws ArithmeticException {
        try {

            int cociente = dividendo / divisor;
            System.out.println("El cociente es: " + cociente);

        } catch (ArithmeticException errorcero) {
            System.out.println("Se ha producido un error aritmético, no se puede dividir entre 0.");
            //System.exit(0);
            throw errorcero;
        }
    }

    public static void resto(int dividendo, int divisor) throws ArithmeticException {
        try {

            int resto = dividendo % divisor;
            System.out.println("El resto es: " + resto);

        } catch (ArithmeticException errorcero) {
            System.out.println("Se ha producido un error aritmético, no se puede dividir entre 0.");
            //System.exit(0);
            throw errorcero;
        }
    }

}

//escribe un programa que pida la cantidad de dinero qeu quiere ingresar o sacar, tiene que estar enstre 100 y 500 
//se indicará cuanto dinero hay en la cuenta (numero positivo), luego volverá a visulizar si quiere ingresar o sacar.
//mensaje "Ahora mismo hay X dinero en la cuenta".
//si algun dato está mal, "Operacion no realizada"
