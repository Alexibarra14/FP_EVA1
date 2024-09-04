/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_p11_converciones;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_P11_CONVERCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // CONVERCIONES DE TEMPERATURA
        double f,c;
        Scanner cap;
         cap = new Scanner(System.in);
        System.out.println("introduce los grados farenheit");
        f = cap.nextDouble();
        c = (f-32)/1.8;    // EXPRESION 
        System.out.println("C= "+c);
        
        System.out.println("INTRODUCE LOS GRADOS CELCIUS");
        c= cap.nextDouble();
        f= (1.8*c)+32;
        System.out.println("LOS GRADOS FARENHEIT SON "+f);
        
        System.out.println("Introduce los grados celcius");
          c= cap.nextDouble();
        double k;
        k= c + 273.15;
        System.out.println("Los grados kelvin son: "+k);
                
       
        
        
        
        
    }
    
}
