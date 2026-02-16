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
public class EjercicioVeintiuno {
    ///Pedir una nota numérica entera entre 0 y 10, y mostrar dicha nota de la forma: cero, uno, dos, tres...
    public static void main(String[] args) {
        try(Scanner read = new Scanner(System.in)){
            System.out.println("Introduzca un nota numerica");
            byte num = read.nextByte();
                
            switch (num) {
                case 0 -> System.out.println("CERO");
                case 1 -> System.out.println("UNO");
                case 2 -> System.out.println("DOS");
                case 3 -> System.out.println("TRES");
                case 4 -> System.out.println("CUATRO");
                case 5 -> System.out.println("CINCO");
                case 6 -> System.out.println("SEIS");
                case 7 -> System.out.println("SIETE");
                case 8 -> System.out.println("OCHO");
                case 9 -> System.out.println("NUEVE");
                case 10 -> System.out.println("DIEZ");
                default -> System.out.println("La nota debe estar entre 0 y 10");
            }
        }catch(InputMismatchException e){
            System.out.println("El formato de numero no es correcto");
        }
    }
}
