/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_entrada_de_datos2;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_6_ENTRADA_DE_DATOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARACION DE VARIABLES
        String nombre;
        String curp;
        int edad;
        double promedio;
        //CREAR NUSTRO ESCANER O VARIABLE DE CAPTURA
        Scanner cap;
        cap= new Scanner(System.in);
        //CAPTURAR
        System.out.println("CAPTURA TU NOMBRE COMPLETO");
        nombre = cap.nextLine();
        System.out.println("CAPTURA TU CURP");
        curp= cap.nextLine();
        System.out.println("CAPTURA TU  EDAD");
        edad = cap.nextInt();
        System.out.println("CAPTURA TU  PROMEDDIO");
        promedio = cap.nextDouble();
       
        System.out.println("SECCION DE DATOS" );
        System.out.println(nombre );
        System.out.println(curp );
        System.out.println(edad );
        System.out.println(promedio );
           

    }
    
}
