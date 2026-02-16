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
public class EjercicioDiecisiete {
    //Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos los meses tienen 30 días.
    public static void main(String[] args) {
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
                    System.out.println("El mes no es correcto introduza una fecha correcta");
                }else{
                    if(year < 1){
                        System.out.println("El año no es correcto introduza una fecha correcta");
                    }else{
                        dia++;
                        if(dia == 31){
                            dia=1;
                            mes++;
                        }
                        
                        if(mes==13){
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
