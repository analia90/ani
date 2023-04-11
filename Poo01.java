/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo01;
 
import java.util.Scanner;
import poo01.Entidad.Persona;

/**
 *
 * @author Pc
 */
public class Poo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1= new Persona ();
        Scanner leer = new Scanner(System.in);
        
         p1.apellido= "carlos";
        System.out.println("ingrese un nombre");
        String nombre= leer.next();
        p1.setNombre(nombre);
        System.out.println(p1.getNombre());
        
    }   
        
    
}
