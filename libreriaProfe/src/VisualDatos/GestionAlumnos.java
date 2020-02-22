/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
package VisualDatos;


public class GestionAlumnos {
    
  public static  void hayAlguienMayorEdad(Alumno al1, Alumno al2, Alumno al3,Alumno al4, Alumno al5)
    {
        if(al1.getEdad()>18|| al2.getEdad()>18|| al3.getEdad()>18 || al4.getEdad()>18 || al5.getEdad()>18)
            
        {
            System.out.println("Algún alumno es mayor de 18 años.");
        }
        
    }

}
