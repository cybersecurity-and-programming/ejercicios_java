/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinDos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cybersecurity-and-programming
 */
public class EjercicioUno {
    //Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            double num = 0;
            
            System.out.println("Introduzca un numero: ");
            while((num = read.nextInt()) >= 0){
                System.out.println("El cuadrado de "+num+" es --> "+ Math.pow(num, 2));
                System.out.println("Introduzca un numero: ");
            }
            System.out.println("ADIOS");
        }catch(InputMismatchException e){
            System.out.println("EL FORMATO DEL NUMERO INTRODUCIDO NO ES VALIDO");
        }
    }
}
