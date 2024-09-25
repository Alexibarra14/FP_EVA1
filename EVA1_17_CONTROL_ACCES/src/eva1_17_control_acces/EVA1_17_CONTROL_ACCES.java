/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_control_acces;

import java.util.Scanner;

/**
 *
 * @author brend
 */
public class EVA1_17_CONTROL_ACCES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   String usu;
    String con;
    String usu;
    Scanner cap;
    cap = new Scanner(System.in);
  System.out.println("ingrese su usuario");
  usu = cap.nextLine();
   System.out.println("ingrese su contraseña");
  con = cap.nextLine();
  if(usu.equals("Admin") && con.equals("1234"))
  {
      System.out.println("ACCESO CONCEDIDO");
       }
   else {
              System.out.println("ACCESO DENEGADO");
              }
  
  }
    }
   