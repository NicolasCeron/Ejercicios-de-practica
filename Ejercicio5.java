
package EjerciciosPractica;

import java.util.Scanner;

/**
 *
 * @author Nicolas Ceron Castaño  20232217164
 * El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente 
   año. La manera de planificarlas depende de lo siguiente: 
   Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para  
   que su nuevo saldo sea de U$10.000. Si su capital tiene actualmente un saldo positivo pedirá 
   un  préstamo bancario para tener un nuevo saldo de U$20.000, pero si su capital tiene 
   actualmente  un saldo superior a los U$20.000 no pedirá ningún préstamo. 
     Posteriormente repartirá su presupuesto de la siguiente manera: 
       U$5.000 para equipo de computo 
       U$2.000 para mobiliario 
  El resto la mitad será para la compra de insumos y la otra para otorgar incentivos al personal. 
  Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y,  
  en caso de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);    
        System.out.println("Cuanto posee en su capital: ");
        double capital = in.nextDouble();
        double prestamo;
     
     
        if (capital<0){
            prestamo=10000.0-capital;
            System.out.println("Su prestamo es igual a: $"+prestamo);

        } else if (capital>20000){
            prestamo=0;
            System.out.println("Su prestamo es igual a: $"+prestamo);

        }else{
            prestamo = 20000.0-capital;
            System.out.println("Su prestamo es igual a: $"+prestamo);
        }
            
            System.out.println("Dinero para equipo de computo: $5000.0");
            System.out.println("Dinero para mobiliario: $2000.0");
            
         capital=capital+prestamo;
            
            System.out.println("dinero para compra de insumos: $"+(capital-7000)/2);
            System.out.println("incentivos al personal: $"+(capital-7000)/2);        }
        
    }
    

