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
public class EjercicioOnce {
    //Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)) {
            System.out.println("Introduzca un numero entre 0 y 9999");
            short num = read.nextShort();
            if(num < 0 || num > 9999){
                System.out.println("El rango especificado no es el correcto. Introduzca un numero entre 0 y 9999");
            }else{
                System.out.println("El numero de cifras es --> "+String.valueOf(num).length());
            }
        }catch(InputMismatchException e){
            System.out.println("El formato de numero no es correcto");
        }
    }
}
