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
public class EjercicioCinco {
    //Pedir un número e indicar si es positivo o negativo.
    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(System.in);
            System.out.println("Introduzca el primer numero");
            byte num1 = read.nextByte();
            
            if(num1 < 0){
                System.out.println("El numero introducido es negativo");
            }else{
                if(num1 == 0){
                    System.out.println("No se puede considerar el 0 como positivo o negativo");
                }else{
                    System.out.println("El numero introducido es positivo");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("LOS NUMEROS INTRODUCIDOS NO TIENEN EL FORMATO CORRECTOS");
        }
    }
}