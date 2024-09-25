/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_rangos;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_18_Rangos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cali;
        Scanner cap;
        cap= new Scanner(System.in);
        System.out.println("INGRESE SU CALIFICACION");
        cali= cap.nextInt();
        if(cali>=0 && cali<=100)  {  
           System.out.println("VALIDA");
        }
        else {
            System.out.println("NO VALIDA");
        }

        }  
    }
    

