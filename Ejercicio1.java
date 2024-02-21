
package EjerciciosPractica;


/**
 *
 * @author Niccolas Ceron Castaño   20232217164
 * 
 * 1. En una tienda de computadoras se planea ofrecer a los clientes
  un descuento que dependerá  del número de equipos que compre. 
  Si las computadoras son menos de cinco se les dará un  10% de descuento 
  sobre el total de la compra; si el número de computadoras es mayor o igual  
  a cinco pero menos de diez se le otorga un 20% de descuento;
  y si son 10 o más se les da un  40% de descuento. 
  El precio de cada computadora es de U$500. 
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.println("Cuantos computadores vas a comprar?: ");
        int num1, num2, num3, num4;         
         num1 = in.nextInt();
         num2 = ((num1*500)*10)/100;
         num3 = ((num1*500)*20)/100;
         num4 = ((num1*500)*40)/100;
         
         if (num1 <= 5){
    
             System.out.println ("El precio de su compra en dolares es: " + ((num1*500)-num2));
      
        }else if (num1 >= 10){
         
             System.out.println ("El precio de su compra en dolares es: " +((num1*500)-num4));
         
        }else{
           
             System.out.println ("El precio de su compra en dolares es: " +((num1*500)-num3));
       }        
    }
}
