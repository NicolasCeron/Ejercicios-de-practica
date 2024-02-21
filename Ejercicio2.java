
package EjerciciosPractica;

import java.util.Scanner;

/**
 *
 * @author Nicolas Ceron Castaño   20232217164
 * 
 * 2. En una serviteca se ha establecido una promoción de las llantas marca
   “Pinchadas”, que consiste  en lo siguiente: 
    • Si se compran menos de cinco llantas el precio es de U$100 cada una, 
   de U$75 si se  compran de cinco a 10 y de U$50 si se compran más de 10. 
    • Obtener la cantidad de dinero que una persona tiene que pagar por cada una 
   de las llantas  que compra y la que tiene que pagar por el total de la compra. 
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.println("Cuantas llantas desea comprar?: ");
        int num1, num2, num3, num4;         
         num1 = in.nextInt();
         num2 = (num1*100);
         num3 = (num1*75);
         num4 = (num1*50);
         
         if (num1 < 5){
    
             System.out.println
        ("El precio total de su compra es: $" + (num2));
             
             System.out.println
        (" EL precio de cada llanta es: $" + 100);
      
       }else if (num1 > 10){
            System.out.println
        ("El precio total de su compra es: $" + (num4));
             
             System.out.println
        (" EL precio de cada llanta es: $" + 50);

       }else{
           System.out.println
        ("El precio total de su compra es: $" + (num3));
             
             System.out.println
        (" EL precio de cada llanta es: $" + 75);
       }        
    }
}

