
package EjerciciosPractica;

/**
 *
 * @author Nicolas Ceron Castaño  20232217164
 * 
 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera:
    • Si trabaja 40 horas o menos se le paga $5000 por hora
    • Si trabaja más de 40 horas se le paga $$5000 por cada una de las primeras 40 horas y un
    aumento del 20% por cada hora extra.
 */

import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in); 
        System.out.println("Cuantas horas trabajara esta semana?: ");
        int horas = in.nextInt();
        double salario;
            if(horas<=40){
                salario=(horas*5000);
                System.out.println("su salario semanal es de: " +salario);
            }else{
                horas=(horas-40)*5000;
                salario=(40*5000)+(horas+(horas*0.2));
                System.out.println("su salario semanal es de: " +salario);                
            }
    }
}
