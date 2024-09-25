/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_operador_or;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_19_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k;
       int mes;
       Scanner cap;
       cap = new Scanner(System.in);
       System.out.println("INTRODUCE TU KILOMETRAJE");
       k= cap.nextInt();
       System.out.println("INTRODUCE LOS MESES DE USO");
       mes= cap.nextInt();
       if(k >=5000 || mes>=6){
          System.out.println("CAMBIO DE ACEITE");
          
            }
         else
           {
                System.out.println("TODO CORRECTO");
          
           }}
    
}
