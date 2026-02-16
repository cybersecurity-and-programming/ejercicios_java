/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinUno;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cybersecurity-and-programming
 */
public class EjercicioDieciNueve {
    //Pedir dos fechas y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)) {
            System.out.println("<-----------INFORMACION DE PRIMERA FECHA----------->");
            System.out.println("Introduzca dia");
            byte dia = read.nextByte();
            
            System.out.println("Introduzca mes");
            byte mes = read.nextByte();
            
            System.out.println("Introduzca año");
            short year = read.nextShort();
            
            System.out.println("<-----------INFORMACION DE SEGUNDA FECHA----------->");
            System.out.println("Introduzca dia");
            byte dia_2 = read.nextByte();
            
            System.out.println("Introduzca mes");
            byte mes_2 = read.nextByte();
            
            System.out.println("Introduzca año");
            short year_2 = read.nextShort();
            
            if(!(dia >= 1 && dia <=30) || !(dia_2 >= 1 && dia_2 <=30)){
                System.out.println("El dia no es correcto introduza una fecha correcta");
            }else{
                if(!(mes >= 1 && mes <= 12) || !(mes_2 >= 1 && mes_2 <= 12)){
                    System.out.println("El mes no es correcto introduza una fecha correcta ");
                }else{
                    if((year < 1) || (year_2 < 1)){
                        System.out.println("El año no es correcto introduza una fecha correcta");
                    }else{
                        if(year_2 > year){
                            System.out.println("La diferencia de fechas es: --> "+((dia_2-dia) + 30*(mes_2-mes)+ 365*(year_2-year)));
                        }else{
                            System.out.println("La diferencia de fechas es: --> "+((dia-dia_2) + 30*(mes-mes_2)+ 365*(year-year_2)));
                        }
                    }
                }
            }
        }catch(InputMismatchException e){
            System.out.println("El formato de numero no es correcto");
        }
    }
}