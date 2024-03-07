
package EjerciciosPractica;

/**
 *
 * @author Nicolas Ceron Castaño 20232217164
 *
 El Seguro Social requiere clasificar a las personas que se jubilaran en el año 2004. Existen tres
tipos de jubilaciones: por edad, por antigüedad joven y por antigüedad adulta. Las personas
adscritas a la jubilación por edad deben tener 60 años o más y una antigüedad en su empleo de
menos de 25 años. Las personas adscritas a la jubilación por antigüedad joven deben tener
menos de 60 años y una antigüedad en su empleo de 25 años o más. Las personas adscritas a
la jubilación por antigüedad adulta deben tener 60 años o más y una antigüedad en su empleo
de 25 años o más.
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner jub = new Scanner(System.in);
        System.out.println("Cual es su edad?: ");
        int edad = jub.nextInt(); 
        System.out.println("Cantidad de años en su empleo: ");
        int empleo = jub.nextInt();
        
        if (edad>=60){
//jubilacion por edad y antiguedad adulta
            if (empleo<25){
                System.out.println("Usted se puede jubilar por edad");
            }else{
                System.out.println("Usted se puede jubilar por antiguedad adulta");}     
//jubilacion por antiguedad joven
        }else{
            if (empleo>=25){
                 System.out.println("Usted se puede jubilar por antiguedad joven");
            }else{
                 System.out.println("Usted no se puede jubilar");
             }
        }
    }
}
