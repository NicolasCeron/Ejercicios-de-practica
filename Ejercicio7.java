
package EjerciciosPractica;

/**
 *
 * @author LENOVO
 * Una institución educativa estableció un programa para estimular a los alumnos con buen
rendimiento académico y que consiste en lo siguiente:
▪ Si el promedio es de 9.5 o más y el alumno es de tecnología, entonces este podrá cursar
55 créditos y se le hará un 25% de descuento.
▪ Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de tecnología,
entonces este podrá cursar 50 créditos y se le hará un 10% de descuento.
▪ Si el promedio es mayor que 7 y menor que 9 y el alumno es de tecnología, este podrá
cursar 50 créditos y no tendrá ningún descuento.
▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 0 a 3 y el
alumno es de tecnología, entonces podrá cursar 45 créditos y no tendrá descuento.
▪ Si el promedio es de 7 o menor, el número de materias reprobadas es de 4 o más y el
alumno es de tecnología, entonces podrá cursar 40 créditos y no tendrá ningún
descuento.
▪ Si el promedio es mayor o igual a 9.5 y el alumno es de profesional, entonces podrá
cursar 55 créditos y se le hará un 20% de descuento.
▪ Si el promedio es menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55
créditos y no tendrá descuento.
Obtener el total que tendrá que pagar un alumno si el valor de la matrícula para alumnos de
profesional es de $30.000 por cada cinco créditos y para alumnos de tecnología es de $18.000
por cada cinco créditos.
 */


import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
    
     Scanner in = new Scanner (System.in);
     
     System.out.println("Seleccione su carrera: ");
        System.out.println("1. Tecnologia");
        System.out.println("2. Profesional");
             int carrera = in.nextInt();
            
        switch (carrera) {
            
            case 1: 
                 double CreditosTec, PagoTotal;
                    CreditosTec = 18.000;   //Por cada 5 (semestres totales/5)
                    PagoTotal = 0;
                    
                System.out.println("De cuanto fue su promedio?: ");
                double promedio = in.nextDouble();
                    if (promedio>9.5){
                        CreditosTec = (CreditosTec*11);
                        PagoTotal = (CreditosTec-(CreditosTec*0.25));
                        System.out.println("El precio total de su matricula es de: "+PagoTotal);
                    }
                    else if (promedio>=9 && promedio<9.5){
                        CreditosTec = (CreditosTec*10);
                        PagoTotal = (CreditosTec-(CreditosTec*0.1));
                        System.out.println("El precio total de su matricula es de: "+PagoTotal);
                    }
                    else if(promedio>7 && promedio<9){
                        PagoTotal = (CreditosTec*10);
                        System.out.println("El precio total de su matricula es de: "+PagoTotal);
                    }  
                    else{
                        System.out.println("Cuantas materias reprobo?: ");
                        int materias =in.nextInt();
                            if (materias>0 && materias<3){
                                 PagoTotal = (CreditosTec*9);
                                 System.out.println("El precio total de su matricula es de: "+PagoTotal);
                            }else{
                                 PagoTotal=(CreditosTec*8);
                             System.out.println("El precio total de su matricula es de: "+PagoTotal);
                            }
                     }
                
                break;
            case 2:
                double CreditosProf, PagoTotal2;
                    CreditosProf = 30.000;  //Por cada 5 (semestres totales/5)
                    PagoTotal2 = 0;
                    
                System.out.println("De cuanto fue su promedio?: ");
                double promedio2 = in.nextDouble();
                 if (promedio2>=9.5){
                        CreditosProf = (CreditosProf*11);
                        PagoTotal2 = (CreditosProf-(CreditosProf*0.20));
                        System.out.println("El precio total de su matricula es de: "+PagoTotal2);
                 } else {
                        PagoTotal2 = (CreditosProf*11);
                        System.out.println("El precio total de su matricula es de: "+PagoTotal2);
                    }    
                break;
                
            default:
                System.out.println("Carrera no válida");
        
        
    }          
 }
}