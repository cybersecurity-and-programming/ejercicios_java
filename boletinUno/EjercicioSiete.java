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
public class EjercicioSiete {
    //Pedir dos números y decir cual es el mayor.
    public static void main(String[] args) {
        try{
            Scanner read = new Scanner(System.in);
            System.out.println("Introduzca primer numero");
            byte num1 = read.nextByte();
            
            System.out.println("Introduzca segundo numero");
            byte num2 = read.nextByte();
              
            if(num1 > num2){
                System.out.println("El numero "+num1+" es mayor que "+num2);
            }else{
                System.out.println("El numero "+num2+" es mayor que "+num1);
            }
        }catch(InputMismatchException e){
            String reason = e.getMessage() == null ? "" : "El rango de una variable de tipo bytes es -128 to 127";
            System.out.println("El formato del numero introducido no es correcto. "+reason);
        }
    }
}
