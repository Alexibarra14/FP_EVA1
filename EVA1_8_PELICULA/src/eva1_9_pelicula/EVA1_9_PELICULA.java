/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_pelicula;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_9_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        String genero;
        int duracion;
        String reparto;
        String clasificacion;
        
        Scanner cap;
        cap = new Scanner(System.in);
     System.out.println("INTRODUCE EL NOMBRE DE LA PELICULA");
     nombre= cap.nextLine();
     System.out.println("INTRODUCE EL GENERO DE LA PELICULA");
     genero = cap.nextLine();
     System.out.println("INTRODUCE El REPARTO DE LA PELICULA");
     reparto = cap.nextLine();
     System.out.println("INTRODUCE LA CLASIFICACION DE LA PELICULA");
     clasificacion= cap.nextLine();
     System.out.println("INTRODUCE LA DURACION DE LA PELICULA");
     duracion = cap.nextInt();
       
        System.out.println(nombre);
        System.out.println(genero);
        System.out.println(reparto);
        System.out.println(clasificacion);
        System.out.println(duracion);

 
        
    }
    
}
