/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinUno;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author cybersecurity-and-programming
 */
public class EjercicioDiez {
    //Pedir tres números y mostrarlos ordenados de mayor a menor.
    public static void main(String[] args) {
        try{
            Scanner read = new Scanner(System.in);
            System.out.println("Introduzca primer numero");
            byte num1 = read.nextByte();
            
            System.out.println("Introduzca segundo numero");
            byte num2 = read.nextByte();
            
            System.out.println("Introduzca tercer numero");
            byte num3 = read.nextByte();
            
            List<Byte> numSorted = Arrays.asList(num1,num2,num3);
            Collections.sort(numSorted, Collections.reverseOrder());
            
            numSorted.forEach((Byte t) -> {
                System.out.print(t+" ");
            });
        }catch(InputMismatchException e){
            String reason = e.getMessage() == null ? "" : "El rango de una variable de tipo bytes es -128 to 127";
            System.out.println("El formato del numero introducido no es correcto. "+reason);
        }
    }
}
