/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Utilidades.Colores;

/**
 *
 * @author poste
 */
public class ErrorLetraNoValida extends Exception {

    public void visMensajeError() {
        System.out.println(Colores.RED + "\tHa insertado letras no válidas.");
    }
}
