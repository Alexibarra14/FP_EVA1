/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_operaciones;

/**
 *
 * @author brend
 */
public class EVA1_9_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Operaciones aritmeticas
     // SUMA Y RESTA
     //Inicializacion de una variable
     int x = 10; //Declaracion y Asignacion
     int y = 5;
     //Si nesesitan muchas variables
     int suma, rest, mult, div, pot, raiz;
     
     // suma y resta
    suma= x + y; //operador suma
    System.out.println("La suma dde x+y");
    System.out.println(suma);
    
    rest= x - y;
    System.out.println("La resta de x-y");
    System.out.println(rest);
    
    //Multiplicacion
    mult= x*y;
    System.out.println("El resultado de la multiplicacion de x*y es");
    System.out.println(mult);
    // Divicion
    // En java, las operaciones dependen del tipo de dato
    // Divides entero, Java te da resultado entero
    div=x/y;
    System.out.println("La divicion de x/y es");
    System.out.println(div);
    x = 5;
    y = 2;
    div= x / y;
    System.out.println("ek resultado de la divicion es ");
    System.out.println(div);
    
    double val1 = 5;
    double val2 = 2;
    double resu;
    
    resu = val1/ val2;
    System.out.println("El resultado de la divicion es");
    System.out.println(resu);
    
    
    
    
    }
    
}
