/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
package Clases;

import pedirDatos.PedirDatosTeclado;


public class Persona {
    String nombre;
    int edad;
    String dni;

    public Persona() {
        pedirTodosDatos();
    }

    public int getEdad() {
        return edad;
    }
    
    
    void pedirNombre()
    {
        nombre=PedirDatosTeclado.pedirString("Indique su nombre:");
    }

     void pedirEdad()
    {
        edad=PedirDatosTeclado.pedirInt("Indique su edad:");
    }
     
      void pedirDni()
    {
        dni=PedirDatosTeclado.pedirString("Indique su dni:");
    }
   public   void visTodosDatos()
      {
          System.out.println("\n\tLos datos de esta persona son:");
                System.out.println("\t\tDNI: "+dni);
          System.out.println("\t\tNOMBRE: "+nombre);
          System.out.println("\t\tEDAD: "+edad);
    
      }
      void pedirTodosDatos()
      {
             pedirDni();
          pedirNombre();
          pedirEdad();
       
      }
}
