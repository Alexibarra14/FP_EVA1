/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_24_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cal;
          Scanner cap = new Scanner(System.in);
          System.out.println("INGRESE SU CALIFICACION");
          cal= cap.nextInt();
          if(cal<=100 && cal>=90 ){
              System.out.println("A");
          }
          else if(cal<=89 && cal>=80 ){
               System.out.println("B");
          } 
          else if(cal<=79 && cal>=70 ){
               System.out.println("C");
         } else if(cal<=69 && cal>=60 ){
               System.out.println("D");
         } else if(cal<=59 && cal>=0 ) {
               System.out.println("F");
         } else {   
             System.out.println("CALIFICACION INVALIDA");
         } 
             }  
    
          
          
    
    
    
}
