/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_captura_auto;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_7_CAPTURA_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              String marca;      
        String modelo;
        int ano;// La ñ no es aceptada en otros lenguajes
        double precio;
        
        Scanner cap;
        cap = new Scanner(System.in);
        
        System.out.println("INTRODUCE LA MARCA DEL COCHE");
        marca= cap.nextLine();
        System.out.println(marca);
        System.out.println("INTRODUCE EL MPDELO DE EL COCHE");
        modelo= cap.nextLine();
        System.out.println("INTRODUCE EL AÑO DEL COCHE");
        ano= cap.nextInt();
        System.out.println("INTRODUCE EL PRECIO DEL COCHE");
        precio= cap.nextDouble();
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(precio);
        
    }
    
}
