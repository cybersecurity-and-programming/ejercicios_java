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
public class EjercicioDieciocho {
    public static void main(String[] args) {
        //Ídem que el ej. 17, suponiendo que cada mes tiene un número distinto de días (suponer que febrero tiene siempre 28 días).
        try(Scanner read = new Scanner(System.in)) {
            System.out.println("Introduzca dia");
            byte dia = read.nextByte();
            
            System.out.println("Introduzca mes");
            byte mes = read.nextByte();
            
            System.out.println("Introduzca año");
            short year = read.nextShort();
            
            if(!(dia >= 1 && dia <=30)){
                System.out.println("El dia no es correcto introduza una fecha correcta");
            }else{
                if(!(mes >= 1 && mes <= 12)){
                    if(!(dia <= 28 && mes == 2)){
                        System.out.println("El mes de Febrero no tiene una fecha correcta");
                    }else{
                        System.out.println("El mes no es correcto introduza una fecha correcta ");
                    }
                }else{
                    if(year < 1){
                        System.out.println("El año no es correcto introduza una fecha correcta");
                    }else{
                        dia++;
                        if(dia == 31 || dia == 29){
                            dia=1;
                            mes++;
                        }
                        
                        if(mes == 13){
                            mes=1;
                            year++;
                        }
                        System.out.println(dia+"/"+mes+"/"+year);
                    }
                }
            }
        }catch(InputMismatchException e){
            System.out.println("El formato de numero no es correcto");
        }
    }
}
