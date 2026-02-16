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
public class EjercicioTrece {
    //Pedir un número entre 0 y 9.999, decir si es capicúa.
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)) {
            System.out.println("Introduzca un numero entre 0 y 9999");
            short num = read.nextShort();
            if(num < 0 || num > 9999){
                System.out.println("El rango especificado no es el correcto. Introduzca un numero entre 0 y 9999");
            }else{
                if(Short.valueOf(new StringBuilder(String.valueOf(num)).reverse().toString()) == num){
                    System.out.println("El numero es capicua");
                }else{
                    System.out.println("El numero no es capicua");
                }
            }
        }catch(InputMismatchException e){
            System.out.println("El formato de numero no es correcto");
        }
    }
}
