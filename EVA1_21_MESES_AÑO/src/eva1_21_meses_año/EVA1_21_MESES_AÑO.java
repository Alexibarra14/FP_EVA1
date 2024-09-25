/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_meses_año;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_21_MESES_AÑO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int mes;
        Scanner cap = new Scanner(System.in);
         System.out.println("INTRODDUCE EL NUMERO DEL MES DEL AÑO");
         mes= cap.nextInt();
         if(mes==1){
           System.out.println("ENERO ");
         }else if (mes==2){
              System.out.println("FEBRERO ");
              }
            else if (mes==3){
              System.out.println("MARZO ");
              }else if (mes==4){
              System.out.println("ABRIL ");
              }else if (mes==5){
              System.out.println("MAYO ");
              }else if (mes==6){
              System.out.println("JUNIO ");
              }else if (mes==7){
              System.out.println("JULIO ");
              }
              else if (mes==8){
              System.out.println("AGOSTO ");
              }else if (mes==9){
              System.out.println("SEPTIEMBRE ");
              }else if (mes==10){
              System.out.println("OCTUBRE ");
              }else if (mes==11){
              System.out.println("NOVIEMBRE ");
              }else if (mes==12){
              System.out.println("DICIEMBRE ");
              }else{
                  System.out.println("MES INCORRECTO "); }
    }
    
}
