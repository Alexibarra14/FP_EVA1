/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_25_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
      int anno;
  
      Scanner cap;
      cap= new Scanner(System.in);
      System.out.println("Ingrese el año");
      anno= cap.nextInt();
      
      if(anno%4==0 && anno%100 >=1 ){
      System.out.println("AÑO BISIESTO");
        }
       else if(anno%100==0 && anno%400==0){
           System.out.println("Año bisiesto");
       }else 
           System.out.println("NO BISIESTO");
      
      
      
      
      
    }
    
}
