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
public class EjercicioDieciseis {
    //  Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)) {
            System.out.println("Introduzca dia");
            byte dia = read.nextByte();
            
            System.out.println("Introduzca mes");
            byte mes = read.nextByte();
            
            System.out.println("Introduzca año");
            short year = read.nextShort();
            
            if(!(dia >= 1 && dia <=31)){
                System.out.println("El dia no es correcto introduza una fecha correcta");
            }else{
                if(!(mes >= 1 && mes <= 12) /*|| !(dia <= 28 && mes == 2)*/){
                    if(!(dia <= 28 && mes == 2)){
                        System.out.println("El mes de Febrero no tiene una fecha correcta");
                    }else{
                        System.out.println("El mes no es correcto introduza una fecha correcta "+mes);
                    }
                }else{
                    if(year < 1){
                        System.out.println("El año no es correcto introduza una fecha correcta");
                    }else{
                        System.out.println("La fecha es correcta");
                    }
                }
            }
        }catch(InputMismatchException e){
            System.out.println("El formato de numero no es correcto");
        }
    }
}
