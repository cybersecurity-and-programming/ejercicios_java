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
public class EjercicioCuatro {
    //Pedir dos números y decir si son iguales o no.
    public static void main(String[] args) {
        try{
            Scanner read = new Scanner(System.in);
            System.out.println("Introduzca el primer numero");
            int num1 = read.nextInt();
            
            System.out.println("Introduzca el segundo numero");
            int num2 = read.nextInt();
            
            if(num1 == num2){
                System.out.println("Los numero introducidos son iguales");
            }else{
                System.out.println("Los numeros introducidos no son iguales");
            }
            
        }catch(InputMismatchException e){
            System.out.println("LOS NUMEROS INTRODUCIDOS NO TIENEN EL FORMATO CORRECTOS");
        }
    }
}