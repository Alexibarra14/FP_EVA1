/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_califas;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_14_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cali;
        Scanner cap;
        cap = new Scanner(System.in);
        System.out.println("INTRODUCE TU CALIFICACION");
        cali= cap.nextInt();
        if (cali>= 70){
            System.out.println("APROBADO");
         }else
        {    
            System.out.println("NA");
          }
    
        
    }
    
}
