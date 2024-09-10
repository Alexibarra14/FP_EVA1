/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_13_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        int edad;
        Scanner cap;
        cap= new Scanner(System.in);
        System.out.println("INGRESA TU EDAD ");
        edad= cap.nextInt();
        System.out.println("TU EDAD ES: "+edad);
        
        if (edad >= 18)  {
           System.out.println("Adulto: Mayor de edad adulto");
        }
        else{ 
                  System.out.println("menor de edad");
              }   
    }
    
}
