
package EjerciciosPractica;

import java.util.Scanner;

/**
 *
 * @author Nicolas ceron Castaño
 * 
 *  Una frutería ofrece las manzanas con descuento según la siguiente tabla: 
    NUM. DE KILOS COMPRADOS % DESCUENTO 
        0 - 2 0% 
        2.01 - 5 10% 
        5.01 - 10 15% 
        10.01 en adelante 20% 
    Determinar cuánto pagara una persona que compre manzanas es esa frutería.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Ingrese precio de la manzana por kg");
        double precio = in.nextDouble();
        
     System.out.println("¿Cuantos kilos de manzana va a comprar?: ");
        double kg = in.nextDouble();
        precio=precio*kg;
        
        if (kg>0 && kg<=2){    
            System.out.println("El precio de las manzanas es de: "+precio) ;
        }
        else if (kg>2 && kg<=5){
            System.out.println("El precio de las manzanas es de: "+(precio-(precio*0.1)));
        } 
        else if (kg>5 && kg<=10){
            System.out.println("El precio de las manzanas es de: "+(precio-(precio*0.15)));
        } 
        else {
            System.out.println("El precio de las manzanas es de: "+(precio-(precio*0.2)));
        } 
    } 
}
