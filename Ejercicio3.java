
package EjerciciosPractica;

/**
 *
 * @author Nicolas Ceron Castaño  20232217164
 * 
 * Un proveedor de reproductores de música ofrece un descuento del 10% 
  sobre el precio sin IVA, de algún aparato, si esta cuesta U$500 o más. 
  Además, independientemente de esto, ofrece un  5% de descuento si la marca
  es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
  cualquiera por la compra de su aparato. El IVA es del 19%. 
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
         Scanner in = new Scanner (System.in);
       
     System.out.println("Cual es el precio del reproductor?: ");
        double precioSinIva = in.nextDouble();
        if(precioSinIva>=500){
            precioSinIva=precioSinIva * 0.9; 
        }
        
     System.out.println("¿El reproductor es de marca NOSY? (si/no): ");
        String Nosy =in.next(); 
     
     boolean Nosy2 = Nosy.equalsIgnoreCase("si"); 
         double descuento = Nosy2 ? 0.05 : 0.0; 
        
     double precioConDescuento = precioSinIva * (1 - descuento);
     double iva = 0.19;
     double precioConIva = precioConDescuento * (1 + iva);
       
       
     System.out.println("El precio final a pagar es: $" + precioConIva);
       
     }
    }
