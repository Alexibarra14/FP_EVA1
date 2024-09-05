/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_12_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        double d,vi,t,ac;
        Scanner cap;
        cap= new Scanner(System.in);
       System.out.println("INTRODUCE LA VELOCIDAD INICIAL");
       vi= cap.nextDouble();
       System.out.println("INTRODUCE EL TIEMPO");
       t = cap.nextDouble();
       System.out.println("INTRODUCE LA ACELERACION");
       ac= cap.nextDouble();
       d= (vi*t) + (ac * (t*t))/2.0;
       System.out.println("LA DISTANCIA ES: "+d);
 
      
                
    }
    
}
