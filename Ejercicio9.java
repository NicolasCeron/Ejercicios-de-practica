
package EjerciciosPractica;

/**
 *
 * @author Nicolás Cerón Castaño  20232217164
 * 
 * Calcular la utilidad que un trabajador recibe en el 
    reparto anual de utilidades si a este se le asigna
    un porcentaje de su salario mensual que depende de su 
    antigüedad en la empresa de acuerdo
    con la siguiente tabla:
    Tiempo Utilidad
    Menos de 1 año 5 % del salario
    1 año o más y menos de 2 años 7% del salario
    2 años o más y menos de 5 años 10% del salario
    5 años o más y menos de 10 años 15% del salario
    10 años o más 20% del salario
 */
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
     Scanner in = new Scanner (System.in);
        System.out.println("Ingrese su salario mensual: ");
          double salario =in.nextDouble();
        System.out.println("Años en la empresa: mas de uno(1) menos de uno (2): ");
          int antiguedad= in.nextInt();
          double utilidades;
          
          if (antiguedad==2){
            utilidades = (salario*0.05);
                System.out.println("La utilidad que va a recibir es de " +utilidades);
          }else{
             System.out.println("Cuantos años lleva en la empresa?: ");
             int años = in.nextInt();
               if (años<2){
                 utilidades = (salario*0.07);
                 System.out.println("La utilidad que va a recibir es de " +utilidades);
               }else if (años<5){
                 utilidades = (salario*0.1);
                 System.out.println("La utilidad que va a recibir es de " +utilidades); 
               }else if (años<10){
                 utilidades = (salario*0.15);
                 System.out.println("La utilidad que va a recibir es de " +utilidades);
               }else{
                 utilidades = (salario*0.20);
                 System.out.println("La utilidad que va a recibir es de " +utilidades);}
         }                
     }    
}
