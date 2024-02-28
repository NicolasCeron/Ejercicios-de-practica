
package EjerciciosPractica;

/**
 *
 * @author Nicolas ceron Castaño 20232217164
 
Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, un médico
determina si una persona tiene anemia o no, lo cual depende de su nivel de hemoglobina en la
sangre, de su edad y de su sexo. Si el nivel de hemoglobina que tiene una persona es menor
que el rango que le corresponde, se determina su resultado como positivo y en caso contrario
como negativo. La tabla en la que el medico se basa para obtener el resultado es la siguiente:
EDAD NIVEL HEMOGLOBINA
0 - 1 mes 13 - 26 g%
> 1 y < = 6 meses 10 - 18 g%
> 6 y < = 12 meses 11 - 15 g%
> 1 y < = 5 años 11.5 - 15 g%
> 5 y < = 10 años 12.6 - 15.5 g%
> 10 y < = 15 años 13 - 15.5 g%
Mujeres > 15 años 12 - 16 g%
Hombres > 15 años 14 - 18 g%
 */

import java.util.Scanner;

public class Ejercicio6 {
 public static void main(String[] args) {
  Scanner in = new Scanner (System.in); 

  System.out.println("Cual es su nivel de hemmoglobina?: ");
        double hemo = in.nextDouble();
            
    System.out.println("Ingrese su edad en meses: ");
        double edad = in.nextDouble();
            
     if (edad >=0 && edad<=1){    
        if (hemo <13){
         System.out.println("Positivo para anemia");
        }else{
         System.out.println("Negativo para anemia");}
        }
            
     else if (edad >1 && edad<=6){    
        if (hemo <10){
         System.out.println("Positivo para anemia");
        }else{
         System.out.println("Negativo para anemia");}}
              
     else if (edad >6 && edad<=12){    
        if (hemo <11){
         System.out.println("Positivo para anemia");
        }else{
         System.out.println("Negativo para anemia");}}
               
     else if (edad >12 && edad<=60){    
        if (hemo <11.5){
         System.out.println("Positivo para anemia");
        }else{
         System.out.println("Negativo para anemia");}}
                
     else if (edad >60 && edad<=120){    
        if (hemo <12.6){
         System.out.println("Positivo para anemia");
        }else{
         System.out.println("Negativo para anemia");}}
                
     else if (edad >120 && edad<=180){    
        if (hemo <13){
         System.out.println("Positivo para anemia");
        }else{
         System.out.println("Negativo para anemia");}}
                
     else{    
      System.out.print("Ingrese sexo (1)hombre, (2)mujer: ");         
         int sexo=in.nextInt();
             if (sexo == 2){
                 if (hemo <12){
                     System.out.println("positivo para anemia");
                 }else{
                     System.out.println("Negativo para anemia");}
             }else if (sexo == 1){
                 if (hemo<14){
                     System.out.println("positivo para anemia");
                 }else{
                     System.out.println("Negativo para anemia");                  
    }
   }
  }
 }
}