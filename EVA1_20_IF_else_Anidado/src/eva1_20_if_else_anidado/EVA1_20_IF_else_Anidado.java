/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_20_IF_else_Anidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TOD code application logic here
        int ds;
        Scanner cap = new Scanner(System.in);
         System.out.println("introduce el dia de la semana");
         ds= cap.nextInt();
         if(ds==1){
           System.out.println("domingo ");
         }else if (ds==2){
              System.out.println("Lunes ");
              }
            else if (ds==3){
              System.out.println("martes ");
              }else if (ds==4){
              System.out.println("miercoles ");
              }else if (ds==5){
              System.out.println("jueves ");
              }else if (ds==6){
              System.out.println("viernes ");
              }else if (ds==7){
              System.out.println("Sabado ");
              }else{
                  System.out.println("dia incorrecto "); }
    }
    
}
