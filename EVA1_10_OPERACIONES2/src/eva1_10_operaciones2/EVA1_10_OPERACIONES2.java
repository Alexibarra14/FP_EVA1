/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_operaciones2;

/**
 *
 * @author brend
 */
public class EVA1_10_OPERACIONES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONCATENACION CADENAS:
     // Operador de concatenacion = +
     //EXAMEN: Cuando tienen el mismo simbolo con diferentes usos:
     // sobrecarga de operadores
     String nombre = "alejandro";
     String apellido = "ibarra";
     String nomCom;
     //Concatenar
     nomCom = nombre + " "+ apellido;
     System.out.println(nomCom);
     // imprimir los datos del usuario
     System.out.println("Nombre del ususario:"+ nombre);
     System.out.println("apellido del ususario:"+apellido);
     System.out.println("Nombre completo del ususario:"+nomCom);
     
             
        
    }
    
}
