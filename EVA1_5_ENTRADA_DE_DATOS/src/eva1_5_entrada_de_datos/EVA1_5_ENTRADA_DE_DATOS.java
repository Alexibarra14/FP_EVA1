/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_entrada_de_datos;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_5_ENTRADA_DE_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        //Captura de datos del teclado
        // scanner --> herramienta (clase)
        // scanner: Tipo de dato 
        Scanner cap; // Inccorporar la herramienta al codigo
        // No existe, hay que crearla
        cap= new Scanner(System.in); //creamos la herramienta.
        
       // Darle la instruccion al usuario
       System.out.println("Introduce tu nombre completo");
       // Capturar.
       nombre = cap.nextLine(); //Capturamos el texto que escribio el usuario hasta que preciona "enter"
       //imprimir los datos
      System.out.println("Datos capturados--------------");
       System.out.println(nombre);
    }
    
}
