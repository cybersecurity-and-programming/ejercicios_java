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
public class EjercicioCatorce {
    //Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)) {
            System.out.println("Introduzca un numero entre 0 y 10");
            short num = read.nextShort();
            switch (num) {
                case 0,1,2,3,4 -> {
                    System.out.println("INSUFICIENTE");
                }
                case 5 -> {
                    System.out.println("SUFICIENTE");
                }
                case 6 -> {
                    System.out.println("SUFICIENTE");
                }
                case 7,8 -> {
                    System.out.println("NOTABLE");
                }
                case 9,10 -> {
                    System.out.println("SOBRESALIENTE");
                }
                default -> System.out.println("La nota introducida no es correcta. Introduzca un numero entre 0 y 10");
            }
        }catch(InputMismatchException e){
            System.out.println("El formato de numero no es correcto");
        }
    }
}