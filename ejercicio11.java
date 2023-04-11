/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("escriba una frase");
        String frase = leer.nextLine();
        frase = frase.toLowerCase();        
        
        System.out.println(" la nueva frase es: " + reemplazarVocal (frase) );
    }   
    

    public static String reemplazarVocal(String frase) {
        String nuevaFrase= "";
         
        for (int i = 0; i < frase.length(); i++) {
            switch ( frase.substring(i, i+1)) {
               
                case "a":
                    nuevaFrase = nuevaFrase.concat("@");
                    break;
                case "e":
                    nuevaFrase = nuevaFrase.concat("#");
                    break;
                 case "i":
                    nuevaFrase = nuevaFrase.concat("$");
                    break;
                 case "o":
                     nuevaFrase = nuevaFrase.concat("%");
                    break;
                 case "u":
                     nuevaFrase = nuevaFrase.concat("*");
                    break;
          
                default:
                   nuevaFrase = nuevaFrase.concat(frase.substring(i, i+1));
                    break;

            }

           
        }
                 return nuevaFrase;
    }
}    
/* 
e=#
i=$
o=%
u=*
a=@ */
